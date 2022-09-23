package com.oc.api_server.Config;

import com.oc.api_server.Repository.Review1Repository;
import com.oc.api_server.Repository.Review2Repository;
import com.oc.api_server.Repository.UserRepository;
import com.oc.api_server.Service.*;
import com.oc.api_server.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MainConfig implements WebMvcConfigurer {

    //소스=========================================================================================================
    @Autowired
    private JavaMailSender emailSender;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Review1Repository review1Repository;

    @Autowired
    private Review2Repository review2Repository;



    //서비스=========================================================================================================

    @Bean
    public UserService userService(){
        return new UserService(userRepository,security());
    }

    @Bean
    public CertificationService certificationService(){
        return new CertificationService(emailSender,security(),userRepository);
    }

    @Bean
    public Review1Service review1Service(){
        return new Review1Service(review1Repository);
    }

    @Bean
    public Review2Service review2Service(){
        return new Review2Service(review2Repository);
    }



    //특수기능=========================================================================================================
    @Bean
    Security security(){
        return new Security();
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.println("으딜 감히");
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/Review1/**");
    }
}

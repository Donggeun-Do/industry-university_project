package com.oc.api_server.Service;

import com.oc.api_server.Repository.Review1Repository;
import com.oc.api_server.VO.Review1;
import com.oc.api_server.VO.SimpleReview1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Review1Service {
    private final Review1Repository repository;

    public Review1Service(Review1Repository repository) {
        this.repository = repository;
    }

    public String getList(){
        List<SimpleReview1> list = repository.getList();
        StringBuffer sb = new StringBuffer();
        for(SimpleReview1 t : list){
            sb.append(t.getId()+" "+t.getTitle()+" "+t.getSimple_main()+" "+t.isIs_image()+"\n");
        }
        return sb.toString();
    }

    public String GetListContinue(long id){
        List<SimpleReview1> list = repository.getListContinue(id);
        StringBuffer sb = new StringBuffer();
        for(SimpleReview1 t : list){
            sb.append(t.getId()+" "+t.getTitle()+" "+t.getSimple_main()+" "+t.isIs_image()+"\n");
        }
        return sb.toString();
    }

    public void SaveReview1(Review1 review1,long id){
        review1.setPeople(0);
        review1.setSum_r(0);
        review1.setReview_owner(id);

        repository.SaveReview1(review1);
    }

    public void SaveImage(String image,int count, long userid, long id){
        Map<String,Object> params = new HashMap<>();
        params.put("image_txt",image);
        params.put("count_num",count);
        params.put("userid",userid);
        params.put("id",id);
        repository.SaveImage(params);
    }
}

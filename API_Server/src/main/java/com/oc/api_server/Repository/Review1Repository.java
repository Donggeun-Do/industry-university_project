package com.oc.api_server.Repository;


import com.oc.api_server.VO.Review1;
import com.oc.api_server.VO.SimpleReview1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface Review1Repository {
    public List<SimpleReview1> getList();

    public List<SimpleReview1> getListContinue(long last);

    public void SaveReview1(Review1 review1);


    public void SaveImage(Map<String,Object> params);

}

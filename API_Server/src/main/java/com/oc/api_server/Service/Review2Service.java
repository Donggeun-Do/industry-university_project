package com.oc.api_server.Service;

import com.oc.api_server.Repository.Review1Repository;
import com.oc.api_server.Repository.Review2Repository;

public class Review2Service {
    private final Review2Repository repository;

    public Review2Service(Review2Repository repository) {
        this.repository = repository;
    }
}

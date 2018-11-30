package com.baojie.boot.search;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService implements TwitterSearch {

    public SearchService() {

    }

    @Override
    public List<LightTweet> search(String searchType, List<String> keywords) {
        List<LightTweet> list=new ArrayList<>();
        list.add(new LightTweet("build by baojie"));
        return list;
    }

}

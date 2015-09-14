package com.example;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.json.JSONObject;

public class MyService {
    private final Logger LOG = Logger.getLogger(MyService.class);

    public String create(MyObject myObject) {
        LOG.info(myObject.toString());

        // Just hard code some response...
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("value", "hello");
        JSONObject json = new JSONObject(map);
        return json.toString();
    }
}
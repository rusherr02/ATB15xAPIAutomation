package org.manav.com.ex_06_Payload_Management.Map;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class pm_00_map {


    @Test
    public void test_map() {

        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
    }
}

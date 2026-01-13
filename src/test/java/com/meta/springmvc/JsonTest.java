package com.meta.springmvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.meta.springmvc.entity.Star;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JsonTest {

    @Test
    @DisplayName("Object To Json : Get Method 필요")
    void test1() throws JsonProcessingException {
        Star star = new Star("Meta", 26);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(star);

        System.out.println("json result: "+jsonString);
    }

    @Test
    @DisplayName("JsonToObject")
    void test2() throws JsonProcessingException{
        String json = "{\"name\" : \"Meta\" , \"age\" : 22}";

        ObjectMapper objectMapper = new ObjectMapper();
        Star star = objectMapper.readValue(json, Star.class);
        System.out.println("name: "+star.getName());
        System.out.println("age: "+star.getAge());
    }
}

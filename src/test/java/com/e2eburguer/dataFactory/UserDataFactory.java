package com.e2eburguer.dataFactory;

import com.e2eburguer.pojo.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;

public class UserDataFactory {

    public static User createUser(){
        User user = new User();

        user.setName("QA Teste");
        user.setEmail("teste.qa@email.com");
        user.setPassword("Teste@123!");

        return user;
    }


    public static User login() throws IOException {
        //pegar os dados do json e atribuir a um user
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new FileInputStream("src/test/resources/payloads/login.json"), User.class);
    }

    public static User userDuplicate() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new FileInputStream("src/test/resources/payloads/userDuplicate.json"), User.class);
    }

    public static User userId(){
        User userID = new User();
        userID.setName("Teste QA");
        userID.setEmail("user@teste.com");
        userID.setUserId("d9a98ee6-b49b-4492-b376-01de29c82579");


        return userID;
    }
}

package com.itrip.controller;

import com.itrip.pojo.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    public List<User> show(){
        List<User>users=new ArrayList<>();
        users.add(new User(1,"张三","121222"));
        users.add(new User(1,"张三","121222"));
        users.add(new User(1,"张三","121222"));
        return  users;
    }
}

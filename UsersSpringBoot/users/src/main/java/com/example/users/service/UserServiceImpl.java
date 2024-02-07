package com.example.users.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.stereotype.Service;

import com.example.users.entity.User;

@Service
public class UserServiceImpl implements UserService{
public static int usersCount=0;
private static List<User> users=new ArrayList<>();

static{
    users.add(new User(1,"John",new Date()));
    users.add(new User(2,"Robert",new Date()));
    users.add(new User(3,"Adam",new Date()));
    users.add(new User(4,"Rohit", new Date())); 
    }


    //method to retrieve all users from the list
    @Override
    public List<User>findAll(){
        return users;
    }

    //method that add the user in the list
    @Override
    public User save(User user) {
        //if(user.getId()==null)
        //users.setId(++usersCount);
        users.add(user);
        usersCount++;
        return user;
       
    }

    //method that find a particular user from the list
    @Override
    public User findOne(int id) {
        for(User user: users){
            if(user.getId()==id)return user;
        }
        return null;

    }

    @Override
    public User deleteById(int id){
       for(User u: users){
        users.remove(u);
        return u;
       }
       return null;
            
        }
    }
    


    


package com.example.users.service;
import java.util.List;



import com.example.users.entity.User;

public interface UserService {
   public List<User> findAll();
   public User save(User save);
   public User findOne(int id);
   public User deleteById(int id);
    
}

package com.Geekster.usermanagementsystem.service;

import com.Geekster.usermanagementsystem.model.UserManage;
import com.Geekster.usermanagementsystem.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public String addUser(UserManage newUser){
        userRepo.save(newUser);
        return "addUser";
    }

    public String addUsers(List<UserManage> newUsers){
    userRepo.saveAll(newUsers);
    return newUsers.size() + "Users were added";
    }

    public List<UserManage> getUsers(){
        return (List<UserManage>) userRepo.findAll();
    }

    public String removeUsers(Integer ids) {
        userRepo.deleteById(ids);
        return "removed Users";
    }

    public UserManage getUserById(Integer id) {
        return userRepo.findById(id).get();
    }

    public void updateUser(Integer UserId, UserManage user) {
        boolean user1 = userRepo.existsById(UserId);
        if(user1){
            userRepo.save(user);
        }
    }
}

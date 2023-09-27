package com.Geekster.usermanagementsystem.repo;

import com.Geekster.usermanagementsystem.model.UserManage;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserManage, Integer> {
}

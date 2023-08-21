package com.example.service;

import com.example.entity.*;
import com.example.repository.*;
import java.util.*;

// required interface
interface IUserService {
  User addUser(User user);

  void deleteUser(int id);

  User updateUser(int id, String newEmail);

  User updateUser(User updateData);

  List<User> getAllUsers();
}

// class implementing the interface
public class UserServiceImpl implements IUserService {
  private UserRepositoryImpl userRepo = new UserRepositoryImpl();

  public User addUser(User user) {
    return userRepo.addUser(user);
  }

  public void deleteUser(int userId) {
    userRepo.deleteUser(userId);
  }

  public User updateUser(int userId, String newEmail) {
    return userRepo.updateUser(userId, newEmail);
  }

  public User updateUser(User newUser) {
    return userRepo.updateUser(newUser);
  }

  public List<User> getAllUsers() {
    return userRepo.getAllUsers();
  }
}
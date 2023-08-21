package com.example.repository;

import com.example.entity.*;
import java.util.*;
import java.util.stream.*;

// the interface for user repository
interface IUserRepository {
  User addUser(User user);

  void deleteUser(int id);

  User updateUser(int id, String newEmail);

  User updateUser(User user);

  List<User> getAllUsers();
}

// class implementation for the interface
public class UserRepositoryImpl implements IUserRepository {
  private List<User> users = new ArrayList<>();

  public User addUser(User user) {
    // don't add if already present
    if (users.contains(user))
      return user;

    users.add(user);
    return user;
  }

  public void deleteUser(int userId) {
    users.removeIf((userObj) -> userObj.getId() == userId);
  }

  public User updateUser(int userId, String newEmail) {
    this.users
        .stream()
        .filter((userObj) -> userObj.getId() == userId)
        .forEach((userObj) -> userObj.setEmail(newEmail));

    return this.users
        .stream()
        .filter((userObj) -> userObj.getId() == userId)
        .collect(Collectors.toList())
        .get(0);
  }

  public User updateUser(User newUser) {
    this.users
        .stream()
        .filter((userObj) -> userObj.getId() == newUser.getId())
        .forEach((userObj) -> {
          userObj.setEmail(newUser.getEmail());
          userObj.setName(newUser.getName());
          userObj.setRole(newUser.getRole());
          // id cannot be changed
        });

    return this.users
        .stream()
        .filter((userObj) -> userObj.getId() == newUser.getId())
        .collect(Collectors.toList())
        .get(0);
  }

  public List<User> getAllUsers() {
    return users;
  }
}

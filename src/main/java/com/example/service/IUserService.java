package com.example.service;

import com.example.entity.*;
import java.util.*;

public interface IUserService {
  User addUser(User user);

  void deleteUser(int id);

  User updateUser(int id, String newEmail);

  User updateUser(User updateData);

  List<User> getAllUsers();
}

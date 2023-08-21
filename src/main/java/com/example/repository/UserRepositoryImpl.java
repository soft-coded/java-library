package com.example.repository;

import com.example.entity.*;
import java.util.*;

// the interface for user repository
interface IUserRepository {
  User addUser(User user);

  void deleteUser(int id);

  User updateUser(int id, String newEmail);

  User updateUser(User user);

  List<User> getAllUsers();
}

public class UserRepositoryImpl implements IUserRepository {

}

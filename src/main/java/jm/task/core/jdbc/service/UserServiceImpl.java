package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDaoJDBCImpl userJDBCimpl = new UserDaoJDBCImpl();

    public void createUsersTable()  {userJDBCimpl.createUsersTable();}

    public void dropUsersTable() {
        userJDBCimpl.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userJDBCimpl.saveUser(name,lastName,age);
    }

    public void removeUserById(long id) {
        userJDBCimpl.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userJDBCimpl.getAllUsers();
    }

    public void cleanUsersTable() {
        userJDBCimpl.cleanUsersTable();
    }
}

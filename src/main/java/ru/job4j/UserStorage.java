package ru.job4j;

import ru.job4j.model.Halls;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class UserStorage {
    private List<Halls> userList = new CopyOnWriteArrayList<>();;
    private static final UserStorage USER_STORAGE = new UserStorage();


    public static UserStorage getInstance() {
        return USER_STORAGE;
    }


    public UserStorage() {
    }

    public void add (Halls halls) {
        userList.add(halls);
    }

    public List<Halls> getUserList() {
        return userList;
    }
}

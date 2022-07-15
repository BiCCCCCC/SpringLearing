package cn.edu.swu.service.impl;

import cn.edu.swu.dao.UserDao;
import cn.edu.swu.service.UserService;

public class UserServiceImpl implements UserService {
    public void setUser(UserDao user) {
        this.user = user;
    }
    private UserDao user;

    public void save() {
        user.save();
    }
}

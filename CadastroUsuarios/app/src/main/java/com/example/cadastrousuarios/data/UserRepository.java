package com.example.cadastrousuarios.data;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class UserRepository {
    private UserDAO mUserDao;
    private LiveData<List<User>> mAllUsers;

    UserRepository(Application application) {
        UserDatabase db = UserDatabase.getDatabase(application);
        mUserDao = db.userDao();
        mAllUsers = mUserDao.getAll();
    }

    LiveData<List<User>> getAllUsers() {
        return mAllUsers;
    }

    void insert(User note) {
        UserDatabase.databaseWriteExecutor.execute(() -> {
            mUserDao.insert(note);
        });
    }
}

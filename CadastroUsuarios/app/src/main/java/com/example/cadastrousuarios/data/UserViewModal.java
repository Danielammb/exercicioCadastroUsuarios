package com.example.cadastrousuarios.data;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class UserViewModal extends AndroidViewModel {

        private UserRepository mRepository;

        private final LiveData<List<User>> mAllUsers;

        public UserViewModal (Application application) {
            super(application);
            mRepository = new UserRepository(application);
            mAllUsers = mRepository.getAllUsers();
        }

        public LiveData<List<User>> getAllUsers() { return mAllUsers; }


        public void insert(User user) { mRepository.insert(user); }

}

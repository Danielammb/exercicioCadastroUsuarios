package com.example.cadastrousuarios.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@Dao
public interface UserDAO {
    @Query("SELECT * FROM user_table")
    public LiveData<List<User>> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insert(User note);


}

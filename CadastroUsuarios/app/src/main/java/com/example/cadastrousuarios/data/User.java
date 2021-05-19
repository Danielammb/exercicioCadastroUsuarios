package com.example.cadastrousuarios.data;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "user_table")
public class User {
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "id")
        public int id;

        @ColumnInfo(name = "nome")
        public String nome;

        @ColumnInfo(name = "email")
        public String email;

        @NonNull
        public String getName(){return this.nome;}

        @NonNull
        public int getId(){ return this.id;}

        @NonNull
        public String getEmail(){return this.email;}

}



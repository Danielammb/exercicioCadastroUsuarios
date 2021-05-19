package com.example.cadastrousuarios;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cadastrousuarios.data.User;

public class UserViewHolder extends RecyclerView.ViewHolder {
    private final TextView nameTextView;
    private final TextView emailTextView;

    private   UserViewHolder(View itemView) {
        super(itemView);
        nameTextView = itemView.findViewById(R.id.nome);
        emailTextView = itemView.findViewById(R.id.email);
    }

    public void bind( User user) {
        emailTextView.setText(user.getEmail());
        nameTextView.setText(user.getName());
    }

    static   UserViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_user, parent, false);
        return new  UserViewHolder(view);
    }
}

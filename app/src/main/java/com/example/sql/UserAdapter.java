package com.example.sql;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter {
    private ArrayList<Users> users;
    private final LayoutInflater layoutInflater;
    private final int layoutResource;

    public UserAdapter(@NonNull Context context, int resource, ArrayList<Users> users) {
        super(context, resource);
        this.users = users;
        this.layoutInflater = LayoutInflater.from(context);
        this.layoutResource = resource;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = convertView;
        v = layoutInflater.inflate(layoutResource, parent,false);
        TextView nameText = v.findViewById(R.id.username);
        TextView contactText = v.findViewById(R.id.contact_number);
        TextView  birthText = v.findViewById(R.id.birth);

        nameText.setText(nameText.getText()+users.get(position).getName());
        contactText.setText(contactText.getText()+users.get(position).getContact());
        birthText.setText(birthText.getText()+users.get(position).getDateofbirth());


        return v;
    }

}

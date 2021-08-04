package com.example.sql;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    ArrayList<Users> userList;
    ListView listView;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity3);
        listView = findViewById(R.id.listview);

        Intent intent = getIntent();
        userList = (ArrayList<Users>) intent.getSerializableExtra("userlist");
        UserAdapter userAdapter = new UserAdapter(this,R.layout.activity2,userList);
        listView.setAdapter(userAdapter);



    }
}
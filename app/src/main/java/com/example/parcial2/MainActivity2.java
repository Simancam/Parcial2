package com.example.parcial2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parcial2.adaptadores.UserAdapter;
import com.example.parcial2.clases.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView rcv_user;
    List<User> listaUser = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        rcv_user = findViewById(R.id.rcv_user);

        User user1 = new User("Antonio",13,"https://rickandmortyapi.com/api/character/avatar/72.jpeg");

        listaUser.add(user1);

        rcv_user.setLayoutManager(new LinearLayoutManager(this));
        rcv_user.setAdapter(new UserAdapter(listaUser));
    }
}
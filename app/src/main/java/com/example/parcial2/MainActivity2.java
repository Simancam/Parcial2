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
        User user2= new User("Pepe", 20,"https://rickandmortyapi.com/api/character/avatar/120.jpeg");
        User user3= new User("David", 22,"https://rickandmortyapi.com/api/character/avatar/190.jpeg");
        User user4= new User("Simanca", 24,"https://rickandmortyapi.com/api/character/avatar/241.jpeg");


        listaUser.add(user1);
        listaUser.add(user2);
        listaUser.add(user3);
        listaUser.add(user4);

        rcv_user.setLayoutManager(new LinearLayoutManager(this));
        rcv_user.setAdapter(new UserAdapter(listaUser));
    }
}
package com.example.parcial2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    String dato;
    Button btn_continue;
    EditText edt_user;
    EditText edt_password;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    public static final String dataUser = "dataUser";
    private static final int modo_privado = Context.MODE_PRIVATE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //llamada de datos del xml
        btn_continue = findViewById(R.id.btn_continue);
        edt_user = findViewById(R.id.edt_user);
        edt_password = findViewById(R.id.edt_password);

        //guardar en cache
        sharedPreferences = getSharedPreferences(dataUser, modo_privado);
        editor = sharedPreferences.edit();
        dato = getApplicationContext().getSharedPreferences(dataUser, modo_privado).getString("usuario", "0");

        if (!dato.equalsIgnoreCase("0")){
            Intent I = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(I);
            finish();
        }

        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("usuario", edt_user.getText().toString());
                editor.commit();
                Intent I = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(I);
                finish();
            }
        });
    }
}
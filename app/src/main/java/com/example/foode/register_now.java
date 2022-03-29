package com.example.foode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register_now extends AppCompatActivity {
    EditText username, email, password;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_now);
        username = findViewById(R.id.ET_name);
        email = findViewById(R.id.ET_email);
        password = findViewById(R.id.ET_password);
        register = findViewById(R.id.btn_register);
        DBHelper DB = new DBHelper();
        register.setOnClickListener(v->
        {
            User user = new User(username.getText().toString(), email.getText().toString(), password.getText().toString());
            DB.add(user).addOnSuccessListener(suc->
            {
                Toast.makeText(this, "User Added", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er->
            {
                Toast.makeText(this, " "+er.getMessage(), Toast.LENGTH_SHORT).show();
            });
        });
    }
}
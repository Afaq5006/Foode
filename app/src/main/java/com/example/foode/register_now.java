package com.example.foode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register_now extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText username, email, password;
    Button register;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_now);
        username = findViewById(R.id.ET_name);
        email = findViewById(R.id.ET_email);
        password = findViewById(R.id.ET_password);
        register = findViewById(R.id.btn_register);
        DB = new DBHelper(this);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = username.getText().toString();
                String emailTXT = email.getText().toString();
                String passwordTXT = password.getText().toString();

                boolean checkData= DB.insert(nameTXT, emailTXT, passwordTXT);
                if (checkData == true)
                    Toast.makeText(register_now.this, "User Added", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(register_now.this, "Error this insert", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text =adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(),text,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
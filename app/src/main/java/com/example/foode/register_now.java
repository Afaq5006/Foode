package com.example.foode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register_now extends AppCompatActivity {
    EditText edt1,edt2,edt3;
    Button btnsign;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_now);
        edt1 = findViewById(R.id.ET_name);
        edt2 = findViewById(R.id.ET_email);
        edt3 = findViewById(R.id.ET_password);
        btnsign = findViewById(R.id.btn_register);
        DB = new DBHelper(this);
        btnsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username =edt1.getText().toString();
                String password=edt2.getText().toString();
                String confirm=edt3.getText().toString();
                if (username.equals("")||password.equals("")||confirm.equals(""))
                {
                    Toast.makeText(register_now.this, "Fields Requireds", Toast.LENGTH_SHORT).show();

                }
                else {

                    if (password.equals(confirm)){
                        Boolean checkname =DB.Checkusername(username);
                        if (checkname==true){
                            Boolean insert =DB.Insert(username,password);
                            if (insert==true){
                                Toast.makeText(register_now.this, "Registered", Toast.LENGTH_SHORT).show();
                                edt1.setText("");
                                edt2.setText("");
                                edt3.setText("");
                            }

                        }
                        else {
                            Toast.makeText(register_now.this, "Username Already Taken", Toast.LENGTH_SHORT).show();
                        }

                    }else {
                        Toast.makeText(register_now.this, "Password Dose Match", Toast.LENGTH_SHORT).show();
                    }
                }
            }

        });
    }
}
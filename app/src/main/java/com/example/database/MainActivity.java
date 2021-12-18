package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,number,edit;
    String s1,s2,s3,nu;
    TextView a;
    db db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.editTextTextPersonName);
        number = findViewById(R.id.editTextTextPersonName2);
        edit = findViewById(R.id.editTextTextPersonName4);
        a = findViewById(R.id.textView);
        db = new db(MainActivity.this);
    }

    public void login(View view) {
        s1 = name.getText().toString();
        s2 = number.getText().toString();
        db.savedata(s1,s2);
        Toast.makeText(this, "saved sucessfullyx", Toast.LENGTH_SHORT).show();
    }

    public void retrive(View view) {
    s3 = edit.getText().toString();
       String nu =db.getlo(s3);
        a.setText(s3);

    }
}
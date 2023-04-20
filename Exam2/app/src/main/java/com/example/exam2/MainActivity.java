package com.example.exam2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference mDatabase;
    private EditText editText1,editText2,editText3,editText4,editText5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.edit_id1);
        editText2 = findViewById(R.id.edit_id2);
        editText3 = findViewById(R.id.edit_id3);
        editText4 = findViewById(R.id.edit_id4);
        editText5 = findViewById(R.id.edit_id5);

        mDatabase = FirebaseDatabase.getInstance().getReference();

    }

    public void senData(View view) {
        writeNewUser();
    }

    public void writeNewUser(){
        User user = new User(editText1.getText().toString(),
                editText2.getText().toString(),
                editText3.getText().toString(),
                editText4.getText().toString(),
                editText5.getText().toString());

        mDatabase.child("users").child(user.getUserId()).setValue(user);
    }
}
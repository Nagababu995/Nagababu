package com.example.naga;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity
{
    EditText editText,editText4,editText5;
    Button button;
    DatabaseReference ref;
    Shoplogdata data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.editText);
        editText4=(EditText)findViewById(R.id.editText4);
        editText5=(EditText)findViewById(R.id.editText5);
        button=(Button)findViewById(R.id.button);
        data=new Shoplogdata();
        ref=FirebaseDatabase.getInstance().getReference().child("Shopowner");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Long pno=Long.parseLong(editText5.getText().toString().trim());
                Long pwd=Long.parseLong(editText4.getText().toString().trim());
                data.setName(editText.getText().toString().trim());
                data.setPass(pwd);
                data.setMobile(pno);
                ref.child("user1").child("stores").setValue(data);
                Toast.makeText(MainActivity.this,"login successfull",Toast.LENGTH_LONG).show();
            }
        });








    }

}






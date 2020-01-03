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
    EditText editText,editText2;
    DatabaseReference ref;
    Button button;
    Products pro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.editText);
        editText2=(EditText)findViewById(R.id.editText2);
        button=(Button)findViewById(R.id.button);
        pro=new Products();
        ref=FirebaseDatabase.getInstance().getReference().child("PRODUCTS");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                        pro.setName(editText2.getText().toString().trim());
                        pro.setProduct(editText.getText().toString().trim());

                            ref.push().setValue(pro);
                            Toast.makeText(MainActivity.this, "data added successfully", Toast.LENGTH_LONG).show();




            }
        });


    }

}














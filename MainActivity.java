package com.example.naga1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
EditText editText,editTest2;
Button button;
DatabaseReference ref;
Product product;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.editText);
        editTest2=(EditText)findViewById(R.id.editText2);
        product=new Product();
        ref= FirebaseDatabase.getInstance().getReference().child("shop");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                product.setName(editText.getText().toString().trim());
                product.setPro(editTest2.getText().toString().trim());
                ref.child("products").setValue(product);
                Toast.makeText(MainActivity.this,"data added successfully",Toast.LENGTH_LONG).show();
                activity();
            }
        });


    }
    public void activity()
    {
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}

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
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    EditText editText,editText2;
    Button button;
    DatabaseReference ref;
    Product pro1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //editText = (EditText) findViewById(R.id.editText);name
        editText2 = (EditText) findViewById(R.id.editText2);//pro
        button = (Button) findViewById(R.id.button);
        pro1 = new Product();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ref=FirebaseDatabase.getInstance().getReference("products").child(pro1.pro);

                deletepro(pro1.pro);
                Toast.makeText(MainActivity.this, "data deleted succesflly", Toast.LENGTH_LONG).show();

            }
        });
    }
    public  void  deletepro(String pro){
        ref.removeValue();
    }


}

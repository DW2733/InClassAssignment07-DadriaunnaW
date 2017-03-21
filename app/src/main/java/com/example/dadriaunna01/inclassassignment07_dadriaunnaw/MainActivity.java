package com.example.dadriaunna01.inclassassignment07_dadriaunnaw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference style = database.getReference("style");
    private DatabaseReference shoe = database.getReference("shoe");

    private EditText shoeType;
    private EditText brand;
    private EditText size;
    private CheckBox cute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       shoeType = (EditText) findViewById(R.id.shoe_type);
       brand= (EditText)findViewById(R.id.brand);
       size=(EditText)findViewById(R.id.size);
       cute= (CheckBox)findViewById(R.id.cute);

    }

    public void setStyle(View view) {

        String myPoppinShoe= shoeType.getText().toString();
        style.setValue(new String(myPoppinShoe));

    }

    public void addShoe(View view) {

        String bigBrand=brand.getText().toString();
        String size1=size.getText().toString();
        int size2= Integer.parseInt(size1);
        boolean cute1;
        cute1=cute.isChecked();


        shoe.push().setValue(new Shoes(bigBrand, size2, cute1));
    }


}

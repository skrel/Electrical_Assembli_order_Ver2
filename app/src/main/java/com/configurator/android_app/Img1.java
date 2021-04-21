package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img1 extends AppCompatActivity {

    EditText img1editText1, img1editText2, img1editText3, img1editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img1);
        myDb = new DatabaseHelper(this);

        img1editText1 = (EditText) findViewById(R.id.img1editText1);
        img1editText1.setText("One gang ring, Device XXXXXX");

        img1editText2 = (EditText) findViewById(R.id.img1editText2);
        img1editText2.setText("Stud mount, 4 inch square welded box, XXX bracket");

        img1editText3 = (EditText) findViewById(R.id.img1editText3);

        img1editText4 = (EditText) findViewById(R.id.img1editText4);
        //img1editText4.setText("1");

        button8 = (Button) findViewById(R.id.button8);

        AddData();

    }

    // add data

    public void AddData() {
        button8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertData(
                                img1editText1.getText().toString(),
                                img1editText2.getText().toString(),
                                img1editText3.getText().toString(),
                                img1editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img1.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img1.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}
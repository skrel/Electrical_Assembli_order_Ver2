package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img6 extends AppCompatActivity {

    EditText img6editText1, img6editText2, img6editText3, img6editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img6);
        myDb = new DatabaseHelper(this);

        img6editText1 = (EditText) findViewById(R.id.img6editText1);
        img6editText1.setText("Two gang ring, Device XXXXXX");

        img6editText2 = (EditText) findViewById(R.id.img6editText2);
        img6editText2.setText("Stud mount, 4 inch square welded box, XXX bracket or similar");

        img6editText3 = (EditText) findViewById(R.id.img6editText3);

        img6editText4 = (EditText) findViewById(R.id.img6editText4);
        //img6editText4.setText("6");

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
                                img6editText1.getText().toString(),
                                img6editText2.getText().toString(),
                                img6editText3.getText().toString(),
                                img6editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img6.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img6.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}
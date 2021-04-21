package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img4 extends AppCompatActivity {

    EditText img4editText1, img4editText2, img4editText3, img4editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img4);
        myDb = new DatabaseHelper(this);

        img4editText1 = (EditText) findViewById(R.id.img4editText1);
        img4editText1.setText("Two gang ring, Device XXXXXX");

        img4editText2 = (EditText) findViewById(R.id.img4editText2);
        img4editText2.setText("Stud mount, 4 inch square welded box, XXX bracket or similar");

        img4editText3 = (EditText) findViewById(R.id.img4editText3);

        img4editText4 = (EditText) findViewById(R.id.img4editText4);
        //img4editText4.setText("4");

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
                                img4editText1.getText().toString(),
                                img4editText2.getText().toString(),
                                img4editText3.getText().toString(),
                                img4editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img4.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img4.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}
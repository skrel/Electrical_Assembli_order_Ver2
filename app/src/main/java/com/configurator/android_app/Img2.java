package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img2 extends AppCompatActivity {

    EditText img2editText1, img2editText2, img2editText3, img2editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img2);
        myDb = new DatabaseHelper(this);

        img2editText1 = (EditText) findViewById(R.id.img2editText1);
        img2editText1.setText("Two gang ring, Device XXXXXX");

        img2editText2 = (EditText) findViewById(R.id.img2editText2);
        img2editText2.setText("Stud mount, 4 inch square welded box, XXX bracket or similar");

        img2editText3 = (EditText) findViewById(R.id.img2editText3);

        img2editText4 = (EditText) findViewById(R.id.img2editText4);
        //img2editText4.setText("2");

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
                                img2editText1.getText().toString(),
                                img2editText2.getText().toString(),
                                img2editText3.getText().toString(),
                                img2editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img2.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img2.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}

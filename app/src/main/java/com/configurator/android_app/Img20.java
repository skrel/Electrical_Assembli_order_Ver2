package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img20 extends AppCompatActivity {

    EditText img20editText1, img20editText2, img20editText3, img20editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img20);
        myDb = new DatabaseHelper(this);

        img20editText1 = (EditText) findViewById(R.id.img20editText1);
        img20editText1.setText("One gang ring, Device XXXXXX");

        img20editText2 = (EditText) findViewById(R.id.img20editText2);
        img20editText2.setText("Between studs, (2)x4 inch square welded boxes, XXXXXX bracket or similar (16in stud, not adjustable)");

        img20editText3 = (EditText) findViewById(R.id.img20editText3);

        img20editText4 = (EditText) findViewById(R.id.img20editText4);
        //img20editText4.setText("20");

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
                                img20editText1.getText().toString(),
                                img20editText2.getText().toString(),
                                img20editText3.getText().toString(),
                                img20editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img20.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img20.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}
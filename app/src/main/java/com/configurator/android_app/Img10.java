package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img10 extends AppCompatActivity {

    EditText img10editText1, img10editText2, img10editText3, img10editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img10);
        myDb = new DatabaseHelper(this);

        img10editText1 = (EditText) findViewById(R.id.img10editText1);
        img10editText1.setText("Two gang ring, Device XXXXXX");

        img10editText2 = (EditText) findViewById(R.id.img10editText2);
        img10editText2.setText("Between studs, 4 inch square welded box, adjustable XXXXXX bracket (16in - 24in) or similar");

        img10editText3 = (EditText) findViewById(R.id.img10editText3);

        img10editText4 = (EditText) findViewById(R.id.img10editText4);
        //img10editText4.setText("10");

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
                                img10editText1.getText().toString(),
                                img10editText2.getText().toString(),
                                img10editText3.getText().toString(),
                                img10editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img10.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img10.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}

package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img21 extends AppCompatActivity {

    EditText img21editText1, img21editText2, img21editText3, img21editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img21);
        myDb = new DatabaseHelper(this);

        img21editText1 = (EditText) findViewById(R.id.img21editText1);
        img21editText1.setText("One gang ring, Device XXXXXX");

        img21editText2 = (EditText) findViewById(R.id.img21editText2);
        img21editText2.setText("Between studs, (2)xOpen back boxes, adjustable XXXXXX bracket (16in - 24in) or similar");

        img21editText3 = (EditText) findViewById(R.id.img21editText3);

        img21editText4 = (EditText) findViewById(R.id.img21editText4);
        //img21editText4.setText("21");

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
                                img21editText1.getText().toString(),
                                img21editText2.getText().toString(),
                                img21editText3.getText().toString(),
                                img21editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img21.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img21.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}
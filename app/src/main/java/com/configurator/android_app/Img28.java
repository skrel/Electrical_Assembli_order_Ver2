package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img28 extends AppCompatActivity {

    EditText img28editText1, img28editText2, img28editText3, img28editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img28);
        myDb = new DatabaseHelper(this);

        img28editText1 = (EditText) findViewById(R.id.img28editText1);

        img28editText2 = (EditText) findViewById(R.id.img28editText2);

        img28editText3 = (EditText) findViewById(R.id.img28editText3);

        img28editText4 = (EditText) findViewById(R.id.img28editText4);
        //img28editText4.setText("28");

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
                                img28editText1.getText().toString(),
                                img28editText2.getText().toString(),
                                img28editText3.getText().toString(),
                                img28editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img28.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img28.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}

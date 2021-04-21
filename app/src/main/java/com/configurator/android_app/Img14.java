package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img14 extends AppCompatActivity {

    EditText img14editText1, img14editText2, img14editText3, img14editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img14);
        myDb = new DatabaseHelper(this);

        img14editText1 = (EditText) findViewById(R.id.img14editText1);
        img14editText1.setText("One gang ring, Device XXXXXX");

        img14editText2 = (EditText) findViewById(R.id.img14editText2);
        img14editText2.setText("Between studs, open back box, adjustable XXXXXX bracket (16in - 24in) or similar");

        img14editText3 = (EditText) findViewById(R.id.img14editText3);

        img14editText4 = (EditText) findViewById(R.id.img14editText4);
        //img14editText4.setText("14");

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
                                img14editText1.getText().toString(),
                                img14editText2.getText().toString(),
                                img14editText3.getText().toString(),
                                img14editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img14.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img14.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}

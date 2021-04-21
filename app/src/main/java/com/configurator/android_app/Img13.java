package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img13 extends AppCompatActivity {

    EditText img13editText1, img13editText2, img13editText3, img13editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img13);
        myDb = new DatabaseHelper(this);

        img13editText1 = (EditText) findViewById(R.id.img13editText1);
        img13editText1.setText("One gang ring, Device XXXXXX");

        img13editText2 = (EditText) findViewById(R.id.img13editText2);
        img13editText2.setText("Between studs, open back box, adjustable XXXXXX bracket (16in - 24in) or similar");

        img13editText3 = (EditText) findViewById(R.id.img13editText3);

        img13editText4 = (EditText) findViewById(R.id.img13editText4);
        //img13editText4.setText("13");

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
                                img13editText1.getText().toString(),
                                img13editText2.getText().toString(),
                                img13editText3.getText().toString(),
                                img13editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img13.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img13.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}

package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img8 extends AppCompatActivity {

    EditText img8editText1, img8editText2, img8editText3, img8editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img8);
        myDb = new DatabaseHelper(this);

        img8editText1 = (EditText) findViewById(R.id.img8editText1);
        img8editText1.setText("Two gang ring, Device XXXXXX");

        img8editText2 = (EditText) findViewById(R.id.img8editText2);
        img8editText2.setText("Stud mount, open back welded box, no bracket");

        img8editText3 = (EditText) findViewById(R.id.img8editText3);

        img8editText4 = (EditText) findViewById(R.id.img8editText4);
        //img8editText4.setText("8");

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
                                img8editText1.getText().toString(),
                                img8editText2.getText().toString(),
                                img8editText3.getText().toString(),
                                img8editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img8.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img8.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}

package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img26 extends AppCompatActivity {

    EditText img26editText1, img26editText2, img26editText3, img26editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img26);
        myDb = new DatabaseHelper(this);

        img26editText1 = (EditText) findViewById(R.id.img26editText1);
        img26editText1.setText("X degree bend");

        img26editText2 = (EditText) findViewById(R.id.img26editText2);

        img26editText3 = (EditText) findViewById(R.id.img26editText3);

        img26editText4 = (EditText) findViewById(R.id.img26editText4);
        //img26editText4.setText("26");

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
                                img26editText1.getText().toString(),
                                img26editText2.getText().toString(),
                                img26editText3.getText().toString(),
                                img26editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img26.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img26.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}

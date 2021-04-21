package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img17 extends AppCompatActivity {

    EditText img17editText1, img17editText2, img17editText3, img17editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img17);
        myDb = new DatabaseHelper(this);

        img17editText1 = (EditText) findViewById(R.id.img17editText1);
        img17editText1.setText("Loop Hanger");

        img17editText2 = (EditText) findViewById(R.id.img17editText2);

        img17editText3 = (EditText) findViewById(R.id.img17editText3);

        img17editText4 = (EditText) findViewById(R.id.img17editText4);
        //img17editText4.setText("17");

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
                                img17editText1.getText().toString(),
                                img17editText2.getText().toString(),
                                img17editText3.getText().toString(),
                                img17editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img17.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img17.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}

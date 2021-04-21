package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img18 extends AppCompatActivity {

    EditText img18editText1, img18editText2, img18editText3, img18editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img18);
        myDb = new DatabaseHelper(this);

        img18editText1 = (EditText) findViewById(R.id.img18editText1);
        img18editText1.setText("One Level Trapeze Hanger");

        img18editText2 = (EditText) findViewById(R.id.img18editText2);

        img18editText3 = (EditText) findViewById(R.id.img18editText3);

        img18editText4 = (EditText) findViewById(R.id.img18editText4);
        //img18editText4.setText("18");

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
                                img18editText1.getText().toString(),
                                img18editText2.getText().toString(),
                                img18editText3.getText().toString(),
                                img18editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img18.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img18.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}

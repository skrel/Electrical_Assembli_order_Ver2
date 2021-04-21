package com.configurator.android_app;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Cart extends AppCompatActivity {
    DatabaseHelper myDb;
    Button button9, button10;
    EditText deleteItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        myDb = new DatabaseHelper(this);
        button9 = (Button)findViewById(R.id.button9);
        button10 = (Button)findViewById(R.id.button10);
        deleteItem = (EditText)findViewById(R.id.deleteItem);

        viewAll();
        DeleteData();

    }

    //redirect to export csv-------------------------------------------------------------------------



    //redirect to export csv-------------------------------------------------------------------------


    //delete data-------------------------------------------------------------------------

    public void DeleteData(){
        button10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Integer deletedRows = myDb.deleteData(deleteItem.getText().toString());
                        if(deletedRows > 0)
                            Toast.makeText(Cart.this,"Data Deleted", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Cart.this,"Data Not Deleted", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    //delete data-------------------------------------------------------------------------


    //show data-------------------------------------------------------------------------

    public void viewAll(){
        button9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Cursor res = myDb.getAllData();
                        if(res.getCount() == 0) {
                            //showMessage("No data");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext()) {
                            buffer.append("Item #:     "+res.getString(0)+"\n");
                            buffer.append("QTY:        "+res.getString(4)+"\n");
                            buffer.append(res.getString(1)+"\n");
                            buffer.append(res.getString(2)+"\n");
                            buffer.append(res.getString(3)+"\n\n");

                        }
                        showMessage("All Items In Your Cart",buffer.toString());
                    }
                }
        );

    }

    public void showMessage(String title, String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }

    //show data-------------------------------------------------------------------------


}

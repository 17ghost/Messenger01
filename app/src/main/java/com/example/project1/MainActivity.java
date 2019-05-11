package com.example.project1;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity<imageButton> extends AppCompatActivity {

    private imageButton imageButton1 ,imageButton2 , imageButton3, imageButton4,imageButton5 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v){
        AlertDialog.Builder a_builder = new AlertDialog.Builder(MainActivity.this);
        a_builder.setMessage("we did it!!!")
                .setCancelable(false)
                .setPositiveButton("close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("click this", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = a_builder.create();
        alert.setTitle("close program");
        alert.show();
    }

//    public void addListenerOnButton(){
//        imageButton1 = (imageButton)findViewById(R.id.imageButton1);
//        imageButton1.setOnClickListener(
//                new View.OnClickListener(){
//                    @Override
//                    public void onClick(View v){
//
//
//                    }
//                }
//        );
//    }
}

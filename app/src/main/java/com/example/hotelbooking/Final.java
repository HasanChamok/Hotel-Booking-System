package com.example.hotelbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Final extends AppCompatActivity {

    public int sum=0;
    public int number;
    public TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Intent intent = getIntent();
        String text = intent.getStringExtra(order.EXTRA_TEXT);
        number = intent.getIntExtra(order.EXTRA_NUM, 0);

        textView2 = (TextView)findViewById(R.id.textview2);
        textView2.setEnabled(false);
        Button button = ( Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlast();
            }
        });
    }

    public void openlast(){
        Intent intent = new Intent(this, Last.class);
        startActivity(intent);
    }
    public void selectedPack(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.smallpackage1 :
                if(checked){
                    sum = sum + (number * 500 );
                }
                else{
                    sum = sum - (number * 500);
                }
                break;
            case R.id.smallpackage2 :
                if(checked){
                    sum = sum + (number * 400 );
                }
                else{
                    sum = sum - (number * 400);
                }
                break;
            case R.id.smallpackage3 :
                if(checked){
                    sum = sum + (number * 700 );
                }
                else{
                    sum = sum - (number * 700);
                }
                break;
            case R.id.smallpackage4 :
                if(checked){
                    sum = sum + (number * 600 );
                }
                else{
                    sum = sum - (number * 600);
                }
                break;
            case R.id.smallpackage5 :
                if(checked){
                    sum = sum + (number * 800 );
                }
                else{
                    sum = sum - (number * 800);
                }
                break;
            case R.id.smallpackage6 :
                if(checked){
                    sum = sum + (number * 700);
                }
                else{
                    sum = sum - (number * 700);
                }
                break;
            case R.id.familypackage7 :
                if(checked){
                    sum = sum + (number * 1200 );
                }
                else{
                    sum = sum - (number * 1200);
                }
                break;
            case R.id.familypackage8 :
                if(checked){
                    sum = sum + (number * 1000 );
                }
                else{
                    sum = sum - (number * 1000);
                }
                break;
            case R.id.familypackage9 :
                if(checked){
                    sum = sum + (number * 1300 );
                }
                else{
                    sum = sum - (number * 1300);
                }
                break;
            case R.id.familypackage10 :
                if(checked){
                    sum = sum + (number * 1000 );
                }
                else{
                    sum = sum - (number * 1000);
                }
                break;
        }
    }
    public void finalorder(View view){
        textView2.setText(" YOU HAVE TO PAY " + sum + "TAKA TO BOOK");
        textView2.setEnabled(true);
    }
}

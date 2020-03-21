package com.example.hotelbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class order extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.example.hotelbooking.example.EXTRA_TEXT";
    public static final String EXTRA_NUM = "com.example.hotelbooking.example.EXTRA_NUM";

    ArrayList<String> select = new ArrayList<String>();
    TextView text;
    Button button;
    String finaltext;
    int a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        text = (TextView) findViewById(R.id.finalresult);
        button = (Button) findViewById(R.id.button3) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
        text.setEnabled(false);

    }


    public void selection(View view){
            boolean checked = ((CheckBox) view).isChecked();
            switch (view.getId()){
                case R.id.saturday :
                    if(checked){
                        select.add("Saturday");
                        a++;
                    }
                    else {
                        select.remove("Saturday");
                        a--;
                    }
                    break;
                case R.id.sunday :
                    if(checked){
                        select.add("Sunday");
                        a++;
                    }
                    else {
                        select.remove("Sunday");
                        a--;
                    }
                    break;
                case R.id.monday :
                    if(checked){
                        select.add("Monday");
                        a++;
                    }
                    else {
                        select.remove("Monday");
                        a--;
                    }
                    break;
                case R.id.tuesday :
                    if(checked){
                        select.add("Tuesday");
                        a++;
                    }
                    else {
                        select.remove("Tuesday");
                        a--;
                    }
                    break;
                case R.id.wednesday :
                    if(checked){
                        select.add("Wednesday");
                        a++;
                    }
                    else {
                        select.remove("Wednesday");
                        a--;
                    }
                    break;
                case R.id.thursday :
                    if(checked){
                        select.add("Thursday");
                        a++;
                    }
                    else {
                        select.remove("Thursday");
                        a--;
                    }
                    break;
                case R.id.friday :
                    if(checked){
                        select.add("Friday");
                        a++;
                    }
                    else {
                        select.remove("Friday");
                        a--;
                    }
                    break;
                case R.id.day :
                    if(checked){
                        select.add("Day");
                        a++;
                    }
                    else {
                        select.remove("Day");
                        a--;
                    }
                    break;
                case R.id.night :
                    if(checked){
                        select.add("Night");
                        a++;
                    }
                    else {
                        select.remove("Night");
                        a--;
                    }
                    break;
                case R.id.both :
                    if(checked){
                        select.add("Day and Night");
                    }
                    else {
                        select.remove("Day and Night");
                    }
                    break;
            }
    }
    public void finalselection(View view){
        finaltext = "You have selected the following Days : " + a  +"\n";
        for(String selections : select){
            finaltext = finaltext + selections + "\n";
        }
        text.setText(finaltext);
        text.setEnabled(true);
    }
    public void openActivity4(){
        Intent intent = new Intent(this, Final.class);
        intent.putExtra(EXTRA_TEXT ,finaltext);
        intent.putExtra(EXTRA_NUM, a);
        startActivity(intent);
    }
}

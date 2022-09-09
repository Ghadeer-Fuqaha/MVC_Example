package com.example.mvc_example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvc_example.R;
import com.example.mvc_example.pojo.Model;

public class MainActivity extends AppCompatActivity {

    //The MainActivity (Java Class) present the controller in (MVC Architecture)

    public TextView txt;
    public Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView) findViewById(R.id.textView);
        btn = (Button) findViewById(R.id.button);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt.setText(getProductFromDatabase().getName());
            }
        });




    }

    public Model getProductFromDatabase(){
        return new Model(1,"Milk","5$","Drink");
    }
}
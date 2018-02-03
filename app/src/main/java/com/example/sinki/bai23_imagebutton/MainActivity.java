package com.example.sinki.bai23_imagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton radFB,radYTB;
    Button btnGC;
    ImageView imgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        radFB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    imgView.setImageResource(R.drawable.facebook);
                }
            }
        });
        radYTB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    imgView.setImageResource(R.drawable.youtube);
                }
            }
        });
        btnGC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Bạn chọn Google Chomre",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void addControls() {
        radFB = (RadioButton) findViewById(R.id.radFB);
        radYTB = (RadioButton) findViewById(R.id.radYTB);
        imgView = (ImageView) findViewById(R.id.imgView);

    }
}

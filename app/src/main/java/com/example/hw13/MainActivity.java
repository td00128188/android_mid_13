package com.example.hw13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void but_click(View view){
        EditText et=findViewById(R.id.editTextNumber);
        ImageView iv=findViewById(R.id.imageView);
        int[] images=new int[10];
        images[0]=R.drawable.aa;
        images[1]=R.drawable.bb;
        images[2]=R.drawable.cc;
        images[3]=R.drawable.dd;
        images[4]=R.drawable.ee;
        images[5]=R.drawable.ff;
        images[6]=R.drawable.gg;
        images[7]=R.drawable.hh;
        images[8]=R.drawable.ii;
        images[9]=R.drawable.jj;
        iv.setImageResource(images[(Integer.parseInt(et.getText().toString())-1)]);
    }
}
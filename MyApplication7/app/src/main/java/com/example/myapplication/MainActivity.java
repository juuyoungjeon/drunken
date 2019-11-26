package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button newpage = (Button)findViewById(R.id.bt1);
        newpage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "다음 페이지입니다", Toast.LENGTH_LONG).show();
                Intent myintent = new Intent(MainActivity.this,Main2Activity.class);
                myintent.putExtra("name","와이프");
                myintent.putExtra("age",23);
                startActivity(myintent);

            }
        });

        Button call = (Button)findViewById(R.id.bt1I);
        call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),"전화가 걸립니다", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:/01012345678"));
                startActivity(intent);
                finish();
            }
        });

        Button call2 = (Button)findViewById(R.id.bt2I);
        call2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),"전화가 걸립니다", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:/01011111111"));
                startActivity(intent);
                finish();
            }
        });

        Button call3 = (Button)findViewById(R.id.camera);
        call3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"카메라로 연결됩니다", Toast.LENGTH_LONG).show();
                Intent intent = new Intent();
                intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
                finish();
            }
        });
    }
}

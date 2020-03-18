package kr.co.tjoeun.complictedpractice;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import javax.xml.transform.Result;

import kr.co.tjoeun.complictedpractice.databinding.ActivityMain2Binding;

public class Main2Activity extends AppCompatActivity {
    ActivityMain2Binding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);

       binding.signupSignupBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
               String signupNameEdi = binding.signupNameEdi.getText().toString();
               String signupPhoneEdi = binding.signupPhoneEdi.getText().toString();
               intent.putExtra("userId",signupNameEdi);
               intent.putExtra("userPhone", signupPhoneEdi);
               startActivity(intent);
           }
       });

    }


    }

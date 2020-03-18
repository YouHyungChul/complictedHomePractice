package kr.co.tjoeun.complictedpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import kr.co.tjoeun.complictedpractice.databinding.ActivityMain3Binding;

public class Main3Activity extends AppCompatActivity {
    ActivityMain3Binding binding = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main3);

        final Intent intent = getIntent();
        String name = intent.getExtras().getString("userId");
        String phone = intent.getExtras().getString("userPhone");
        binding.infoIdTxt.setText(name);
        binding.infoPhoneTxt.setText(phone);

        binding.infoModiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Main3Activity.this, Main4Activity.class);
                startActivity(intent1);
            }
        });


    }
}

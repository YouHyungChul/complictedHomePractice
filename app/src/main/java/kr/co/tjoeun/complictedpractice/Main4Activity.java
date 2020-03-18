package kr.co.tjoeun.complictedpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import kr.co.tjoeun.complictedpractice.databinding.ActivityMain4Binding;

public class Main4Activity extends AppCompatActivity {
    ActivityMain4Binding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main4);

        binding.modiInputBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main4Activity.this, Main3Activity.class);
                String modiId = binding.modiNameEdi.getText().toString();
                String modiPhone = binding.modiNameEdi.getText().toString();
                intent.putExtra("modiName", modiId);
                intent.putExtra("modiPhone", modiPhone);
                startActivity(intent);


                finish();

            }
        });
    }
}

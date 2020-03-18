package kr.co.tjoeun.complictedpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kr.co.tjoeun.complictedpractice.databinding.ActivityMain3Binding;

public class Main3Activity extends AppCompatActivity {
    ActivityMain3Binding binding = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main3);
    }
}

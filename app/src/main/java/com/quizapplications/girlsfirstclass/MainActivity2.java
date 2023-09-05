package com.quizapplications.girlsfirstclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.quizapplications.girlsfirstclass.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {


    ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());





        binding.textView.setText(getIntent().getStringExtra("key"));
        binding.textView2.setText(getIntent().getStringExtra("key2"));




    }
}
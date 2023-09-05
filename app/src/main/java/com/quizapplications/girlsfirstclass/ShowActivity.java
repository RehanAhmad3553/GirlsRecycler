package com.quizapplications.girlsfirstclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.ScriptGroup;

import com.quizapplications.girlsfirstclass.databinding.ActivityShowBinding;

public class ShowActivity extends AppCompatActivity {


    ActivityShowBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityShowBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        int image = getIntent().getIntExtra("pic",0);
        


        binding.textView5.setText(name);
        binding.textView8.setText(email);
        binding.imageView2.setImageResource(image);



    }
}
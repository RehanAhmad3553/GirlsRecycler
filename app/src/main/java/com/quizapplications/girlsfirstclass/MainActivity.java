package com.quizapplications.girlsfirstclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.quizapplications.girlsfirstclass.Adapter.MyAdapter;
import com.quizapplications.girlsfirstclass.Adapter.MyAdapter2;
import com.quizapplications.girlsfirstclass.Model.ModelClass;
import com.quizapplications.girlsfirstclass.Model.ModelClass2;
import com.quizapplications.girlsfirstclass.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;

    ArrayList<ModelClass> list;

    ArrayList<ModelClass2> list2;


    @SuppressLint("SuspiciousIndentation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list = new ArrayList<>();
        list2 = new ArrayList<>();


        list.add(new ModelClass("farhad", "farhad@gmail.com", R.drawable.image));
        list.add(new ModelClass("shahid", "shahid@gmail.com", R.drawable.image));
        list.add(new ModelClass("ahmad", "ahmad@gmail.com", R.drawable.image));
        list.add(new ModelClass("ali", "ali@gmail.com", R.drawable.image));
        list.add(new ModelClass("farhad", "farhad@gmail.com", R.drawable.image));
        list.add(new ModelClass("farhad", "farhad@gmail.com", R.drawable.image));
        list.add(new ModelClass("farhad", "farhad@gmail.com", R.drawable.image));
        list.add(new ModelClass("farhad", "farhad@gmail.com", R.drawable.image));
        list.add(new ModelClass("farhad", "farhad@gmail.com", R.drawable.image));


        // StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2 , StaggeredGridLayoutManager.HORIZONTAL);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);


        // GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);


        MyAdapter adapter = new MyAdapter(list);
        binding.Recycler.setLayoutManager(layoutManager);
        binding.Recycler.setAdapter(adapter);


        MyAdapter2 adapter2 = new MyAdapter2(list2);
       /* binding.Recycler2.setLayoutManager(gridLayoutManager);
        binding.Recycler2.setAdapter(adapter2);*/


    }


}
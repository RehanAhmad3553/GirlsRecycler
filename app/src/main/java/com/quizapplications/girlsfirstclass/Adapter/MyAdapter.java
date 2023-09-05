package com.quizapplications.girlsfirstclass.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.quizapplications.girlsfirstclass.MainActivity2;
import com.quizapplications.girlsfirstclass.Model.ModelClass;
import com.quizapplications.girlsfirstclass.R;
import com.quizapplications.girlsfirstclass.ShowActivity;
import com.quizapplications.girlsfirstclass.databinding.ListItemBinding;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{


    ArrayList<ModelClass> list;

    public MyAdapter(ArrayList<ModelClass> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

       ModelClass obj = list.get(position);

       holder.binding.textView3.setText(obj.getName());
       holder.binding.textView4.setText(obj.getEmail());


       holder.binding.imageView.setImageResource(obj.getImage());


       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent intent = new Intent(v.getContext(), ShowActivity.class);
               intent.putExtra("name",obj.getName());
               intent.putExtra("email",obj.getEmail());
               intent.putExtra("pic",obj.getImage());
               v.getContext().startActivity(intent);

           }
       });








    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
  {

      ListItemBinding binding;



      public ViewHolder(@NonNull View itemView) {
          super(itemView);
          binding = ListItemBinding.bind(itemView);


      }
  }








}

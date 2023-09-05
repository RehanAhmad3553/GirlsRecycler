package com.quizapplications.girlsfirstclass.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.quizapplications.girlsfirstclass.Model.ModelClass2;
import com.quizapplications.girlsfirstclass.R;
import com.quizapplications.girlsfirstclass.databinding.ListItem2Binding;

import java.util.ArrayList;

public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.ViewHolder>{


    ArrayList<ModelClass2> list2;

    public MyAdapter2(ArrayList<ModelClass2> list2) {
        this.list2 = list2;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item2,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ModelClass2 obj = list2.get(position);

        holder.binding.textView6.setText(obj.getName());
        holder.binding.textView7.setText(obj.getAddress());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obj.getName().equals("XYZ"))
                {
                    Toast.makeText(v.getContext(), "XYZ", Toast.LENGTH_SHORT).show();
                }
                else if(obj.getName().equals("CDF"))
                {
                    Toast.makeText(v.getContext(), "CDF", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }

    @Override
    public int getItemCount() {
        return list2.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
            ListItem2Binding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            binding = ListItem2Binding.bind(itemView);


        }
    }

}

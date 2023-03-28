package com.example.fourthhomework.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fourthhomework.Car;
import com.example.fourthhomework.R;
import com.example.fourthhomework.carClick;
import com.example.fourthhomework.databinding.ItemCarBinding;

import java.util.ArrayList;

public class CarsAdapter extends RecyclerView.Adapter<CarsAdapter.ViewHolder> {

    ArrayList<Car> arrayList;
    carClick onCarClick;

    public CarsAdapter(ArrayList<Car> arrayList, carClick carClick) {
        this.arrayList = arrayList;
        onCarClick = carClick;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder
                (ItemCarBinding
                        .inflate(LayoutInflater
                                .from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(arrayList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onCarClick.carClick(arrayList.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ItemCarBinding itemCarBinding;

        public ViewHolder(@NonNull ItemCarBinding itemCarBinding) {
            super(itemCarBinding.getRoot());
            this.itemCarBinding = itemCarBinding;
        }

        public void onBind(Car car) {
            itemCarBinding.ivOne.setImageResource(car.getImage());
            itemCarBinding.appCompatTextView.setText(car.getName());
        }
    }
}




package com.example.fourthhomework;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fourthhomework.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {
    ActivityDetailBinding binding;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        if (getIntent() != null) {
            Car car = (Car) getIntent().getSerializableExtra("car");
            binding.textViewDetail.setText(((Car) getIntent().getSerializableExtra("car")).getName());
            binding.imageViewDetail.setImageResource(((Car) getIntent().getSerializableExtra("car")).getImage());
            binding.textViewDescriptionDetail.setText(((Car) getIntent().getSerializableExtra("car")).getDescription());
        }
    }
}

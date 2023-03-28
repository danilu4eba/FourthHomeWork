package com.example.fourthhomework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.fourthhomework.databinding.ActivityMainBinding;
import com.example.fourthhomework.recyclerview.CarsAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements carClick {

    ArrayList<Car> arrayList;
    CarsAdapter carsAdapter;

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        fillList();
    }

    private void fillList() {
        arrayList = new ArrayList<>();
        arrayList.add(new Car("lexus", "japan car", R.drawable.lexus));
        arrayList.add(new Car("mazda", "japan car", R.drawable.mazda));
        arrayList.add(new Car("mers", "germany car", R.drawable.mers));
        arrayList.add(new Car("jeep", "usa car", R.drawable.jee));
        carsAdapter = new CarsAdapter(arrayList, this);
        binding.rv.setAdapter(carsAdapter);
    }

    @Override
    public void carClick(Car car) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("car", car);
        startActivity(intent);

    }
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}

package com.rikx.boltovnik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.rikx.boltovnik.databinding.ActivityAkauntBinding;

public class Akaunt extends AppCompatActivity {
    private ActivityAkauntBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAkauntBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


    }
}
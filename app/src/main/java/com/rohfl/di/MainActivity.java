package com.rohfl.di;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.rohfl.di.databinding.ActivityMainBinding;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

//    @Inject SampleObject sampleObject;

    @Inject OtherObject otherObject;

    ActivityMainBinding binding;

    private boolean isAlreadyClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        View v = binding.getRoot();

        setContentView(v);

        binding.button.setOnClickListener(v1 -> {
            if(!isAlreadyClicked) {
                binding.sampleText.setText("Hello Rohit, I am text view.");
            } else {
                binding.sampleText.setText("");
            }
            isAlreadyClicked = !isAlreadyClicked;

        });
//        sampleObject.hello();

    }
}
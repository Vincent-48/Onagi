package com.example.onagi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.onagi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    TextView txtName;
    TextView txtAbout;
    ImageView txtProfilePic;
    ActivityMainBinding binding;

    @Overrides
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.home:
                    replaceFragment(new HomeFragment());
                    break;
                case R.id.profile:
                    replaceFragment(new ProfileFragment());
                    break;
                case R.id.messages:
                    replaceFragment(new MessageFragment());
                    break;
                case R.id.notify:
                    replaceFragment(new NotifyFragment());
                    break;
                case R.id.friends:
                    replaceFragment(new FriendsFragment());

                        break;
            }
            return true;
        });

        txtProfilePic = findViewById(R.id.imageView);




    }
    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();
    }
}
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
import android.widget.Toast;

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
                    Toast.makeText(this,"Home section",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.profile:
                    replaceFragment(new ProfileFragment());
                    Toast.makeText(this,"Profile section",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.messages:
                    replaceFragment(new MessageFragment());
                    Toast.makeText(this,"Messages section",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.notify:
                    replaceFragment(new NotifyFragment());
                    Toast.makeText(this,"Notifications section",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.friends:
                    replaceFragment(new FriendsFragment());
                    Toast.makeText(this,"Friends section",Toast.LENGTH_SHORT).show();

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
package com.example.samplesrepos.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.samplesrepos.R;
import com.example.samplesrepos.view.fragment.FragmentDua;
import com.example.samplesrepos.view.fragment.FragmentSatu;
import com.example.samplesrepos.view.fragment.FragmentTiga;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav_layout);

        getFragmentPage(new FragmentSatu());

        BottomNavigationView bottomNavigation = findViewById(R.id.bottomNavigationView);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;

                //Menantukan halaman Fragment yang akan tampil
                switch (item.getItemId()){
                    case R.id.fr_satu:
                        fragment = new FragmentSatu();
                        break;

                    case R.id.fr_dua:
                        fragment = new FragmentDua();
                        break;

                    case R.id.fr_tiga:
                        fragment = new FragmentTiga();
                        break;
                }
                return getFragmentPage(fragment);
            }
        });

    }

    //Menampilkan halaman Fragment
    private boolean getFragmentPage(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.page_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
package com.example.opensource103.opensourceproject103;

import android.app.Application;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.pedro.library.AutoPermissions;
import com.pedro.library.AutoPermissionsListener;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity implements AutoPermissionsListener {

    HomeFragment homeFragment;
    SearchFragment searchFragment;
    MarketFragment gpsFragment;
    FavoritesFragment myInfoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homeFragment = new HomeFragment();
        searchFragment = new SearchFragment();
        gpsFragment = new MarketFragment();
        myInfoFragment = new FavoritesFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
                        return true;
                    case R.id.search:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, searchFragment).commit();
                        return true;
                    case R.id.gps:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, gpsFragment).commit();
                        return true;
                    case R.id.me:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, myInfoFragment).commit();
                        return true;
                }
                return false;
            }

        });

        AutoPermissions.Companion.loadAllPermissions(this, 101);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        AutoPermissions.Companion.parsePermissions(this, requestCode, permissions, this);
    }

    @Override
    public void onDenied(int i, @NotNull String[] strings) {
        // Toast.makeText(this, "permission denied", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onGranted(int i, @NotNull String[] strings) {
        // Toast.makeText(this, "permission granted", Toast.LENGTH_SHORT).show();
    }
}

package com.a.intest2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import static com.a.intest2.Tool.out;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        BottomNavigationView navView = findViewById(R.id.nav_view);
        //
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_first,
                R.id.navigation_second
        ).build();
        //
        //try {
            NavController navController = Navigation.findNavController(
                    this,
                    R.id.nav_host_fragment
            );
            NavigationUI.setupActionBarWithNavController(
                    this,
                    navController,
                    appBarConfiguration
            );
            NavigationUI.setupWithNavController(
                    navView,
                    navController
            );
        //}
//        catch (Exception ex) {
//            out("main", ex);
//        }
    }
}
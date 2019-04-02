package com.example.cookart;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

public class homeScrenn extends AppCompatActivity {
    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;
    private fragmentHome fragmentHome;
    private fragmentCookingRecipe fragmentCookingRecipe;
    private fragmentMenu fragmentMenu;
    private fragmentNotification fragmentNotification;
    private fragmentPersonal fragmentPersonal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screnn);


        mMainNav= findViewById(R.id.default_bottom_navigation);
        mMainFrame = findViewById(R.id.main_frame);
        fragmentHome = new fragmentHome();
        fragmentCookingRecipe = new fragmentCookingRecipe();
        fragmentMenu = new fragmentMenu();
        fragmentNotification = new fragmentNotification();
        fragmentPersonal = new fragmentPersonal();


        // set default fragment is homefragment
        setFragment(fragmentHome);

        /*
         * set fragment for items on bottom navigation */
        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.action_home :
                        setFragment(fragmentHome);
                        return true;
                    case R.id.cooking_recipe:
                        setFragment(fragmentCookingRecipe);
                        return true;
                    case R.id.menu:
                        setFragment(fragmentMenu);
                        return true;
                    case R.id.notification:
                        setFragment(fragmentNotification);
                        return true;
                    case R.id.personal:
                        setFragment(fragmentPersonal);
                        return true;

                    default:
                        return false;

                }
            }
        });


    }




    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();
    }


}

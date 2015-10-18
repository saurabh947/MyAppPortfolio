package com.saurabh.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Test Commit
    }

    public void popMovies1(View view) {
        Toast.makeText(this, "This will launch the Popular Movies - 1 App", Toast.LENGTH_LONG).show();
    }

    public void popMovies2(View view) {
        Toast.makeText(this, "This will launch the Popular Movies - 2 App", Toast.LENGTH_LONG).show();
    }

    public void productionize(View view) {
        Toast.makeText(this, "This will launch the Productionize App", Toast.LENGTH_LONG).show();
    }

    public void buildBigger(View view) {
        Toast.makeText(this, "This will launch the Build Bigger App", Toast.LENGTH_LONG).show();
    }

    public void capstone(View view) {
        Toast.makeText(this, "This will launch the Capstone App", Toast.LENGTH_LONG).show();
    }
}

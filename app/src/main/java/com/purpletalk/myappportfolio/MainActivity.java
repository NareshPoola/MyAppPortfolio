package com.purpletalk.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.view_spotify_streamer:
                showToast("spotify streamer");
                break;
            case R.id.view_scores_app:
                showToast("scores");
                break;
            case R.id.view_library_app:
                showToast("library");
                break;
            case R.id.view_build_it_bigger:
                showToast("build it bigger");
                break;
            case R.id.view_xyz_reader:
                showToast("xyz reader");
                break;
            case R.id.view_capstone:
                showToast("my capstone");
                break;
        }
    }

    private void showToast(String message) {
        Toast.makeText(MainActivity.this, "This button will launch " + message + " app!", Toast.LENGTH_SHORT).show();

    }
}

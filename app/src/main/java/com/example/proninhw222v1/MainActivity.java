package com.example.proninhw222v1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_open_notes) {
            Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(intentNotes);
            Toast.makeText(MainActivity.this, "Отркываю записную книжку", Toast.LENGTH_LONG).show();
            return true;
        }
        if (id == R.id.action_subscribe) {
            Intent intentNotes = new Intent(MainActivity.this, SubscribeActivity.class);
            startActivity(intentNotes);
            Toast.makeText(MainActivity.this, "Отркываю подписки", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);

    }
}

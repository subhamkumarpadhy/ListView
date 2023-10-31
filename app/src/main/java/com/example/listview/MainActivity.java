package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> arrCountry = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        arrCountry.add("India");
        arrCountry.add("Pakistan");
        arrCountry.add("China");
        arrCountry.add("Afghanistan");
        arrCountry.add("Sri Lanka");
        arrCountry.add("Bhutan");
        arrCountry.add("Bangladesh");
        arrCountry.add("Iran");
        arrCountry.add("Indonesia");
        arrCountry.add("Iraq");
        arrCountry.add("Japan");
        arrCountry.add("Israel");
        arrCountry.add("Maldives");
        arrCountry.add("Mongolia");
        arrCountry.add("Oman");
        arrCountry.add("Jordan");
        arrCountry.add("Russia");
        arrCountry.add("Egypt");
        arrCountry.add("Cambodia");
        arrCountry.add("North Korea");
        arrCountry.add("Qatar");
        arrCountry.add("Singapore");
        arrCountry.add("South Korea");
        arrCountry.add("Syria");
        arrCountry.add("Thailand");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, arrCountry);
        listView.setAdapter(adapter);
        
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "India will win the world cup", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
package com.example.ipv4v6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner=findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Problem_Type, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);


        spinner.setSelection(0,false);
       spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

               String selectedItem = parent.getItemAtPosition(position).toString();
               Intent intent;
               switch (selectedItem) {
                   case "Select":
                      /* Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                       break;*/
                   case "IPv4V6":
                       intent = new Intent(MainActivity.this, Ipv4vV6.class);
                       startActivity(intent);
                       break;
                   case "Process Scheduling":
                       intent = new Intent(MainActivity.this, ProcessScheduling.class);
                       startActivity(intent);
                       break;

               }

           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {


           }
       });
    }
}
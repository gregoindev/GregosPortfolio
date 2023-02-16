package com.gregorilla.gregosportfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);


        Project[] projects = {
                new Project("Getting Started App", "Our very first project, the default 'Hello World' app!", R.drawable.getting_started),
                new Project("MyQuote", "A single quote app!", R.drawable.quote),
                new Project("DollarToPeso ", "An app that takes a Dollar Currency and converts it to Peso, teaching me Variables, Methods and Conditional Logic", R.drawable.calculator),
                new Project("Converter", "Converter app!", R.drawable.tape),
                new Project("Kainan", "A menu app for a restaurant called 'Kainan', learning about Activities, Classes & Objects, Arrays, Intents and ListViews", R.drawable.hungry_developer),

        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        list.setAdapter(adapter);
    }
}
package com.example.cylonz.bindingrecyclerview.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.example.cylonz.bindingrecyclerview.R;
import com.example.cylonz.bindingrecyclerview.adapter.RVAdapter;
import com.example.cylonz.bindingrecyclerview.data.Person;
import com.example.cylonz.bindingrecyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding Binding;
    List<Person> persons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        Binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        Binding.rv1.setHasFixedSize(true);
        Binding.rv1.setLayoutManager(llm);
        init();
        Binding.rv1.setAdapter(new RVAdapter(persons));
    }

    private void init(){
            persons = new ArrayList<>();
            persons.add(new Person("001","Jame"));
            persons.add(new Person("002","Mark"));
            persons.add(new Person("003","Oben"));
            persons.add(new Person("004","Rob"));
            persons.add(new Person("005","Marry"));
            persons.add(new Person("006","Jane"));
            persons.add(new Person("007","Tom"));
            persons.add(new Person("008","Boy"));
            persons.add(new Person("009","Ann"));
            persons.add(new Person("010","Man"));
            persons.add(new Person("011","Dark"));
            persons.add(new Person("012","Red"));
        }
}

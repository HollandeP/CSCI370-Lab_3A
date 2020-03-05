package com.example.csci370lab3a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView studentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentList = (ListView) findViewById(R.id.student);

        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student("Holly","Pocket", "Fashion");
        students.add(student1);
        Student student2 = new Student("Nathan", "Bell", "Theatre");
        students.add(student2);
        Student student3 = new Student("Julian", "Casablancas", "Music");
        students.add(student3);
        Student student4 = new Student("Alex", "Jones","Radio");
        students.add(student4);
        Student student5 = new Student("Tucker","Bytnar", "Journalism");
        students.add(student5);

        StudentAdapter adapter = new StudentAdapter(this, students);
        studentList.setAdapter(adapter);
        //


    }
}

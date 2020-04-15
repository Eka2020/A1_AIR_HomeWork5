package com.geektech.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements IonTextClick {
    public static String TEXT_KEY = "text_key";
    SomeClass someClass;
    private EditText editName, editGroup, editPhone, editAge, editCourse;
    private TextView name, group, phone, age, course;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editName = findViewById(R.id.main2_edit1);
        editGroup = findViewById(R.id.main2_edit2);
        editPhone = findViewById(R.id.main2_edit3);
        editAge = findViewById(R.id.main2_edit4);
        editCourse = findViewById(R.id.main2_edit5);

        Button close = findViewById(R.id.main_2_close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                someClass.text = editName.getText().toString();
                Log.d("ololo", someClass.text);
                intent.putExtra(MainActivity.RESULT_KEY, someClass);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        if (getIntent() != null) {
            someClass = (SomeClass) getIntent().getSerializableExtra(TEXT_KEY);
            editName.setText(someClass.text);
            someClass = (SomeClass) getIntent().getSerializableExtra(TEXT_KEY);
            editAge.setText(someClass.age);
            someClass = (SomeClass) getIntent().getSerializableExtra(TEXT_KEY);
            editPhone.setText(someClass.phone);
            someClass = (SomeClass) getIntent().getSerializableExtra(TEXT_KEY);
            editGroup.setText(someClass.group);
            someClass = (SomeClass) getIntent().getSerializableExtra(TEXT_KEY);
            editCourse.setText(someClass.course);
        } else {
            TextView name = findViewById(R.id.main2_name);
            name.setText("Nothing to show");
        }
    }

    public void Save(View v) {
        someClass.age = editAge.getText().toString();
        someClass.phone = editPhone.getText().toString();
        someClass.group = editGroup.getText().toString();
        someClass.course = editCourse.getText().toString();
        age = findViewById(R.id.main2_age);
        age.setText(someClass.age);
        phone = findViewById(R.id.main2_phone);
        phone.setText(someClass.phone);
        group = findViewById(R.id.main2_group);
        group.setText(someClass.age);
        course =  findViewById(R.id.main2_course);
        course.setText(someClass.course);

        Button save = findViewById(R.id.main_save);
        save.setVisibility(View.GONE);
        Button change= findViewById(R.id.main_change);
        change.setVisibility(View.VISIBLE);
    }

    public void Change(View v) {
            editAge.setText("");
            editName.setText("");
            editPhone.setText("");
            editGroup.setText("");
            editCourse.setText("");
        age = findViewById(R.id.main2_age);
        age.setText("");
        name = findViewById(R.id.main2_name);
        name.setText("");
        phone = findViewById(R.id.main2_phone);
        phone.setText("");
        group = findViewById(R.id.main2_group);
        group.setText("");
        course =  findViewById(R.id.main2_course);
        course.setText("");

        Button save = findViewById(R.id.main_save);
        save.setVisibility(View.VISIBLE);
        Button change= findViewById(R.id.main_change);
        change.setVisibility(View.GONE);
        }

        @Override
        public void onTextClick (SomeClass someClass){
            Log.d("ololo", "TEXT " + someClass.position);
        }

    }



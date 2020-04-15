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
    EditText editName,  editGroup, editPhone, editAge, editCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editName = findViewById(R.id.main2_edit1);
        editGroup = findViewById(R.id.main2_edit2);
        editPhone = findViewById(R.id.main2_edit3);
        editAge = findViewById(R.id.main2_edit4);
        editCourse = findViewById(R.id.main2_edit5);


        final Button save = findViewById(R.id.main_2_save);
        save.setOnClickListener(new View.OnClickListener() {
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
            TextView age = findViewById(R.id.main2_age);
            name.setText("Nothing to show");
            TextView phone = findViewById(R.id.main2_phone);
            name.setText("Nothing to show");
            TextView group = findViewById(R.id.main2_group);
            name.setText("Nothing to show");
            TextView course = findViewById(R.id.main2_course);
            name.setText("Nothing to show");
         }
    }

    public void Close(View v) {

        someClass.age = editAge.getText().toString();
        someClass.phone = editPhone.getText().toString();
        someClass.group = editGroup.getText().toString();
        someClass.course = editCourse.getText().toString();

        TextView age = (TextView) findViewById(R.id.main2_age);
        age.setText(someClass.age);
        TextView phone = (TextView) findViewById(R.id.main2_phone);
        phone.setText(someClass.phone);
        TextView group = (TextView) findViewById(R.id.main2_group);
        group.setText(someClass.age);
        TextView course = (TextView) findViewById(R.id.main2_course);
        course.setText(someClass.course);
    }

    @Override
    public void onTextClick(SomeClass someClass) {
        Log.d("ololo", "TEXT " + someClass.position);
    }

   }



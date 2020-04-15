package com.geektech.recyclerview2;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;
    private SomeClass someClass;
    IonTextClick listener;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.vh_text_name);
//        textView = itemView.findViewById(R.id.vh_text_age);
//        textView = itemView.findViewById(R.id.vh_text_phone);
//        textView = itemView.findViewById(R.id.vh_text_group);
//        textView = itemView.findViewById(R.id.vh_text_course);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onTextClick(someClass);
            }
        });
    }

    public void onBind(SomeClass someClass) {
        this.someClass = someClass;
        Log.d("ololo", someClass.text + someClass.position);
        textView.setText(someClass.text);
    }
}

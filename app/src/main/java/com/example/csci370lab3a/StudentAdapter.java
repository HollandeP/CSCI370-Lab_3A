package com.example.csci370lab3a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mInflator;
    private ArrayList<Student> mDataSource;

    public StudentAdapter(Context context, ArrayList<Student> students){
        mContext = context;
        mDataSource = students;
        mInflator = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }
    @Override
    public int getCount() {
        return mDataSource.size();
    }

    @Override
    public Object getItem(int position) {
        return mDataSource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = mInflator.inflate(R.layout.list_view_row, parent, false);

        TextView studentFirstNameView = rowView.findViewById(android.R.id.text1);
        TextView studentLastNameView = rowView.findViewById(android.R.id.text1);
        TextView studentMajorView = rowView.findViewById(android.R.id.text2);

        Student student = (Student) getItem(position);
        studentFirstNameView.setText(student.getFirstName());
        studentLastNameView.setText(student.getLastName());
        studentMajorView.setText(student.getMajor());

        return rowView;
    }
}

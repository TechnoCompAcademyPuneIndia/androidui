package course.examples.UI.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;

public class RecyclerViewActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recycler_view);

        //Set up RecyclerView
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.list);

        //Set the layout manager
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Set the ItemAnimator
        //mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        // Set up the adapter
        ArrayList<String> names = new ArrayList<String>();
        Collections.addAll(names, getResources().getStringArray(R.array.colors));

        MyRecyclerViewAdapter mAdapter = new MyRecyclerViewAdapter(names,
                R.layout.list_item, this);
        mRecyclerView.setAdapter(mAdapter);
    }
}
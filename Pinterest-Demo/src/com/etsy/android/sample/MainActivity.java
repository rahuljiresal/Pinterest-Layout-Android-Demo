package com.etsy.android.sample;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import com.etsy.android.grid.StaggeredGridView;

import java.util.ArrayList;

public class MainActivity extends Activity implements AbsListView.OnItemClickListener {

    private StaggeredGridView mGridView;
    private DataAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Pinterest Layout Demo");
        mGridView = (StaggeredGridView) findViewById(R.id.grid_view);

        mAdapter = new DataAdapter(this, R.layout.list_item_sample, SampleData.generateSampleData());

        mGridView.setAdapter(mAdapter);

        mGridView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        Toast.makeText(this, "Item Clicked: " + position, Toast.LENGTH_SHORT).show();
    }

}

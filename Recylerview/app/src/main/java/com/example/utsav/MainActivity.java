package com.example.utsav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recylerview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Code BY MR.Gujarati
 */

@SuppressWarnings("all")
public class MainActivity extends AppCompatActivity {

    /**
     * decler recylerview and
     * <p>
     * your data model cllas and create a new ArrayList.
     */
    RecyclerView RvDemo;
    List<DemoModel> demoModelList = new ArrayList<>();

    /**
     * decler the layout on your activity.
     * <p>
     * and ids.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RvDemo = findViewById(R.id.RvDemo);

        /**
         * crerate this method and decler your data.
         * */
        setData();
    }

    /**
     * Using a linearlayout to show data step by step.
     * <p>
     * recylerview in setAdapter and show data.
     */
    private void setData() {
        RvDemo.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        demoModelList.add(new DemoModel("Arijit Singh", R.drawable.arijit_singh));
        demoModelList.add(new DemoModel("Badshah", R.drawable.badshah));
        demoModelList.add(new DemoModel("Dhoni", R.drawable.dhoni));
        demoModelList.add(new DemoModel("Kohli", R.drawable.kohli));
        demoModelList.add(new DemoModel("IronMan", R.drawable.ironman));
        demoModelList.add(new DemoModel("Pandya", R.drawable.pandya));
        demoModelList.add(new DemoModel("Rohit", R.drawable.rohit));
        demoModelList.add(new DemoModel("Sidhdhu", R.drawable.sidhu));
        DemoAdapter demoAdapter = new DemoAdapter(demoModelList, MainActivity.this);
        RvDemo.setAdapter(demoAdapter);
    }
}
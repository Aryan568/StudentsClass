package com.example.studentclass.classes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.studentclass.R;

public class sixth extends AppCompatActivity {

    private CardView ch1, ch2, ch3, ch4, ch5;
    private RecyclerView rv1, rv2, rv3, rv4, rv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);



        ch1= findViewById(R.id.chapter1);
        ch2= findViewById(R.id.chapter2);
        ch3= findViewById(R.id.chapter3);
        ch4= findViewById(R.id.chapter4);
        ch5= findViewById(R.id.chapter5);

        rv1= findViewById(R.id.RecyclerView1);
        rv2= findViewById(R.id.RecyclerView2);
        rv3= findViewById(R.id.RecyclerView3);
        rv4= findViewById(R.id.RecyclerView4);
        rv5= findViewById(R.id.RecyclerView5);

        String[] img1 = {"image1", "image2", "image3", "image4", "image5", "food"};
        String[] img2 = {"imageA", "imageB", "imageC", "components"};
        String[] img3 = {"imageA", "imageB", "imageC", "fibre"};
        String[] img4 = {"imageA", "imageB", "imageC", "materials"};
        String[] img5 = {"imageA", "imageB", "imageC", "substances"};

        int[] image1= {R.drawable.ch1p1, R.drawable.ch1p1, R.drawable.ch1p1, R.drawable.ch1p1, R.drawable.ch1p1};
        int[] image2= {R.drawable.ch1p1, R.drawable.ch1p1, R.drawable.ch1p1};
        int[] image3= {R.drawable.ch1p1, R.drawable.ch1p1, R.drawable.ch1p1};
        int[] image4= {R.drawable.ch1p1, R.drawable.ch1p1, R.drawable.ch1p1};
        int[] image5= {R.drawable.ch1p1, R.drawable.ch1p1, R.drawable.ch1p1};

        rv1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rv1.setAdapter(new RVAdapter(this, img1, image1));

        rv2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rv2.setAdapter(new RVAdapter(this, img2, image2));

        rv3.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rv3.setAdapter(new RVAdapter(this, img3, image3));

        rv4.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rv4.setAdapter(new RVAdapter(this, img4, image4));

        rv5.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rv5.setAdapter(new RVAdapter(this, img5, image5));

        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleRecyclerViewVisibility(rv1);
            }
        });

        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleRecyclerViewVisibility(rv2);
            }
        });
        ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleRecyclerViewVisibility(rv3);
            }
        });
        ch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleRecyclerViewVisibility(rv4);
            }
        });
        ch5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleRecyclerViewVisibility(rv5);
            }
        });
    }

    // Helper method to toggle the visibility of a RecyclerView
    private void toggleRecyclerViewVisibility(RecyclerView recyclerView) {
        if (recyclerView.getVisibility() == View.GONE) {
            recyclerView.setVisibility(View.VISIBLE);
        } else {
            recyclerView.setVisibility(View.GONE);
        }
    }
}


package com.mardillu.observablescrollview.test;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.mardillu.observablescrollview.ObservableRecyclerView;
import com.mardillu.observablescrollview.ObservableScrollViewCallbacks;
import com.mardillu.observablescrollview.ScrollState;

public class RecyclerViewActivity extends Activity implements ObservableScrollViewCallbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        ObservableRecyclerView recyclerView = (ObservableRecyclerView) findViewById(R.id.scrollable);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setScrollViewCallbacks(this);
        UiTestUtils.setDummyData(this, recyclerView);
    }

    @Override
    public void onScrollChanged(int scrollY, boolean firstScroll, boolean dragging) {
    }

    @Override
    public void onDownMotionEvent() {
    }

    @Override
    public void onUpOrCancelMotionEvent(ScrollState scrollState) {
    }
}

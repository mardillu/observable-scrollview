package com.mardillu.observablescrollview.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AbsListView;

import com.mardillu.observablescrollview.ObservableGridView;
import com.mardillu.observablescrollview.ObservableScrollViewCallbacks;
import com.mardillu.observablescrollview.ScrollState;

public class GridViewActivity extends Activity implements ObservableScrollViewCallbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        ObservableGridView scrollable = (ObservableGridView) findViewById(R.id.scrollable);
        scrollable.setScrollViewCallbacks(this);
        UiTestUtils.setDummyData(this, scrollable);
        scrollable.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
            }
        });
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
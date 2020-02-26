package com.mardillu.observablescrollview.test;

import android.os.Bundle;

import com.mardillu.observablescrollview.ObservableListView;
import com.mardillu.observablescrollview.ScrollUtils;

public class ListViewScrollFromBottomActivity extends ListViewActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ObservableListView scrollable = (ObservableListView) findViewById(R.id.scrollable);
        ScrollUtils.addOnGlobalLayoutListener(scrollable, new Runnable() {
            @Override
            public void run() {
                int count = scrollable.getAdapter().getCount() - 1;
                int position = count == 0 ? 1 : count > 0 ? count : 0;
                scrollable.smoothScrollToPosition(position);
                scrollable.setSelection(position);
            }
        });
    }
}

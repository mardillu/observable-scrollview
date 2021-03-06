package com.mardillu.observablescrollview.test;

import android.os.Bundle;

import com.mardillu.observablescrollview.ObservableRecyclerView;
import com.mardillu.observablescrollview.ScrollUtils;

public class RecyclerViewScrollFromBottomActivity extends RecyclerViewActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ObservableRecyclerView scrollable = (ObservableRecyclerView) findViewById(R.id.scrollable);
        ScrollUtils.addOnGlobalLayoutListener(scrollable, new Runnable() {
            @Override
            public void run() {
                int count = scrollable.getAdapter().getItemCount() - 1;
                int position = count == 0 ? 1 : count > 0 ? count : 0;
                scrollable.scrollToPosition(position);
            }
        });
    }
}

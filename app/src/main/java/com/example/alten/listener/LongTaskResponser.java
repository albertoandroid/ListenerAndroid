package com.example.alten.listener;

import android.util.Log;

public class LongTaskResponser implements OnTaskListener {
    @Override
    public void onComplete() {
        Log.d("TAG", "LongTaskResponser");
    }
}

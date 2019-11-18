package run.java.com.javarunprogram.android;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.AsyncTaskLoader;

import java.util.ArrayList;
import java.util.List;

public class CustomAsynkTaskLoader extends AsyncTaskLoader<List<String>> {
    public CustomAsynkTaskLoader(@NonNull Context context) {
        super(context);
    }

    @Nullable
    @Override
    public List<String> loadInBackground() {
        return new ArrayList<String>();
    }
}

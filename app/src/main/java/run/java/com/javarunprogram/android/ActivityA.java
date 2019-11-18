package run.java.com.javarunprogram.android;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.List;

public class ActivityA extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<String>> {

    void showToast(String msg) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(ActivityA.this, msg, Toast.LENGTH_LONG).show();
            }
        }, 500);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showToast("onCreate");
        getSupportLoaderManager().initLoader(1, null, this).forceLoad();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showToast("onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showToast("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showToast("onPause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showToast("onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showToast("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast("onDestroy");
    }

    @NonNull
    @Override
    public Loader<List<String>> onCreateLoader(int i, @Nullable Bundle bundle) {
        return new CustomAsynkTaskLoader(ActivityA.this);
    }

    @Override
    public void onLoadFinished(@NonNull Loader<List<String>> loader, List<String> strings) {

    }

    @Override
    public void onLoaderReset(@NonNull Loader<List<String>> loader) {

    }
}

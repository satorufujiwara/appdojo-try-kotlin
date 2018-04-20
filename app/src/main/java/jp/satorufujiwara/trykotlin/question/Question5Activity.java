package jp.satorufujiwara.trykotlin.question;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import jp.satorufujiwara.trykotlin.R;

public class Question5Activity extends AppCompatActivity {

    private Question4ViewModel viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.question5_activity);
        viewModel = ViewModelProviders.of(this).get(Question4ViewModel.class);
    }

    @Override
    protected void onResume() {
        super.onResume();
        viewModel.start();
    }

    @Override
    protected void onPause() {
        viewModel.stop();
        super.onPause();
    }

    static class Question4ViewModel extends ViewModel {

        private Long startTime;

        public void start() {
            startTime = System.currentTimeMillis();
        }

        public void stop() {
            Log.d("Question4ViewModel", "Foreground time is " + (System.currentTimeMillis() - startTime) + "ms.");
        }
    }
}

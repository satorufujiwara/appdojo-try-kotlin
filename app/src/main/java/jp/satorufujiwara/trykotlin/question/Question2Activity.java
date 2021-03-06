package jp.satorufujiwara.trykotlin.question;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import jp.satorufujiwara.trykotlin.R;
import jp.satorufujiwara.trykotlin.databinding.Question2ActivityBinding;

public class Question2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Question2ActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.question2_activity);
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Question2Activity.this, "Hello! Kotlin!", Toast.LENGTH_LONG).show();
            }
        });
    }
}

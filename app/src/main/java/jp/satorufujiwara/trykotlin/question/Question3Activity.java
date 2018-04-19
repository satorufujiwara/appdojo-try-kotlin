package jp.satorufujiwara.trykotlin.question;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import jp.satorufujiwara.trykotlin.R;
import jp.satorufujiwara.trykotlin.databinding.Question1ActivityBinding;

public class Question3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Question1ActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.question3_activity);
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.textView.getVisibility() == View.VISIBLE) {
                    binding.textView.setVisibility(View.GONE);
                } else {
                    binding.textView.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}

package jp.satorufujiwara.trykotlin.question;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import jp.satorufujiwara.trykotlin.R;
import jp.satorufujiwara.trykotlin.databinding.Question4ActivityBinding;
import jp.satorufujiwara.trykotlin.databinding.Question4AdapterItemBinding;

public class Question4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Question4ActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.question4_activity);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Question4Adapter adapter = new Question4Adapter();
        binding.recyclerView.setAdapter(adapter);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add("No." + i);
        }
        adapter.items.addAll(list);
    }

    static class Question4Adapter extends RecyclerView.Adapter<Question4Adapter.ViewHolder> {

        List<String> items = new ArrayList<>();

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolder(DataBindingUtil.<Question4AdapterItemBinding>inflate(
                    LayoutInflater.from(parent.getContext()), R.layout.question4_adapter_item, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.binding.textView.setText(items.get(position));
        }

        @Override
        public int getItemCount() {
            return items.size();
        }

        static class ViewHolder extends RecyclerView.ViewHolder {
            public final Question4AdapterItemBinding binding;

            ViewHolder(Question4AdapterItemBinding binding) {
                super(binding.getRoot());
                this.binding = binding;
            }
        }

    }
}

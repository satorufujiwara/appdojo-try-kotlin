package jp.satorufujiwara.trykotlin.answer

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import jp.satorufujiwara.trykotlin.R
import jp.satorufujiwara.trykotlin.databinding.Question4ActivityBinding
import jp.satorufujiwara.trykotlin.databinding.Question4AdapterItemBinding

class Answer4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil
                .setContentView<Question4ActivityBinding>(this, R.layout.question4_activity)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = Question4Adapter()
        binding.recyclerView.adapter = adapter
        adapter.items.addAll((0 until 100).map { "No.$it" })
    }
}

class Question4Adapter : RecyclerView.Adapter<Question4Adapter.ViewHolder>() {
    val items: MutableList<String> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Question4Adapter.ViewHolder {
        return ViewHolder(DataBindingUtil.inflate(
                LayoutInflater.from(parent.context), R.layout.question4_adapter_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.textView.text = items[position]
    }

    override fun getItemCount() = items.size

    class ViewHolder(val binding: Question4AdapterItemBinding) : RecyclerView.ViewHolder(binding.root)
}

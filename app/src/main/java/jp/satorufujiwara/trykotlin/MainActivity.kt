package jp.satorufujiwara.trykotlin

import android.app.Activity
import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import jp.satorufujiwara.trykotlin.answer.Answer1Activity
import jp.satorufujiwara.trykotlin.answer.Answer2Activity
import jp.satorufujiwara.trykotlin.answer.Answer3Activity
import jp.satorufujiwara.trykotlin.databinding.MainActivityBinding
import jp.satorufujiwara.trykotlin.databinding.MainAdapterItemBinding
import jp.satorufujiwara.trykotlin.question.Question1Activity
import jp.satorufujiwara.trykotlin.question.Question2Activity
import jp.satorufujiwara.trykotlin.question.Question3Activity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<MainActivityBinding>(this, R.layout.main_activity)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = MainAdapter(this).apply {
            items.add("Question1" to Intent(this@MainActivity, Question1Activity::class.java))
            items.add("Answer1" to Intent(this@MainActivity, Answer1Activity::class.java))
            items.add("Question2" to Intent(this@MainActivity, Question2Activity::class.java))
            items.add("Answer2" to Intent(this@MainActivity, Answer2Activity::class.java))
            items.add("Question3" to Intent(this@MainActivity, Question3Activity::class.java))
            items.add("Answer3" to Intent(this@MainActivity, Answer3Activity::class.java))

        }
    }
}

class MainAdapter(val activity: Activity) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    val items = ArrayList<Pair<String, Intent>>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.ViewHolder {
        return ViewHolder(DataBindingUtil.inflate(
                LayoutInflater.from(parent.context), R.layout.main_adapter_item, parent, false))
    }

    override fun onBindViewHolder(holder: MainAdapter.ViewHolder, position: Int) {
        items[position].run {
            holder.binding.textView.text = first
            holder.binding.cardView.setOnClickListener {
                activity.startActivity(second)
            }
        }
    }

    override fun getItemCount() = items.size

    inner class ViewHolder(val binding: MainAdapterItemBinding) : RecyclerView.ViewHolder(binding.root)
}

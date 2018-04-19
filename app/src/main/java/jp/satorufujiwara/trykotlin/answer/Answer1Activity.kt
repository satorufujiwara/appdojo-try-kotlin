package jp.satorufujiwara.trykotlin.answer

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import jp.satorufujiwara.trykotlin.R
import jp.satorufujiwara.trykotlin.databinding.Question1ActivityBinding

class Answer1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<Question1ActivityBinding>(this, R.layout.question1_activity)
        binding.button.setOnClickListener {
            binding.textView.text = if (binding.checkBox.isChecked) "Yes!" else "No!"
        }
    }
}

package jp.satorufujiwara.trykotlin.answer

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.core.widget.toast
import jp.satorufujiwara.trykotlin.R
import jp.satorufujiwara.trykotlin.databinding.Question1ActivityBinding

class Answer3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<Question1ActivityBinding>(this, R.layout.question3_activity)
        binding.button.setOnClickListener {
            binding.textView.isVisible = !binding.textView.isVisible
        }
    }
}

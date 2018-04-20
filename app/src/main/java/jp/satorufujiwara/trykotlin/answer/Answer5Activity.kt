package jp.satorufujiwara.trykotlin.answer

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import jp.satorufujiwara.trykotlin.R
import jp.satorufujiwara.trykotlin.databinding.Question4ActivityBinding

class Answer5Activity : AppCompatActivity() {

    private val viewModel by lazy {
        ViewModelProviders.of(this).get(Question5ViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil
                .setContentView<Question4ActivityBinding>(this, R.layout.question5_activity)
    }

    override fun onResume() {
        super.onResume()
        viewModel.start()
    }

    override fun onPause() {
        viewModel.stop()
        super.onPause()
    }
}

class Question5ViewModel : ViewModel() {

    private var startTime: Long = 0L

    fun start() {
        startTime = System.currentTimeMillis()
    }

    fun stop() {
        Log.d("Question4ViewModel", "Foreground time is ${System.currentTimeMillis() - startTime}ms.")
    }

}

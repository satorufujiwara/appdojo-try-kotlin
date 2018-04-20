package jp.satorufujiwara.trykotlin.answer

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import jp.satorufujiwara.trykotlin.R
import jp.satorufujiwara.trykotlin.databinding.Question4ActivityBinding

class Answer4OtherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil
                .setContentView<Question4ActivityBinding>(this, R.layout.question4_activity)
                .run {
                    recyclerView.layoutManager = LinearLayoutManager(this@Answer4OtherActivity)
                    recyclerView.adapter = Question4Adapter().apply {
                        items.addAll((0 until 100).map { "No.$it" })
                    }
                }
    }
}

package jp.satorufujiwara.trykotlin

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        DataBindingUtil.inflate<>()
        setContentView(R.layout.activity_main)
    }
}

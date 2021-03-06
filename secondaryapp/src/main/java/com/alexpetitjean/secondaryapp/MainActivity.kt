package com.alexpetitjean.secondaryapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alexpetitjean.common.CommonActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            startActivity(CommonActivity.newIntent(this))
        }
    }
}

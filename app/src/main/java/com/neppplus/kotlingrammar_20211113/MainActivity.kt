package com.neppplus.kotlingrammar_20211113

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnVariable01.setOnClickListener {
//      변수 문법 01

            var myName : String

            myName = "김정난"

            Log.d("문법연습1", myName)



            val friendName : String
            friendName = "정란"
            Log.d("문법연습1", friendName)

        }


        btnVariable02.setOnClickListener {

            var myName2 = "김정난2"
            var myBrith2 = 814
            Log.d("변수연습2", myName2)
        }

    }
}
package com.neppplus.kotlingrammar_20211113

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.time.measureTimedValue

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
            var myBirth2 = 814
            var myHeight = 163.5
            myHeight = 165.2

            Log.d("변수연습2", myName2)
        }

        btnCondition03.setOnClickListener {
            val userAge = 10

            if(userAge >= 20){
                Log.d("조건문01","성인입니다")
            }
            else if(userAge >= 17){
                Log.d("조건문01","고등학생입니다")
            }
            else if(userAge >= 14){
                Log.d("조건문01", "중학생입니다.")
            }
            else{
                Log.d("조건문01","초등학생이거나, 미취학아동입니다")
            }

        }

        btnCondition02.setOnClickListener {
//      회사조건 고연봉, 가까운거리, 워라벨
            val companyASalary = 3000
            val companyADistance = 50
            val companyAOffEarly = true

//      구직자 01 조건 : 연봉 4천 이상 OK
            val person01OK = companyASalary >= 4000

            Log.d("조건문02", person01OK.toString())

//      구직자 02 조건 : 이동시간이 30분 이내 또는 빨리 퇴근
            val person02Ok = (companyADistance <=30) || companyAOffEarly
            Log.d("조건문02", person02Ok.toString())

        }
    }
}
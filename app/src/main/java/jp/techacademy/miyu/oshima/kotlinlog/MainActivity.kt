package jp.techacademy.miyu.oshima.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val human = Human("大嶋", 25)
        //Human
        human.say()
        human.hobby = "哲学"
        human.think()

        //Humanのインスタンスを作る
        val human2 = Human("尾崎豊", 26)
        human2.say()
        human2.hobby = "音楽"
        human2.think()

    }
}
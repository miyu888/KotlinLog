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

        //Humanのインスタンスを作る
        val Human = Human("大嶋", 25)
        Human.think()

    }
}
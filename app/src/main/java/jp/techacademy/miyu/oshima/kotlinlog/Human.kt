package jp.techacademy.miyu.oshima.kotlinlog

import android.util.Log

open class Human: Animal, Thinkable {

    var hobby: String

    //引数付きコンストラクタ
    constructor(name: String, age: Int):super(name,age){
       this.hobby ="哲学"
    }
    //Animalクラスのメソッドをオーバーライド
    override fun say(){}


    //Thinkableインターフェースのメソッドをオーバーライド
    override fun think(){

        Log.d("kotlinetest", "私は" + this.hobby + "について考える。")
    }
}
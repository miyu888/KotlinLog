package jp.techacademy.miyu.oshima.kotlinlog

import android.util.Log

open class Human: Animal, Thinkable {

    var hobby: String

    //引数付きコンストラクタ
    constructor(name: String, age: Int):super(name,age){
       this.hobby =""
    }
    //Animalクラスのメソッドをオーバーライド
    override fun say(){

        //メソッド
        Log.d("kotlintest", "私の名前は" + this.name + "です。")
        Log.d("kotlintest", "年は" + this.age + "です。")


    }


    //Thinkableインターフェースのメソッドをオーバーライド
    override fun think(){
        this.hobby = "哲学"
        Log.d("kotlinetest", "私は" + this.hobby + "について考える。")
    }
}
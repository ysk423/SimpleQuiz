package com.ysk423.simplequiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //レイアウトの要素を取得
        val tvCount:TextView=findViewById(R.id.tvCount)
        val tvQuestion:TextView=findViewById(R.id.tvQuestion)
        val btn0:Button=findViewById(R.id.btn0)
        val btn1:Button=findViewById(R.id.btn1)
        val btn2:Button=findViewById(R.id.btn2)
        val btn3:Button=findViewById(R.id.btn3)
        var i = 0

        //配列を用意
        val quizData = arrayOf("A0","A1","A2","A3")

        //0-3までの数字を用意してシャッフル
        val list = listOf(0,1,2,3)
        val num = list.shuffled()

        //シャッフルされたnumの数字を入れる
        btn0.text = quizData[num[0]]
        btn1.text = quizData[num[1]]
        btn2.text = quizData[num[2]]
        btn3.text = quizData[num[3]]

        //btn0を押したときの正誤判定
        btn0.setOnClickListener {
            if(btn0.text==quizData[i]){
                //正解+カウントを1増やす+対象ボタン無効化
                tvQuestion.text="正解"
                i++
                btn0.isEnabled=false
                tvCount.text=i.toString()+"問正解"
                //i=4で全問正解
                if(i==4){
                    tvQuestion.text="全問正解"
                }
            }else{
                //不正解+全ボタンの無効化
                tvQuestion.text="不正解"
                btn0.isEnabled=false
                btn1.isEnabled=false
                btn2.isEnabled=false
                btn3.isEnabled=false
            }
        }

        //btn1を押したときの正誤判定
        btn1.setOnClickListener {
            if(btn1.text==quizData[i]){
                //正解+カウントを1増やす+対象ボタン無効化
                tvQuestion.text="正解"
                i++
                btn1.isEnabled=false
                tvCount.text=i.toString()+"問正解"
                //i=4で全問正解
                if(i==4){
                    tvQuestion.text="全問正解"
                }
            }else{
                //不正解+全ボタンの無効化
                tvQuestion.text="不正解"
                btn0.isEnabled=false
                btn1.isEnabled=false
                btn2.isEnabled=false
                btn3.isEnabled=false
            }
        }

        //btn2を押したときの正誤判定
        btn2.setOnClickListener {
            if(btn2.text==quizData[i]){
                //正解+カウントを1増やす+対象ボタン無効化
                tvQuestion.text="正解"
                i++
                btn2.isEnabled=false
                tvCount.text=i.toString()+"問正解"
                //i=4で全問正解
                if(i==4){
                    tvQuestion.text="全問正解"
                }
            }else{
                //不正解+全ボタンの無効化
                tvQuestion.text="不正解"
                btn0.isEnabled=false
                btn1.isEnabled=false
                btn2.isEnabled=false
                btn3.isEnabled=false
            }
        }

        //btn3を押したときの正誤判定
        btn3.setOnClickListener {
            if(btn3.text==quizData[i]){
                //正解+カウントを1増やす+対象ボタン無効化
                tvQuestion.text="正解"
                i++
                btn3.isEnabled=false
                tvCount.text=i.toString()+"問正解"
                //i=4で全問正解
                if(i==4){
                    tvQuestion.text="全問正解"
                }
            }else{
                //不正解+全ボタンの無効化
                tvQuestion.text="不正解"
                btn0.isEnabled=false
                btn1.isEnabled=false
                btn2.isEnabled=false
                btn3.isEnabled=false
            }
        }

    }
}
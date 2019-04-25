package edu.us.ischool.yimengl.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setButtonListeners()

    }
    fun setButtonListeners(){
        val loser = findViewById<TextView>(R.id.txtLose)

        val player1 = findViewById<TextView>(R.id.txt1)
        val player2 = findViewById<TextView>(R.id.txt2)
        val player3 = findViewById<TextView>(R.id.txt3)
        val player4 = findViewById<TextView>(R.id.txt4)

        val btn1_minus = findViewById<Button>(R.id.btn1_minus)
        val btn1_plus = findViewById<Button>(R.id.btn1_plus)
        val btn1_minus5 = findViewById<Button>(R.id.btn1_minus5)
        val btn1_plus5 = findViewById<Button>(R.id.btn1_plus5)

        val btn2_minus = findViewById<Button>(R.id.btn2_minus)
        val btn2_plus = findViewById<Button>(R.id.btn2_plus)
        val btn2_minus5 = findViewById<Button>(R.id.btn2_minus5)
        val btn2_plus5 = findViewById<Button>(R.id.btn2_plus5)

        val btn3_minus = findViewById<Button>(R.id.btn3_minus)
        val btn3_plus = findViewById<Button>(R.id.btn3_plus)
        val btn3_minus5 = findViewById<Button>(R.id.btn3_minus5)
        val btn3_plus5 = findViewById<Button>(R.id.btn3_plus5)

        val btn4_minus = findViewById<Button>(R.id.btn4_minus)
        val btn4_plus = findViewById<Button>(R.id.btn4_plus)
        val btn4_minus5 = findViewById<Button>(R.id.btn4_minus5)
        val btn4_plus5 = findViewById<Button>(R.id.btn4_plus5)

        btn1_minus.setOnClickListener() {
           listenerHelper(player1, loser, -1)
        }
        btn1_plus.setOnClickListener() {
            listenerHelper(player1, loser, 1)
        }
        btn1_minus5.setOnClickListener() {
            listenerHelper(player1, loser, -5)
        }
        btn1_plus5.setOnClickListener() {
            listenerHelper(player1, loser, 5)
        }

        btn2_minus.setOnClickListener() {
            listenerHelper(player2, loser, -1)
        }
        btn2_plus.setOnClickListener() {
            listenerHelper(player2, loser, 1)
        }
        btn2_minus5.setOnClickListener() {
            listenerHelper(player2, loser, -5)
        }
        btn2_plus5.setOnClickListener() {
            listenerHelper(player2, loser, 5)
        }

        btn3_minus.setOnClickListener() {
            listenerHelper(player3, loser, -1)
        }
        btn3_plus.setOnClickListener() {
            listenerHelper(player3, loser, 1)
        }
        btn3_minus5.setOnClickListener() {
            listenerHelper(player3, loser, -5)
        }
        btn3_plus5.setOnClickListener() {
            listenerHelper(player3, loser, 5)
        }

        btn4_minus.setOnClickListener() {
            listenerHelper(player4, loser, -1)
        }
        btn4_plus.setOnClickListener() {
            listenerHelper(player4, loser, 1)
        }
        btn4_minus5.setOnClickListener() {
            listenerHelper(player4, loser, -5)
        }
        btn4_plus5.setOnClickListener() {
            listenerHelper(player4, loser, 5)
        }
    }

    fun listenerHelper (player: TextView, loser: TextView, buttonTxt: Int){
        val temp = player.text.toString()
        val currentLife = temp.split(' ')[1].toInt() + buttonTxt
        val updatedStatus = temp.split(' ')[0] + ' ' + currentLife.toString() + ' ' + temp.split(' ')[2]
        player.text = updatedStatus
        if (currentLife <= 0) {
            val currentLoser = temp.split(": ")[0] + " Loses!"
            loser.text = currentLoser
        }
    }
}

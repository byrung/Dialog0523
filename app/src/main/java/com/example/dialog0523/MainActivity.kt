package com.example.dialog0523

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnDialog = findViewById<Button>(R.id.btnDialog)

        btnDialog.setOnClickListener {
            var dialog = AlertDialog.Builder(this@MainActivity)
            dialog.setTitle("안내")
            dialog.setMessage("오늘 목")
            dialog.setIcon(R.drawable.Log)
            dialog.setPositiveButton("확인",null){ dialog, which ->
                Toast.makeText(this@MainActivity, "확인버튼", Toast.LENGTH_SHORT)

            }
            dialog.show()
        }
    }
}
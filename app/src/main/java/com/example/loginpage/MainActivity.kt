package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.loginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    lateinit var username: EditText
    lateinit var password: EditText
    lateinit var loginButton: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        getSupportActionBar()?.hide()


        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.loginButton.setOnClickListener(View.OnClickListener {
            if(binding.email.text.toString()=="user@gmail.com" && binding.password.text.toString()=="1234")
                Toast.makeText(this, "Login Successfully", Toast.LENGTH_SHORT).show()
            else
            {
                Toast.makeText(this, "Incorrect Username and Password", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
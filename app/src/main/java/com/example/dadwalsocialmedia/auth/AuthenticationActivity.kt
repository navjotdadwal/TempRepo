package com.example.dadwalsocialmedia.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dadwalsocialmedia.R

class AuthenticationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)

        supportFragmentManager.beginTransaction()
            .replace(R.id.auth_fragment_container, LoginFragment())
            .commit()
    }
}
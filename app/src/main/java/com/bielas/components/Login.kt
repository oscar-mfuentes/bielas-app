package com.bielas.components

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.InputType
import android.text.method.PasswordTransformationMethod
import android.widget.EditText
import android.widget.ImageButton
import com.bielas.R
import com.bielas.services.LoginService

class Login : AppCompatActivity() {

    private lateinit var inputPasswd: EditText
    private lateinit var showHideButton: ImageButton
    private val loginSerice = LoginService()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        inputPasswd = findViewById(R.id.loginPasswdInput)
        showHideButton = findViewById(R.id.loginButtonShowHide)

        inputPasswd.inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD
        inputPasswd.transformationMethod = PasswordTransformationMethod()
        showHideButton.setOnClickListener {
            hideShowPasswd()
        }
    }

    fun hideShowPasswd() {
        loginSerice.hideShowPasswd(inputPasswd, showHideButton, this)
    }
}

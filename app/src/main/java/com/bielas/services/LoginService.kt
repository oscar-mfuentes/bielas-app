package com.bielas.services

import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.IBinder
import android.text.InputType
import android.text.method.PasswordTransformationMethod
import android.widget.EditText
import android.widget.ImageButton
import com.bielas.R

class LoginService : Service() {

    override fun onBind(intent: Intent?): IBinder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun hideShowPasswd(input: EditText, button: ImageButton, context: Context) {
        if (input.inputType == InputType.TYPE_TEXT_VARIATION_PASSWORD) {
            input.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            input.transformationMethod = null
            button.setImageDrawable(context.resources.getDrawable(R.drawable.ic_eye_regular, null))
        } else {
            input.inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD
            input.transformationMethod = PasswordTransformationMethod()
            button.setImageDrawable(context.resources.getDrawable(R.drawable.ic_eye_regular_slash, null))
        }
    }
}

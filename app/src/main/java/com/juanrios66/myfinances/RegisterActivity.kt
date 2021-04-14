package com.juanrios66.myfinances

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.juanrios66.myfinances.databinding.ActivityRegisterBinding


class RegisterActivity : AppCompatActivity() {

    private lateinit var registerBinding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerBinding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(registerBinding.root)

        registerBinding.textpass2.setOnClickListener {
            if (registerBinding.reppassLayout.error == getString(R.string.coincidencia)) {
                registerBinding.reppassLayout.error = null
                registerBinding.textpass2.setText("")
            }
        }

        registerBinding.registrar.setOnClickListener {
            val name = registerBinding.textname.text.toString()
            val email = registerBinding.textemail.text.toString()
            val password = registerBinding.textpass.text.toString()
            if (name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty()) {
                if (password == registerBinding.textpass2.text.toString()) {
                    registerBinding.reppassLayout.error = null
                    val intent = Intent()
                    val bundle = Bundle()
                    val user = Users(name, email, password)
                    bundle.putSerializable("user", user)
                    intent.putExtras(bundle)
                    setResult(Activity.RESULT_OK, intent)
                    finish()
                } else {
                    registerBinding.reppassLayout.error = getString(R.string.coincidencia)
                }
            } else {
                Toast.makeText(this, getString(R.string.errorregister), Toast.LENGTH_LONG).show()
            }
        }

    }
}
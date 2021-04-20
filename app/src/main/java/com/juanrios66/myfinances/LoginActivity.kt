package com.juanrios66.myfinances

import Utils.*
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import com.juanrios66.myfinances.R.id.buttonlogin
import com.juanrios66.myfinances.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var loginBinding: ActivityLoginBinding
    private var usuarios: MutableList<Users> = mutableListOf()
    private lateinit var nick: String
    private var banEmail = false
    private var banPass = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)

        // Modo test: Usar para evitar registro ya que no se cuenta con base de datos aun
        usuarios.add(Users("1", "1", "1"))
        if (intent.hasExtra("user")) {
            usuarios.add(intent.getSerializableExtra("user") as Users)
        }

        loginBinding.textpassword.setOnClickListener {
            if (loginBinding.layoutpass.error == getString(R.string.errorpass)) {
                loginBinding.layoutpass.error = null
                loginBinding.textpassword.setText(EMPTY)
            }
        }

        loginBinding.textemail.doAfterTextChanged {
            if (!emailValidator(loginBinding.textemail.text.toString())) {
                loginBinding.layoutemail.error = getString(R.string.email_invalido)
            } else {
                loginBinding.layoutemail.error = null
            }
        }

        loginBinding.textpassword.doAfterTextChanged {
            if (!passValidator(loginBinding.textpassword.text.toString())) {
                loginBinding.layoutpass.error = getString(R.string.digits6)
            } else {
                loginBinding.layoutpass.error = null
            }
        }

        loginBinding.buttonlogin.setOnClickListener {
            for (u in usuarios) {
                if (loginBinding.textemail.text.toString() == u.email) {
                    banEmail = true
                    if (loginBinding.textpassword.text.toString() == u.password) {
                        banPass = true
                        nick = u.nickname.toString()
                    }
                }
            }
            if (banEmail) {
                if (banPass) {
                    banEmail = false
                    banPass = false
                    val intent = Intent(this, MainActivity::class.java)
                    intent.putExtra("email", loginBinding.textemail.text.toString())
                    intent.putExtra("pass", loginBinding.textpassword.text.toString())
                    intent.putExtra("nick", nick)
                    startActivity(intent)
                    finish()
                } else {
                    loginBinding.layoutpass.error = getString(R.string.errorpass)
                }
            } else {
                Toast.makeText(this, getString(R.string.errorlogin), Toast.LENGTH_LONG).show()
            }
        }

        loginBinding.buttonToRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivityForResult(intent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1 && resultCode == Activity.RESULT_OK) {
            val user: Users = data!!.getSerializableExtra("user") as Users
            loginBinding.textemail.setText(EMPTY)
            loginBinding.textpassword.setText(EMPTY)
            usuarios.add(user)
        }
    }
}

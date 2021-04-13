package com.juanrios66.myfinances

import android.R.attr
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.juanrios66.myfinances.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {

    private lateinit var loginBinding: ActivityLoginBinding
    private var usuarios: MutableList<Users> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)

        loginBinding.textpassword.setOnClickListener {
            loginBinding.layoutpass.error = null
            loginBinding.textpassword.setText("")
        }

        loginBinding.buttonlogin.setOnClickListener{
            if(loginBinding.textemail.text.toString()=="12"){
                if(loginBinding.textpassword.text.toString()=="12"){
                    var intent = Intent(this, MainActivity::class.java)
                    intent.putExtra("email", loginBinding.textemail.text.toString())
                    startActivity(intent)
                }else{
                    loginBinding.layoutpass.error = getString(R.string.errorpass)
                }
            }else{
                Toast.makeText(this, getString(R.string.errorlogin), Toast.LENGTH_LONG).show()
            }
        }

        loginBinding.buttonToRegister.setOnClickListener{
            var intent = Intent(this, RegisterActivity::class.java)
            startActivityForResult(intent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1 && resultCode == Activity.RESULT_OK) {
            val user: Users = data!!.getSerializableExtra("user") as Users
            loginBinding.textemail.setText(user.email)
            loginBinding.textpassword.setText(user.password)
            usuarios.add(user)
        }
    }
}
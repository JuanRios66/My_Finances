package com.juanrios66.myfinances

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.juanrios66.myfinances.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    private var usuarios: MutableList<Users> = mutableListOf()
    private lateinit var user: Users

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        val data = intent.extras
        this.title = data?.getString("nick")
        mainBinding.emailtextview.text = data?.getString("email")
        mainBinding.passwordtextview.text = data?.getString("pass")
        user = Users(data?.getString("nick"), data?.getString("email"), data?.getString("pass"))
        usuarios.add(user)

        Log.d("metodo", "onCreate")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.logout_menu -> {
                val intent = Intent(this, LoginActivity::class.java)
                val bundle = Bundle()
                bundle.putSerializable("user", user)
                intent.putExtras((bundle))
                startActivity(intent)
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onStart() {
        super.onStart()
        Log.d("metodo", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("metodo", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("metodo", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("metodo", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("metodo", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("metodo", "onDestroy")
    }
}



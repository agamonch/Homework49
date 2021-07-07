package kg.unicapp.homework49

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startService()
    }

    private fun startService() {
        val button = findViewById<Button>(R.id.button)
        val intent = Intent(this, MyService::class.java)
        button.setOnClickListener {
            startService(intent)
        }
    }
}
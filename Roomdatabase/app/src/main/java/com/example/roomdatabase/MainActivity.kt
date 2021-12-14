package com.example.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.lifecycleScope
import com.example.roomdatabase.data.AppDatabase
import com.example.roomdatabase.data.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edittext = findViewById<EditText>(R.id.editTextfirstName)
        val editText1 = findViewById<EditText>(R.id.editTextlastname)
        val button = findViewById<Button>(R.id.buttonsave)
        val database = AppDatabase.getInstance(this).userDao
        button.setOnClickListener {
            lifecycleScope.launch(Dispatchers.IO) {
                database.insertData(
                    User(
                        uid = 0,
                        firstName = edittext.text.toString(),
                        lastName = editText1.text.toString(),
                        age = 21
                    )
                )
            }
        }

    }

}
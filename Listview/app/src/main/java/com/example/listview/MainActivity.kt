package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val cities = arrayOf(
            "Mardan","Quetta","Peshawer","Lahore","Islamabad","Wahcantt","Taxila","Hassanabdal","Haripur", "Abbottabad")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = findViewById<ListView>(R.id.listview)
        val arrayAdapter: ArrayAdapter<String> =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, cities)
        list.adapter = arrayAdapter
        list.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "You Selected " + cities[i], Toast.LENGTH_SHORT).show()
        }

    }
}
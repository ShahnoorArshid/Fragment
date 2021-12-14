package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.MyAdapter
import com.News

class MainActivity : AppCompatActivity() {
    lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<News>
    lateinit var imageId : Array<Int>
    lateinit var heading :Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageId= arrayOf(
            R.drawable.manimage,
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image4,
            R.drawable.image4,
            R.drawable.image4,
            R.drawable.image4,
            R.drawable.image5
        )
        heading= arrayOf(
            "FIA director issued show_cause in sugar cane case",
            "Ready to talk with anyone except those who looted the nation",
            "Prince Charles relationship reaching a breaking point",
            "Tom Holland find it a miracle he can promote spiderman",
            "Google Confirms limited android bug that prevent emergency calling without Teams Installed ",
            "Google Confirms limited android bug that prevent emergency calling without Teams Installed ",
            "Google Confirms limited android bug that prevent emergency calling without Teams Installed ",
            "Google Confirms limited android bug that prevent emergency calling without Teams Installed ",
            "Google Confirms limited android bug that prevent emergency calling without Teams Installed ",
            "Fifth layer of corona has been installed"
        )
        newRecyclerView=findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager=LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)
        newArrayList= arrayListOf<News>()
        getUserdata()


    }

    private fun getUserdata() {
        for (i in imageId.indices){
            val news=News(imageId[i],heading[i])
            newArrayList.add(news)
        }
        newRecyclerView.adapter=MyAdapter(newArrayList)

    }
}
package com.example.lol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var champions:ArrayList<Champion>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rv:RecyclerView=findViewById(R.id.recyclerView)
        rv.layoutManager=LinearLayoutManager(this)
        val champ1=Champion("ahri","mid",R.drawable.ic_ahri)
        val champ2=Champion("ahri","mid",R.drawable.ic_annie)
        val champ3=Champion("ahri","mid",R.drawable.ic_ashe)
        val champ4=Champion("ahri","mid",R.drawable.ic_ekko)
        champions.add(champ1)
        champions.add(champ2)
        champions.add(champ3)
        champions.add(champ4)
        var adapter=MyAdapter(champions,this)
        rv.adapter=adapter
    }

}
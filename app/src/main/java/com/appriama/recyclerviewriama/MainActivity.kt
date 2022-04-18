package com.appriama.recyclerviewriama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.antman,
                "Ant-Man",
                "Ant-Man adalah sebuah film superhero Amerika Serikat yang dirilis pada 17 Juli 2015. Film ini merupakan film kedua belas di Marvel Cinematic Universe." +
                        "Ant-Man mampu melawan semua musuhnya yang terbilang sangat besar dengan tubuhnya yang ekstra kecil."
            ),
            Superhero(
                R.drawable.blackpanther,
                "Black Panther",
                "Black Panther adalah film superhero Amerika Serikat tahun 2018 berdasarkan karakter Marvel Comics dengan nama sama."
            ),
            Superhero(
                R.drawable.ironman,
                "Iron Man",
                "Iron Man adalah pahlawan super fiksi yang muncul dalam buku komik Amerika yang diterbitkan oleh Marvel Comics, serta media yang terkait. " +
                        "Karakter diciptakan oleh penulis dan editor Stan Lee, yang dikembangkan oleh penulis skenario Larry Lieber, dan dirancang oleh seniman Don Heck dan Jack Kirby"
            ),
            Superhero(
                R.drawable.captain,
                "Captain America",
                "Captain America adalah superhero tertua di tim Avengers dan sebagai pemimpin tim. Nama asli Captain America adalah Steve Rogers."
            ),
            Superhero(
                R.drawable.hulk,
                "Hulk",
                "Hulk dianggap sebagai superhero dengan kekuatan paling kuat yang dimiliki oleh tim Avengers. " +
                        "Sosok hijau besar ini sebenarnya adalah seorang ilmuwan bernama Bruce Banner, yang terkena bom sinar gamma selama penelitiannya. " +
                        "Bruce Banner bisa berubah menjadi Hulk saat dia marah dan tidak bisa mengontrol emosinya."
            ),
            Superhero(
                R.drawable.thor,
                "Thor",
                "Thor adalah dewa petir dari Asgard. Thor adalah Putra Mahkota Asgard di mana ayahnya adalah Odin, Raja Asgard. " +
                        "Namun, Thor memiliki saudara tiri bernama Loki yang licik dan ingin menguasai Asgard dan dunia."
            ),
            Superhero(
                R.drawable.spiderman,
                "Spider Man",
                "Spiderman atau manusia laba-laba adalah seorang superhero yang memiliki kekuatan berupa jaring yang keluar dari tangannya dan memiliki karakter seperti laba-laba."
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter=SuperheroAdapter(this,superheroList){

        }
    }
}
package com.example.myapplication

class Pet {
    var play : String = "10"
    var clean : String = "5"
    var feed: String = "4"


    fun feed() {
        feed += 3
    }

    fun clean() {
        clean += 3
    }

    fun play() {
        play += 3
    }

    fun isFeed(): Boolean {
        return feed > 5.toString()
    }

    fun isClean(): Boolean {
        return clean < 5.toString()
    }


}



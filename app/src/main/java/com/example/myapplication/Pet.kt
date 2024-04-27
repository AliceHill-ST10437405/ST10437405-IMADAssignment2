package com.example.myapplication
class Pet {
    var play : Int = 3
    var clean : Int = 2
    var feed: Int = 4

    fun feed() {
        feed += 2
    }

    fun clean() {
        this.clean += 2
    }

    fun play() {
        this.play += 2
    }

    fun isFeed(): Boolean {
        return feed > 5
    }

    fun isClean(): Boolean {
        return clean < 5
    }
}





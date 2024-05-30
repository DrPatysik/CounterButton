package com.example.counterbutton

import android.os.Parcel
import kotlinx.parcelize.Parceler
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Counters1  (
    var counter1:Int = 0,
    var counter2:Int = 0,
    var counter3:Int = 0,
    var counter4:Int = 0
):Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    fun incrementCounter1(){
        counter1++
    }

    fun incrementCounter2(){
        counter2++
    }

    fun incrementCounter3(){
        counter3++
    }
    fun incrementCounter4(){
        counter4++
    }

    companion object : Parceler<Counters1> {
        override fun create(parcel: Parcel): Counters1 {
            return Counters1(parcel)
        }

        override fun Counters1.write(parcel: Parcel, flags: Int) {
            parcel.writeInt(counter1)
            parcel.writeInt(counter2)
            parcel.writeInt(counter3)
            parcel.writeInt(counter4)        }
    }
}


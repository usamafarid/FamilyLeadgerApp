package com.example.familyleadgerapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("account")
data class Account(
    @PrimaryKey(autoGenerate = true)
    val aId: Int, //1234
    val balance: Double, //5000.00
    val name: String, //EasyPaisa,Jazz cash
    val type: String, //bank , cash , wallet
    val createdAt: Long, //timestamp
    val currency: String ="PKR"
)

package com.example.familyleadgerapp.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
     "transactions",
    foreignKeys = [
    ForeignKey(
        entity = Account::class,
        parentColumns =["aId"],
        childColumns = ["aId"],
        onUpdate = ForeignKey.CASCADE,
        onDelete = ForeignKey.CASCADE,
        ),
     ],
    indices = [
    Index(
        value = ["aId"]
    )
     ]
)
data class Transaction(
    @PrimaryKey(autoGenerate = true)
    val tId : Int =0 , //1234
    val tDate: Long , //timestamp
    val tAmount: Double , //5000.00
    val tTitle: String , //food,shopping,groceries
    val tType: String , //income , expense
    val tCategory: String , //food,shopping,groceries
    val aId: Int //linkedID (1 to Many)
    )
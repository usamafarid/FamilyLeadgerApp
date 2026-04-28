package com.example.familyleadgerapp.database

import android.view.textclassifier.SelectionEvent
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update

@Dao
interface TransactionDAO {

    @Insert
    fun addTransaction()
    @Update
    fun updateTransaction()
    @Delete
    fun deleteTransaction()

    @Query("SELECT * FROM t")
    fun getAllTransaction()

}
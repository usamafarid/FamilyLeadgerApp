package com.example.familyleadgerapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.familyleadgerapp.model.Transaction

@Dao
interface TransactionDAO {

    @Insert
     suspend fun addTransaction(transaction: Transaction)
    @Update
     suspend fun updateTransaction(transaction : Transaction)
    @Delete
    suspend fun deleteTransaction(transaction : Transaction)

    @Query("SELECT * FROM transactions")
    fun getAllTransaction(): LiveData<Transaction>

}
package com.example.familyleadgerapp.database


import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.familyleadgerapp.model.Account

@Dao
interface AccountDAO {

    @Insert
    suspend fun addAccount(account : Account)
    @Update
    suspend fun updateAccount(account : Account)
    @Delete
    suspend fun deleteAccount(account : Account)
    @Query("SELECT * FROM account")
    fun getAllAccount():  LiveData<Account>

}
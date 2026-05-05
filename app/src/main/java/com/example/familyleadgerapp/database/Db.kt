package com.example.familyleadgerapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.familyleadgerapp.model.Account
import com.example.familyleadgerapp.model.Transaction

@Database(entities = [Transaction::class, Account::class], version = 1)
abstract class Db: RoomDatabase() {
    abstract fun transactionDao(): TransactionDAO
    abstract fun accountDao(): AccountDAO

    //singleton object
    companion object {
        var instance: Db? = null
        fun getDbInstance(context : Context): Db{
            if (instance==null) {
                synchronized(this) {
                   instance = Room
                        .databaseBuilder(
                            context.applicationContext ,
                            Db::class.java ,
                            "transaction"
                        )
                        .build()

                }
            }
            return instance!!
        }
    }
}
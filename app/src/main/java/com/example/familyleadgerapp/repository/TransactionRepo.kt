package com.example.familyleadgerapp.repository

import android.content.Context
import com.example.familyleadgerapp.database.AccountDAO
import com.example.familyleadgerapp.database.TransactionDAO
import com.example.familyleadgerapp.model.Account
import com.example.familyleadgerapp.model.Transaction
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext


class TransactionRepo(val transactionDAO : TransactionDAO) {

    suspend fun addTransaction(transaction : Transaction){
       // withContext(Dispatchers.IO){}
        transactionDAO.addTransaction(transaction)
    }
    fun getTransaction(transaction : Transaction){
        transactionDAO.getAllTransaction()
    }


}
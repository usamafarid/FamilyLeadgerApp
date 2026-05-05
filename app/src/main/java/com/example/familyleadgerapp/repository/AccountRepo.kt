package com.example.familyleadgerapp.repository

import com.example.familyleadgerapp.database.AccountDAO
import com.example.familyleadgerapp.model.Account

class AccountRepo( val accountDAO : AccountDAO) {

    suspend fun addAccount(account : Account){
        accountDAO.addAccount(account)
    }
    fun getAccounts(account : Account){
        accountDAO.getAllAccount()
    }
}
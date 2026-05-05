package com.example.familyleadgerapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.familyleadgerapp.repository.TransactionRepo

class TransactionVMFactory(val transactionRepo : TransactionRepo): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass : Class<T>) : T {
        return TransactionVM(transactionRepo) as T
    }
}
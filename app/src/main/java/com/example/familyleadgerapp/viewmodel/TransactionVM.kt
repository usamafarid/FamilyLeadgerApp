package com.example.familyleadgerapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.familyleadgerapp.model.Transaction
import com.example.familyleadgerapp.repository.TransactionRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TransactionVM(val transactionRepo : TransactionRepo): ViewModel() {

    //Livedata
    private var _transaction = MutableLiveData<Transaction>()
    val transaction: LiveData<Transaction>
        get() = _transaction

    fun addTransaction(transaction : Transaction){
        viewModelScope.launch(Dispatchers.IO){
            transactionRepo.addTransaction(transaction)
        }
    }


    }

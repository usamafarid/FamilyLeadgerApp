package com.example.familyleadgerapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.familyleadgerapp.repository.AccountRepo

class AccountVMFactory(val accountRepo : AccountRepo): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass : Class<T>) : T {
        return AccountVM(accountRepo) as T
    }
}
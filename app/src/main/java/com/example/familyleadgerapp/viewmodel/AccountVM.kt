package com.example.familyleadgerapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.familyleadgerapp.model.Account
import com.example.familyleadgerapp.repository.AccountRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AccountVM(val accountRepo : AccountRepo): ViewModel() {


   private var _account = MutableLiveData<Account>()
    val account : LiveData<Account> = _account

   fun addAccount(account : Account){
       viewModelScope.launch(Dispatchers.IO){
           accountRepo.accountDAO.addAccount(account)
       }

    }
}
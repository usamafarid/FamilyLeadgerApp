package com.example.familyleadgerapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.familyleadgerapp.R
import com.example.familyleadgerapp.database.Db
import com.example.familyleadgerapp.databinding.FragmentTransactionBinding
import com.example.familyleadgerapp.model.Transaction
import com.example.familyleadgerapp.repository.TransactionRepo
import com.example.familyleadgerapp.viewmodel.TransactionVM
import com.example.familyleadgerapp.viewmodel.TransactionVMFactory


class TransactionFragment : Fragment() {
    lateinit var binding : FragmentTransactionBinding

    lateinit var viewModel: TransactionVM

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        binding.root

        val db= Db.getDbInstance(requireContext())
        val transactionDAO = db.transactionDao()
        val repository= TransactionRepo(transactionDAO)
        val factory= TransactionVMFactory(repository)
         viewModel= ViewModelProvider(this,factory)[TransactionVM::class]
    }

    override fun onCreateView(
        inflater : LayoutInflater , container : ViewGroup? ,
        savedInstanceState : Bundle?
    ) : View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_transaction , container , false)
    }

    override fun onViewCreated(view : View , savedInstanceState : Bundle?) {
        super.onViewCreated(view , savedInstanceState)

        viewModel.transaction.observe(viewLifecycleOwner, Observer{
            val transaction = Transaction(0,4/5/26L,10000.00,"food","Food","Expense",0)
           viewModel.addTransaction(transaction)
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding.root
    }

}
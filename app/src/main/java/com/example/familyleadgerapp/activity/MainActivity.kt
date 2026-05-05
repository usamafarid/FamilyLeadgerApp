package com.example.familyleadgerapp.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.familyleadgerapp.R
import com.example.familyleadgerapp.database.Db

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val db= Db.getDbInstance(this.applicationContext)
        db.accountDao()
        db.transactionDao()
    }
}
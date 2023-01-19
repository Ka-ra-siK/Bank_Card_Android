package com.eltex.bankard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.eltex.bankard.api.ApiService
import com.eltex.bankard.api.RetrofitHelper
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.create

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val quotesApi = RetrofitHelper.getInstance().create(ApiService::class.java)
        // launching a new coroutine
        GlobalScope.launch {
            val result = quotesApi.getBunkInfo("45717360")
            if (result != null)
            // Checking the results
                Log.d("ayush: ", result.body().toString())
        }
    }
}
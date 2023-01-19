package com.eltex.bankard.api

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("/{bank_bin}")
    fun getBunkInfo(@Path("bank_bin") bankBin: String): Response<BankResponse>
}
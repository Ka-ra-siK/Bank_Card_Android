package com.eltex.bankard.api

class BankResponse (
    val scheme: String,
    val type: String,
    val brand: String,
    val prepaid: Boolean,
    val number: List<BankResponseNumber>,
    val country: List<BankResponseCountry>,
    val bank: List<BankResponseBank>

)
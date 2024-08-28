package com.example.bankaccountprogram

class BankAccount(var accountHolder: String, var balance: Double) {

    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance  += amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }

    fun withdraw(amount: Double) {
        if(amount <= balance) {
            balance  -= amount
            transactionHistory.add("$accountHolder withdrew $$amount")
        } else {
            println("You don't have funds to withdraw $$amount")
        }

    }

    fun displayTransactionHistory() {
        println("Transaction History for $accountHolder")
        for(transaction in transactionHistory) {
            println(transaction)
        }
    }


}
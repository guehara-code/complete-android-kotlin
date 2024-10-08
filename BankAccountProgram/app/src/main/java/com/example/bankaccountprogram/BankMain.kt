package com.example.bankaccountprogram

fun main() {

    val denisesBankAccount = BankAccount("Denis Panjuta", 1338.20)

    denisesBankAccount.deposit(200.0)
    denisesBankAccount.withdraw(1200.0)
    denisesBankAccount.deposit(3000.0)
    denisesBankAccount.deposit(2000.0)
    denisesBankAccount.withdraw(3333.15)

    denisesBankAccount.displayTransactionHistory()

    println("${denisesBankAccount.accountHolder}'s " +
    "balance is ${denisesBankAccount.balance}")
}
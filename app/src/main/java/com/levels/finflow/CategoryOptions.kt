package com.levels.finflow

object CategoryOptions {

    fun expenseCategory(): ArrayList<String> {
        val listExpense = ArrayList<String>()
        listExpense.add("Їжа/Напої")
        listExpense.add("Транспорт")
        listExpense.add("Розваги")
        listExpense.add("Освіта")
        listExpense.add("Рахунки")
        listExpense.add("Покупки")
        listExpense.add("Зв'язок")
        listExpense.add("Інвестиції")
        listExpense.add("Здоров'я")
        listExpense.add("Інші витрати")

        return listExpense
    }

    fun incomeCategory(): ArrayList<String> {
        val listIncome = ArrayList<String>()
        listIncome.add("Зарплата")
        listIncome.add("Премія")
        listIncome.add("Подарунок")
        listIncome.add("Інвестиційний прибуток")
        listIncome.add("Інші доходи")

        return listIncome
    }
}
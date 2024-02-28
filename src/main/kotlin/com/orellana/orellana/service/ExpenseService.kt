package com.orellana.orellana.service

import com.orellana.orellana.model.Expense
import com.orellana.orellana.repository.ExpenseRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class ExpenseService {
    @Autowired
    lateinit var expenseRepository: ExpenseRepository

    fun list ():List<Expense>{
        return expenseRepository.findAll()
    }

    fun getTotalExpense (categoryId: Long?): Double?{
        try{
            var total: Double = 0.0
            val expenseCategory = expenseRepository.findByCategoryId(categoryId)
            expenseCategory.map{expense ->
                total += expense?.spend!!
            }
            return total
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }

    fun save(expense: Expense): Expense {
        try{
            return expenseRepository.save(expense)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
}
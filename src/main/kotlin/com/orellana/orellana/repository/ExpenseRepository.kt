package com.orellana.orellana.repository

import com.orellana.orellana.model.Expense
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ExpenseRepository: JpaRepository<Expense, Long> {
    fun findById (id:Long?): Expense?

    fun findByCategoryId (categoryId:Long?): List <Expense?>
}
package com.orellana.orellana.controller

import com.orellana.orellana.model.Expense
import com.orellana.orellana.service.ExpenseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/expense")
class ExpenseController {
    @Autowired
    lateinit var expenseService: ExpenseService

    @GetMapping
    fun list ():List <Expense>{
        return expenseService.list()
    }

    @PostMapping
    fun save (@RequestBody expense: Expense): ResponseEntity<Expense> {
        return ResponseEntity(expenseService.save(expense), HttpStatus.OK)
    }

    @GetMapping("/totalExpense/{categoryId}")
    fun getTotalExpense(@PathVariable("categoryId") categoryId:Long?):ResponseEntity<*>{
        return  ResponseEntity(expenseService.getTotalExpense(categoryId),HttpStatus.OK)
    }

}
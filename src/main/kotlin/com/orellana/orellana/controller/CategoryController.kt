package com.orellana.orellana.controller

import com.orellana.orellana.model.Category
import com.orellana.orellana.service.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/category")
class CategoryController {
    @Autowired
    lateinit var categoryService: CategoryService

    @GetMapping
    fun list ():List <Category>{
        return categoryService.list()
    }

    @PostMapping
    fun save (@RequestBody category: Category): ResponseEntity<Category> {
        return ResponseEntity(categoryService.save(category), HttpStatus.OK)
    }
}
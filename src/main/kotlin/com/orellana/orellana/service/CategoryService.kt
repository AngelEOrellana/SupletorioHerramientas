package com.orellana.orellana.service

import com.orellana.orellana.model.Category
import com.orellana.orellana.repository.CategoryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class CategoryService {
    @Autowired
    lateinit var categoryRepository: CategoryRepository

    fun list ():List<Category>{
        return categoryRepository.findAll()
    }

    fun save(client: Category): Category {
        try{
            return categoryRepository.save(category)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
}
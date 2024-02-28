package com.orellana.orellana.repository

import com.orellana.orellana.model.Category
import org.springframework.stereotype.Repository

@Repository
interface CategoryRepository {
    fun findById (id:Long?): Category?


}
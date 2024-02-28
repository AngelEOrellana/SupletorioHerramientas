package com.orellana.orellana.model

import jakarta.persistence.*

@Entity
@Table(name = "expense")
class Expense {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var description: String? = null
    var spend: Double? = null
    @Column(name="category_id")
    var categoryId: Long? = null
}
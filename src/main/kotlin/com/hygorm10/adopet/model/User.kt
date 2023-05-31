package com.hygorm10.adopet.model

import com.hygorm10.adopet.model.enums.UserType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "tb_order")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    @Column(unique = true)
    val email: String,
    val password: String,
    val phone: String?,
    val city: String?,
    val about: String?,
    val type: UserType? = UserType.USER
)
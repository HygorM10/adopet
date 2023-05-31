package com.hygorm10.adopet.repositories

import com.hygorm10.adopet.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long>
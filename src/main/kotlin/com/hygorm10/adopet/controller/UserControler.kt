package com.hygorm10.adopet.controller

import com.hygorm10.adopet.model.User
import com.hygorm10.adopet.services.UserService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/v1/users"])
class UserControler(
    private val userService: UserService
) {

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    fun create(@RequestBody user: User): User {
        return userService.create(user)
    }

    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    fun findAll(): Map<String, List<User>> {
        return mapOf("items" to userService.findAll())
    }

    @GetMapping(value = ["/{id}"])
    fun findById(@PathVariable id: Long): User? {
        return userService.findById(id).orElseThrow()
    }

}
package de.hska.customer.service

import de.hska.customer.db.CustomerRepository
import de.hska.customer.entity.Customer
import reactor.core.publisher.Flux

class CustomerService(
    private val repo: CustomerRepository)
{
    fun findAll(): Flux<Customer> = repo.findAll()
    fun create(customer: Customer) = repo.save(customer)
    fun findById(id: String) = repo.findById(id)
    fun deleteById(id: String) = repo.deleteById(id)
}



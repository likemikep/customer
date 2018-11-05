package de.hska.customer.db

import de.hska.customer.entity.Customer
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface CustomerRepository : ReactiveCrudRepository<Customer,String> {
}

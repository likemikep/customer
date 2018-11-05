package de.hska.customer.rest

import de.hska.customer.service.CustomerService
import org.springframework.http.ResponseEntity.notFound
import org.springframework.http.ResponseEntity.ok
import reactor.core.publisher.Mono
import reactor.core.publisher.toMono

class CustomerHandler(private val service: CustomerService) {

}

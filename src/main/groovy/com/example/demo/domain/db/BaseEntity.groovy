package com.example.demo.domain.db

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass
import javax.persistence.Version

@MappedSuperclass
abstract class BaseEntity {
    @Id @GeneratedValue(strategy= GenerationType.SEQUENCE)
    Long id
    @Version
    Long version
}

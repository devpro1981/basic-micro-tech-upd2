package com.example.demo.domain.db

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener

import javax.persistence.Column
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass
import java.time.ZonedDateTime

@MappedSuperclass
@EntityListeners(AuditingEntityListener)
abstract class BaseAuditedEntity extends BaseEntity {
    @CreatedDate
    @Column(updatable = false)
    ZonedDateTime dateCreated

    @LastModifiedDate
    ZonedDateTime lastUpdated
}

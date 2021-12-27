package com.example.demo.domain.db

import javax.persistence.Column
import javax.persistence.Entity

@Entity
class ApplicationSettings extends BaseAuditedEntity implements Serializable {
    private static final long serialVersionUID = 1L

    @Column(name = '"KEY"')
    String key
}

package com.example.demo.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.auditing.DateTimeProvider

import java.time.ZonedDateTime

@Configuration
class DateTimeProviderConfig {
    @Bean // Retrieve current time in system default (server) time zone
    DateTimeProvider auditingDateTimeProvider() {
        return () -> Optional.of(ZonedDateTime.now())
    }
}

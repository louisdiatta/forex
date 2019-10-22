package com.luwee.microserviceforexservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luwee.microserviceforexservice.domain.ExchangeValue;

public interface ExchangeRepository extends JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromAndTo(String from, String to);
}

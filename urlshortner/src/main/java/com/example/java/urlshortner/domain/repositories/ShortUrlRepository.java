package com.example.java.urlshortner.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.java.urlshortner.domain.entities.ShortUrl;

public interface ShortUrlRepository extends JpaRepository<ShortUrl, Long>{

}

package com.ms_security.ms_security.persistence.repository;

import com.ms_security.ms_security.persistence.entity.CartEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICartRepository extends JpaRepository<CartEntity, Long> {
    Page<CartEntity> findAll(Pageable pageable);
    Optional<CartEntity> findByUserId(Long userId);
}

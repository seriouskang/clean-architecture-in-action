package com.example.infrastructure.book.repository;

import com.example.infrastructure.book.entity.BookJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookJPARepository extends JpaRepository<BookJpaEntity, Long> {
}

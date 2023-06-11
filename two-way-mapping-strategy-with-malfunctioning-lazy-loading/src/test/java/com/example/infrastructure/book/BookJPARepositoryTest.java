package com.example.infrastructure.book;

import com.example.infrastructure.book.entity.BookJpaEntity;
import com.example.infrastructure.book.repository.BookJPARepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class BookJPARepositoryTest {
    @Autowired
    private BookJPARepository bookJPARepository;

    @Test
    void find_by_id() {
        // given, when
        Optional<BookJpaEntity> foundBookJpaEntity = bookJPARepository.findById(1L);

        // then
        BookJpaEntity bookJpaEntity = new BookJpaEntity("dummy-author", "dummy-title", "dummy-contents");
        assertThat(foundBookJpaEntity).hasValue(bookJpaEntity);
    }
}

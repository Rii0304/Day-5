package jpa.repository;

import jpa.entity.BookDetailsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDetailsRepository extends CrudRepository<BookDetailsEntity, Integer> {
}

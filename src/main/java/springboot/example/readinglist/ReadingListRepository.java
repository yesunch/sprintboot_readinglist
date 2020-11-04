package springboot.example.readinglist;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// This interface will be implemented automatically after the program starts
public interface ReadingListRepository extends JpaRepository<Book,Long> {
    List<Book> findByReader(String reader);
}

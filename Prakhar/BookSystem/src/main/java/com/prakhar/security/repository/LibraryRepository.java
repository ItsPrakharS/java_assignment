package com.prakhar.security.repository;

import com.prakhar.security.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryRepository extends JpaRepository<Library,Long> {

    Library findByLibraryName(String libraryName);
}

package com.cibt.catserviceapp.repository;

import java.util.List;

import com.cibt.catserviceapp.models.Category;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findByParentId(Long parentId);

    Category findByCategoryName(String name);

    // @Query(value = "SELECT * FROM USERS u WHERE u.status = 1", nativeQuery = true)
    List<Category> findByStatusAndParentId(boolean status, Integer parentId);
    
}
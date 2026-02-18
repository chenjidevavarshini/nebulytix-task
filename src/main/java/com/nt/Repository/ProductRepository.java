package com.nt.Repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

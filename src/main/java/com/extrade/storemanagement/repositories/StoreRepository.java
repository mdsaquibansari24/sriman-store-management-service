package com.extrade.storemanagement.repositories;

import com.extrade.storemanagement.entities.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Integer> {
}

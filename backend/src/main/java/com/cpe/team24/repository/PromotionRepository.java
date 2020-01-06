package com.cpe.team24.repository;

import com.cpe.team24.entity.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PromotionRepository extends JpaRepository<Promotion,Long> {
}

package com.madelybetancourt.forma1.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.madelybetancourt.forma1.user.service.SegUserService;

@Repository
public interface SegUserRepository extends JpaRepository<SegUserService, Integer>{
    
}
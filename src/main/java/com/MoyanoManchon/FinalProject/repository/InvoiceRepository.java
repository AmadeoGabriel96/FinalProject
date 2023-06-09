package com.MoyanoManchon.FinalProject.repository;

import com.MoyanoManchon.FinalProject.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    @Override
    Optional<Invoice> findById(Long aLong);

}

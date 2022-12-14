package com.generation.lojagames.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.lojagames.models.ProdutoModel;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
    public List<ProdutoModel> findAllByNomeProdutoContainingIgnoreCase(String nomeProduto);
}

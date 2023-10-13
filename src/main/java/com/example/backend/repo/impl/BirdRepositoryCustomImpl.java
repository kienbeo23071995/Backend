package com.example.backend.repo.impl;

import com.example.backend.dtos.BirdDTO;
import com.example.backend.repo.BirdRepositoryCustom;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class BirdRepositoryCustomImpl implements BirdRepositoryCustom {
    @Autowired
    @PersistenceContext(unitName = "entityManagerFactory")
    private EntityManager entityManager;

    @Override
    public List<BirdDTO> getAll() {
        String sql = "SELECT [bird_id]\n" +
                "      ,[bird_name]\n" +
                "      ,[bird_age]\n" +
                "      ,s.[status]\n" +
                "\t  ,bt.bird_type\n" +
                "\t  ,sp.species_name\n" +
                "      ,[food_quantity]\n" +
                "\t  ,birdGender\n" +
                "\t  ,hatchingDate\n" +
                "  FROM [BirdFarmProject].[dbo].[Bird] b\n" +
                "  join [Status] s on b.status_id = s.status_id\n" +
                "  join [BirdType] bt on b.bird_type_id = bt.bird_type_id\n" +
                "  join Species sp on b.species_id = sp.species_id";
        Query query = entityManager.createNativeQuery(sql,"BirdDTO");
        List<BirdDTO> resultList = query.getResultList();
        return resultList;
    }

    @Override
    public BirdDTO getBirdDTOByID(String id) {
        String sql = "SELECT [bird_id]\n" +
                "      ,[bird_name]\n" +
                "      ,[bird_age]\n" +
                "      ,s.[status]\n" +
                "\t  ,bt.bird_type\n" +
                "\t  ,sp.species_name\n" +
                "      ,[food_quantity]\n" +
                "\t  ,birdGender\n" +
                "\t  ,hatchingDate\n" +
                "  FROM [BirdFarmProject].[dbo].[Bird] b\n" +
                "  join [Status] s on b.status_id = s.status_id\n" +
                "  join [BirdType] bt on b.bird_type_id = bt.bird_type_id\n" +
                "  join Species sp on b.species_id = sp.species_id where [bird_id] = :id";
        Query query = entityManager.createNativeQuery(sql,"BirdDTO");
        query.setParameter("id",id);
        BirdDTO birdDTO = (BirdDTO) query.getSingleResult();
        return birdDTO;
    }
}

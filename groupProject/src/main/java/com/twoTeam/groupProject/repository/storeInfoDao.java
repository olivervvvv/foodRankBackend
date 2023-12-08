package com.twoTeam.groupProject.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twoTeam.groupProject.entity.StoreInfo;


@Repository
public interface storeInfoDao extends JpaRepository<StoreInfo, String>{

	public List<StoreInfo> findByLocationCity(String locationCity);
}

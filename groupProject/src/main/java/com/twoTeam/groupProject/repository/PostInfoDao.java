package com.twoTeam.groupProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twoTeam.groupProject.entity.PostInfo;

@Repository
public interface PostInfoDao extends JpaRepository<PostInfo, Integer>{

	public PostInfo findById(int postId);
}

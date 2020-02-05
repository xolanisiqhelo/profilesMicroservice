package com.profiles.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.profiles.model.DAOUser;

@Repository
public interface ProfilesRepository  extends JpaRepository<DAOUser, Integer>{
	DAOUser findByUsername(String username);
}

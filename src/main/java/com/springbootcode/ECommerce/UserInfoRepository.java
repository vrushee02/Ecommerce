package com.springbootcode.ECommerce;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface UserInfoRepository extends JpaRepository<UserInfo, Long>{
   // void deleteById(Long id);

	List<UserInfo> findAllById(Long id);
	List<UserInfo> findByEmail(String username1);
}



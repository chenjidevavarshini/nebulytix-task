package com.nt.Repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.Entities.User;

public interface UserRepository extends JpaRepository<User, Long> 
{
	
}

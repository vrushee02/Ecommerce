/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootcode.ECommerce;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author sensrapp
 */
@Service
public class UserInfoService {

	@Autowired
	private UserInfoRepository userrepository;
	
	//@Autowired
	//private BCryptPasswordEncoder passwordEncoder;
	 
	
	public UserInfo saveData(UserInfo regist) {
		
		
	UserInfo employee = new UserInfo(regist.getFirstname(),regist.getMiddlename(),regist.getLastname(), regist.getEmail()  ,regist.getPassword());
	
		System.out.println("save into database");
                return userrepository.save(employee);	
      }

	
	/*public UserInfo saveUpdateData(UserInfo regist) {
		
		
	UserInfo employee = new UserInfo(regist.getId(),  regist.getFirstname(),regist.getMiddlename(),regist.getLastname(), regist.getEmail()  ,regist.getPassword(),Arrays.asList(new Role("USER_ADMIN")));
	
		System.out.println("save into database");
      return userrepository.save(employee);	
      }*/

//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        UserInfo user = userrepository.findByEmail(username);
//        if (user != null) {
//        	System.out.println("in employee method");
//
//            return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));
//        }
//
//        else{
//               throw new UsernameNotFoundException("No user Found");
//        }
//	}       
//
//	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
//		// TODO Auto-generated method stub
//		return roles.stream().map(role-> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
//	}
//	
	public List<UserInfo> findByEmail(String email) {
		// TODO Auto-generated method stub
		System.out.println("finding email");
		return userrepository.findByEmail(email);
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		System.out.println("deleting user");
		userrepository.deleteById(id);
	}
	
	public List<UserInfo> userDataList()
	{
		return userrepository.findAll();
		
		
	}
	
	public List<UserInfo> userDataById(Long id)
	{
		return userrepository.findAllById(id);
		
		
	}	
	
//	public List<UserInfo> logindata(String email)
//	{
//		// BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();  
//		 
//		 
//		 return userrepository.findByEmail(email);
////		   Long id=0000000000L;
////	        if (vendor != null) {
////	        	System.out.println("in candidate method");
////	        	String demail = vendor.getEmail();
////	        	String dpassword = vendor.getPassword();
////	        	if(email.equals(demail) && password.equals(dpassword))
////	        	{
////		     		 id = vendor.getId();
////	        		
////	        		System.out.println("data is equal"+id);
////	        		
////	        	}
////	        	
////	        }
////	        //  return new org.springframework.security.core.userdetails.User(vendor.getEmail(), vendor.getPhone());	        }
////	        else{
////	               System.out.println("No user Found");
////	        }
////			return id;
//
//	        
//	}

}

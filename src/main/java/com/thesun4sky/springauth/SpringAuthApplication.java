package com.thesun4sky.springauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. 인증설정 (WebSecurityConfig.java)
 * WebSecurityConfig > http.formLogin() > UsernamePasswordAuthenticationFilter > SecurityFilterChain > 요청별 인증수행

 * 2. 인증정보 받아오기 & 인증객체에 넣기 (UserDetailsServiceImpl.java)
 * UsernamePasswordAuthenticationFilter > UserDetailsService 구현 > loadUserByUsername() > User > UserDetails > Authentication (createSuccessAuthentication()에서 만들어짐)

 * 3. 인증정보 구현체 (UserDetailsImpl.java)
 * UserDetails 구현체 > UserDetailsImpl

 * 4. 인증객체(Authentication)에서 UserDetails 값 받아오기 (@AuthenticationPrincipal)
 * Authentication > getPrincipal() > UserDetails > user
 */
@SpringBootApplication
public class SpringAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAuthApplication.class, args);
	}

}
# spring-auth

## SpringSecurity 인증정보 설정 및 전달 순서

1. 인증설정 (WebSecurityConfig.java)
* WebSecurityConfig > http.formLogin() > UsernamePasswordAuthenticationFilter > SecurityFilterChain > 요청별 인증수행
https://github.com/thesun4sky/spring-auth/blob/ea0cc39d3c8c93b8026dea7e5245fc3268498f41/src/main/java/com/thesun4sky/springauth/config/WebSecurityConfig.java#L14-L46

2. 인증정보 받아오기 & 인증객체에 넣기 (UserDetailsServiceImpl.java)https://github.com/thesun4sky/spring-auth
* UsernamePasswordAuthenticationFilter > UserDetailsService 구현 > loadUserByUsername() > User > UserDetails > Authentication (createSuccessAuthentication()에서 만들어짐)
https://github.com/thesun4sky/spring-auth/blob/ea0cc39d3c8c93b8026dea7e5245fc3268498f41/src/main/java/com/thesun4sky/springauth/security/UserDetailsServiceImpl.java#L14-L30

3. 인증정보 구현체 (UserDetailsImpl.java)
* UserDetails 구현체 > UserDetailsImpl
https://github.com/thesun4sky/spring-auth/blob/ea0cc39d3c8c93b8026dea7e5245fc3268498f41/src/main/java/com/thesun4sky/springauth/security/UserDetailsImpl.java#L16-L69

4. 인증객체(Authentication)에서 UserDetails 값 받아오기 (@AuthenticationPrincipal)
* Authentication > getPrincipal() > UserDetails > user
https://github.com/thesun4sky/spring-auth/blob/ea0cc39d3c8c93b8026dea7e5245fc3268498f41/src/main/java/com/thesun4sky/springauth/controller/ProductController.java#L19-L27

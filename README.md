#  PROJECT SETUP
  - Important dependencies
     - Spring WEB
     - Spring Security
     - Spring Boot Devtools
     - Thymleaf
     - Spring Data Jpa
     - MySql Driver
       
	    		implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
			implementation 'org.springframework.boot:spring-boot-starter-security'
			implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
		    	implementation 'org.springframework.boot:spring-boot-starter-web'
		    	implementation 'org.thymeleaf.extras:thymeleaf-extras-springsecurity6'
		    	developmentOnly 'org.springframework.boot:spring-boot-devtools'
		    	runtimeOnly 'com.mysql:mysql-connector-j'

- Packages Architecture
  - entities
    - Emplyee.class
  - repository
    - EmpRepo.class exrtends JpaRepository
  - config
    - CustomUserDetails.class implements UserDetails
    - CustomUserDetailsService.class implements UserDetailsService
    - SecurityConfig.class @Configuration @EnableWebSecurity
      - Create BcryptPasswordEncoder Bean
      - Create DaoAuthenticationProvider Bean -> UserDetailsService obj, password encoder
  - controller
    - HomeController.class
  - services

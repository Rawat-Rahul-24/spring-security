package com.example.main.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.model.AuthenticateRequests;
import com.example.main.model.AuthenticationResponse;
import com.example.main.services.CustomUserDetailsService;
import com.example.main.util.JWTUtil;

@RestController
public class MainController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private CustomUserDetailsService userDetailsService;
	
	@Autowired
	private JWTUtil jwtUtil;
	
	@GetMapping("/")
	public String home() {
		return "Welcome";
	}
	
	@GetMapping("/user")
	public String userLogin() {
		return "Welcome user";
	}
	
	@GetMapping("/admin")
	public String adminLogin() {
		return "Welocme admin";
	}
	
	@PostMapping("/authenticate")
	public ResponseEntity<?> generateJwt(@RequestBody AuthenticateRequests authenticateRequests) throws Exception {
		try{
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authenticateRequests.getUsername(), authenticateRequests.getPassword()));
		}catch (BadCredentialsException e) {
			throw new Exception("Incorrect username and password");
		}
		final UserDetails userdetails = userDetailsService
				.loadUserByUsername(authenticateRequests.getUsername());
		
		final String jwt = jwtUtil.generateToken(userdetails);
		
		return new ResponseEntity(new AuthenticationResponse(jwt), HttpStatus.OK);
	}

}
	


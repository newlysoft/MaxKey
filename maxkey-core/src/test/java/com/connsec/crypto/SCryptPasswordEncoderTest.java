package com.connsec.crypto;

import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

public class SCryptPasswordEncoderTest {

	public SCryptPasswordEncoderTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SCryptPasswordEncoder pe=new SCryptPasswordEncoder();
		String c="$e0801$7Holo9EgzBeg5xf/WLZu3/5IQwOyEPDLJPgMXkF9jnekBrbQUMt4CF9O2trkz3zBCnCLpUMR437q/AjQ5TTToA==$oYB8KRSxAsxkKkt5r79W6r6P0wTUcKwGye1ivXRN0Ts="
		;
				System.out.println(pe.encode("shimingxy")+"_password");
				System.out.println(pe.matches("shimingxy"+"_password", c));
	}

}
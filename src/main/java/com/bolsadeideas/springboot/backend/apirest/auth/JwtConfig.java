package com.bolsadeideas.springboot.backend.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIBOwIBAAJBALYXp341c4y2X5h+rIZNHQH+zVz0mRwetE/gP/4jS9GurxifmuqM\r\n" + 
			"eVl50dF7/7XgjwEJQOTB1zHHHbimT/KxQMkCAwEAAQJBAI+f4LCfoGBgiM5TO+lC\r\n" + 
			"cZrdS0YCd7HCVh6all7xoB/l/wjfNSvaEUfx8azmJYkgdYPufJ88UHesP6JY4Nyo\r\n" + 
			"rgECIQDo+FBaw0MebpHInd6CD4lZoQMV2wwNFpUJmk6mIqe8WQIhAMgXzNVnagQA\r\n" + 
			"s2nbzMjAcJx2aLLTEgthCnZ15gTy/lnxAiAIbatijTvpZvCpRGTfabZ7YqLc8I7Q\r\n" + 
			"DmgX79g2lHxjCQIgWr0wTraPBTGsKx1aSM+8QbgQ0seVL0Paks30edoYLoECIQCL\r\n" + 
			"RJyBAFaWPCYxN8z1zreyV//LEtnzllP1ehWI02HF6w==\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBALYXp341c4y2X5h+rIZNHQH+zVz0mRwe\r\n" + 
			"tE/gP/4jS9GurxifmuqMeVl50dF7/7XgjwEJQOTB1zHHHbimT/KxQMkCAwEAAQ==\r\n" + 
			"-----END PUBLIC KEY-----";
}

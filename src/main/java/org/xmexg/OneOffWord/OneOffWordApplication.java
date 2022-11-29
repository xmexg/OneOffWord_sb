package org.xmexg.OneOffWord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xmexg.OneOffWord.dao.Mysql;

@SpringBootApplication
public class OneOffWordApplication {

	public static Mysql ms;

	public static void main(String[] args) {
		ms = new Mysql();
		SpringApplication.run(OneOffWordApplication.class, args);
	}

}

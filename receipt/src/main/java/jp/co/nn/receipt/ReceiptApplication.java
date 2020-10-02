package jp.co.nn.receipt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={"jp.co.nn.receipt.mapper"})
public class ReceiptApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReceiptApplication.class, args);
	}

}

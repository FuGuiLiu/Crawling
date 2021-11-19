package com.sky.crawling;

import com.sky.crawling.component.zhihu.ZhihuTask;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sky.crawling.dao")
public class CrawlingApplication implements CommandLineRunner {
	@Autowired
	private ZhihuTask zhihuTask;


	public static void main(String[] args) {
		SpringApplication.run(CrawlingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// 爬取知乎数据
		zhihuTask.crawl();
	}
}

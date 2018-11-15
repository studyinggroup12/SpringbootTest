package com.sola.SpringbootTest;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.sola.controller.UserController;
import com.sola.entity.Goods;
import com.sola.service.GoodsService;

import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1{
	@Autowired
	private GoodsService goodsService;
//	private MockMvc mock;
	
//	@Before
//	public void setUp() throws Exception{
//		mock=MockMvcBuilders.standaloneSetup(new UserController()).build();
//	}
	
	@Test
	public void test1() {
		System.out.println(goodsService.findById(1));
		System.out.println(goodsService.findById(1).get());
	}
	

	
}

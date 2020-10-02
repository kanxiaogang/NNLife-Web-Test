package jp.co.nn.receipt.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.nn.receipt.repository.Receipt;
import jp.co.nn.receipt.service.ReceiptService;

@RestController
public class ReceiptController {
	
	@Autowired
	ReceiptService receiptService;
	
	@GetMapping("/recipes")
	public Map<String,List<Receipt>> getAllReceipts(){
		Map<String,List<Receipt>> map = new HashMap<>();
		map.put("recipes", receiptService.getReceipts());
		return map;
	}
	
	@GetMapping("/recipes/{id}")
	public Map<String,Object> getReceiptById(@PathVariable("id") Integer id) {
		Map<String,Object> map = new HashMap<>();
		List<Receipt> list = new ArrayList<>();
		map.put("message", "Recipe details by id");
		list.add(receiptService.getReceiptById(id));
		map.put("recipe",list);
		return map;
	}
	
	@PostMapping("/recipes")
	public Map<String,Object> saveReceipt(Receipt rececipt) {
		int result = receiptService.insertReceipt(rececipt);
		Map<String,Object> map = new HashMap<>();
		List<Receipt> list = new ArrayList<>();
		//登録成功の場合
		if(result == 1) {
			map.put("message", "Recipe successfully created!");
			list.add(rececipt);
			map.put("recipe", list);
		}
		//登録失敗の場合
		else {
			map.put("message", "Recipe creation failed!");
			map.put("required", "title, making_time, serves, ingredients, cost");
		}
		return map;
		
	}
	
	@PutMapping("/recipes/{id}")
	public Map<String,Object> updateReceipt(@PathVariable("id") Integer id, Receipt rececipt) {
		int result = receiptService.updateReceipt(rececipt);
		Map<String,Object> map = new HashMap<>();
		List<Receipt> list = new ArrayList<>();
		//更新成功の場合
		if(result == 1) {
			map.put("message", "Recipe successfully updated!");
			list.add(rececipt);
			map.put("recipe", list);
		}
		//更新失敗の場合
		else {
			map.put("message", "Recipe updated failed!");
//			map.put("required", "title, making_time, serves, ingredients, cost");
		}
		return map;
	}
	
	@DeleteMapping("/recipes/{id}")
	public Map<String,String> deleteReceipt(@PathVariable("id") Integer id){
		int result = receiptService.deleteReceiptById(id);
		Map<String,String> map = new HashMap<>();
		//削除成功の場合
		if(result == 1) {
			map.put("message", "Recipe successfully removed!");
		}
		//削除失敗の場合
		else {
			map.put("message", "No Recipe found");
//			map.put("required", "title, making_time, serves, ingredients, cost");
		}
		return map;
		
	}
	
}

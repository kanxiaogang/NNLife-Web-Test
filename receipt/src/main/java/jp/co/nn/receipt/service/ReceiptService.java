package jp.co.nn.receipt.service;

import java.util.List;

import jp.co.nn.receipt.repository.Receipt;

public interface ReceiptService {
	
	//すべてレシピを取得する
	public List<Receipt> getReceipts();
	//IDによりレシピを取得する
	public Receipt getReceiptById(Integer id);
	//IDによりレシピを削除する
	public int deleteReceiptById(Integer id);
	//レシピを登録する
	public int insertReceipt(Receipt rececipt);
	//レシピを更新する
	public int updateReceipt(Receipt rececipt);

}

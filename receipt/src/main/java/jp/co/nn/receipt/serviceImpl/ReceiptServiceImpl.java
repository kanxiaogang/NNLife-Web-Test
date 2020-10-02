package jp.co.nn.receipt.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.nn.receipt.mapper.RecepitMapper;
import jp.co.nn.receipt.repository.Receipt;
import jp.co.nn.receipt.service.ReceiptService;

@Service
public class ReceiptServiceImpl implements ReceiptService{

	@Autowired
	RecepitMapper receiptMapper;
	
	@Override
	public List<Receipt> getReceipts() {
		// TODO Auto-generated method stub
		return receiptMapper.getReceipts();
	}

	@Override
	public Receipt getReceiptById(Integer id) {
		// TODO Auto-generated method stub
		return receiptMapper.getReceiptById(id);
	}

	@Override
	public int deleteReceiptById(Integer id) {
		// TODO Auto-generated method stub
		return receiptMapper.deleteReceiptById(id);
	}

	@Override
	public int insertReceipt(Receipt rececipt) {
		// TODO Auto-generated method stub
		return receiptMapper.insertReceipt(rececipt);
	}

	@Override
	public int updateReceipt(Receipt rececipt) {
		// TODO Auto-generated method stub
		return receiptMapper.updateReceipt(rececipt);
	}

}

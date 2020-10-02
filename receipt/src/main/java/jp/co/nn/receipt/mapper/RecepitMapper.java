package jp.co.nn.receipt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import jp.co.nn.receipt.repository.Receipt;

@Mapper
public interface RecepitMapper {
	@Select("select * from recipes")
	public List<Receipt> getReceipts();
	
	@Select("select * from recipes where id=#{id}")
	public Receipt getReceiptById(Integer id);
	
	@Delete("delete from recipes where id=#{id}")
	public int deleteReceiptById(Integer id);
	
	@Options(useGeneratedKeys = true, keyProperty = "id")
	@Insert("insert into recipes(title,making_time,serves,ingredients,cost,created_at,updated_at) values(#{title},#{making_time},#{serves},#{ingredients},#{cost},#{created_at},#{updated_at})")
	public int insertReceipt(Receipt rececipt);
	
	@Update("update recipes set title=#{title},making_time=#{making_time},serves=#{serves},ingredients=#{ingredients},cost=#{cost},created_at=#{created_at},updated_at=#{updated_at} where id=#{id}")
	public int updateReceipt(Receipt rececipt);

}

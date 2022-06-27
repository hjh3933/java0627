package org.java.Dao;

import java.util.ArrayList;

import org.java.DBConnect.DbConnect;
import org.java.Dto.MemberDto;

public class MemberDao {
	//싱글톤
	private static final MemberDao INSTANCE = new MemberDao();
	private MemberDao() {}
	public static MemberDao getInstance() {
		return INSTANCE;
	}
	//insert
	public int insertDo() {
		int rs = 0;
		//회원가입 DB
		DbConnect.getConnect();	//static이라 객체 생성 필요없지롱 ㅋㅋ
		return rs;
	}
	//select
	public ArrayList<MemberDto> list() {
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		//회원조회DB
		DbConnect.getConnect();
		return lists;
	}
	//update
	public int updateDo() {
		int rs = 0;
		//회원 수정 DB
		DbConnect.getConnect();
		return rs;
	}
	//delete
	public int deleteDo() {
		int rs = 0;
		//회원탈퇴 DB
		DbConnect.getConnect();
		return rs;
	}
}

package org.java.Dao;

import java.util.ArrayList;

import org.java.DBConnect.DbConnect;
import org.java.Dto.MemberDto;

public class MemberDao {
	//�̱���
	private static final MemberDao INSTANCE = new MemberDao();
	private MemberDao() {}
	public static MemberDao getInstance() {
		return INSTANCE;
	}
	//insert
	public int insertDo() {
		int rs = 0;
		//ȸ������ DB
		DbConnect.getConnect();	//static�̶� ��ü ���� �ʿ������ ����
		return rs;
	}
	//select
	public ArrayList<MemberDto> list() {
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		//ȸ����ȸDB
		DbConnect.getConnect();
		return lists;
	}
	//update
	public int updateDo() {
		int rs = 0;
		//ȸ�� ���� DB
		DbConnect.getConnect();
		return rs;
	}
	//delete
	public int deleteDo() {
		int rs = 0;
		//ȸ��Ż�� DB
		DbConnect.getConnect();
		return rs;
	}
}

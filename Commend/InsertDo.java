package org.java.Commend;

import org.java.Dao.MemberDao;

public class InsertDo implements ExcuteQueryCommend {

	@Override
	public void excuteQuery() {
		System.out.println("회원가입 실행");
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.insertDo();
		System.out.println("반환값 : "+rs);
	}

}

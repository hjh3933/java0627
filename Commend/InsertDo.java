package org.java.Commend;

import org.java.Dao.MemberDao;

public class InsertDo implements ExcuteQueryCommend {

	@Override
	public void excuteQuery() {
		System.out.println("ȸ������ ����");
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.insertDo();
		System.out.println("��ȯ�� : "+rs);
	}

}

package com.atcrowdfunding.bean;

import java.util.List;

/**
 * 数据包装类
 * @author ashikotakeshi
 *
 */
public class Datas {
	
		private List<User> users;
		private List<Integer> ids;
		private List<MemberCert> mcs;

		public List<MemberCert> getMcs() {
			return mcs;
		}

		public void setMcs(List<MemberCert> mcs) {
			this.mcs = mcs;
		}

		public List<Integer> getIds() {
			return ids;
		}

		public void setIds(List<Integer> ids) {
			this.ids = ids;
		}

		public List<User> getUsers() {
			return users;
		}

		public void setUsers(List<User> users) {
			this.users = users;
		}
}

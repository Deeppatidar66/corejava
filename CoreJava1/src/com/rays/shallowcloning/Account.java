package com.rays.shallowcloning;

public class Account implements Cloneable {
		int balance =0;
		public Account(int balance ) {
			this.balance= balance;
			
		}
		@Override
		protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		}
	}



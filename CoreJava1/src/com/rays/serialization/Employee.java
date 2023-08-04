package com.rays.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee  implements Externalizable{
	
	String name = null;
	int maths = 0;
	int physics =0;
	int chemistry = 0;
	transient int temp =0;
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(maths);
		out.writeInt(physics);
		out.writeInt(chemistry);
		out.writeInt(temp);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		name = (String) in.readObject();
		maths = in.readInt();
		physics = in.readInt();
		chemistry = in.readInt();
		temp = in.readInt();
		
		
		
	}
	
	
	

}

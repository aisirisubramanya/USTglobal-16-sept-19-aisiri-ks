package com.ustglobal.object;

public class Cow {
	int id;
	String name;
	double cost;

	public Cow(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this==obj) {
			return true;
		}
		else 
		{
			Cow c=(Cow) obj;
			if(this.id==c.id)
			{
				if(this.name.equals(c.name))
				{
					if(this.cost==c.cost) 
					{
						return true;
					}
					else
					{
						return false;
					}
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
	}
}

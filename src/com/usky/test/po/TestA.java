package com.usky.test.po;


//@Table(name = "TESTA")
public class TestA
{
	String id;

	//	@Id
	//	@Column(name = "ID", length = 50)
	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}
}

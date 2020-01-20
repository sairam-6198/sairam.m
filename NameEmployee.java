package com.techouts.collections;

 class NameEmployee implements Comparable<NameEmployee> {
	int id;
	String name,mail;
	NameEmployee(int id,String name,String mail){
		this.id=id;
		this.name=name;
		this.mail=mail;
	}
	public int compareTo(NameEmployee e){
		return name.compareTo(e.name);
	}

}

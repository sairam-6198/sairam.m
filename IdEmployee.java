package com.techouts.collections;

 class IdEmployee implements Comparable<IdEmployee> {
	int id;
	String name,mail;
	IdEmployee(int id,String name,String mail){
		this.id=id;
		this.name=name;
		this.mail=mail;
	}

	public int compareTo(IdEmployee e){
		if(id==e.id)
			return 0;
		else if(id>e.id)
			return 1;
		else
			return -1;
			
	}
}

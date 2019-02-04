package virtualpet.organic;

import virtualpet.interfaces.Purr;

public class OrganicCat extends OrganicPet implements Purr {

	public OrganicCat(String name) {
		super(name);
	}

	@Override
	public String vocalization() {
		return "Purr";
		
	}

}

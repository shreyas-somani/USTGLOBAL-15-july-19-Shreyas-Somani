package com.ust.usttyspringcore.beans;

public class Pet {
 private Animal name;
 private Animal Animal;

	public Animal getName() {
	return name;
}

public Pet(com.ust.usttyspringcore.beans.Animal name, com.ust.usttyspringcore.beans.Animal animal) {
		super();
		this.name = name;
		Animal = animal;
	}

public void setName(Animal name) {
	this.name = name;
}

public Animal getAnimal() {
	return Animal;
}

public void setAnimal(Animal animal) {
	Animal = animal;
}

	public Pet() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

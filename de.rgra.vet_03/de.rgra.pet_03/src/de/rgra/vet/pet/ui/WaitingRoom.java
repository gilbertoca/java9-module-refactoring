package de.rgra.vet.pet.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.rgra.vet.pet.db.PetDao;
import de.rgra.vet.pet.model.Pet;

public class WaitingRoom {

	private List<Pet> pets;

	public WaitingRoom() {
		pets = initialPets();
	}

	public List<Pet> getPets() {
		return Collections.unmodifiableList(pets);
	}

	private static List<Pet> initialPets() {
		List<Pet> result = new ArrayList<>();

		for (int i = 1; i <= 3; i++) {
			result.add(new PetDao().fetchPetsForCustomer(i).get(0));
		}
		return result;
	}
}

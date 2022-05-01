package com.maq.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.maq.binding.Pet;

@Service
public class PetService {
	
	public void getAllPets() {
		String url = "https://vur3ednzag.execute-api.ap-south-1.amazonaws.com/prod/pets/";
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Pet[]> responseEntity = rt.getForEntity(url, Pet[].class);
		Pet[] body = responseEntity.getBody();
		for(Pet i:body) {
			System.out.println(i);
		}
	}
	
	public void getPetById(Integer petId) {
		String url = "https://vur3ednzag.execute-api.ap-south-1.amazonaws.com/prod/pets/{petId}";
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Pet> responseEntity = rt.getForEntity(url, Pet.class, petId);
		Pet body = responseEntity.getBody();
		System.out.println(body);
	}
	
	public void addPet() {
		String url = "https://vur3ednzag.execute-api.ap-south-1.amazonaws.com/prod/pets/";
		RestTemplate rt = new RestTemplate();;
		
		Pet pet = new Pet();
		pet.setId(4);
		pet.setType("Parrot");
		pet.setPrice(400.00);
		ResponseEntity<String> postForEntity = rt.postForEntity(url, pet, String.class);
		System.out.println(postForEntity.getBody());
	}

}

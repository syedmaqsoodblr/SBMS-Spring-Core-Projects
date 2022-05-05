package com.maq.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.maq.binding.Passenger;
import com.maq.binding.Ticket;

@Service
public class MakeMyTripService {

	public void bookTicket() {
		String apiUrl = "https://maq-irctc-demo-app.herokuapp.com/ticket";
		Passenger passenger = new Passenger();
		passenger.setName("Syed");
		passenger.setEmail("maq@gmail.com");
		passenger.setFrom("BLR");
		passenger.setJdate("06-May-2022");
		passenger.setTo("Delhi");
		passenger.setTrainNum(1245);
		
		WebClient client = WebClient.create();
		Ticket ticket = client.post()
			  .uri(apiUrl)
			  .bodyValue(passenger)
			  .retrieve()
			  .bodyToMono(Ticket.class)
			  .block();
		
		System.out.println(ticket);
		// Ticket(name=Syed, ticketPrice=500, ticketNum=a7551e28b0224fa39265ecbacb3855e5, ticketStatus=Confirm)
			
	}
	
	public void getTicketSync() {
		String apiUrl = "https://maq-irctc-demo-app.herokuapp.com/ticket/a7551e28b0224fa39265ecbacb3855e5";

		WebClient client = WebClient.create();
		Ticket ticket = client.get()
			  .uri(apiUrl)
			  .retrieve()
			  .bodyToMono(Ticket.class)
			  .block();
		System.out.println(ticket);
	}
	
	public void getTicketAsync() {
		String apiUrl = "https://maq-irctc-demo-app.herokuapp.com/ticket/a7551e28b0224fa39265ecbacb3855e5";

		WebClient client = WebClient.create();
		client.get()
			  .uri(apiUrl)
			  .retrieve()
			  .bodyToMono(Ticket.class)
			  .subscribe(MakeMyTripService::ticketRespHandler);
		System.out.println("Logic executing after sending request...");
//		Logic executing after sending request...
//		Response recieved from api....
//		Ticket(email=maq@gmail.com, from=BLR, jdate=null, name=Syed, to=Delhi, trainNum=null, ticketPrice=500, ticketNum=a7551e28b0224fa39265ecbacb3855e5, ticketStatus=Confirm)

	}
	
	public static void ticketRespHandler(Ticket ticket) {
		System.out.println("Response recieved from api....");
		System.out.println(ticket);
	}
}

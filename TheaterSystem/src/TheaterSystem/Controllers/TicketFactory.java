package TheaterSystem.Controllers;

import TheaterSystem.Models.*;
import TheaterSystem.Models.Tickets.General;
import TheaterSystem.Models.Tickets.Matinee;
import TheaterSystem.Models.Tickets.Senior;
import TheaterSystem.Models.Tickets.Student;

import java.util.Scanner;

public class TicketFactory {
    public Ticket makeTicket(String ticketId) {
        Ticket newTicket = null;
        Movie movie = null;
        Theater theater = null;
        Double price = 10.99;
        ShowTime showTime = null;
        Controller controller = Controller.getInstance();
        for (Movie currentMovie : controller.getMovies()) {
            System.out.println(currentMovie.getId() + ". " + currentMovie.getMovieName());
        }
        Scanner userInput = new Scanner(System.in);

        while(movie == null){
            System.out.print("Movie Id: ");

            if (userInput.hasNextLine()) {

                for (Movie currentMovie : controller.getMovies()) {
                    if (currentMovie.getId() == Integer.parseInt(userInput.nextLine())) {
                        movie = currentMovie;
                        break;
                    }
                }
            }
            if(movie != null){
                break;
            }
            System.out.println("Incorrect Input");
        }


        int i = 1;
        for (ShowTime currentShowtimes : movie.getShowTimes()) {
            System.out.println(i + ". " + currentShowtimes.getStartTime());
            i++;
        }
        while(showTime == null)
        {
            System.out.print("Showtime Id: ");
            if(userInput.hasNextLine()) {

                showTime = movie.getShowTimes().get(Integer.parseInt(userInput.nextLine()) -1);
                theater = showTime.getTheater();
                break;
            }
            System.out.println("Incorrent Input");

        }

        System.out.println("1. General");
        System.out.println("2. Student");
        System.out.println("3. Senior");
        System.out.println("4. Matinee");
        while(true){

            System.out.println("Select Admission:");

            if(userInput.hasNextLine()) {
                if(userInput.nextLine() == "1"){
                    return new General(movie, price, showTime, theater);

                }
                if(userInput.nextLine() == "2"){
                    return new Student(movie, price, showTime, theater);

                }
                if(userInput.nextLine() == "3"){
                    return new Senior(movie, price, showTime, theater);

                }
                if(userInput.nextLine() == "4"){
                    return new Matinee(movie, price, showTime, theater);

                }
            }

            System.out.println("Invalid Input");
        }



    }
}

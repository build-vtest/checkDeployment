import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        // Set up the Spark server
        port(8080); // You can change the port number if needed

        // Define a route to display the welcome message
       get("/", (req, res) -> {
           return "Welcome to my website!";
       });
    }
}
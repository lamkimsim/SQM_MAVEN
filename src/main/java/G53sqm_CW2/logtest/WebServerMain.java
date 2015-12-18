package G53sqm_CW2.logtest;


/**
 * This class contains the main method for the Jibble Web Server.
 * 
 * @author Copyright Paul Mutton, http://www.jibble.org/
 */
public class WebServerMain {

    public static void main(String[] args) {
    	
    	System.out.println("Jibble web server (modified by Lam Kim Sim 010876 for G53SQM)");
    	System.out.println("Root Directory: C:\\Users\\LAMLAMLAM\\git localhost\\g53sqm.jibble");
    	System.out.println("Port: 8088 ");
        
        String rootDir = WebServerConfig.DEFAULT_ROOT_DIRECTORY;
        int port = WebServerConfig.DEFAULT_PORT;
        
        if (args.length > 0) {
            rootDir = args[0];
        }
        
        if (args.length > 1) {
            try {
                port = Integer.parseInt(args[1]);
            }
            catch (NumberFormatException e) {
                // Stick with the default value.
            }
        }
        
        try {
            WebServer server = new WebServer(rootDir, port);
            server.activate();
        }
        catch (WebServerException e) {
            System.out.println(e.toString());
        }
    }

}
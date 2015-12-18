package G53sqm_CW2.logtest;





/**
 * A logging class which prefixes messages to the standard output with
 * human readable timestamps.
 * 
 * @author Copyright Paul Mutton, http://www.jibble.org/
 */
public class Logger {
    
    private Logger() {
        // Prevent this class from being constructed.
    }
    
    public static void log(String ip, String request, int code) {
        System.out.println("[" + new java.util.Date().toString() + "] " + ip + " \"" + request + "\" " + code);
    }
    
}
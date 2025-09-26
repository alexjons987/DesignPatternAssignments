import Singleton.Logger;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Hi mate, in the console");

        logger.log("Getting CWD...");
        String cwd = System.getProperty("user.dir");

        logger.log("Setting up file reference...");
        File file = new File(cwd, "SingletonAssignment.log");

        logger.setPath(file);
        logger.log(String.format("Logger path changed to %s!", file.getAbsolutePath()));

        logger.log("Hi mate, but in a file");
    }
}
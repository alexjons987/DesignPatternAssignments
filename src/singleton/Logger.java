package singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    static Logger logger = null;

    String path;

    private Logger() {
        this.path = null;
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    /**
     * Sets the {@code Logger} path using a {@code String}.
     *
     * @param path Full path to write logs to.
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Sets the {@code Logger} path using a {@code File} reference.
     *
     * @param file {@code File} to write logs to.
     */
    public void setPath(File file) {
        this.path = file.getAbsolutePath();
    }

    /**
     * Log given {@code String}. Will log to console if path is not set using {@link #setPath}.
     *
     * @param message {@code String} to be logged.
     */
    public void log(String message) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String logEntry = String.format("[%s] %s", LocalDateTime.now().format(formatter), message);

        if (this.path == null) {
            System.out.println(logEntry);
        } else {
            try (FileWriter fw = new FileWriter(this.path, true)) {
                fw.write(logEntry + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

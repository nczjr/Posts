package behappy.edu.Posts;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.Thread.sleep;

@SpringBootApplication
public class PostsApplication {

	private static final Logger logger = LogManager.getLogger(PostsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PostsApplication.class, args);
		int i = 0;
		while (true){
			logger.info("teraz : " + i);
			try {
				sleep(60000);
			} catch (InterruptedException e) {
				logger.error("d",e);
			}
			i++;
		}
	}
}

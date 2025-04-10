package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
  private static final Logger logger = LogManager.getLogger(Calculator.class);

  public static void main(String[] args) {
    logger.info("It is a info logger.");
    logger.error("It is an error logger.");
  }
}
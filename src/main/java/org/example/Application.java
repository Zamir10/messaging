package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

final class Application {

  private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

  private Application() {
  }

  public static void main(final String[] args) {
    LOGGER.info("Application Started");
  }
}
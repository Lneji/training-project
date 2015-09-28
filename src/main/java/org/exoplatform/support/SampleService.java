package org.exoplatform.support;

import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.services.log.Log;


public class SampleService {
  private static final Log LOG = ExoLogger.getLogger(SampleService.class);


  public SampleService () {
      LOG.info("---------------------- eXo Sample Service ----------------------------");
  }
}

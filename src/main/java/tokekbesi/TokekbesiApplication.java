package tokekbesi;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import tokekbesi.api.ChallengeAPI;
import tokekbesi.impl.api.SlackChallengeAPI;

public class TokekbesiApplication extends Application<TokekbesiConfiguration> {

  public static void main(final String[] args) throws Exception {
    new TokekbesiApplication().run(args);
  }

  @Override
  public String getName() {
    return "Tokekbesi";
  }

  @Override
  public void initialize(final Bootstrap<TokekbesiConfiguration> bootstrap) {
    // TODO: application initialization
  }

  @Override
  public void run(final TokekbesiConfiguration configuration,
      final Environment environment) {
    ChallengeAPI challengeAPI = new SlackChallengeAPI();
    environment.jersey().register(challengeAPI);
  }

}

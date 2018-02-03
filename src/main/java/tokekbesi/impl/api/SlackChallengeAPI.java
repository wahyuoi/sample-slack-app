package tokekbesi.impl.api;

import tokekbesi.api.ChallengeAPI;
import tokekbesi.api.data.ChallengeRequest;
import tokekbesi.api.data.ChallengeResponse;

public class SlackChallengeAPI implements ChallengeAPI {

  @Override
  public ChallengeResponse challenge(ChallengeRequest request) {
    return new ChallengeResponse().setChallenge(request.getChallenge());
  }
}

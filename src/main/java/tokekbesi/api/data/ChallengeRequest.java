package tokekbesi.api.data;

public class ChallengeRequest {
  private String token;
  private String challenge;
  private String type;

  public String getToken() {
    return token;
  }

  public ChallengeRequest setToken(String token) {
    this.token = token;
    return this;
  }

  public String getChallenge() {
    return challenge;
  }

  public ChallengeRequest setChallenge(String challenge) {
    this.challenge = challenge;
    return this;
  }

  public String getType() {
    return type;
  }

  public ChallengeRequest setType(String type) {
    this.type = type;
    return this;
  }
}

package tokekbesi.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import tokekbesi.api.data.ChallengeRequest;
import tokekbesi.api.data.ChallengeResponse;

@Path("challenge")
@Produces(MediaType.APPLICATION_JSON)
public interface ChallengeAPI {

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  ChallengeResponse challenge(ChallengeRequest request);
}

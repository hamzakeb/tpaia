package api;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import database.VolsBD;

@Path("/vols")
public class AirportResources {

    @GET
    public String getVols() {
        return VolsBD.getVols().toString();
    }

    @GET
    @Path("numVol-{id}")
    public String getVol(@PathParam("id") String id) {
        System.out.println("ID : " + id);
        return VolsBD.getVolById(id).toString();
    }
    
    @GET
    @Path("/search")
    public String getVolsByParam(@QueryParam("departure") String departure, @QueryParam("arrival") String arrival, @QueryParam("departureTime") int departureTime) {
        return VolsBD.getVolByParam(departure,arrival,departureTime).toString();
    }
}
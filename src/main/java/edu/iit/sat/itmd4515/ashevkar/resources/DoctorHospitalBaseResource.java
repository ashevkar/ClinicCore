package edu.iit.sat.itmd4515.ashevkar.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author 
 */
@Path("/hospitals")
public class DoctorHospitalBaseResource {
    
    /**
     *
     * @return
     */
    @GET
    public Response ping(){
        return Response
                .ok("ping Jakarta EE")
                .build();
    }

    /**
     *
     * @return
     */
    @Path("/version")
    @GET
    public Response version(){
        return Response
                .ok("Accept nothing, verify & test everything! ")
                .build();
    }
}

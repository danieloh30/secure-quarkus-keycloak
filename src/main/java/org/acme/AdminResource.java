package org.acme;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/admin")
public class AdminResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String admin() {
        return "Keycloak Granted using Quarkus Native!!!";
    }
    
}

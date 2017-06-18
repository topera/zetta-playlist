package com.zp.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by rafael on 18/06/17.
 */
@Path("playlist")
public class PlaylistResource {

    /**
     * List all playlists of the logged user
     * @return
     */
    @GET
    public Response list() {
        String output = "[]";
        return Response.status(200).entity(output).build();
    }

}
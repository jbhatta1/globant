/*
 * Code challenge for Globant
 */
package com.globant;

/**
 * Used for Health check of server as well as database.
 * Also use to find files in a folder
 * @author jaya
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;

@Path("/GlobantService")
public class GlobantService {

    private static final UserDao userDao = new UserDao();
    @GET
    @Path("/serverHealthCheck")
    public String isServerAlive() {
        return "All good! @ "+new Date().toString();
    }

    @GET
    @Path("/isDatabaseConnectionAlive")
    @Produces(MediaType.APPLICATION_JSON)
    public Boolean isDatabaseConnectionAlive() {
        return userDao.isDatabaseConnectionAlive();
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/filesInFolder")
    public List<String> findFilesInFolder(final String folderName) {
        return listFilesInGivenFolder(new File(folderName));
    }

    public List<String> listFilesInGivenFolder(final File folder) {
        List<String> fileName = new ArrayList<>();
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesInGivenFolder(fileEntry);
            } else {
                fileName.add(fileEntry.getName());
            }
        }
        return fileName;
    }

}

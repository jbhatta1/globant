/*
 * Code challenge for Globant
 */
package com.globant;

/**
 * Authenticates and find users
 * @author jaya
 */
import javax.ws.rs.core.MediaType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;

@Path("/UserService")
public class UserService {
    private static UserDao userDao = new UserDao();

    @GET
    @Path("/users")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> findAllUsers() {
        return userDao.findAllUsers();
    }
    
    @POST
    @Path("/authenticate")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public User findUserByIdAndPassword(final User user) {
        System.out.println("*********** " + user.getUserId() + "**********" + user.getPassword());
        return userDao.findUserByIdAndPassword(user.getUserId(), user.getPassword());
    }
    
    @POST
    @Path("/filter")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> findUsersByParameters(final Map<String, Object> paramMap) {
        return userDao.findUsersByParameters(paramMap);
    }
    
}

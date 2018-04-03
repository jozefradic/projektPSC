package com.psc.resources;

import com.psc.db.MySQL;
import com.psc.resources.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

import static javax.ws.rs.core.Response.*;

@Path("/obec/")
public class Service {
//import com.automationrhapsody.reststub.persistence.PersonDB;
// import com.codahale.metrics.annotation.Timed;
    @GET
    @Path("/get/{obec}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPsc(@PathParam("obec") String obec)throws SQLException {
            MySQL result = new MySQL();
            result.getPscByObec( obec);

        return result;

    }

        @GET
        @Path("/get/{psc}")
        @Produces(MediaType.APPLICATION_JSON)
        public Response getObec(@PathParam("psc") String psc)throws SQLException {

        MySQL result1 = new MySQL();
        result1.getPscByObec( psc);

        return result1;
        }
/*
    @GET
    @Path("/get/{obec}")
    @Produces(MediaType.APPLICATION_JSON)
    public Obec getObec(@PathParam("obec") String obec) {
        return PersonDB.getById(id);
    }



    @GET
    @Timed
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getPersons() {
        return PersonDB.getAll();
    }

    @POST
    @Timed
    @Path("/save")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes({MediaType.APPLICATION_JSON})
    public String addPerson(Person person) {
        return PersonDB.save(person);
    }

    */
}


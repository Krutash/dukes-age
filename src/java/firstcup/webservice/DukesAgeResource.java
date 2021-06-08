/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstcup.webservice;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * REST Web Service
 *
 * @author utkro
 */
@Path("dukesAge")
public class DukesAgeResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of DukesAgeResource
     */
    public DukesAgeResource() {
    }

    /**
     * Retrieves representation of an instance of
     * firstcup.webservice.DukesAgeResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
    public String getText() {
        //TODO return proper representation object
        //create a new Calender for Duke's birthday
        Calendar dukesBirthday = new GregorianCalendar(1995, Calendar.MAY, 23);
        //create a new Calender for today
        Calendar now = GregorianCalendar.getInstance();

        //subtract today's year from Dukes's borthyear
        int dukesAge = now.get(Calendar.YEAR) - dukesBirthday.get(Calendar.YEAR);

        if (now.before(dukesBirthday)) {
            dukesAge--;
        }
        //return a String representation of Duke's age
        return "" + dukesAge;
    }

}

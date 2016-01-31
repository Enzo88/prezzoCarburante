package eu.vinmasterpiece.carburantimise.util;

import com.fasterxml.jackson.databind.util.StdConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by vincenzo on 31/01/16.
 */
public class DateConverter extends StdConverter<String, Date> {
    @Override
    public Date convert(final String value) {
        Date date = null;
        if (value == null || value.equals("NULL")) {
            return null;
        }
        try {
            date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(value);
        } catch (ParseException e) {
            throw new IllegalStateException("Unable to parse date", e);
        }
        return date;
    }
}

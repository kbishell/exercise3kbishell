package com.kortneybishell.customtags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class HelloWorldTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();

        JspWriter out = getJspContext().getOut();

        LocalTime hours = LocalTime.now();


        if(hours.getHour() >= 1 || hours.getHour() <= 12){
            out.println("Good Morning");
        }else if(hours.getHour() >= 12 || hours.getHour() <= 16){
            out.println("Good Afternoon");
        }else if(hours.getHour() >= 16 || hours.getHour() <=21){
            out.println("Good Evening");
        }else if(hours.getHour() >=21 || hours.getHour() <=24){
            out.println("Good Night");
        }

        out.println("Enterprise Java");

        LocalDate day = LocalDate.now();
        LocalDate month = LocalDate.now();

        if(day.getDayOfMonth() == 2 && month.getMonthValue() == 2){
            out.println("Happy Ground Hog Day");
        }
    }
}

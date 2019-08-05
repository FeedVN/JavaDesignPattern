package patterns.structural.decorator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class EmployeeComponent {

    abstract String getName();

    abstract void doTask();

    abstract void join(Date joinDate);

    abstract void terminate(Date terminateDate);

    String formatDate(Date theDate) {
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(theDate);
    }

    void showBasicInformation() {
        System.out.println("-------");
        System.out.println("The basic information of " + getName());

        join(Calendar.getInstance().getTime());

        Calendar terminateDate = Calendar.getInstance();
        terminateDate.add(Calendar.MONTH, 6);
        terminate(terminateDate.getTime());
    }
}

package mx.com.xochitlgalvez.reminders;

/**
 * Created by Francisco on 11/9/2015.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ReminderAlarmReceiver extends BroadcastReceiver {
    public static final String REMINDER_TEXT = "despierta!!";

    @Override
    public void onReceive(Context context, Intent intent) {
    }
}
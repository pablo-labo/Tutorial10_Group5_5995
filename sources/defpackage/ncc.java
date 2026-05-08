package defpackage;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.f;
import androidx.fragment.app.g;
import com.indeed.android.jobsearch.R;
import com.reactcommunity.rndatetimepicker.DatePickerModule;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ValidFragment"})
public class ncc extends f {
    public pcc f0;
    public DatePickerModule.a g0;
    public DatePickerModule.a h0;
    public DatePickerModule.a i0;

    @Override // androidx.fragment.app.f
    public final Dialog H(Bundle bundle) {
        pcc pccVar;
        long timeInMillis;
        long timeInMillis2;
        final Bundle arguments = getArguments();
        g activity = getActivity();
        DatePickerModule.a aVar = this.g0;
        Calendar calendar = Calendar.getInstance();
        if (arguments != null && arguments.containsKey("value")) {
            calendar.setTimeInMillis(arguments.getLong("value"));
        }
        calendar.setTimeZone(mc2.c(arguments));
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        occ occVarValueOf = occ.b;
        occ occVarValueOf2 = (arguments == null || arguments.getString("display", null) == null) ? occVarValueOf : occ.valueOf(arguments.getString("display").toUpperCase(Locale.US));
        if (arguments != null && arguments.getString("display", null) != null) {
            occVarValueOf2 = occ.valueOf(arguments.getString("display").toUpperCase(Locale.US));
        }
        occ occVar = occVarValueOf2;
        occ occVar2 = occ.a;
        if (occVar == occVar2) {
            pccVar = new pcc(activity, R.style.SpinnerDatePickerDialog, aVar, i, i2, i3);
            if (occVar == occVar2 && pccVar.getDatePicker() != null) {
                pccVar.getDatePicker().setCalendarViewShown(false);
            }
        } else {
            pccVar = new pcc(activity, aVar, i, i2, i3);
            if (occVar == occVar2 && pccVar.getDatePicker() != null) {
                pccVar.getDatePicker().setCalendarViewShown(false);
            }
        }
        pcc pccVar2 = pccVar;
        if (arguments != null) {
            mc2.d(arguments, pccVar2, this.i0);
            if (activity != null) {
                if (arguments.getString("display", null) != null) {
                    occVarValueOf = occ.valueOf(arguments.getString("display").toUpperCase(Locale.US));
                }
                pccVar2.setOnShowListener(new lc2(pccVar2, activity, arguments, occVarValueOf == occVar2));
            }
        }
        final DatePicker datePicker = pccVar2.getDatePicker();
        if (arguments.containsKey("minimumDate")) {
            Calendar calendar2 = Calendar.getInstance(mc2.c(arguments));
            calendar2.setTimeInMillis(arguments.getLong("minimumDate"));
            calendar2.set(11, 0);
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            timeInMillis = calendar2.getTimeInMillis();
        } else {
            timeInMillis = 0;
        }
        if (arguments.containsKey("maximumDate")) {
            Calendar calendar3 = Calendar.getInstance(mc2.c(arguments));
            calendar3.setTimeInMillis(arguments.getLong("maximumDate"));
            calendar3.set(11, 23);
            calendar3.set(12, 59);
            calendar3.set(13, 59);
            calendar3.set(14, 999);
            timeInMillis2 = calendar3.getTimeInMillis();
        } else {
            timeInMillis2 = Long.MAX_VALUE;
        }
        final long j = timeInMillis2;
        if (arguments.containsKey("minimumDate")) {
            datePicker.setMinDate(timeInMillis);
        } else {
            datePicker.setMinDate(-2208988800001L);
        }
        if (arguments.containsKey("maximumDate")) {
            datePicker.setMaxDate(j);
        }
        if (arguments.containsKey("firstDayOfWeek")) {
            datePicker.setFirstDayOfWeek(arguments.getInt("firstDayOfWeek"));
        }
        if (arguments.containsKey("maximumDate") || arguments.containsKey("minimumDate")) {
            final long j2 = timeInMillis;
            datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() { // from class: mcc
                @Override // android.widget.DatePicker.OnDateChangedListener
                public final void onDateChanged(DatePicker datePicker2, int i4, int i5, int i6) {
                    Calendar calendar4 = Calendar.getInstance(mc2.c(arguments));
                    calendar4.set(i4, i5, i6, 0, 0, 0);
                    calendar4.setTimeInMillis(Math.min(Math.max(calendar4.getTimeInMillis(), j2), j));
                    DatePicker datePicker3 = datePicker;
                    if (datePicker3.getYear() == calendar4.get(1) && datePicker3.getMonth() == calendar4.get(2) && datePicker3.getDayOfMonth() == calendar4.get(5)) {
                        return;
                    }
                    datePicker3.updateDate(calendar4.get(1), calendar4.get(2), calendar4.get(5));
                }
            });
        }
        if (arguments.containsKey("testID")) {
            datePicker.setTag(arguments.getString("testID"));
        }
        this.f0 = pccVar2;
        return pccVar2;
    }

    @Override // androidx.fragment.app.f, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DatePickerModule.a aVar = this.h0;
        if (aVar != null) {
            aVar.onDismiss(dialogInterface);
        }
    }
}

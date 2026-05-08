package defpackage;

import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ng3 {
    public static String a(long j) {
        Calendar calendarE = ojg.e();
        Calendar calendarF = ojg.f(null);
        calendarF.setTimeInMillis(j);
        return calendarE.get(1) == calendarF.get(1) ? b(j, Locale.getDefault()) : c(j, Locale.getDefault());
    }

    public static String b(long j, Locale locale) {
        AtomicReference<zlf> atomicReference = ojg.a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMd", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instanceForSkeleton.format(new Date(j));
    }

    public static String c(long j, Locale locale) {
        AtomicReference<zlf> atomicReference = ojg.a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMd", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instanceForSkeleton.format(new Date(j));
    }
}

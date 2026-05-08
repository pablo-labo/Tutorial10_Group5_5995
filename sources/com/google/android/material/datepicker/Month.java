package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import defpackage.l5;
import defpackage.ojg;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();
    public String V;
    public final Calendar a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;

    public static class a implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        public final Month createFromParcel(Parcel parcel) {
            return Month.c(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Month[] newArray(int i) {
            return new Month[i];
        }
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarB = ojg.b(calendar);
        this.a = calendarB;
        this.b = calendarB.get(2);
        this.c = calendarB.get(1);
        this.d = calendarB.getMaximum(7);
        this.e = calendarB.getActualMaximum(5);
        this.f = calendarB.getTimeInMillis();
    }

    public static Month c(int i, int i2) {
        Calendar calendarF = ojg.f(null);
        calendarF.set(1, i);
        calendarF.set(2, i2);
        return new Month(calendarF);
    }

    public static Month e(long j) {
        Calendar calendarF = ojg.f(null);
        calendarF.setTimeInMillis(j);
        return new Month(calendarF);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Month month) {
        return this.a.compareTo(month.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.b == month.b && this.c == month.c;
    }

    public final int f() {
        Calendar calendar = this.a;
        int firstDayOfWeek = calendar.get(7) - calendar.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.d : firstDayOfWeek;
    }

    public final long h(int i) {
        Calendar calendarB = ojg.b(this.a);
        calendarB.set(5, i);
        return calendarB.getTimeInMillis();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String m(Context context) {
        if (this.V == null) {
            long timeInMillis = this.a.getTimeInMillis();
            this.V = DateUtils.formatDateTime(context, timeInMillis - ((long) TimeZone.getDefault().getOffset(timeInMillis)), 36);
        }
        return this.V;
    }

    public final int n(Month month) {
        if (this.a instanceof GregorianCalendar) {
            return (month.b - this.b) + ((month.c - this.c) * 12);
        }
        l5.q("Only Gregorian calendars are supported.");
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }
}

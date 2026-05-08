package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.l5;
import defpackage.ojg;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();
    public final Month a;
    public final Month b;
    public final DateValidator c;
    public final Month d;
    public final int e;
    public final int f;

    public interface DateValidator extends Parcelable {
        boolean h0(long j);
    }

    public static class a implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        public final CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    public static final class b {
        public Long a;
        public DateValidator b;

        static {
            ojg.a(Month.c(1900, 0).f);
            ojg.a(Month.c(2100, 11).f);
        }
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3) {
        this.a = month;
        this.b = month2;
        this.d = month3;
        this.c = dateValidator;
        if (month3 != null && month.a.compareTo(month3.a) > 0) {
            l5.q("start Month cannot be after current Month");
            throw null;
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            l5.q("current Month cannot be after end Month");
            throw null;
        }
        this.f = month.n(month2) + 1;
        this.e = (month2.c - month.c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.a.equals(calendarConstraints.a) && this.b.equals(calendarConstraints.b) && Objects.equals(this.d, calendarConstraints.d) && this.c.equals(calendarConstraints.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.c, 0);
    }
}

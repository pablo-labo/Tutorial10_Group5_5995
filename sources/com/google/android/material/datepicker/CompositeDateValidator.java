package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public final d a;
    public final ArrayList b;
    public static final a c = new a();
    public static final b d = new b();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new c();

    public static class a implements d {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public final boolean a(ArrayList arrayList, long j) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && dateValidator.h0(j)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public final int getId() {
            return 1;
        }
    }

    public static class b implements d {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public final boolean a(ArrayList arrayList, long j) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && !dateValidator.h0(j)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public final int getId() {
            return 2;
        }
    }

    public static class c implements Parcelable.Creator<CompositeDateValidator> {
        @Override // android.os.Parcelable.Creator
        public final CompositeDateValidator createFromParcel(Parcel parcel) {
            ArrayList arrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int i = parcel.readInt();
            d dVar = CompositeDateValidator.d;
            if (i != 2 && i == 1) {
                dVar = CompositeDateValidator.c;
            }
            arrayList.getClass();
            return new CompositeDateValidator(arrayList, dVar);
        }

        @Override // android.os.Parcelable.Creator
        public final CompositeDateValidator[] newArray(int i) {
            return new CompositeDateValidator[i];
        }
    }

    public interface d {
        boolean a(ArrayList arrayList, long j);

        int getId();
    }

    public CompositeDateValidator() {
        throw null;
    }

    public CompositeDateValidator(ArrayList arrayList, d dVar) {
        this.b = arrayList;
        this.a = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.b.equals(compositeDateValidator.b) && this.a.getId() == compositeDateValidator.a.getId();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean h0(long j) {
        return this.a.a(this.b, j);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.b);
        parcel.writeInt(this.a.getId());
    }
}

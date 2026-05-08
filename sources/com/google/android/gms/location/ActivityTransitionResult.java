package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.e7i;
import defpackage.fib;
import defpackage.ojd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new e7i();
    public final List a;
    public final Bundle b;

    public ActivityTransitionResult() {
        throw null;
    }

    public ActivityTransitionResult(ArrayList arrayList, Bundle bundle) {
        this.b = null;
        fib.j(arrayList, "transitionEvents list can't be null.");
        if (!arrayList.isEmpty()) {
            for (int i = 1; i < arrayList.size(); i++) {
                fib.b(((ActivityTransitionEvent) arrayList.get(i)).c >= ((ActivityTransitionEvent) arrayList.get(i + (-1))).c);
            }
        }
        this.a = Collections.unmodifiableList(arrayList);
        this.b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ActivityTransitionResult) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fib.i(parcel);
        int iA = ojd.A(parcel, 20293);
        ojd.x(parcel, 1, this.a, false);
        ojd.l(parcel, 2, this.b);
        ojd.B(parcel, iA);
    }
}

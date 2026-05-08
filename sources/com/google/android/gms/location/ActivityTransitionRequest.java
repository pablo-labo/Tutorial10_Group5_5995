package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.b4i;
import defpackage.fib;
import defpackage.hrc;
import defpackage.ojd;
import defpackage.u40;
import defpackage.xna;
import defpackage.z3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new b4i();
    public static final hrc e = new hrc(1);
    public final List a;
    public final String b;
    public final List c;
    public final String d;

    public ActivityTransitionRequest(ArrayList arrayList, String str, ArrayList arrayList2, String str2) {
        fib.j(arrayList, "transitions can't be null");
        fib.a("transitions can't be empty.", arrayList.size() > 0);
        TreeSet treeSet = new TreeSet(e);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActivityTransition activityTransition = (ActivityTransition) it.next();
            fib.a(String.format("Found duplicated transition: %s.", activityTransition), treeSet.add(activityTransition));
        }
        this.a = Collections.unmodifiableList(arrayList);
        this.b = str;
        this.c = arrayList2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList2);
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (xna.a(this.a, activityTransitionRequest.a) && xna.a(this.b, activityTransitionRequest.b) && xna.a(this.d, activityTransitionRequest.d) && xna.a(this.c, activityTransitionRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        return z3.n(u40.f("ActivityTransitionRequest [mTransitions=", strValueOf, ", mTag='", this.b, "', mClients="), String.valueOf(this.c), ", mAttributionTag=", this.d, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fib.i(parcel);
        int iA = ojd.A(parcel, 20293);
        ojd.x(parcel, 1, this.a, false);
        ojd.t(parcel, 2, this.b, false);
        ojd.x(parcel, 3, this.c, false);
        ojd.t(parcel, 4, this.d, false);
        ojd.B(parcel, iA);
    }
}

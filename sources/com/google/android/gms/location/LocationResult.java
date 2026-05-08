package com.google.android.gms.location;

import android.location.Location;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ojd;
import defpackage.vmi;
import defpackage.xna;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public final List a;
    public static final List b = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<LocationResult> CREATOR = new vmi();

    public LocationResult(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        List list = ((LocationResult) obj).a;
        int i = Build.VERSION.SDK_INT;
        List<Location> list2 = this.a;
        if (i >= 31) {
            return list2.equals(list);
        }
        if (list2.size() != list.size()) {
            return false;
        }
        Iterator it = list.iterator();
        for (Location location : list2) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !xna.a(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "LocationResult".concat(String.valueOf(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.x(parcel, 1, this.a, false);
        ojd.B(parcel, iA);
    }
}

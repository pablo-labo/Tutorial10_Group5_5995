package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.l6;
import defpackage.oii;
import defpackage.ojd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new oii();
    public final List a;
    public final int b;
    public final String c;
    public final String d;

    public GeofencingRequest(ArrayList arrayList, int i, String str, String str2) {
        this.a = arrayList;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeofencingRequest[geofences=");
        sb.append(this.a);
        sb.append(", initialTrigger=");
        sb.append(this.b);
        sb.append(", tag=");
        sb.append(this.c);
        sb.append(", attributionTag=");
        return l6.i(sb, this.d, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.x(parcel, 1, this.a, false);
        ojd.y(parcel, 2, 4);
        parcel.writeInt(this.b);
        ojd.t(parcel, 3, this.c, false);
        ojd.t(parcel, 4, this.d, false);
        ojd.B(parcel, iA);
    }
}

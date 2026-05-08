package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.gah;
import defpackage.ojd;
import defpackage.xna;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new gah();
    public final List a;
    public final boolean b;
    public final String c;
    public final String d;

    public ApiFeatureRequest(ArrayList arrayList, boolean z, String str, String str2) {
        fib.i(arrayList);
        this.a = arrayList;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.b == apiFeatureRequest.b && xna.a(this.a, apiFeatureRequest.a) && xna.a(this.c, apiFeatureRequest.c) && xna.a(this.d, apiFeatureRequest.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.a, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.x(parcel, 1, this.a, false);
        ojd.y(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        ojd.t(parcel, 3, this.c, false);
        ojd.t(parcel, 4, this.d, false);
        ojd.B(parcel, iA);
    }
}

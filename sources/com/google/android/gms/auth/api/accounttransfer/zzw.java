package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import defpackage.ojd;
import defpackage.ot0;
import defpackage.p6;
import defpackage.qmi;
import defpackage.r6;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzw extends zzbz {
    public static final Parcelable.Creator<zzw> CREATOR = new qmi();
    public static final HashMap W;
    public final DeviceMetaData V;
    public final Set a;
    public final int b;
    public final String c;
    public final int d;
    public final byte[] e;
    public final PendingIntent f;

    static {
        HashMap map = new HashMap();
        W = map;
        map.put("accountType", new FastJsonResponse.Field(7, false, 7, false, "accountType", 2, null));
        map.put("status", new FastJsonResponse.Field(0, false, 0, false, "status", 3, null));
        map.put("transferBytes", new FastJsonResponse.Field(8, false, 8, false, "transferBytes", 4, null));
    }

    public zzw(HashSet hashSet, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.a = hashSet;
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = bArr;
        this.f = pendingIntent;
        this.V = deviceMetaData;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map a() {
        return W;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object b(FastJsonResponse.Field field) {
        int i = field.V;
        if (i == 1) {
            return Integer.valueOf(this.b);
        }
        if (i == 2) {
            return this.c;
        }
        if (i == 3) {
            return Integer.valueOf(this.d);
        }
        if (i == 4) {
            return this.e;
        }
        r6.g(p6.c(i, "Unknown SafeParcelable id="));
        return null;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean d(FastJsonResponse.Field field) {
        return this.a.contains(Integer.valueOf(field.V));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        Set set = this.a;
        if (set.contains(1)) {
            ojd.y(parcel, 1, 4);
            parcel.writeInt(this.b);
        }
        if (set.contains(2)) {
            ojd.t(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            ojd.y(parcel, 3, 4);
            parcel.writeInt(this.d);
        }
        if (set.contains(4)) {
            ojd.m(parcel, 4, this.e, true);
        }
        if (set.contains(5)) {
            ojd.s(parcel, 5, this.f, i, true);
        }
        if (set.contains(6)) {
            ojd.s(parcel, 6, this.V, i, true);
        }
        ojd.B(parcel, iA);
    }

    public zzw() {
        this.a = new ot0(3);
        this.b = 1;
    }
}

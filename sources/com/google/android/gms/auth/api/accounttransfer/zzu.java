package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import defpackage.cmi;
import defpackage.ojd;
import defpackage.p6;
import defpackage.r6;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzu extends zzbz {
    public static final Parcelable.Creator<zzu> CREATOR = new cmi();
    public static final HashMap V;
    public final HashSet a;
    public final int b;
    public final zzw c;
    public final String d;
    public final String e;
    public final String f;

    static {
        HashMap map = new HashMap();
        V = map;
        map.put("authenticatorInfo", new FastJsonResponse.Field(11, false, 11, false, "authenticatorInfo", 2, zzw.class));
        map.put("signature", new FastJsonResponse.Field(7, false, 7, false, "signature", 3, null));
        map.put("package", new FastJsonResponse.Field(7, false, 7, false, "package", 4, null));
    }

    public zzu(HashSet hashSet, int i, zzw zzwVar, String str, String str2, String str3) {
        this.a = hashSet;
        this.b = i;
        this.c = zzwVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map a() {
        return V;
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
            return this.d;
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
        HashSet hashSet = this.a;
        if (hashSet.contains(1)) {
            ojd.y(parcel, 1, 4);
            parcel.writeInt(this.b);
        }
        if (hashSet.contains(2)) {
            ojd.s(parcel, 2, this.c, i, true);
        }
        if (hashSet.contains(3)) {
            ojd.t(parcel, 3, this.d, true);
        }
        if (hashSet.contains(4)) {
            ojd.t(parcel, 4, this.e, true);
        }
        if (hashSet.contains(5)) {
            ojd.t(parcel, 5, this.f, true);
        }
        ojd.B(parcel, iA);
    }

    public zzu() {
        this.a = new HashSet(3);
        this.b = 1;
    }
}

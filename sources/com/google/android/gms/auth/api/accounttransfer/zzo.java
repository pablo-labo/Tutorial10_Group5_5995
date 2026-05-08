package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import defpackage.cki;
import defpackage.ojd;
import defpackage.p6;
import defpackage.r6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzo extends zzbz {
    public static final Parcelable.Creator<zzo> CREATOR = new cki();
    public static final HashMap f;
    public final HashSet a;
    public final int b;
    public final ArrayList c;
    public final int d;
    public final zzs e;

    static {
        HashMap map = new HashMap();
        f = map;
        map.put("authenticatorData", new FastJsonResponse.Field(11, true, 11, true, "authenticatorData", 2, zzu.class));
        map.put(ReactProgressBarViewManager.PROP_PROGRESS, new FastJsonResponse.Field(11, false, 11, false, ReactProgressBarViewManager.PROP_PROGRESS, 4, zzs.class));
    }

    public zzo() {
        this.a = new HashSet(1);
        this.b = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map a() {
        return f;
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
            ojd.x(parcel, 2, this.c, true);
        }
        if (hashSet.contains(3)) {
            ojd.y(parcel, 3, 4);
            parcel.writeInt(this.d);
        }
        if (hashSet.contains(4)) {
            ojd.s(parcel, 4, this.e, i, true);
        }
        ojd.B(parcel, iA);
    }

    public zzo(HashSet hashSet, int i, ArrayList arrayList, int i2, zzs zzsVar) {
        this.a = hashSet;
        this.b = i;
        this.c = arrayList;
        this.d = i2;
        this.e = zzsVar;
    }
}

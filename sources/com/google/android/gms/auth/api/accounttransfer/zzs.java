package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import defpackage.ht0;
import defpackage.ojd;
import defpackage.oli;
import defpackage.p6;
import defpackage.r6;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzs extends zzbz {
    public static final Parcelable.Creator<zzs> CREATOR = new oli();
    public static final ht0 V;
    public final int a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    static {
        ht0 ht0Var = new ht0();
        V = ht0Var;
        ht0Var.put("registered", FastJsonResponse.Field.s0(2, "registered"));
        ht0Var.put("in_progress", FastJsonResponse.Field.s0(3, "in_progress"));
        ht0Var.put("success", FastJsonResponse.Field.s0(4, "success"));
        ht0Var.put("failed", FastJsonResponse.Field.s0(5, "failed"));
        ht0Var.put("escrowed", FastJsonResponse.Field.s0(6, "escrowed"));
    }

    public zzs(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
        this.f = arrayList5;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map a() {
        return V;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object b(FastJsonResponse.Field field) {
        int i = field.V;
        switch (i) {
            case 1:
                return Integer.valueOf(this.a);
            case 2:
                return this.b;
            case 3:
                return this.c;
            case 4:
                return this.d;
            case 5:
                return this.e;
            case 6:
                return this.f;
            default:
                r6.g(p6.c(i, "Unknown SafeParcelable id="));
                return null;
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean d(FastJsonResponse.Field field) {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.v(parcel, 2, this.b);
        ojd.v(parcel, 3, this.c);
        ojd.v(parcel, 4, this.d);
        ojd.v(parcel, 5, this.e);
        ojd.v(parcel, 6, this.f);
        ojd.B(parcel, iA);
    }

    public zzs() {
        this.a = 1;
    }
}

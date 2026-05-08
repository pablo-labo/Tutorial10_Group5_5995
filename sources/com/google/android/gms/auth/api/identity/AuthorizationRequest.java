package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fib;
import defpackage.ojd;
import defpackage.tdh;
import defpackage.xna;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AuthorizationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new tdh();
    public final String V;
    public final boolean W;
    public final List a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final Account e;
    public final String f;

    public AuthorizationRequest(ArrayList arrayList, String str, boolean z, boolean z2, Account account, String str2, String str3, boolean z3) {
        boolean z4 = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            z4 = true;
        }
        fib.a("requestedScopes cannot be null or empty", z4);
        this.a = arrayList;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = account;
        this.f = str2;
        this.V = str3;
        this.W = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        List list = authorizationRequest.a;
        List list2 = this.a;
        return list2.size() == list.size() && list2.containsAll(list) && this.c == authorizationRequest.c && this.W == authorizationRequest.W && this.d == authorizationRequest.d && xna.a(this.b, authorizationRequest.b) && xna.a(this.e, authorizationRequest.e) && xna.a(this.f, authorizationRequest.f) && xna.a(this.V, authorizationRequest.V);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.W), Boolean.valueOf(this.d), this.e, this.f, this.V});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.x(parcel, 1, this.a, false);
        ojd.t(parcel, 2, this.b, false);
        ojd.y(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ojd.y(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        ojd.s(parcel, 5, this.e, i, false);
        ojd.t(parcel, 6, this.f, false);
        ojd.t(parcel, 7, this.V, false);
        ojd.y(parcel, 8, 4);
        parcel.writeInt(this.W ? 1 : 0);
        ojd.B(parcel, iA);
    }
}

package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.fib;
import defpackage.ojd;
import defpackage.w3i;
import defpackage.xna;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new w3i();
    public final String V;
    public final Integer a;
    public final Double b;
    public final Uri c;
    public final List d;
    public final List e;
    public final ChannelIdValue f;

    public RegisterRequestParams(Integer num, Double d, Uri uri, ArrayList arrayList, ArrayList arrayList2, ChannelIdValue channelIdValue, String str) {
        this.a = num;
        this.b = d;
        this.c = uri;
        fib.a("empty list of register requests is provided", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.d = arrayList;
        this.e = arrayList2;
        this.f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RegisterRequest registerRequest = (RegisterRequest) it.next();
            fib.a("register request has null appId and no request appId is provided", (uri == null && registerRequest.d == null) ? false : true);
            String str2 = registerRequest.d;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it2.next();
            fib.a("registered key has null appId and no request appId is provided", (uri == null && registeredKey.b == null) ? false : true);
            String str3 = registeredKey.b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        fib.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.V = str;
    }

    public final boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        List list2 = registerRequestParams.e;
        return xna.a(this.a, registerRequestParams.a) && xna.a(this.b, registerRequestParams.b) && xna.a(this.c, registerRequestParams.c) && xna.a(this.d, registerRequestParams.d) && (((list = this.e) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && xna.a(this.f, registerRequestParams.f) && xna.a(this.V, registerRequestParams.V);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, this.d, this.e, this.f, this.V});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.q(parcel, 2, this.a);
        ojd.n(parcel, 3, this.b);
        ojd.s(parcel, 4, this.c, i, false);
        ojd.x(parcel, 5, this.d, false);
        ojd.x(parcel, 6, this.e, false);
        ojd.s(parcel, 7, this.f, i, false);
        ojd.t(parcel, 8, this.V, false);
        ojd.B(parcel, iA);
    }
}

package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.adi;
import defpackage.fib;
import defpackage.ojd;
import defpackage.xna;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new adi();
    public final String V;
    public final Integer a;
    public final Double b;
    public final Uri c;
    public final byte[] d;
    public final List e;
    public final ChannelIdValue f;

    public SignRequestParams(Integer num, Double d, Uri uri, byte[] bArr, ArrayList arrayList, ChannelIdValue channelIdValue, String str) {
        this.a = num;
        this.b = d;
        this.c = uri;
        this.d = bArr;
        fib.a("registeredKeys must not be null or empty", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.e = arrayList;
        this.f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it.next();
            fib.a("registered key has null appId and no request appId is provided", (registeredKey.b == null && uri == null) ? false : true);
            String str2 = registeredKey.b;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        fib.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.V = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        List list = signRequestParams.e;
        if (xna.a(this.a, signRequestParams.a) && xna.a(this.b, signRequestParams.b) && xna.a(this.c, signRequestParams.c) && Arrays.equals(this.d, signRequestParams.d)) {
            List list2 = this.e;
            if (list2.containsAll(list) && list.containsAll(list2) && xna.a(this.f, signRequestParams.f) && xna.a(this.V, signRequestParams.V)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, this.e, this.f, this.V, Integer.valueOf(Arrays.hashCode(this.d))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.q(parcel, 2, this.a);
        ojd.n(parcel, 3, this.b);
        ojd.s(parcel, 4, this.c, i, false);
        ojd.m(parcel, 5, this.d, false);
        ojd.x(parcel, 6, this.e, false);
        ojd.s(parcel, 7, this.f, i, false);
        ojd.t(parcel, 8, this.V, false);
        ojd.B(parcel, iA);
    }
}

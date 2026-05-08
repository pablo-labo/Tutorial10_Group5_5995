package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.neh;
import defpackage.ojd;
import defpackage.xna;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new neh();
    public final PendingIntent a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final int f;

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, ArrayList arrayList, String str3, int i) {
        this.a = pendingIntent;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
        this.e = str3;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        List list = saveAccountLinkingTokenRequest.d;
        List list2 = this.d;
        return list2.size() == list.size() && list2.containsAll(list) && xna.a(this.a, saveAccountLinkingTokenRequest.a) && xna.a(this.b, saveAccountLinkingTokenRequest.b) && xna.a(this.c, saveAccountLinkingTokenRequest.c) && xna.a(this.e, saveAccountLinkingTokenRequest.e) && this.f == saveAccountLinkingTokenRequest.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.s(parcel, 1, this.a, i, false);
        ojd.t(parcel, 2, this.b, false);
        ojd.t(parcel, 3, this.c, false);
        ojd.v(parcel, 4, this.d);
        ojd.t(parcel, 5, this.e, false);
        ojd.y(parcel, 6, 4);
        parcel.writeInt(this.f);
        ojd.B(parcel, iA);
    }
}

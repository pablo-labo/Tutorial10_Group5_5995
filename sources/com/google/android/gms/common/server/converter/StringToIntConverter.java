package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import defpackage.ojd;
import defpackage.vah;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.a<String, Integer> {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new vah();
    public final int a;
    public final HashMap b;
    public final SparseArray c;

    public StringToIntConverter(int i, ArrayList arrayList) {
        this.a = i;
        this.b = new HashMap();
        this.c = new SparseArray();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zac zacVar = (zac) arrayList.get(i2);
            String str = zacVar.b;
            int i3 = zacVar.c;
            this.b.put(str, Integer.valueOf(i3));
            this.c.put(i3, str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.b;
        for (String str : map.keySet()) {
            arrayList.add(new zac(str, ((Integer) map.get(str)).intValue()));
        }
        ojd.x(parcel, 2, arrayList, false);
        ojd.B(parcel, iA);
    }

    public StringToIntConverter() {
        this.a = 1;
        this.b = new HashMap();
        this.c = new SparseArray();
    }
}

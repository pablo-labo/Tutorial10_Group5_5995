package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.nlh;
import defpackage.ojd;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class UvmEntry extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UvmEntry> CREATOR = new nlh();
    public final int a;
    public final short b;
    public final short c;

    public UvmEntry(int i, short s, short s2) {
        this.a = i;
        this.b = s;
        this.c = s2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        return this.a == uvmEntry.a && this.b == uvmEntry.b && this.c == uvmEntry.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Short.valueOf(this.b), Short.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.y(parcel, 2, 4);
        parcel.writeInt(this.b);
        ojd.y(parcel, 3, 4);
        parcel.writeInt(this.c);
        ojd.B(parcel, iA);
    }
}

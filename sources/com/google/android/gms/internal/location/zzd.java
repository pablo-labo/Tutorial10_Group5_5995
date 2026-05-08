package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ath;
import defpackage.gth;
import defpackage.ja;
import defpackage.jth;
import defpackage.ojd;
import defpackage.oth;
import defpackage.p6;
import defpackage.rth;
import defpackage.suh;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new suh();
    public final zzd V;
    public final oth W;
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;

    static {
        Process.myUid();
        Process.myPid();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzd(int i, int i2, String str, String str2, String str3, int i3, List list, zzd zzdVar) {
        rth rthVar;
        oth othVarD;
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.f = str3;
        this.e = i3;
        jth jthVar = oth.b;
        if (list instanceof gth) {
            othVarD = ((gth) list).d();
            if (othVarD.e()) {
                Object[] array = othVarD.toArray(gth.a);
                int length = array.length;
                if (length == 0) {
                    othVarD = rth.e;
                } else {
                    rthVar = new rth(array, length);
                    othVarD = rthVar;
                }
            }
        } else {
            Object[] array2 = list.toArray();
            int length2 = array2.length;
            for (int i4 = 0; i4 < length2; i4++) {
                if (array2[i4] == null) {
                    ja.k(p6.c(i4, "at index "));
                    throw null;
                }
            }
            if (length2 == 0) {
                othVarD = rth.e;
            } else {
                rthVar = new rth(array2, length2);
                othVarD = rthVar;
            }
        }
        this.W = othVarD;
        this.V = zzdVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzd)) {
            return false;
        }
        zzd zzdVar = (zzd) obj;
        return this.a == zzdVar.a && this.b == zzdVar.b && this.e == zzdVar.e && this.c.equals(zzdVar.c) && ath.b(this.d, zzdVar.d) && ath.b(this.f, zzdVar.f) && ath.b(this.V, zzdVar.V) && this.W.equals(zzdVar.W);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.c, this.d, this.f});
    }

    public final String toString() {
        String str = this.c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb = new StringBuilder(length);
        sb.append(this.a);
        sb.append("/");
        sb.append(str);
        if (str2 != null) {
            sb.append("[");
            if (str2.startsWith(str)) {
                sb.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        String str3 = this.f;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        ojd.y(parcel, 2, 4);
        parcel.writeInt(this.b);
        ojd.t(parcel, 3, this.c, false);
        ojd.t(parcel, 4, this.d, false);
        ojd.y(parcel, 5, 4);
        parcel.writeInt(this.e);
        ojd.t(parcel, 6, this.f, false);
        ojd.s(parcel, 7, this.V, i, false);
        ojd.x(parcel, 8, this.W, false);
        ojd.B(parcel, iA);
    }
}

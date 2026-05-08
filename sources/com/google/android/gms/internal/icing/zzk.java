package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.mii;
import defpackage.ojd;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzk extends AbstractSafeParcelable {
    public final String a;
    public final zzt b;
    public final int c;
    public final byte[] d;
    public static final int e = Integer.parseInt("-1");
    public static final Parcelable.Creator<zzk> CREATOR = new mii();

    static {
        ArrayList arrayList = new ArrayList();
        new zzt("SsbContext", "blob", true, 1, false, null, (zzm[]) arrayList.toArray(new zzm[arrayList.size()]), null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzk(java.lang.String r8, com.google.android.gms.internal.icing.zzt r9, int r10, byte[] r11) {
        /*
            r7 = this;
            r7.<init>()
            r0 = 10
            r1 = 0
            int r2 = com.google.android.gms.internal.icing.zzk.e
            if (r10 == r2) goto L1c
            if (r10 < 0) goto L14
            java.lang.String[] r3 = defpackage.jki.a
            if (r10 < r0) goto L11
            goto L16
        L11:
            r3 = r3[r10]
            goto L17
        L14:
            java.lang.String[] r3 = defpackage.jki.a
        L16:
            r3 = r1
        L17:
            if (r3 == 0) goto L1a
            goto L1c
        L1a:
            r3 = 0
            goto L1d
        L1c:
            r3 = 1
        L1d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 32
            r4.<init>(r5)
            java.lang.String r6 = "Invalid section type "
            r4.append(r6)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            defpackage.fib.a(r4, r3)
            r7.a = r8
            r7.b = r9
            r7.c = r10
            r7.d = r11
            if (r10 == r2) goto L5c
            if (r10 < 0) goto L47
            java.lang.String[] r7 = defpackage.jki.a
            if (r10 < r0) goto L44
            goto L49
        L44:
            r7 = r7[r10]
            goto L4a
        L47:
            java.lang.String[] r7 = defpackage.jki.a
        L49:
            r7 = r1
        L4a:
            if (r7 != 0) goto L5c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r5)
            r7.append(r6)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            goto L64
        L5c:
            if (r8 == 0) goto L63
            if (r11 == 0) goto L63
            java.lang.String r7 = "Both content and blobContent set"
            goto L64
        L63:
            r7 = r1
        L64:
            if (r7 != 0) goto L67
            return
        L67:
            defpackage.l5.q(r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.zzk.<init>(java.lang.String, com.google.android.gms.internal.icing.zzt, int, byte[]):void");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.t(parcel, 1, this.a, false);
        ojd.s(parcel, 3, this.b, i, false);
        ojd.y(parcel, 4, 4);
        parcel.writeInt(this.c);
        ojd.m(parcel, 5, this.d, false);
        ojd.B(parcel, iA);
    }
}

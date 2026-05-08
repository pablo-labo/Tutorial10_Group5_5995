package com.google.android.recaptcha.internal;

import defpackage.bg;
import defpackage.h5;
import defpackage.pyd;
import defpackage.u63;
import defpackage.ut0;
import defpackage.z92;
import defpackage.zr4;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class zzff {
    private final zzaef zza;
    private final byte[] zzb;

    public zzff(zzaef zzaefVar) {
        this.zza = zzaefVar;
        int i = zzajf.zzd;
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        this.zzb = bArr;
    }

    public final byte[] zza(byte[] bArr, int i) {
        Collection collectionZ;
        byte[] byteArray = BigInteger.valueOf(i).toByteArray();
        byte[] bArrZze = zzajf.zze(bArr, this.zza.zzp(), pyd.J(pyd.m(0, this.zzb, 12 - byteArray.length), byteArray));
        bArrZze.getClass();
        int length = bArrZze.length - 12;
        int i2 = length >= 0 ? length : 0;
        if (i2 < 0) {
            h5.k(bg.d(i2, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i2 == 0) {
            collectionZ = zr4.a;
        } else {
            int length2 = bArrZze.length;
            if (i2 >= length2) {
                collectionZ = ut0.z0(bArrZze);
            } else if (i2 == 1) {
                collectionZ = u63.Z(Byte.valueOf(bArrZze[length2 - 1]));
            } else {
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = length2 - i2; i3 < length2; i3++) {
                    arrayList.add(Byte.valueOf(bArrZze[i3]));
                }
                collectionZ = arrayList;
            }
        }
        return z92.t1(collectionZ);
    }

    public final byte[] zzb() {
        return this.zzb;
    }
}

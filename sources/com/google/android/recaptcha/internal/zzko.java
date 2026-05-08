package com.google.android.recaptcha.internal;

import defpackage.a32;
import defpackage.b0;
import defpackage.ut0;
import defpackage.z92;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzko implements zzkw {
    public static final zzko zza = new zzko();

    private zzko() {
    }

    @Override // com.google.android.recaptcha.internal.zzkw
    public final void zza(int i, zzkb zzkbVar, zzanu... zzanuVarArr) throws zzeu, IOException {
        String strW0;
        String str;
        if (zzanuVarArr.length != 1) {
            b0.n(4, 3, null);
            return;
        }
        int i2 = 0;
        Object objZza = zzkbVar.zzc().zza(zzanuVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            b0.n(4, 5, null);
            return;
        }
        if (objZza instanceof int[]) {
            strW0 = ut0.r0(",", (int[]) objZza, 56);
        } else {
            if (objZza instanceof byte[]) {
                str = new String((byte[]) objZza, a32.b);
            } else if (objZza instanceof long[]) {
                long[] jArr = (long[]) objZza;
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "[");
                int length = jArr.length;
                int i3 = 0;
                while (i2 < length) {
                    long j = jArr[i2];
                    i3++;
                    if (i3 > 1) {
                        sb.append((CharSequence) ",");
                    }
                    sb.append((CharSequence) String.valueOf(j));
                    i2++;
                }
                sb.append((CharSequence) "]");
                strW0 = sb.toString();
            } else if (objZza instanceof short[]) {
                short[] sArr = (short[]) objZza;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) "[");
                int length2 = sArr.length;
                int i4 = 0;
                while (i2 < length2) {
                    short s = sArr[i2];
                    i4++;
                    if (i4 > 1) {
                        sb2.append((CharSequence) ",");
                    }
                    sb2.append((CharSequence) String.valueOf((int) s));
                    i2++;
                }
                sb2.append((CharSequence) "]");
                strW0 = sb2.toString();
            } else if (objZza instanceof float[]) {
                float[] fArr = (float[]) objZza;
                StringBuilder sb3 = new StringBuilder();
                sb3.append((CharSequence) "[");
                int length3 = fArr.length;
                int i5 = 0;
                while (i2 < length3) {
                    float f = fArr[i2];
                    i5++;
                    if (i5 > 1) {
                        sb3.append((CharSequence) ",");
                    }
                    sb3.append((CharSequence) String.valueOf(f));
                    i2++;
                }
                sb3.append((CharSequence) "]");
                strW0 = sb3.toString();
            } else if (objZza instanceof double[]) {
                double[] dArr = (double[]) objZza;
                StringBuilder sb4 = new StringBuilder();
                sb4.append((CharSequence) "[");
                int length4 = dArr.length;
                int i6 = 0;
                while (i2 < length4) {
                    double d = dArr[i2];
                    i6++;
                    if (i6 > 1) {
                        sb4.append((CharSequence) ",");
                    }
                    sb4.append((CharSequence) String.valueOf(d));
                    i2++;
                }
                sb4.append((CharSequence) "]");
                strW0 = sb4.toString();
            } else if (objZza instanceof char[]) {
                str = new String((char[]) objZza);
            } else if (objZza instanceof Object[]) {
                strW0 = ut0.t0((Object[]) objZza, ",", "[", "]", null, 56);
            } else {
                if (!(objZza instanceof Collection)) {
                    b0.n(4, 5, null);
                    return;
                }
                strW0 = z92.W0((Iterable) objZza, ",", "[", "]", null, 56);
            }
            strW0 = str;
        }
        zzkbVar.zzc().zze(i, strW0);
    }
}

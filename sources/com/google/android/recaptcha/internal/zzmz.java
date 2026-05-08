package com.google.android.recaptcha.internal;

import defpackage.l5;
import defpackage.o6;
import defpackage.p6;
import defpackage.r6;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmz {
    public static int zza(int i, int i2, String str) {
        String strZza;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strZza = zznc.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                l5.q(p6.c(i2, "negative size: "));
                return 0;
            }
            strZza = zznc.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        l5.s(zzh(i, i2, "index"));
        return 0;
    }

    public static void zzc(boolean z) {
        if (z) {
            return;
        }
        o6.h();
    }

    public static void zzd(boolean z, Object obj) {
        if (z) {
            return;
        }
        l5.q((String) obj);
    }

    public static void zze(boolean z, String str, char c) {
        if (z) {
            return;
        }
        l5.q(zznc.zza(str, Character.valueOf(c)));
    }

    public static void zzf(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? zzh(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zzh(i2, i3, "end index") : zznc.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void zzg(boolean z, Object obj) {
        if (z) {
            return;
        }
        r6.g((String) obj);
    }

    private static String zzh(int i, int i2, String str) {
        if (i < 0) {
            return zznc.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zznc.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        l5.q(p6.c(i2, "negative size: "));
        return null;
    }
}

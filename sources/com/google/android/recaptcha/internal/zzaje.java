package com.google.android.recaptcha.internal;

import defpackage.l5;
import defpackage.u40;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaje {
    public static final /* synthetic */ int zza = 0;
    private static final ThreadLocal zzb;

    static {
        zzaik zzaikVarZzc = zzaim.zzc();
        zzaikVarZzc.zzb(-62135596800L);
        zzaikVarZzc.zza(0);
        zzaik zzaikVarZzc2 = zzaim.zzc();
        zzaikVarZzc2.zzb(253402300799L);
        zzaikVarZzc2.zza(999999999);
        zzaik zzaikVarZzc3 = zzaim.zzc();
        zzaikVarZzc3.zzb(0L);
        zzaikVarZzc3.zza(0);
        zzb = new zzajd();
        zze("now");
        zze("getEpochSecond");
        zze("getNano");
    }

    public static zzaim zza(zzaim zzaimVar) {
        long jZzb = zzaimVar.zzb();
        boolean zZzf = zzf(jZzb);
        int iZza = zzaimVar.zza();
        if (zZzf && iZza >= 0 && iZza < 1000000000) {
            return zzaimVar;
        }
        throw new IllegalArgumentException("Timestamp is not valid. See proto definition for valid values. Seconds (" + jZzb + ") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (" + iZza + ") must be in range [0, +999,999,999].");
    }

    public static zzaim zzb(long j) {
        return zzc(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static zzaim zzc(long j, int i) {
        if (!zzf(j)) {
            l5.q(u40.c(j, "Timestamp is not valid. Input seconds is too large. Seconds (", ") must be in range [-62,135,596,800, +253,402,300,799]. "));
            return null;
        }
        if (i <= -1000000000 || i >= 1000000000) {
            long j2 = i / 1000000000;
            long j3 = j + j2;
            if (!((j ^ j3) >= 0) && !((j2 ^ j) < 0)) {
                throw new ArithmeticException();
            }
            i %= 1000000000;
            j = j3;
        }
        if (i < 0) {
            i += 1000000000;
            long j4 = (-1) + j;
            if (!((j ^ j4) >= 0) && !((1 ^ j) >= 0)) {
                throw new ArithmeticException();
            }
            j = j4;
        }
        zzaik zzaikVarZzc = zzaim.zzc();
        zzaikVarZzc.zzb(j);
        zzaikVarZzc.zza(i);
        zzaim zzaimVar = (zzaim) zzaikVarZzc.zzq();
        zza(zzaimVar);
        return zzaimVar;
    }

    public static String zzd(zzaim zzaimVar) {
        zza(zzaimVar);
        long jZzb = zzaimVar.zzb();
        int iZza = zzaimVar.zza();
        StringBuilder sb = new StringBuilder();
        sb.append(((SimpleDateFormat) zzb.get()).format(new Date(jZzb * 1000)));
        if (iZza != 0) {
            sb.append(".");
            sb.append(iZza % 1000000 == 0 ? String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(iZza / 1000000)) : iZza % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(iZza / 1000)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(iZza)));
        }
        sb.append("Z");
        return sb.toString();
    }

    private static Method zze(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean zzf(long j) {
        return j >= -62135596800L && j <= 253402300799L;
    }
}

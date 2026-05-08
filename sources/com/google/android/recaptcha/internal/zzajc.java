package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajc {
    static {
        zzafm zzafmVarZzc = zzafo.zzc();
        zzafmVarZzc.zzb(-315576000000L);
        zzafmVarZzc.zza(-999999999);
        zzafm zzafmVarZzc2 = zzafo.zzc();
        zzafmVarZzc2.zzb(315576000000L);
        zzafmVarZzc2.zza(999999999);
        zzafm zzafmVarZzc3 = zzafo.zzc();
        zzafmVarZzc3.zzb(0L);
        zzafmVarZzc3.zza(0);
    }

    public static zzafo zza(long j) {
        int i = (int) (j % 1000000000);
        long j2 = j / 1000000000;
        if (i <= -1000000000 || i >= 1000000000) {
            long j3 = i / 1000000000;
            long j4 = j2 + j3;
            if (!((j2 ^ j4) >= 0) && !((j3 ^ j2) < 0)) {
                throw new ArithmeticException();
            }
            i %= 1000000000;
            j2 = j4;
        }
        if (j2 > 0 && i < 0) {
            i += 1000000000;
            j2--;
        }
        if (j2 < 0 && i > 0) {
            i -= 1000000000;
            j2++;
        }
        zzafm zzafmVarZzc = zzafo.zzc();
        zzafmVarZzc.zzb(j2);
        zzafmVarZzc.zza(i);
        zzafo zzafoVar = (zzafo) zzafmVarZzc.zzq();
        long jZzb = zzafoVar.zzb();
        int iZza = zzafoVar.zza();
        if (jZzb >= -315576000000L && jZzb <= 315576000000L && iZza >= -999999999 && iZza < 1000000000 && ((jZzb >= 0 && iZza >= 0) || (jZzb <= 0 && iZza <= 0))) {
            return zzafoVar;
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + jZzb + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + iZza + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }
}

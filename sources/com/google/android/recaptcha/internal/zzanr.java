package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzanr extends zzagg implements zzahm {
    private static final zzanr zza;
    private static volatile zzaht zzd;
    private int zze;
    private String zzf = "";
    private zzagl zzg = zzagg.zzM();
    private zzagm zzh = zzagg.zzO();
    private zzanb zzi;

    static {
        zzanr zzanrVar = new zzanr();
        zza = zzanrVar;
        zzagg.zzY(zzanr.class, zzanrVar);
    }

    private zzanr() {
    }

    public static zzanr zzc(byte[] bArr) {
        return (zzanr) zzagg.zzJ(zza, bArr);
    }

    public final zzanb zza() {
        zzanb zzanbVar = this.zzi;
        return zzanbVar == null ? zzanb.zzb() : zzanbVar;
    }

    public final String zzd() {
        return this.zzf;
    }

    public final List zze() {
        return this.zzh;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002'\u0003%\u0004ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzanr();
        }
        zzanw zzanwVar = null;
        if (i2 == 4) {
            return new zzanq(zzanwVar);
        }
        if (i2 == 5) {
            return zza;
        }
        if (i2 != 6) {
            throw null;
        }
        zzaht zzahtVar = zzd;
        if (zzahtVar != null) {
            return zzahtVar;
        }
        synchronized (zzanr.class) {
            try {
                zzagbVar = zzd;
                if (zzagbVar == null) {
                    zzagbVar = new zzagb(zza);
                    zzd = zzagbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzagbVar;
    }
}

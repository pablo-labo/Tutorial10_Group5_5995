package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafo extends zzagg implements zzahm {
    private static final zzafo zza;
    private static volatile zzaht zzd;
    private long zze;
    private int zzf;

    static {
        zzafo zzafoVar = new zzafo();
        zza = zzafoVar;
        zzagg.zzY(zzafo.class, zzafoVar);
    }

    private zzafo() {
    }

    public static zzafm zzc() {
        return (zzafm) zza.zzB();
    }

    public final int zza() {
        return this.zzf;
    }

    public final long zzb() {
        return this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzahx(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzafo();
        }
        zzafn zzafnVar = null;
        if (i2 == 4) {
            return new zzafm(zzafnVar);
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
        synchronized (zzafo.class) {
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

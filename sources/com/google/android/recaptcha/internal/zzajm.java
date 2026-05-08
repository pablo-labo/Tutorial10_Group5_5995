package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajm extends zzagg implements zzahm {
    private static final zzajm zza;
    private static volatile zzaht zzd;
    private int zze;
    private zzafo zzf;
    private int zzg;

    static {
        zzajm zzajmVar = new zzajm();
        zza = zzajmVar;
        zzagg.zzY(zzajm.class, zzajmVar);
    }

    private zzajm() {
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzajm();
        }
        zzajl zzajlVar = null;
        if (i2 == 4) {
            return new zzajk(zzajlVar);
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
        synchronized (zzajm.class) {
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

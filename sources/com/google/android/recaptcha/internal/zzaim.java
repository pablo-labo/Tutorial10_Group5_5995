package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaim extends zzagg implements zzahm {
    private static final zzaim zza;
    private static volatile zzaht zzd;
    private long zze;
    private int zzf;

    static {
        zzaim zzaimVar = new zzaim();
        zza = zzaimVar;
        zzagg.zzY(zzaim.class, zzaimVar);
    }

    private zzaim() {
    }

    public static zzaik zzc() {
        return (zzaik) zza.zzB();
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
            return new zzaim();
        }
        zzail zzailVar = null;
        if (i2 == 4) {
            return new zzaik(zzailVar);
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
        synchronized (zzaim.class) {
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

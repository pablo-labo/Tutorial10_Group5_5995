package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzalu extends zzagg implements zzahm {
    private static final zzalu zza;
    private static volatile zzaht zzd;
    private zzaef zze;
    private zzaef zzf;

    static {
        zzalu zzaluVar = new zzalu();
        zza = zzaluVar;
        zzagg.zzY(zzalu.class, zzaluVar);
    }

    private zzalu() {
        zzaef zzaefVar = zzaef.zzb;
        this.zze = zzaefVar;
        this.zzf = zzaefVar;
    }

    public static zzalu zzd() {
        return zza;
    }

    public final zzaef zza() {
        return this.zze;
    }

    public final zzaef zzb() {
        return this.zzf;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzalu();
        }
        zzamd zzamdVar = null;
        if (i2 == 4) {
            return new zzalt(zzamdVar);
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
        synchronized (zzalu.class) {
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

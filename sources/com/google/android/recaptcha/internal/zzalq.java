package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzalq extends zzagg implements zzahm {
    private static final zzalq zza;
    private static volatile zzaht zzd;
    private zzaef zze;
    private String zzf;
    private long zzg;
    private zzaef zzh;
    private String zzi;
    private String zzj;
    private boolean zzk;

    static {
        zzalq zzalqVar = new zzalq();
        zza = zzalqVar;
        zzagg.zzY(zzalq.class, zzalqVar);
    }

    private zzalq() {
        zzaef zzaefVar = zzaef.zzb;
        this.zze = zzaefVar;
        this.zzf = "";
        this.zzh = zzaefVar;
        this.zzi = "";
        this.zzj = "";
    }

    public static zzalq zze() {
        return zza;
    }

    public final long zza() {
        return this.zzg;
    }

    public final zzaef zzb() {
        return this.zzh;
    }

    public final zzaef zzc() {
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
            return zzagg.zzV(zza, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\u0002\u0004\n\u0005Ȉ\u0006Ȉ\u0007\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzalq();
        }
        zzamd zzamdVar = null;
        if (i2 == 4) {
            return new zzalp(zzamdVar);
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
        synchronized (zzalq.class) {
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

    public final String zzg() {
        return this.zzf;
    }
}

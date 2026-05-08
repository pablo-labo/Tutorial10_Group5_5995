package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajt extends zzagg implements zzahm {
    private static final zzajt zza;
    private static volatile zzaht zzd;
    private zzaef zze;
    private String zzf;
    private zzaef zzg;
    private String zzh;
    private String zzi;
    private zzaef zzj;
    private String zzk;
    private zzaef zzl;

    static {
        zzajt zzajtVar = new zzajt();
        zza = zzajtVar;
        zzagg.zzY(zzajt.class, zzajtVar);
    }

    private zzajt() {
        zzaef zzaefVar = zzaef.zzb;
        this.zze = zzaefVar;
        this.zzf = "";
        this.zzg = zzaefVar;
        this.zzh = "";
        this.zzi = "";
        this.zzj = zzaefVar;
        this.zzk = "";
        this.zzl = zzaefVar;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\n\u0004Ȉ\u0005Ȉ\u0006\n\u0007Ȉ\b\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzajt();
        }
        zzajs zzajsVar = null;
        if (i2 == 4) {
            return new zzajr(zzajsVar);
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
        synchronized (zzajt.class) {
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

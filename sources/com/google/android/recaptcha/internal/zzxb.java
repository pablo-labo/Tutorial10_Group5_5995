package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxb extends zzagg implements zzahm {
    private static final zzxb zza;
    private static volatile zzaht zzd;
    private int zze;
    private int zzf;
    private zzxe zzg;
    private zzaef zzh;
    private zzaef zzi;
    private zzaef zzj;
    private zzaef zzk;
    private zzaef zzl;
    private zzaef zzm;

    static {
        zzxb zzxbVar = new zzxb();
        zza = zzxbVar;
        zzagg.zzY(zzxb.class, zzxbVar);
    }

    private zzxb() {
        zzaef zzaefVar = zzaef.zzb;
        this.zzh = zzaefVar;
        this.zzi = zzaefVar;
        this.zzj = zzaefVar;
        this.zzk = zzaefVar;
        this.zzl = zzaefVar;
        this.zzm = zzaefVar;
    }

    public static zzwz zzb() {
        return (zzwz) zza.zzB();
    }

    public static zzxb zzd(zzaef zzaefVar, zzafr zzafrVar) {
        return (zzxb) zzagg.zzK(zza, zzaefVar, zzafrVar);
    }

    public static zzaht zzm() {
        return (zzaht) zza.zzf(7, null, null);
    }

    public static /* synthetic */ void zzs(zzxb zzxbVar, zzxe zzxeVar) {
        zzxeVar.getClass();
        zzxbVar.zzg = zzxeVar;
        zzxbVar.zze |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzxe zze() {
        zzxe zzxeVar = this.zzg;
        return zzxeVar == null ? zzxe.zze() : zzxeVar;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new zzxb();
        }
        zzxa zzxaVar = null;
        if (i2 == 4) {
            return new zzwz(zzxaVar);
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
        synchronized (zzxb.class) {
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

    public final zzaef zzg() {
        return this.zzm;
    }

    public final zzaef zzh() {
        return this.zzh;
    }

    public final zzaef zzi() {
        return this.zzk;
    }

    public final zzaef zzj() {
        return this.zzl;
    }

    public final zzaef zzk() {
        return this.zzi;
    }

    public final zzaef zzl() {
        return this.zzj;
    }
}

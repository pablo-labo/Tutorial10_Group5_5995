package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzvh extends zzagg implements zzahm {
    private static final zzvh zza;
    private static volatile zzaht zzd;
    private int zze;
    private int zzf;
    private zzvb zzg;
    private zzaef zzh;
    private zzaef zzi;

    static {
        zzvh zzvhVar = new zzvh();
        zza = zzvhVar;
        zzagg.zzY(zzvh.class, zzvhVar);
    }

    private zzvh() {
        zzaef zzaefVar = zzaef.zzb;
        this.zzh = zzaefVar;
        this.zzi = zzaefVar;
    }

    public static zzvf zzc() {
        return (zzvf) zza.zzB();
    }

    public static zzvh zze() {
        return zza;
    }

    public static zzvh zzg(zzaef zzaefVar, zzafr zzafrVar) {
        return (zzvh) zzagg.zzK(zza, zzaefVar, zzafrVar);
    }

    public static zzaht zzj() {
        return (zzaht) zza.zzf(7, null, null);
    }

    public static /* synthetic */ void zzk(zzvh zzvhVar, zzvb zzvbVar) {
        zzvbVar.getClass();
        zzvhVar.zzg = zzvbVar;
        zzvhVar.zze |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzvb zzb() {
        zzvb zzvbVar = this.zzg;
        return zzvbVar == null ? zzvb.zzc() : zzvbVar;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzvh();
        }
        zzvg zzvgVar = null;
        if (i2 == 4) {
            return new zzvf(zzvgVar);
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
        synchronized (zzvh.class) {
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

    public final zzaef zzh() {
        return this.zzh;
    }

    public final zzaef zzi() {
        return this.zzi;
    }
}

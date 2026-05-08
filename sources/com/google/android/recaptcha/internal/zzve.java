package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzve extends zzagg implements zzahm {
    private static final zzve zza;
    private static volatile zzaht zzd;
    private int zze;
    private int zzf;
    private zzvh zzg;
    private zzaef zzh = zzaef.zzb;

    static {
        zzve zzveVar = new zzve();
        zza = zzveVar;
        zzagg.zzY(zzve.class, zzveVar);
    }

    private zzve() {
    }

    public static zzvc zzb() {
        return (zzvc) zza.zzB();
    }

    public static zzve zzd(zzaef zzaefVar, zzafr zzafrVar) {
        return (zzve) zzagg.zzK(zza, zzaefVar, zzafrVar);
    }

    public static zzaht zzh() {
        return (zzaht) zza.zzf(7, null, null);
    }

    public static /* synthetic */ void zzj(zzve zzveVar, zzvh zzvhVar) {
        zzvhVar.getClass();
        zzveVar.zzg = zzvhVar;
        zzveVar.zze |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzvh zze() {
        zzvh zzvhVar = this.zzg;
        return zzvhVar == null ? zzvh.zze() : zzvhVar;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzve();
        }
        zzvd zzvdVar = null;
        if (i2 == 4) {
            return new zzvc(zzvdVar);
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
        synchronized (zzve.class) {
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
        return this.zzh;
    }
}

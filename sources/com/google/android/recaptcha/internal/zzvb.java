package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzvb extends zzagg implements zzahm {
    private static final zzvb zza;
    private static volatile zzaht zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzvb zzvbVar = new zzvb();
        zza = zzvbVar;
        zzagg.zzY(zzvb.class, zzvbVar);
    }

    private zzvb() {
    }

    public static zzuz zza() {
        return (zzuz) zza.zzB();
    }

    public static zzvb zzc() {
        return zza;
    }

    public final zzvq zzd() {
        zzvq zzvqVarZzb = zzvq.zzb(this.zze);
        return zzvqVarZzb == null ? zzvq.UNRECOGNIZED : zzvqVarZzb;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzvb();
        }
        zzva zzvaVar = null;
        if (i2 == 4) {
            return new zzuz(zzvaVar);
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
        synchronized (zzvb.class) {
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

    public final int zzg() {
        int i = this.zzg;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzh() {
        int i = this.zzf;
        int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}

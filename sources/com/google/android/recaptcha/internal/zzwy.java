package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwy extends zzagg implements zzahm {
    private static final zzwy zza;
    private static volatile zzaht zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzwy zzwyVar = new zzwy();
        zza = zzwyVar;
        zzagg.zzY(zzwy.class, zzwyVar);
    }

    private zzwy() {
    }

    public static zzww zzd() {
        return (zzww) zza.zzB();
    }

    public static zzwy zzg() {
        return zza;
    }

    public final int zza() {
        return this.zzg;
    }

    public final zzvq zzb() {
        zzvq zzvqVarZzb = zzvq.zzb(this.zzf);
        return zzvqVarZzb == null ? zzvq.UNRECOGNIZED : zzvqVarZzb;
    }

    public final zzvq zzc() {
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
            return zzagg.zzV(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzwy();
        }
        zzwx zzwxVar = null;
        if (i2 == 4) {
            return new zzww(zzwxVar);
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
        synchronized (zzwy.class) {
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

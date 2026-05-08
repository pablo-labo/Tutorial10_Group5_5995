package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzvu extends zzagg implements zzahm {
    private static final zzvu zza;
    private static volatile zzaht zzd;
    private String zze = "";
    private zzaef zzf = zzaef.zzb;
    private int zzg;

    static {
        zzvu zzvuVar = new zzvu();
        zza = zzvuVar;
        zzagg.zzY(zzvu.class, zzvuVar);
    }

    private zzvu() {
    }

    public static zzvr zza() {
        return (zzvr) zza.zzB();
    }

    public static zzvu zzd() {
        return zza;
    }

    public static /* synthetic */ void zzi(zzvu zzvuVar, String str) {
        str.getClass();
        zzvuVar.zze = str;
    }

    public static /* synthetic */ void zzj(zzvu zzvuVar, zzaef zzaefVar) {
        zzaefVar.getClass();
        zzvuVar.zzf = zzaefVar;
    }

    public final zzvs zzb() {
        int i = this.zzg;
        zzvs zzvsVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : zzvs.REMOTE : zzvs.ASYMMETRIC_PUBLIC : zzvs.ASYMMETRIC_PRIVATE : zzvs.SYMMETRIC : zzvs.UNKNOWN_KEYMATERIAL;
        return zzvsVar == null ? zzvs.UNRECOGNIZED : zzvsVar;
    }

    public final zzaef zze() {
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
            return zzagg.zzV(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzvu();
        }
        zzvt zzvtVar = null;
        if (i2 == 4) {
            return new zzvr(zzvtVar);
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
        synchronized (zzvu.class) {
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
        return this.zze;
    }
}

package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwb extends zzagg implements zzahm {
    private static final zzwb zza;
    private static volatile zzaht zzd;
    private int zze;
    private zzvu zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        zzwb zzwbVar = new zzwb();
        zza = zzwbVar;
        zzagg.zzY(zzwb.class, zzwbVar);
    }

    private zzwb() {
    }

    public static zzwa zzc() {
        return (zzwa) zza.zzB();
    }

    public static /* synthetic */ void zzg(zzwb zzwbVar, zzvu zzvuVar) {
        zzvuVar.getClass();
        zzwbVar.zzf = zzvuVar;
        zzwbVar.zze |= 1;
    }

    public final int zza() {
        return this.zzh;
    }

    public final zzvu zzb() {
        zzvu zzvuVar = this.zzf;
        return zzvuVar == null ? zzvu.zzd() : zzvuVar;
    }

    public final zzwj zze() {
        int i = this.zzi;
        zzwj zzwjVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : zzwj.WITH_ID_REQUIREMENT : zzwj.CRUNCHY : zzwj.RAW : zzwj.LEGACY : zzwj.TINK : zzwj.UNKNOWN_PREFIX;
        return zzwjVar == null ? zzwj.UNRECOGNIZED : zzwjVar;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzwb();
        }
        zzwc zzwcVar = null;
        if (i2 == 4) {
            return new zzwa(zzwcVar);
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
        synchronized (zzwb.class) {
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

    public final boolean zzj() {
        return (this.zze & 1) != 0;
    }

    public final int zzk() {
        int i = this.zzg;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}

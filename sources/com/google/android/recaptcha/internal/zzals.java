package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzals extends zzagg implements zzahm {
    private static final zzals zza;
    private static volatile zzaht zzd;
    private int zze;
    private zzamp zzg;
    private String zzf = "";
    private zzaef zzh = zzaef.zzb;

    static {
        zzals zzalsVar = new zzals();
        zza = zzalsVar;
        zzagg.zzY(zzals.class, zzalsVar);
    }

    private zzals() {
    }

    public static zzalr zza() {
        return (zzalr) zza.zzB();
    }

    public static /* synthetic */ void zzc(zzals zzalsVar, zzamp zzampVar) {
        zzampVar.getClass();
        zzalsVar.zzg = zzampVar;
        zzalsVar.zze |= 2;
    }

    public static /* synthetic */ void zzd(zzals zzalsVar, zzaef zzaefVar) {
        zzalsVar.zze |= 4;
        zzalsVar.zzh = zzaefVar;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ဉ\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzals();
        }
        zzamd zzamdVar = null;
        if (i2 == 4) {
            return new zzalr(zzamdVar);
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
        synchronized (zzals.class) {
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

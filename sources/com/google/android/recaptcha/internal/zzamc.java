package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzamc extends zzagg implements zzahm {
    private static final zzamc zza;
    private static volatile zzaht zzd;
    private int zze;
    private String zzf = "";
    private zzamp zzg;

    static {
        zzamc zzamcVar = new zzamc();
        zza = zzamcVar;
        zzagg.zzY(zzamc.class, zzamcVar);
    }

    private zzamc() {
    }

    public static zzamb zza() {
        return (zzamb) zza.zzB();
    }

    public static zzamc zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzamc zzamcVar, String str) {
        str.getClass();
        zzamcVar.zze |= 1;
        zzamcVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzamc();
        }
        zzamd zzamdVar = null;
        if (i2 == 4) {
            return new zzamb(zzamdVar);
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
        synchronized (zzamc.class) {
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

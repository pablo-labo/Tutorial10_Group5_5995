package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwg extends zzagg implements zzahm {
    private static final zzwg zza;
    private static volatile zzaht zzd;
    private String zze = "";
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzwg zzwgVar = new zzwg();
        zza = zzwgVar;
        zzagg.zzY(zzwg.class, zzwgVar);
    }

    private zzwg() {
    }

    public static zzwf zza() {
        return (zzwf) zza.zzB();
    }

    public static /* synthetic */ void zze(zzwg zzwgVar, String str) {
        str.getClass();
        zzwgVar.zze = str;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzwg();
        }
        zzwh zzwhVar = null;
        if (i2 == 4) {
            return new zzwf(zzwhVar);
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
        synchronized (zzwg.class) {
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

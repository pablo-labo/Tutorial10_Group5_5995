package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzalw extends zzagg implements zzahm {
    private static final zzalw zza;
    private static volatile zzaht zzd;
    private int zze;
    private String zzf = "";
    private zzamp zzg;

    static {
        zzalw zzalwVar = new zzalw();
        zza = zzalwVar;
        zzagg.zzY(zzalw.class, zzalwVar);
    }

    private zzalw() {
    }

    public static zzalv zza() {
        return (zzalv) zza.zzB();
    }

    public static /* synthetic */ void zzc(zzalw zzalwVar, zzamp zzampVar) {
        zzampVar.getClass();
        zzalwVar.zzg = zzampVar;
        zzalwVar.zze |= 2;
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
            return new zzalw();
        }
        zzamd zzamdVar = null;
        if (i2 == 4) {
            return new zzalv(zzamdVar);
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
        synchronized (zzalw.class) {
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

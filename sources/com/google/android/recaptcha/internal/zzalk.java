package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzalk extends zzagg implements zzahm {
    private static final zzalk zza;
    private static volatile zzaht zzd;
    private int zze;
    private String zzf = "";
    private zzamp zzg;

    static {
        zzalk zzalkVar = new zzalk();
        zza = zzalkVar;
        zzagg.zzY(zzalk.class, zzalkVar);
    }

    private zzalk() {
    }

    public static zzalj zza() {
        return (zzalj) zza.zzB();
    }

    public static /* synthetic */ void zzc(zzalk zzalkVar, zzamp zzampVar) {
        zzampVar.getClass();
        zzalkVar.zzg = zzampVar;
        zzalkVar.zze |= 2;
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
            return new zzalk();
        }
        zzamd zzamdVar = null;
        if (i2 == 4) {
            return new zzalj(zzamdVar);
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
        synchronized (zzalk.class) {
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

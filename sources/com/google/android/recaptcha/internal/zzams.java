package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzams extends zzagg implements zzahm {
    private static final zzams zza;
    private static volatile zzaht zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzams zzamsVar = new zzams();
        zza = zzamsVar;
        zzagg.zzY(zzams.class, zzamsVar);
    }

    private zzams() {
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzams();
        }
        zzamz zzamzVar = null;
        if (i2 == 4) {
            return new zzamr(zzamzVar);
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
        synchronized (zzams.class) {
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

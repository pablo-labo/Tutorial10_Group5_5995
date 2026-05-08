package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzakc extends zzagg implements zzahm {
    private static final zzakc zza;
    private static volatile zzaht zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzakc zzakcVar = new zzakc();
        zza = zzakcVar;
        zzagg.zzY(zzakc.class, zzakcVar);
    }

    private zzakc() {
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzakc();
        }
        zzakb zzakbVar = null;
        if (i2 == 4) {
            return new zzaka(zzakbVar);
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
        synchronized (zzakc.class) {
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

package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzala extends zzagg implements zzahm {
    private static final zzala zza;
    private static volatile zzaht zzd;
    private zzagn zze = zzagg.zzP();

    static {
        zzala zzalaVar = new zzala();
        zza = zzalaVar;
        zzagg.zzY(zzala.class, zzalaVar);
    }

    private zzala() {
    }

    public static zzala zzb() {
        return zza;
    }

    public final List zzc() {
        return this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzala();
        }
        zzald zzaldVar = null;
        if (i2 == 4) {
            return new zzakz(zzaldVar);
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
        synchronized (zzala.class) {
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

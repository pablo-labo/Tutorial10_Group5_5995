package com.google.android.recaptcha.internal;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zzank extends zzagg implements zzahm {
    private static final zzank zza;
    private static volatile zzaht zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzank zzankVar = new zzank();
        zza = zzankVar;
        zzagg.zzY(zzank.class, zzankVar);
    }

    private zzank() {
    }

    public static zzank zzb(InputStream inputStream) {
        return (zzank) zzagg.zzI(zza, inputStream);
    }

    public final zzanl zzc() {
        zzanl zzanlVarZzb = zzanl.zzb(this.zzg);
        return zzanlVarZzb == null ? zzanl.UNRECOGNIZED : zzanlVarZzb;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzank();
        }
        zzanw zzanwVar = null;
        if (i2 == 4) {
            return new zzanj(zzanwVar);
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
        synchronized (zzank.class) {
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

package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzanp extends zzagg implements zzahm {
    private static final zzanp zza;
    private static volatile zzaht zzd;
    private zzagn zze = zzagg.zzP();

    static {
        zzanp zzanpVar = new zzanp();
        zza = zzanpVar;
        zzagg.zzY(zzanp.class, zzanpVar);
    }

    private zzanp() {
    }

    public static zzanp zzb(byte[] bArr) {
        return (zzanp) zzagg.zzJ(zza, bArr);
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
            return zzagg.zzV(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzanv.class});
        }
        if (i2 == 3) {
            return new zzanp();
        }
        zzanw zzanwVar = null;
        if (i2 == 4) {
            return new zzano(zzanwVar);
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
        synchronized (zzanp.class) {
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

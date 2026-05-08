package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzamh extends zzagg implements zzahm {
    private static final zzamh zza;
    private static volatile zzaht zzd;
    private int zze;
    private long zzg;
    private int zzh;
    private String zzf = "";
    private zzagn zzi = zzagg.zzP();
    private zzaef zzj = zzaef.zzb;
    private String zzk = "";
    private String zzl = "";

    static {
        zzamh zzamhVar = new zzamh();
        zza = zzamhVar;
        zzagg.zzY(zzamh.class, zzamhVar);
    }

    private zzamh() {
    }

    public static zzamh zzc() {
        return zza;
    }

    public final zzaef zza() {
        return this.zzj;
    }

    public final String zzd() {
        return this.zzf;
    }

    public final List zze() {
        return this.zzi;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0004ဌ\u0002\u0005\u001b\u0006ည\u0003\u0007ለ\u0004\bለ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzamj.class, "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzamh();
        }
        zzamk zzamkVar = null;
        if (i2 == 4) {
            return new zzamg(zzamkVar);
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
        synchronized (zzamh.class) {
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

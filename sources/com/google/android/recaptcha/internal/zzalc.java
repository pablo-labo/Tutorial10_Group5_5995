package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzalc extends zzagg implements zzahm {
    private static final zzalc zza;
    private static volatile zzaht zzd;
    private int zze;
    private zzala zzf;
    private zzala zzg;

    static {
        zzalc zzalcVar = new zzalc();
        zza = zzalcVar;
        zzagg.zzY(zzalc.class, zzalcVar);
    }

    private zzalc() {
    }

    public static zzalc zzd(byte[] bArr) {
        return (zzalc) zzagg.zzJ(zza, bArr);
    }

    public final zzala zza() {
        zzala zzalaVar = this.zzf;
        return zzalaVar == null ? zzala.zzb() : zzalaVar;
    }

    public final zzala zzb() {
        zzala zzalaVar = this.zzg;
        return zzalaVar == null ? zzala.zzb() : zzalaVar;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzalc();
        }
        zzald zzaldVar = null;
        if (i2 == 4) {
            return new zzalb(zzaldVar);
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
        synchronized (zzalc.class) {
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

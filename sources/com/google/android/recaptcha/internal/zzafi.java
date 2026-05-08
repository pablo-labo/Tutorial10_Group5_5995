package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafi extends zzagg implements zzahm {
    private static final zzafi zza;
    private static volatile zzaht zzd;
    private int zze;
    private boolean zzg;
    private byte zzh = 2;
    private String zzf = "";

    static {
        zzafi zzafiVar = new zzafi();
        zza = zzafiVar;
        zzagg.zzY(zzafi.class, zzafiVar);
    }

    private zzafi() {
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return new zzahx(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzafi();
        }
        zzafk zzafkVar = null;
        if (i2 == 4) {
            return new zzafh(zzafkVar);
        }
        if (i2 == 5) {
            return zza;
        }
        if (i2 != 6) {
            this.zzh = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzaht zzahtVar = zzd;
        if (zzahtVar != null) {
            return zzahtVar;
        }
        synchronized (zzafi.class) {
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

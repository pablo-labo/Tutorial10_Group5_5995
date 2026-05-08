package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafd extends zzagd implements zzahm {
    private static final zzafd zzd;
    private static volatile zzaht zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private byte zzo = 2;

    static {
        zzafd zzafdVar = new zzafd();
        zzd = zzafdVar;
        zzagg.zzY(zzafd.class, zzafdVar);
    }

    private zzafd() {
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzo);
        }
        if (i2 == 2) {
            return new zzahx(zzd, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzf", "zzg", zzaex.zza, "zzh", zzaew.zza, "zzi", zzafa.zza, "zzj", zzafb.zza, "zzk", zzaez.zza, "zzl", zzaey.zza, "zzm", zzaev.zza, "zzn", zzafc.zza});
        }
        if (i2 == 3) {
            return new zzafd();
        }
        zzafk zzafkVar = null;
        if (i2 == 4) {
            return new zzaeu(zzafkVar);
        }
        if (i2 == 5) {
            return zzd;
        }
        if (i2 != 6) {
            this.zzo = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzaht zzahtVar = zze;
        if (zzahtVar != null) {
            return zzahtVar;
        }
        synchronized (zzafd.class) {
            try {
                zzagbVar = zze;
                if (zzagbVar == null) {
                    zzagbVar = new zzagb(zzd);
                    zze = zzagbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzagbVar;
    }
}

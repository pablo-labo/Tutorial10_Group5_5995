package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafj extends zzagg implements zzahm {
    private static final zzafj zza;
    private static volatile zzaht zzd;
    private int zze;
    private long zzh;
    private long zzi;
    private double zzj;
    private byte zzm = 2;
    private zzagn zzf = zzahw.zze();
    private String zzg = "";
    private zzaef zzk = zzaef.zzb;
    private String zzl = "";

    static {
        zzafj zzafjVar = new zzafj();
        zza = zzafjVar;
        zzagg.zzY(zzafj.class, zzafjVar);
    }

    private zzafj() {
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i2 == 2) {
            return new zzahx(zza, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"zze", "zzf", zzafi.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzafj();
        }
        zzafk zzafkVar = null;
        if (i2 == 4) {
            return new zzafg(zzafkVar);
        }
        if (i2 == 5) {
            return zza;
        }
        if (i2 != 6) {
            this.zzm = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzaht zzahtVar = zzd;
        if (zzahtVar != null) {
            return zzahtVar;
        }
        synchronized (zzafj.class) {
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

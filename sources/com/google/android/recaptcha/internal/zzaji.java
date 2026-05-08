package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaji extends zzagg implements zzahm {
    private static final zzaji zza;
    private static volatile zzaht zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        zzaji zzajiVar = new zzaji();
        zza = zzajiVar;
        zzagg.zzY(zzaji.class, zzajiVar);
    }

    private zzaji() {
    }

    public static zzaji zze(byte[] bArr) {
        return (zzaji) zzagg.zzJ(zza, bArr);
    }

    public final int zza() {
        return this.zzh;
    }

    public final long zzb() {
        return this.zzg;
    }

    public final long zzc() {
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
            return zzagg.zzV(zza, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzaji();
        }
        zzajj zzajjVar = null;
        if (i2 == 4) {
            return new zzajh(zzajjVar);
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
        synchronized (zzaji.class) {
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

    public final int zzg() {
        int i = this.zzk;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzh() {
        int i = this.zzj;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzi() {
        int i = this.zzl;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}

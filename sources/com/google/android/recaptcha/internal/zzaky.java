package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaky extends zzagg implements zzahm {
    private static final zzaky zza;
    private static volatile zzaht zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private zzafo zzj;
    private zzaim zzk;
    private int zzl;
    private zzakf zzm;
    private String zzh = "";
    private String zzi = "";
    private zzagn zzn = zzagg.zzP();

    static {
        zzaky zzakyVar = new zzaky();
        zza = zzakyVar;
        zzagg.zzY(zzaky.class, zzakyVar);
    }

    private zzaky() {
    }

    public static zzaky zzb() {
        return zza;
    }

    public static zzaky zzc(byte[] bArr) {
        return (zzaky) zzagg.zzJ(zza, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001\u0004\u0003ဉ\u0000\u0004ဉ\u0001\u0005\f\u0007\u001b\b\f\tȈ\nȈ\u000bဉ\u0002", new Object[]{"zze", "zzf", "zzj", "zzk", "zzl", "zzn", zzakp.class, "zzg", "zzh", "zzi", "zzm"});
        }
        if (i2 == 3) {
            return new zzaky();
        }
        zzakx zzakxVar = null;
        if (i2 == 4) {
            return new zzakw(zzakxVar);
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
        synchronized (zzaky.class) {
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

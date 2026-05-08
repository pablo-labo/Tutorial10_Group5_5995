package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaks extends zzagg implements zzahm {
    private static final zzaks zza;
    private static volatile zzaht zzd;
    private int zze;
    private zzafo zzf;
    private zzaim zzg;
    private zzafo zzh;
    private zzaim zzi;

    static {
        zzaks zzaksVar = new zzaks();
        zza = zzaksVar;
        zzagg.zzY(zzaks.class, zzaksVar);
    }

    private zzaks() {
    }

    public static zzakq zza() {
        return (zzakq) zza.zzB();
    }

    public static /* synthetic */ void zzc(zzaks zzaksVar, zzaim zzaimVar) {
        zzaimVar.getClass();
        zzaksVar.zzi = zzaimVar;
        zzaksVar.zze |= 8;
    }

    public static /* synthetic */ void zzd(zzaks zzaksVar, zzafo zzafoVar) {
        zzafoVar.getClass();
        zzaksVar.zzh = zzafoVar;
        zzaksVar.zze |= 4;
    }

    public static /* synthetic */ void zze(zzaks zzaksVar, zzaim zzaimVar) {
        zzaimVar.getClass();
        zzaksVar.zzg = zzaimVar;
        zzaksVar.zze |= 2;
    }

    public static /* synthetic */ void zzg(zzaks zzaksVar, zzafo zzafoVar) {
        zzafoVar.getClass();
        zzaksVar.zzf = zzafoVar;
        zzaksVar.zze |= 1;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzaks();
        }
        zzakr zzakrVar = null;
        if (i2 == 4) {
            return new zzakq(zzakrVar);
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
        synchronized (zzaks.class) {
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

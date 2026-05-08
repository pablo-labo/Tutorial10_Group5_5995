package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzann extends zzagg implements zzahm {
    private static final zzann zza;
    private static volatile zzaht zzd;
    private int zze = 0;
    private Object zzf;

    static {
        zzann zzannVar = new zzann();
        zza = zzannVar;
        zzagg.zzY(zzann.class, zzannVar);
    }

    private zzann() {
    }

    public static zzanm zzc() {
        return (zzanm) zza.zzB();
    }

    public static zzann zze(byte[] bArr) {
        return (zzann) zzagg.zzJ(zza, bArr);
    }

    public static /* synthetic */ void zzg(zzann zzannVar, zzakj zzakjVar) {
        zzakjVar.getClass();
        zzannVar.zzf = zzakjVar;
        zzannVar.zze = 1;
    }

    public static /* synthetic */ void zzh(zzann zzannVar, zzaky zzakyVar) {
        zzakyVar.getClass();
        zzannVar.zzf = zzakyVar;
        zzannVar.zze = 2;
    }

    public final zzakj zza() {
        return this.zze == 1 ? (zzakj) this.zzf : zzakj.zzg();
    }

    public final zzaky zzb() {
        return this.zze == 2 ? (zzaky) this.zzf : zzaky.zzb();
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zzf", "zze", zzakj.class, zzaky.class});
        }
        if (i2 == 3) {
            return new zzann();
        }
        zzanw zzanwVar = null;
        if (i2 == 4) {
            return new zzanm(zzanwVar);
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
        synchronized (zzann.class) {
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

    public final int zzi() {
        int i = this.zze;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }
}

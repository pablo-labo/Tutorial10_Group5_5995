package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzvo extends zzagg implements zzahm {
    private static final zzvo zza;
    private static volatile zzaht zzd;
    private int zze;
    private zzaef zzf = zzaef.zzb;

    static {
        zzvo zzvoVar = new zzvo();
        zza = zzvoVar;
        zzagg.zzY(zzvo.class, zzvoVar);
    }

    private zzvo() {
    }

    public static zzvm zzb() {
        return (zzvm) zza.zzB();
    }

    public static zzvo zzd() {
        return zza;
    }

    public static zzvo zze(zzaef zzaefVar, zzafr zzafrVar) {
        return (zzvo) zzagg.zzK(zza, zzaefVar, zzafrVar);
    }

    public static zzaht zzh() {
        return (zzaht) zza.zzf(7, null, null);
    }

    public final int zza() {
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
            return zzagg.zzV(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzvo();
        }
        zzvn zzvnVar = null;
        if (i2 == 4) {
            return new zzvm(zzvnVar);
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
        synchronized (zzvo.class) {
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

    public final zzaef zzg() {
        return this.zzf;
    }
}

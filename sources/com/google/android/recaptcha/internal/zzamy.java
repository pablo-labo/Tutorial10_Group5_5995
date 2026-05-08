package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzamy extends zzagg implements zzahm {
    private static final zzamy zza;
    private static volatile zzaht zzd;
    private zzagn zze = zzagg.zzP();
    private int zzf;

    static {
        zzamy zzamyVar = new zzamy();
        zza = zzamyVar;
        zzagg.zzY(zzamy.class, zzamyVar);
    }

    private zzamy() {
    }

    public static zzamv zza() {
        return (zzamv) zza.zzB();
    }

    public static /* synthetic */ void zzc(zzamy zzamyVar, Iterable iterable) {
        zzamyVar.zzg();
        zzadq.zzx(iterable, zzamyVar.zze);
    }

    public static /* synthetic */ void zzd(zzamy zzamyVar, zzamx zzamxVar) {
        zzamxVar.getClass();
        zzamyVar.zzg();
        zzamyVar.zze.add(zzamxVar);
    }

    private final void zzg() {
        zzagn zzagnVar = this.zze;
        if (zzagnVar.zzc()) {
            return;
        }
        this.zze = zzagg.zzQ(zzagnVar);
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b", new Object[]{"zze", zzamx.class, "zzf"});
        }
        if (i2 == 3) {
            return new zzamy();
        }
        zzamz zzamzVar = null;
        if (i2 == 4) {
            return new zzamv(zzamzVar);
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
        synchronized (zzamy.class) {
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

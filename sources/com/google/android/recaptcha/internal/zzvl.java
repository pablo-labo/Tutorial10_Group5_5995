package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzvl extends zzagg implements zzahm {
    private static final zzvl zza;
    private static volatile zzaht zzd;
    private int zze;
    private int zzf;
    private zzaef zzg = zzaef.zzb;
    private zzvo zzh;

    static {
        zzvl zzvlVar = new zzvl();
        zza = zzvlVar;
        zzagg.zzY(zzvl.class, zzvlVar);
    }

    private zzvl() {
    }

    public static zzvj zzb() {
        return (zzvj) zza.zzB();
    }

    public static zzvl zzd(zzaef zzaefVar, zzafr zzafrVar) {
        return (zzvl) zzagg.zzK(zza, zzaefVar, zzafrVar);
    }

    public static zzaht zzh() {
        return (zzaht) zza.zzf(7, null, null);
    }

    public static /* synthetic */ void zzj(zzvl zzvlVar, zzvo zzvoVar) {
        zzvoVar.getClass();
        zzvlVar.zzh = zzvoVar;
        zzvlVar.zze |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzvo zze() {
        zzvo zzvoVar = this.zzh;
        return zzvoVar == null ? zzvo.zzd() : zzvoVar;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzvl();
        }
        zzvk zzvkVar = null;
        if (i2 == 4) {
            return new zzvj(zzvkVar);
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
        synchronized (zzvl.class) {
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
        return this.zzg;
    }
}

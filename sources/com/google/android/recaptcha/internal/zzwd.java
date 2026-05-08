package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwd extends zzagg implements zzahm {
    private static final zzwd zza;
    private static volatile zzaht zzd;
    private int zze;
    private zzagn zzf = zzagg.zzP();

    static {
        zzwd zzwdVar = new zzwd();
        zza = zzwdVar;
        zzagg.zzY(zzwd.class, zzwdVar);
    }

    private zzwd() {
    }

    public static zzvz zzc() {
        return (zzvz) zza.zzB();
    }

    public static zzwd zzg(byte[] bArr, zzafr zzafrVar) {
        return (zzwd) zzagg.zzL(zza, bArr, zzafrVar);
    }

    public static /* synthetic */ void zzi(zzwd zzwdVar, zzwb zzwbVar) {
        zzwbVar.getClass();
        zzagn zzagnVar = zzwdVar.zzf;
        if (!zzagnVar.zzc()) {
            zzwdVar.zzf = zzagg.zzQ(zzagnVar);
        }
        zzwdVar.zzf.add(zzwbVar);
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final zzwb zzd(int i) {
        return (zzwb) this.zzf.get(i);
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzwb.class});
        }
        if (i2 == 3) {
            return new zzwd();
        }
        zzwc zzwcVar = null;
        if (i2 == 4) {
            return new zzvz(zzwcVar);
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
        synchronized (zzwd.class) {
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

    public final List zzh() {
        return this.zzf;
    }
}

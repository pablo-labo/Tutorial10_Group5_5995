package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzamp extends zzagg implements zzahm {
    private static final zzamp zza;
    private static volatile zzaht zzd;
    private int zze;
    private String zzf = "";
    private zzagn zzg = zzagg.zzP();

    static {
        zzamp zzampVar = new zzamp();
        zza = zzampVar;
        zzagg.zzY(zzamp.class, zzampVar);
    }

    private zzamp() {
    }

    public static zzamo zza() {
        return (zzamo) zza.zzB();
    }

    public static zzamp zzc(zzaef zzaefVar) {
        return (zzamp) zzagg.zzH(zza, zzaefVar);
    }

    public static zzamp zzd(byte[] bArr) {
        return (zzamp) zzagg.zzJ(zza, bArr);
    }

    public static /* synthetic */ void zzg(zzamp zzampVar, Iterable iterable) {
        zzampVar.zzk();
        zzadq.zzx(iterable, zzampVar.zzg);
    }

    public static /* synthetic */ void zzh(zzamp zzampVar, zzamn zzamnVar) {
        zzamnVar.getClass();
        zzampVar.zzk();
        zzampVar.zzg.add(zzamnVar);
    }

    public static /* synthetic */ void zzj(zzamp zzampVar, String str) {
        str.getClass();
        zzampVar.zze |= 1;
        zzampVar.zzf = str;
    }

    private final void zzk() {
        zzagn zzagnVar = this.zzg;
        if (zzagnVar.zzc()) {
            return;
        }
        this.zzg = zzagg.zzQ(zzagnVar);
    }

    public final List zze() {
        return this.zzg;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zze", "zzg", zzamn.class, "zzf"});
        }
        if (i2 == 3) {
            return new zzamp();
        }
        zzamq zzamqVar = null;
        if (i2 == 4) {
            return new zzamo(zzamqVar);
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
        synchronized (zzamp.class) {
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

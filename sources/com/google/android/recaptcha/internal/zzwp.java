package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwp extends zzagg implements zzahm {
    private static final zzwp zza;
    private static volatile zzaht zzd;
    private int zze;

    static {
        zzwp zzwpVar = new zzwp();
        zza = zzwpVar;
        zzagg.zzY(zzwp.class, zzwpVar);
    }

    private zzwp() {
    }

    public static zzwn zzb() {
        return (zzwn) zza.zzB();
    }

    public static zzwp zzd() {
        return zza;
    }

    public final zzvq zza() {
        zzvq zzvqVarZzb = zzvq.zzb(this.zze);
        return zzvqVarZzb == null ? zzvq.UNRECOGNIZED : zzvqVarZzb;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzwp();
        }
        zzwo zzwoVar = null;
        if (i2 == 4) {
            return new zzwn(zzwoVar);
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
        synchronized (zzwp.class) {
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

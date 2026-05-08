package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajq extends zzagg implements zzahm {
    private static final zzajq zza;
    private static volatile zzaht zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private zzagl zzk = zzagg.zzM();

    static {
        zzajq zzajqVar = new zzajq();
        zza = zzajqVar;
        zzagg.zzY(zzajq.class, zzajqVar);
    }

    private zzajq() {
    }

    public static zzajn zza() {
        return (zzajn) zza.zzB();
    }

    public static /* synthetic */ void zzc(zzajq zzajqVar, Iterable iterable) {
        zzagl zzaglVar = zzajqVar.zzk;
        if (!zzaglVar.zzc()) {
            zzajqVar.zzk = zzagg.zzN(zzaglVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzajqVar.zzk.zzh(((zzajo) it.next()).zza());
        }
    }

    public static /* synthetic */ void zze(zzajq zzajqVar, String str) {
        str.getClass();
        zzajqVar.zzj = str;
    }

    public static /* synthetic */ void zzg(zzajq zzajqVar, String str) {
        str.getClass();
        zzajqVar.zzh = str;
    }

    public static /* synthetic */ void zzh(zzajq zzajqVar, String str) {
        str.getClass();
        zzajqVar.zzf = str;
    }

    public static /* synthetic */ void zzi(zzajq zzajqVar, String str) {
        str.getClass();
        zzajqVar.zzi = str;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007,", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzajq();
        }
        zzajp zzajpVar = null;
        if (i2 == 4) {
            return new zzajn(zzajpVar);
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
        synchronized (zzajq.class) {
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

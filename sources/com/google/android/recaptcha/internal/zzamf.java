package com.google.android.recaptcha.internal;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes2.dex */
public final class zzamf extends zzagg implements zzahm {
    private static final zzamf zza;
    private static volatile zzaht zzd;
    private int zze;
    private zzaly zzm;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private String zzn = "";

    static {
        zzamf zzamfVar = new zzamf();
        zza = zzamfVar;
        zzagg.zzY(zzamf.class, zzamfVar);
    }

    private zzamf() {
    }

    public static zzame zza() {
        return (zzame) zza.zzB();
    }

    public static /* synthetic */ void zzc(zzamf zzamfVar, String str) {
        str.getClass();
        zzamfVar.zze |= 8;
        zzamfVar.zzi = str;
    }

    public static /* synthetic */ void zzd(zzamf zzamfVar, String str) {
        str.getClass();
        zzamfVar.zze |= 2;
        zzamfVar.zzg = str;
    }

    public static /* synthetic */ void zze(zzamf zzamfVar, String str) {
        str.getClass();
        zzamfVar.zze |= 1;
        zzamfVar.zzf = str;
    }

    public static /* synthetic */ void zzg(zzamf zzamfVar, zzaly zzalyVar) {
        zzalyVar.getClass();
        zzamfVar.zzm = zzalyVar;
        zzamfVar.zze |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
    }

    public static /* synthetic */ void zzh(zzamf zzamfVar, String str) {
        str.getClass();
        zzamfVar.zze |= 4;
        zzamfVar.zzh = str;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bဉ\u0007\tለ\b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new zzamf();
        }
        zzamk zzamkVar = null;
        if (i2 == 4) {
            return new zzame(zzamkVar);
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
        synchronized (zzamf.class) {
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

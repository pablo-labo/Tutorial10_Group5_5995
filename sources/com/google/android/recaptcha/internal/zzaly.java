package com.google.android.recaptcha.internal;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaly extends zzagg implements zzahm {
    private static final zzaly zza;
    private static volatile zzaht zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private zzamc zzk;
    private zzals zzl;
    private zzama zzm;
    private zzalk zzn;
    private zzalw zzo;
    private zzali zzp;

    static {
        zzaly zzalyVar = new zzaly();
        zza = zzalyVar;
        zzagg.zzY(zzaly.class, zzalyVar);
    }

    private zzaly() {
    }

    public static zzalx zza() {
        return (zzalx) zza.zzB();
    }

    public static zzaly zzc(byte[] bArr) {
        return (zzaly) zzagg.zzJ(zza, bArr);
    }

    public static /* synthetic */ void zzj(zzaly zzalyVar, String str) {
        str.getClass();
        zzalyVar.zze |= 1;
        zzalyVar.zzf = str;
    }

    public static /* synthetic */ void zzk(zzaly zzalyVar, zzalk zzalkVar) {
        zzalkVar.getClass();
        zzalyVar.zzn = zzalkVar;
        zzalyVar.zze |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
    }

    public static /* synthetic */ void zzl(zzaly zzalyVar, zzals zzalsVar) {
        zzalsVar.getClass();
        zzalyVar.zzl = zzalsVar;
        zzalyVar.zze |= 64;
    }

    public static /* synthetic */ void zzm(zzaly zzalyVar, zzalw zzalwVar) {
        zzalwVar.getClass();
        zzalyVar.zzo = zzalwVar;
        zzalyVar.zze |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
    }

    public static /* synthetic */ void zzn(zzaly zzalyVar, zzamc zzamcVar) {
        zzamcVar.getClass();
        zzalyVar.zzk = zzamcVar;
        zzalyVar.zze |= 32;
    }

    public static /* synthetic */ void zzo(zzaly zzalyVar, zzama zzamaVar) {
        zzamaVar.getClass();
        zzalyVar.zzm = zzamaVar;
        zzalyVar.zze |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
    }

    public final zzamc zzd() {
        zzamc zzamcVar = this.zzk;
        return zzamcVar == null ? zzamc.zzc() : zzamcVar;
    }

    @Deprecated
    public final String zze() {
        return this.zzi;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new zzaly();
        }
        zzamd zzamdVar = null;
        if (i2 == 4) {
            return new zzalx(zzamdVar);
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
        synchronized (zzaly.class) {
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

    public final String zzg() {
        return this.zzf;
    }

    @Deprecated
    public final String zzh() {
        return this.zzg;
    }

    @Deprecated
    public final String zzi() {
        return this.zzh;
    }
}

package com.google.android.recaptcha.internal;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzalo extends zzagg implements zzahm {
    private static final zzalo zza;
    private static volatile zzaht zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private zzagm zzl = zzagg.zzO();
    private zzaef zzm = zzaef.zzb;
    private zzalq zzn;
    private zzalm zzo;
    private zzalu zzp;

    static {
        zzalo zzaloVar = new zzalo();
        zza = zzaloVar;
        zzagg.zzY(zzalo.class, zzaloVar);
    }

    private zzalo() {
    }

    public static zzalo zzd() {
        return zza;
    }

    public final zzaef zza() {
        return this.zzm;
    }

    public final zzalm zzb() {
        zzalm zzalmVar = this.zzo;
        return zzalmVar == null ? zzalm.zzc() : zzalmVar;
    }

    public final zzalq zze() {
        zzalq zzalqVar = this.zzn;
        return zzalqVar == null ? zzalq.zze() : zzalqVar;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007%\bည\u0006\u000bဉ\u0007\fဉ\b\rဉ\t", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new zzalo();
        }
        zzamd zzamdVar = null;
        if (i2 == 4) {
            return new zzaln(zzamdVar);
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
        synchronized (zzalo.class) {
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

    public final zzalu zzg() {
        zzalu zzaluVar = this.zzp;
        return zzaluVar == null ? zzalu.zzd() : zzaluVar;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final String zzi() {
        return this.zzi;
    }

    public final String zzj() {
        return this.zzh;
    }

    public final String zzk() {
        return this.zzj;
    }

    public final String zzl() {
        return this.zzk;
    }

    public final List zzm() {
        return this.zzl;
    }

    public final boolean zzn() {
        return (this.zze & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0;
    }

    public final boolean zzo() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzp() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzq() {
        return (this.zze & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
    }

    public final boolean zzr() {
        return (this.zze & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0;
    }

    public final boolean zzt() {
        return (this.zze & 64) != 0;
    }
}

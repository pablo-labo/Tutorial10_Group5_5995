package com.google.android.recaptcha.internal;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzanu extends zzagg implements zzahm {
    private static final zzanu zza;
    private static volatile zzaht zzd;
    private int zze = 0;
    private Object zzf;

    static {
        zzanu zzanuVar = new zzanu();
        zza = zzanuVar;
        zzagg.zzY(zzanu.class, zzanuVar);
    }

    private zzanu() {
    }

    public final double zza() {
        if (this.zze == 11) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final float zzb() {
        if (this.zze == 10) {
            return ((Float) this.zzf).floatValue();
        }
        return 0.0f;
    }

    public final int zzc() {
        if (this.zze == 1) {
            return ((Integer) this.zzf).intValue();
        }
        return 0;
    }

    public final int zzd() {
        if (this.zze == 5) {
            return ((Integer) this.zzf).intValue();
        }
        return 0;
    }

    public final int zze() {
        if (this.zze == 6) {
            return ((Integer) this.zzf).intValue();
        }
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u000f\u0001\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001>\u0000\u0002:\u0000\u0003=\u0000\u0004Ȼ\u0000\u0005B\u0000\u0006B\u0000\u0007>\u0000\bC\u0000\t6\u0000\n4\u0000\u000b3\u0000\fȻ\u0000\r:\u0000\u000e?\u0000\u000f?\u0000", new Object[]{"zzf", "zze"});
        }
        if (i2 == 3) {
            return new zzanu();
        }
        zzanw zzanwVar = null;
        if (i2 == 4) {
            return new zzant(zzanwVar);
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
        synchronized (zzanu.class) {
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

    public final long zzg() {
        if (this.zze == 8) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    public final zzaef zzh() {
        return this.zze == 3 ? (zzaef) this.zzf : zzaef.zzb;
    }

    public final String zzj() {
        return this.zze == 4 ? (String) this.zzf : "";
    }

    public final String zzk() {
        return this.zze == 12 ? (String) this.zzf : "";
    }

    public final boolean zzl() {
        if (this.zze == 2) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final boolean zzm() {
        return this.zze == 1;
    }

    public final int zzn() {
        switch (this.zze) {
            case 0:
                return 16;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case DatadogLogGenerator.CRASH /* 9 */:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return 14;
            case 15:
                return 15;
            default:
                return 0;
        }
    }
}

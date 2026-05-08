package com.google.android.recaptcha.internal;

import app.rive.runtime.kotlin.renderers.RendererMetrics;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzakj extends zzagg implements zzahm {
    private static final zzakj zza;
    private static volatile zzaht zzd;
    private int zze;
    private Object zzg;
    private int zzh;
    private int zzi;
    private long zzn;
    private zzafo zzo;
    private int zzp;
    private zzajw zzq;
    private zzakv zzr;
    private zzaim zzt;
    private zzafo zzu;
    private int zzw;
    private int zzf = 0;
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private String zzs = "";
    private zzagl zzv = zzagg.zzM();

    static {
        zzakj zzakjVar = new zzakj();
        zza = zzakjVar;
        zzagg.zzY(zzakj.class, zzakjVar);
    }

    private zzakj() {
    }

    public static zzakg zzd() {
        return (zzakg) zza.zzB();
    }

    public static zzakj zzg() {
        return zza;
    }

    public static zzakj zzh(byte[] bArr) {
        return (zzakj) zzagg.zzJ(zza, bArr);
    }

    public static /* synthetic */ void zzk(zzakj zzakjVar, int i) {
        zzagl zzaglVar = zzakjVar.zzv;
        if (!zzaglVar.zzc()) {
            zzakjVar.zzv = zzagg.zzN(zzaglVar);
        }
        zzakjVar.zzv.zzh(0);
    }

    public static /* synthetic */ void zzl(zzakj zzakjVar, String str) {
        str.getClass();
        zzakjVar.zzj = str;
    }

    public static /* synthetic */ void zzn(zzakj zzakjVar, zzajw zzajwVar) {
        zzakjVar.zzq = zzajwVar;
        zzakjVar.zze |= 2;
    }

    public static /* synthetic */ void zzo(zzakj zzakjVar, String str) {
        str.getClass();
        zzakjVar.zzk = str;
    }

    public static /* synthetic */ void zzp(zzakj zzakjVar, zzakv zzakvVar) {
        zzakvVar.getClass();
        zzakjVar.zzr = zzakvVar;
        zzakjVar.zze |= 4;
    }

    public static /* synthetic */ void zzq(zzakj zzakjVar, int i) {
        zzakjVar.zze |= 32;
        zzakjVar.zzw = i;
    }

    public static /* synthetic */ void zzt(zzakj zzakjVar, String str) {
        str.getClass();
        zzakjVar.zzl = str;
    }

    public final int zza() {
        return this.zzw;
    }

    public final boolean zzad() {
        return (this.zze & 32) != 0;
    }

    public final int zzae() {
        int i;
        switch (this.zzh) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
                i = 10;
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            case 11:
                i = 13;
                break;
            case 12:
                i = 14;
                break;
            case 13:
                i = 15;
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                i = 16;
                break;
            case 15:
                i = 17;
                break;
            case 16:
                i = 18;
                break;
            case 17:
                i = 19;
                break;
            case 18:
                i = 20;
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                i = 21;
                break;
            case 20:
                i = 22;
                break;
            case 21:
                i = 23;
                break;
            case 22:
                i = 24;
                break;
            case 23:
                i = 25;
                break;
            case 24:
                i = 26;
                break;
            case 25:
                i = 27;
                break;
            case 26:
                i = 28;
                break;
            case 27:
                i = 29;
                break;
            case 28:
                i = 30;
                break;
            case 29:
                i = 31;
                break;
            case RendererMetrics.SAMPLES /* 30 */:
                i = 32;
                break;
            case 31:
                i = 33;
                break;
            case 32:
                i = 34;
                break;
            case 33:
                i = 35;
                break;
            case 34:
                i = 36;
                break;
            case 35:
                i = 37;
                break;
            case 36:
                i = 38;
                break;
            case 37:
                i = 39;
                break;
            case 38:
                i = 40;
                break;
            case 39:
                i = 41;
                break;
            case 40:
                i = 42;
                break;
            case 41:
                i = 43;
                break;
            case 42:
                i = 44;
                break;
            case 43:
                i = 45;
                break;
            case 44:
                i = 46;
                break;
            case 45:
                i = 47;
                break;
            case 46:
                i = 48;
                break;
            case 47:
                i = 49;
                break;
            case 48:
                i = 50;
                break;
            case 49:
                i = 51;
                break;
            case 50:
                i = 52;
                break;
            case 51:
                i = 53;
                break;
            case 52:
                i = 54;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int zzaf() {
        int i = this.zzp;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    @Deprecated
    public final long zzb() {
        return this.zzn;
    }

    public final zzajw zzc() {
        zzajw zzajwVar = this.zzq;
        return zzajwVar == null ? zzajw.zzd() : zzajwVar;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0011\u0001\u0001\u0001\u0013\u0011\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u0003\u0004\f\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bȈ\tȈ\nဉ\u0000\u000bဉ\u0003\rဉ\u0004\u000eȈ\u000f<\u0000\u0011'\u0012င\u0005\u0013\f", new Object[]{"zzg", "zzf", "zze", "zzh", "zzk", "zzn", "zzp", "zzq", "zzr", "zzs", "zzl", "zzm", "zzo", "zzt", "zzu", "zzj", zzajm.class, "zzv", "zzw", "zzi"});
        }
        if (i2 == 3) {
            return new zzakj();
        }
        zzaki zzakiVar = null;
        if (i2 == 4) {
            return new zzakg(zzakiVar);
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
        synchronized (zzakj.class) {
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

    public final String zzi() {
        return this.zzk;
    }

    public final String zzj() {
        return this.zzl;
    }

    public final boolean zzu() {
        return (this.zze & 2) != 0;
    }
}

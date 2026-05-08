package com.google.android.recaptcha.internal;

import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import defpackage.b0;
import defpackage.z3;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zznb {
    private boolean zza;
    private long zzb;
    private long zzc;

    public static zznb zzb() {
        zznb zznbVar = new zznb();
        zznbVar.zze();
        return zznbVar;
    }

    public static zznb zzc() {
        return new zznb();
    }

    private final long zzg() {
        return this.zza ? (System.nanoTime() - this.zzc) + this.zzb : this.zzb;
    }

    public final String toString() {
        String str;
        long jZzg = zzg();
        TimeUnit timeUnit = jZzg / 86400000000000L > 0 ? TimeUnit.DAYS : jZzg / 3600000000000L > 0 ? TimeUnit.HOURS : jZzg / 60000000000L > 0 ? TimeUnit.MINUTES : jZzg / 1000000000 > 0 ? TimeUnit.SECONDS : jZzg / 1000000 > 0 ? TimeUnit.MILLISECONDS : jZzg / 1000 > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jZzg / r2.convert(1L, timeUnit)));
        switch (zzna.zza[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY;
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                b0.t();
                return null;
        }
        return z3.m(str2, " ", str);
    }

    public final long zza(TimeUnit timeUnit) {
        return timeUnit.convert(zzg(), TimeUnit.NANOSECONDS);
    }

    public final zznb zzd() {
        this.zzb = 0L;
        this.zza = false;
        return this;
    }

    public final zznb zze() {
        zzmz.zzg(!this.zza, "This stopwatch is already running.");
        this.zza = true;
        this.zzc = System.nanoTime();
        return this;
    }

    public final zznb zzf() {
        long jNanoTime = System.nanoTime();
        zzmz.zzg(this.zza, "This stopwatch is already stopped.");
        this.zza = false;
        this.zzb = (jNanoTime - this.zzc) + this.zzb;
        return this;
    }
}

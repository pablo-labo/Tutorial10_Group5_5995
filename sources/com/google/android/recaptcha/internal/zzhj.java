package com.google.android.recaptcha.internal;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.recaptcha.RecaptchaAction;
import defpackage.lu2;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhj {
    private final String zza;
    private final zzjl zzb;
    private final zzer zzc;
    private final Application zzd;
    private final zzbf zze;
    private final zzjt zzf;
    private final zzfq zzg;
    private final zzji zzh;
    private final zzes zzi;
    private final zzfa zzj;

    public zzhj(String str, zzjl zzjlVar, zzer zzerVar, zzfq zzfqVar, zzji zzjiVar, Application application, zzes zzesVar, zzfa zzfaVar, zzbf zzbfVar, zzeh zzehVar, zzjt zzjtVar) {
        this.zza = str;
        this.zzb = zzjlVar;
        this.zzc = zzerVar;
        this.zzg = zzfqVar;
        this.zzh = zzjiVar;
        this.zzd = application;
        this.zzi = zzesVar;
        this.zzj = zzfaVar;
        this.zze = zzbfVar;
        this.zzf = zzjtVar;
    }

    public static final /* synthetic */ zzeg zzd(zzhj zzhjVar, Exception exc) {
        return exc instanceof TimeoutCancellationException ? zzhjVar.zzs(exc, new zzeg(zzee.zzc, zzed.zzb, exc.getMessage(), null, 8, null)) : exc instanceof zzeg ? zzhjVar.zzs(exc, (zzeg) exc) : zzhjVar.zzs(exc, new zzeg(zzee.zzc, zzed.zzZ, exc.getMessage(), null, 8, null));
    }

    public static final /* synthetic */ void zzn(zzhj zzhjVar, String str) throws zzeg {
        try {
            zzhjVar.zzf.zza(zzalc.zzd(zzfj.zza(str)));
        } catch (Exception e) {
            throw new zzeg(zzee.zzl, zzed.zzan, e.getMessage(), null, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzeg zzs(Exception exc, zzeg zzegVar) {
        NetworkCapabilities networkCapabilities;
        try {
            Object systemService = this.zzd.getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return zzegVar;
                }
            }
        } catch (Exception unused) {
        }
        return new zzeg(zzee.zzc, zzed.zzao, exc.getMessage(), null, 8, null);
    }

    public final zzamf zzg(RecaptchaAction recaptchaAction, zzaly zzalyVar, zzalo zzaloVar, String str) {
        zzame zzameVarZza = zzamf.zza();
        zzameVarZza.zze(this.zza);
        zzameVarZza.zza(recaptchaAction.getAction());
        zzameVarZza.zzb(zzaloVar.zzk());
        zzameVarZza.zzc(zzaloVar.zzj());
        zzameVarZza.zzd(zzalyVar);
        return (zzamf) zzameVarZza.zzq();
    }

    public final Object zzh(String str, long j, lu2 lu2Var) {
        return new zzip(27, new zzgx(this, str, j, null), null);
    }

    public final Object zzi(zzamf zzamfVar, long j, lu2 lu2Var) {
        return new zzip(28, new zzha(this, j, zzamfVar, null), null);
    }

    public final Object zzj(zzalo zzaloVar, long j, lu2 lu2Var) {
        return new zziq(new zzhf(j, this, zzaloVar, null));
    }

    public final Object zzk(zzamh zzamhVar, lu2 lu2Var) {
        return new zzip(29, new zzhg(zzamhVar, this, null), null);
    }

    public final Object zzl(long j, lu2 lu2Var) {
        return new zzip(22, new zzhi(j, this, null), null);
    }
}

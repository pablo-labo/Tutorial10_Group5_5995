package com.google.android.recaptcha.internal;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzaft extends zzafs {
    @Override // com.google.android.recaptcha.internal.zzafs
    public final void zza(Object obj) {
        ((zzagd) obj).zza.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzafs
    public final void zzb(zzajb zzajbVar, Map.Entry entry) {
        zzage zzageVar = (zzage) entry.getKey();
        zzaiz zzaizVar = zzaiz.zza;
        switch (zzageVar.zzb.ordinal()) {
            case 0:
                zzajbVar.zzf(zzageVar.zza, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                zzajbVar.zzo(zzageVar.zza, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                zzajbVar.zzt(zzageVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                zzajbVar.zzK(zzageVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                zzajbVar.zzr(zzageVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                zzajbVar.zzm(zzageVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                zzajbVar.zzk(zzageVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                zzajbVar.zzb(zzageVar.zza, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                zzajbVar.zzG(zzageVar.zza, (String) entry.getValue());
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                zzajbVar.zzq(zzageVar.zza, entry.getValue(), zzahv.zza().zzb(entry.getValue().getClass()));
                break;
            case 10:
                zzajbVar.zzv(zzageVar.zza, entry.getValue(), zzahv.zza().zzb(entry.getValue().getClass()));
                break;
            case 11:
                zzajbVar.zzd(zzageVar.zza, (zzaef) entry.getValue());
                break;
            case 12:
                zzajbVar.zzI(zzageVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                zzajbVar.zzr(zzageVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                zzajbVar.zzx(zzageVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                zzajbVar.zzz(zzageVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                zzajbVar.zzB(zzageVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                zzajbVar.zzD(zzageVar.zza, ((Long) entry.getValue()).longValue());
                break;
        }
    }
}

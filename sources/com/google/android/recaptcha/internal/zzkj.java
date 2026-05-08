package com.google.android.recaptcha.internal;

import defpackage.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkj implements zzkw {
    public static final zzkj zza = new zzkj();

    private zzkj() {
    }

    @Override // com.google.android.recaptcha.internal.zzkw
    public final void zza(int i, zzkb zzkbVar, zzanu... zzanuVarArr) throws zzeu {
        if (zzanuVarArr.length == 0) {
            b0.n(4, 3, null);
            return;
        }
        zzamv zzamvVarZza = zzamy.zza();
        for (zzanu zzanuVar : zzanuVarArr) {
            Object objZza = zzkbVar.zzc().zza(zzanuVar);
            if (objZza == null) {
                throw new zzeu(4, 4, null);
            }
            zzamw zzamwVarZza = zzamx.zza();
            if (objZza instanceof Integer) {
                zzamwVarZza.zzg(((Number) objZza).intValue());
            } else if (objZza instanceof Short) {
                zzamwVarZza.zzf(((Number) objZza).shortValue());
            } else if (objZza instanceof Byte) {
                zzamwVarZza.zzb(zzaef.zzm(new byte[]{((Number) objZza).byteValue()}, 0, 1));
            } else if (objZza instanceof Long) {
                zzamwVarZza.zzh(((Number) objZza).longValue());
            } else if (objZza instanceof Double) {
                zzamwVarZza.zzd(((Number) objZza).doubleValue());
            } else if (objZza instanceof Float) {
                zzamwVarZza.zze(((Number) objZza).floatValue());
            } else if (objZza instanceof Boolean) {
                zzamwVarZza.zza(((Boolean) objZza).booleanValue());
            } else if (objZza instanceof Character) {
                zzamwVarZza.zzc(String.valueOf(((Character) objZza).charValue()));
            } else if (objZza instanceof String) {
                zzamwVarZza.zzw((String) objZza);
            } else {
                zzamwVarZza.zzw(objZza.toString());
            }
            zzamvVarZza.zzb((zzamx) zzamwVarZza.zzq());
        }
        zzkc zzkcVarZzc = zzkbVar.zzc();
        byte[] bArrZzy = ((zzamy) zzamvVarZza.zzq()).zzy();
        zzkcVarZzc.zze(i, zzqg.zzh().zzi(bArrZzy, 0, bArrZzy.length));
    }
}

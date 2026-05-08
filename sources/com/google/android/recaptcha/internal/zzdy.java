package com.google.android.recaptcha.internal;

import android.util.Base64;
import defpackage.j6g;
import defpackage.lu2;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdy implements zzdx {
    public zzdy() throws GeneralSecurityException {
        zzaag.zza();
    }

    @Override // com.google.android.recaptcha.internal.zzdx
    public final Object zza(zzalu zzaluVar, String str, lu2 lu2Var) throws zzeg {
        try {
            ((zzqz) zzrb.zza(Base64.decode(str, 0)).zzf(zzri.zza(), zzqz.class)).zza(zzaluVar.zzb().zzp(), zzaluVar.zza().zzp());
            return j6g.a;
        } catch (GeneralSecurityException unused) {
            throw new zzeg(zzee.zzb, zzed.zzbb, null, null, 12, null);
        }
    }
}

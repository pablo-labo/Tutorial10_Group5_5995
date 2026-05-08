package com.google.android.recaptcha.internal;

import defpackage.b0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkl implements zzkw {
    public static final zzkl zza = new zzkl();

    private zzkl() {
    }

    @Override // com.google.android.recaptcha.internal.zzkw
    public final void zza(int i, zzkb zzkbVar, zzanu... zzanuVarArr) throws zzeu {
        if (zzanuVarArr.length != 1) {
            b0.n(4, 3, null);
            return;
        }
        Object objZza = zzkbVar.zzc().zza(zzanuVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            b0.n(4, 5, null);
            return;
        }
        try {
            if (objZza instanceof String) {
                objZza = zzkbVar.zzj().zza((String) objZza);
            }
            zzkbVar.zzc().zze(i, Boolean.valueOf(zzkbVar.zzi(objZza)));
        } catch (zzeu e) {
            throw e;
        } catch (Exception e2) {
            b0.n(6, 8, e2);
        }
    }
}

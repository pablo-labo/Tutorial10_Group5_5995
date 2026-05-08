package com.google.android.recaptcha.internal;

import defpackage.b0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzla implements zzkw {
    public static final zzla zza = new zzla();

    private zzla() {
    }

    @Override // com.google.android.recaptcha.internal.zzkw
    public final void zza(int i, zzkb zzkbVar, zzanu... zzanuVarArr) throws zzeu {
        if (zzanuVarArr.length != 2) {
            b0.n(4, 3, null);
            return;
        }
        Class<?> clsZza = zzkbVar.zzc().zza(zzanuVarArr[0]);
        if (true != Objects.nonNull(clsZza)) {
            clsZza = null;
        }
        if (clsZza == null) {
            b0.n(4, 5, null);
            return;
        }
        Class<?> cls = clsZza instanceof Class ? clsZza : clsZza.getClass();
        Object objZza = zzkbVar.zzc().zza(zzanuVarArr[1]);
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            b0.n(4, 5, null);
            return;
        }
        try {
            zzkbVar.zzc().zze(i, cls.getField(zzkbVar.zzj().zza(str)));
        } catch (Exception e) {
            b0.n(6, 10, e);
        }
    }
}

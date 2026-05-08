package com.google.android.recaptcha.internal;

import defpackage.b0;
import defpackage.ut0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkz implements zzkw {
    public static final zzkz zza = new zzkz();

    private zzkz() {
    }

    @Override // com.google.android.recaptcha.internal.zzkw
    public final void zza(int i, zzkb zzkbVar, zzanu... zzanuVarArr) throws zzeu {
        int length = zzanuVarArr.length;
        if (length == 0) {
            b0.n(4, 3, null);
            return;
        }
        Object objZza = zzkbVar.zzc().zza(zzanuVarArr[0]);
        if (true != (objZza instanceof Class)) {
            objZza = null;
        }
        Class cls = (Class) objZza;
        if (cls == null) {
            b0.n(4, 5, null);
            return;
        }
        Class[] clsArrZzf = zzkbVar.zzc().zzf(ut0.E0(zzanuVarArr).subList(1, length));
        try {
            zzkbVar.zzc().zze(i, cls.getConstructor((Class[]) Arrays.copyOf(clsArrZzf, clsArrZzf.length)));
        } catch (Exception e) {
            b0.n(6, 9, e);
        }
    }
}

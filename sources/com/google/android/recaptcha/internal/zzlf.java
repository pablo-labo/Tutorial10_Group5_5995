package com.google.android.recaptcha.internal;

import defpackage.b0;
import defpackage.ut0;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlf implements zzkw {
    public static final zzlf zza = new zzlf();

    private zzlf() {
    }

    @Override // com.google.android.recaptcha.internal.zzkw
    public final void zza(int i, zzkb zzkbVar, zzanu... zzanuVarArr) throws zzeu {
        int length = zzanuVarArr.length;
        if (length == 0) {
            b0.n(4, 3, null);
            return;
        }
        Object objZza = zzkbVar.zzc().zza(zzanuVarArr[0]);
        if (true != (objZza instanceof Method)) {
            objZza = null;
        }
        Method method = (Method) objZza;
        if (method == null) {
            b0.n(4, 5, null);
            return;
        }
        Object[] objArrZzg = zzkbVar.zzc().zzg(ut0.E0(zzanuVarArr).subList(1, length));
        try {
            zzkbVar.zzc().zze(i, method.invoke(null, Arrays.copyOf(objArrZzg, objArrZzg.length)));
        } catch (Exception e) {
            b0.n(6, 15, e);
        }
    }
}

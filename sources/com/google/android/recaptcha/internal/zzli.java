package com.google.android.recaptcha.internal;

import defpackage.b0;
import defpackage.ut0;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzli implements zzkw {
    public static final zzli zza = new zzli();

    private zzli() {
    }

    @Override // com.google.android.recaptcha.internal.zzkw
    public final void zza(int i, zzkb zzkbVar, zzanu... zzanuVarArr) throws zzeu {
        int length = zzanuVarArr.length;
        if (length == 0) {
            b0.n(4, 3, null);
            return;
        }
        Constructor<?> constructorZza = zzkbVar.zzc().zza(zzanuVarArr[0]);
        if (true != Objects.nonNull(constructorZza)) {
            constructorZza = null;
        }
        if (constructorZza == null) {
            b0.n(4, 5, null);
            return;
        }
        Constructor<?> constructor = constructorZza instanceof Constructor ? constructorZza : constructorZza.getClass().getConstructor(null);
        Object[] objArrZzg = zzkbVar.zzc().zzg(ut0.E0(zzanuVarArr).subList(1, length));
        try {
            zzkbVar.zzc().zze(i, constructor.newInstance(Arrays.copyOf(objArrZzg, objArrZzg.length)));
        } catch (Exception e) {
            b0.n(6, 14, e);
        }
    }
}

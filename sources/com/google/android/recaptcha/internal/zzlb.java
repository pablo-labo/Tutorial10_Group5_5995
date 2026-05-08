package com.google.android.recaptcha.internal;

import defpackage.b0;
import defpackage.ut0;
import defpackage.wl7;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlb implements zzkw {
    public static final zzlb zza = new zzlb();

    private zzlb() {
    }

    @Override // com.google.android.recaptcha.internal.zzkw
    public final void zza(int i, zzkb zzkbVar, zzanu... zzanuVarArr) throws zzeu {
        int length = zzanuVarArr.length;
        if (length < 2) {
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
        String strZza = zzkbVar.zzj().zza(str);
        if (wl7.b(strZza, "forName")) {
            b0.n(6, 48, null);
            return;
        }
        Class[] clsArrZzf = zzkbVar.zzc().zzf(ut0.E0(zzanuVarArr).subList(2, length));
        try {
            zzkbVar.zzc().zze(i, cls.getMethod(strZza, (Class[]) Arrays.copyOf(clsArrZzf, clsArrZzf.length)));
        } catch (Exception e) {
            b0.n(6, 13, e);
        }
    }
}

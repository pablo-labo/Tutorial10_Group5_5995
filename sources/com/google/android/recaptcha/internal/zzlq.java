package com.google.android.recaptcha.internal;

import defpackage.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlq implements zzkw {
    public static final zzlq zza = new zzlq();

    private zzlq() {
    }

    @Override // com.google.android.recaptcha.internal.zzkw
    public final void zza(int i, zzkb zzkbVar, zzanu... zzanuVarArr) throws zzeu {
        if (zzanuVarArr.length != 2) {
            b0.n(4, 3, null);
            return;
        }
        Object objZza = zzkbVar.zzc().zza(zzanuVarArr[0]);
        if (true != (objZza instanceof int[])) {
            objZza = null;
        }
        int[] iArr = (int[]) objZza;
        if (iArr == null) {
            b0.n(4, 5, null);
            return;
        }
        Object objZza2 = zzkbVar.zzc().zza(zzanuVarArr[1]);
        if (true != (objZza2 instanceof String)) {
            objZza2 = null;
        }
        String str = (String) objZza2;
        if (str == null) {
            b0.n(4, 5, null);
            return;
        }
        zzkc zzkcVarZzc = zzkbVar.zzc();
        StringBuilder sb = new StringBuilder();
        try {
            for (int i2 : iArr) {
                sb.append(str.charAt(i2));
            }
            zzkcVarZzc.zze(i, sb.toString());
        } catch (Exception e) {
            b0.n(4, 22, e);
        }
    }
}

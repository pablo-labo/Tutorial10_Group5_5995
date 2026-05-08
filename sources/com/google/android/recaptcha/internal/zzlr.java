package com.google.android.recaptcha.internal;

import defpackage.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlr implements zzkw {
    public static final zzlr zza = new zzlr();

    private zzlr() {
    }

    @Override // com.google.android.recaptcha.internal.zzkw
    public final void zza(int i, zzkb zzkbVar, zzanu... zzanuVarArr) throws zzeu {
        int length = zzanuVarArr.length;
        if (length != 2) {
            if (length == 0) {
                zzkbVar.zzc().zze(i, new zzel());
                return;
            } else {
                b0.n(4, 3, null);
                return;
            }
        }
        Object objZza = zzkbVar.zzc().zza(zzanuVarArr[0]);
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            b0.n(4, 5, null);
            return;
        }
        Object objZza2 = zzkbVar.zzc().zza(zzanuVarArr[1]);
        if (true != (objZza2 instanceof zzel)) {
            objZza2 = null;
        }
        zzel zzelVar = (zzel) objZza2;
        if (zzelVar == null) {
            b0.n(4, 5, null);
            return;
        }
        byte[] bArrZzy = zzin.zza(zzkbVar.zzb(), zzelVar).zzy();
        zzkbVar.zzk().zzb(str, zzqg.zzh().zzi(bArrZzy, 0, bArrZzy.length));
    }
}

package com.google.android.recaptcha.internal;

import defpackage.b0;
import defpackage.t92;
import defpackage.ut0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkm implements zzkw {
    public static final zzkm zza = new zzkm();

    private zzkm() {
    }

    private static final boolean zzb(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((zzanu) it.next()).zzm()));
        }
        return !arrayList.contains(Boolean.FALSE);
    }

    @Override // com.google.android.recaptcha.internal.zzkw
    public final void zza(int i, zzkb zzkbVar, zzanu... zzanuVarArr) throws zzeu {
        if (!zzb(ut0.E0(zzanuVarArr))) {
            b0.n(4, 5, null);
            return;
        }
        for (zzanu zzanuVar : zzanuVarArr) {
            zzkbVar.zzc().zzb(zzanuVar.zzc());
        }
    }
}

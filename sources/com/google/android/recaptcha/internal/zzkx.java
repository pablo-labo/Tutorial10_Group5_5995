package com.google.android.recaptcha.internal;

import defpackage.b0;
import defpackage.t92;
import defpackage.ut0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkx implements zzkw {
    public static final zzkx zza = new zzkx();

    private zzkx() {
    }

    private static final List zzc(Object obj) {
        if (obj instanceof byte[]) {
            return ut0.z0((byte[]) obj);
        }
        if (obj instanceof short[]) {
            return ut0.F0((short[]) obj);
        }
        if (obj instanceof int[]) {
            return ut0.C0((int[]) obj);
        }
        if (obj instanceof long[]) {
            return ut0.D0((long[]) obj);
        }
        if (obj instanceof float[]) {
            return ut0.B0((float[]) obj);
        }
        if (obj instanceof double[]) {
            return ut0.A0((double[]) obj);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzkw
    public final void zza(int i, zzkb zzkbVar, zzanu... zzanuVarArr) throws zzeu {
        if (zzanuVarArr.length != 2) {
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
        Object objZza2 = zzkbVar.zzc().zza(zzanuVarArr[1]);
        if (true != Objects.nonNull(objZza2)) {
            objZza2 = null;
        }
        if (objZza2 != null) {
            zzkbVar.zzc().zze(i, zzb(objZza, objZza2));
        } else {
            b0.n(4, 5, null);
        }
    }

    public final Object zzb(Object obj, Object obj2) throws zzeu {
        List listZzc = zzc(obj);
        List listZzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (listZzc2 != null) {
                List list = listZzc2;
                ArrayList arrayList = new ArrayList(t92.r0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (listZzc != null && (obj2 instanceof Number)) {
            List list2 = listZzc;
            ArrayList arrayList2 = new ArrayList(t92.r0(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        }
        if (listZzc == null || listZzc2 == null) {
            b0.n(4, 5, null);
            return null;
        }
        zzkv.zza(this, listZzc.size(), listZzc2.size());
        int size = listZzc.size();
        Double[] dArr = new Double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = Double.valueOf(Math.pow(((Number) listZzc.get(i)).doubleValue(), ((Number) listZzc2.get(i)).doubleValue()));
        }
        return dArr;
    }
}

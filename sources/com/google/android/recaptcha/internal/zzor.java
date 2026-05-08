package com.google.android.recaptcha.internal;

import defpackage.ja;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzor extends zzon {
    public final zzor zzb(Object obj, Object... objArr) {
        List listAsList = Arrays.asList(objArr);
        if (obj == null) {
            ja.k("null key in entry: null=".concat(zzow.zza(listAsList)));
            return null;
        }
        Iterator it = listAsList.iterator();
        if (it.hasNext()) {
            zzoe zzopVar = (zzoe) zza().get(obj);
            if (zzopVar == null) {
                int iMax = listAsList instanceof Set ? Math.max(4, ((Set) listAsList).size()) : 4;
                zznj.zza(iMax, "expectedSize");
                zzopVar = new zzop(iMax, true);
                zza().put(obj, zzopVar);
            }
            while (it.hasNext()) {
                Object next = it.next();
                zznj.zzb(obj, next);
                zzopVar.zzb(next);
            }
        }
        return this;
    }

    public final zzot zzc() {
        Map map = this.zza;
        if (map == null) {
            return zznw.zza;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return zznw.zza;
        }
        zzok zzokVar = new zzok(setEntrySet.size());
        int size = 0;
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            zzoq zzoqVarZzk = zzoq.zzk(((zzop) entry.getValue()).zzd());
            if (!zzoqVarZzk.isEmpty()) {
                zzokVar.zza(key, zzoqVarZzk);
                size += zzoqVarZzk.size();
            }
        }
        return new zzot(zzokVar.zzb(), size, null);
    }
}

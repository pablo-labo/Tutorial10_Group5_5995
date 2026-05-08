package com.google.android.recaptcha.internal;

import defpackage.l6;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzty {
    private final Map zza = new HashMap();

    public final zzty zza(zzadm zzadmVar, Object obj) throws GeneralSecurityException {
        List list;
        if (zzadmVar.zza() != 0 && zzadmVar.zza() != 5) {
            l6.m("PrefixMap only supports 0 and 5 byte prefixes");
            return null;
        }
        Map map = this.zza;
        if (map.containsKey(zzadmVar)) {
            list = (List) map.get(zzadmVar);
        } else {
            ArrayList arrayList = new ArrayList();
            map.put(zzadmVar, arrayList);
            list = arrayList;
        }
        list.add(obj);
        return this;
    }

    public final zzub zzb() {
        return new zzub(this.zza, null);
    }
}

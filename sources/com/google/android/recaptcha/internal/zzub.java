package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzub {
    private static final zzadm zza = zzadm.zzb(new byte[0]);
    private final Map zzb;

    public final Iterable zza(byte[] bArr) {
        Map map = this.zzb;
        List list = (List) map.get(zza);
        List list2 = bArr.length >= 5 ? (List) map.get(zzadm.zzc(bArr, 0, 5)) : null;
        return (list == null && list2 == null) ? new ArrayList() : list == null ? list2 : list2 == null ? list : new zztx(this, list2, list);
    }
}

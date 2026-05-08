package com.google.android.recaptcha.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public class zzot<K, V> extends zzoo<K, V> implements zzpb<K, V> {
    private final transient zzoq<V> emptySet;
    private transient zzoq zza;

    public zzot(zzol zzolVar, int i, Comparator comparator) {
        super(zzolVar, i);
        this.emptySet = zzpk.zza;
    }

    public final zzoq zzb() {
        zzoq zzoqVar = this.zza;
        if (zzoqVar != null) {
            return zzoqVar;
        }
        zzos zzosVar = new zzos(this);
        this.zza = zzosVar;
        return zzosVar;
    }
}

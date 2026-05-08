package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafr {
    static final zzafr zza = new zzafr(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    public zzafr() {
        this.zzd = new HashMap();
    }

    public static zzafr zza() {
        int i = zzadt.zza;
        return zza;
    }

    public final zzagf zzb(zzahl zzahlVar, int i) {
        return (zzagf) this.zzd.get(new zzafq(zzahlVar, i));
    }

    public zzafr(boolean z) {
        this.zzd = Collections.EMPTY_MAP;
    }
}

package com.google.android.recaptcha.internal;

import android.os.Build;
import defpackage.lc9;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmv {
    public static final Map zza() {
        LinkedHashMap linkedHashMapB0 = lc9.b0(new Pair(-4, zzed.zzo), new Pair(-12, zzed.zzp), new Pair(-6, zzed.zzk), new Pair(-11, zzed.zzm), new Pair(-13, zzed.zzq), new Pair(-14, zzed.zzr), new Pair(-2, zzed.zzl), new Pair(-7, zzed.zzs), new Pair(-5, zzed.zzt), new Pair(-9, zzed.zzu), new Pair(-8, zzed.zzE), new Pair(-15, zzed.zzn), new Pair(-1, zzed.zzv), new Pair(-3, zzed.zzx), new Pair(-10, zzed.zzy));
        linkedHashMapB0.put(-16, zzed.zzw);
        int i = Build.VERSION.SDK_INT;
        if (i >= 27) {
            linkedHashMapB0.put(1, zzed.zzA);
            linkedHashMapB0.put(2, zzed.zzB);
            linkedHashMapB0.put(0, zzed.zzC);
            linkedHashMapB0.put(3, zzed.zzD);
        }
        if (i >= 29) {
            linkedHashMapB0.put(4, zzed.zzz);
        }
        return linkedHashMapB0;
    }
}

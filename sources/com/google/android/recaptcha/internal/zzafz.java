package com.google.android.recaptcha.internal;

import defpackage.l5;
import defpackage.l6;

/* JADX INFO: loaded from: classes2.dex */
final class zzafz implements zzahj {
    private static final zzafz zza = new zzafz();

    private zzafz() {
    }

    public static zzafz zza() {
        return zza;
    }

    @Override // com.google.android.recaptcha.internal.zzahj
    public final zzahi zzb(Class cls) {
        if (!zzagg.class.isAssignableFrom(cls)) {
            l5.q("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (zzahi) zzagg.zzF(cls.asSubclass(zzagg.class)).zzf(3, null, null);
        } catch (Exception e) {
            l6.p("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzahj
    public final boolean zzc(Class cls) {
        return zzagg.class.isAssignableFrom(cls);
    }
}

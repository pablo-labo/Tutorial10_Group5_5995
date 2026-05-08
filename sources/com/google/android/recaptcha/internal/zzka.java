package com.google.android.recaptcha.internal;

import defpackage.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzka {
    private final zzjt zza;

    public zzka(zzjt zzjtVar) {
        this.zza = zzjtVar;
    }

    public final Class zza(Object obj) throws zzeu {
        if (obj instanceof Class) {
            return (Class) obj;
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Number) obj).intValue();
            Class cls = iIntValue == 1 ? Integer.TYPE : iIntValue == 2 ? Short.TYPE : iIntValue == 3 ? Byte.TYPE : iIntValue == 4 ? Long.TYPE : iIntValue == 5 ? Character.TYPE : iIntValue == 6 ? Float.TYPE : iIntValue == 7 ? Double.TYPE : iIntValue == 8 ? Boolean.TYPE : null;
            if (cls != null) {
                return cls;
            }
            b0.n(4, 6, null);
            return null;
        }
        if (!(obj instanceof String)) {
            b0.n(4, 5, null);
            return null;
        }
        try {
            String str = (String) obj;
            Class<?> cls2 = Class.forName(str);
            if (this.zza.zzb(str)) {
                return cls2;
            }
            b0.n(6, 47, null);
            return null;
        } catch (Exception e) {
            b0.n(6, 8, e);
            return null;
        }
    }
}

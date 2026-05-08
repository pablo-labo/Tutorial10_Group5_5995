package com.google.android.recaptcha.internal;

import defpackage.b0;
import defpackage.ut0;
import defpackage.z92;
import defpackage.zr4;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlx {
    private List zza = zr4.a;

    public final long zza(long[] jArr) {
        Iterator it = z92.h1(this.zza, ut0.D0(jArr)).iterator();
        if (!it.hasNext()) {
            b0.u("Empty collection can't be reduced.");
            return 0L;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) it.next()).longValue() ^ ((Number) next).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = ut0.D0(jArr);
    }
}

package com.google.android.recaptcha.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class zzu implements Comparator {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        return java.lang.Integer.compare(r1, r5.zzc.length);
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ int compare(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            com.google.android.recaptcha.internal.zzv r4 = (com.google.android.recaptcha.internal.zzv) r4
            com.google.android.recaptcha.internal.zzv r5 = (com.google.android.recaptcha.internal.zzv) r5
            r3 = 0
            r0 = r3
        L6:
            byte[] r1 = r4.zzc
            int r1 = r1.length
            if (r3 >= r1) goto L2c
            byte[] r2 = r5.zzc
            int r2 = r2.length
            if (r0 >= r2) goto L2c
            byte r1 = r4.zza(r3)
            int r1 = com.google.android.recaptcha.internal.zzv.zzb(r1)
            byte r2 = r5.zza(r0)
            int r2 = com.google.android.recaptcha.internal.zzv.zzb(r2)
            int r1 = java.lang.Integer.compare(r1, r2)
            if (r1 == 0) goto L27
            return r1
        L27:
            int r3 = r3 + 1
            int r0 = r0 + 1
            goto L6
        L2c:
            byte[] r3 = r5.zzc
            int r3 = r3.length
            int r3 = java.lang.Integer.compare(r1, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzu.compare(java.lang.Object, java.lang.Object):int");
    }
}

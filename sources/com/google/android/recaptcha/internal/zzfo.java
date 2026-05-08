package com.google.android.recaptcha.internal;

import defpackage.g13;
import defpackage.j6g;
import defpackage.kc9;
import defpackage.lu2;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzfo {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object zza(com.google.android.recaptcha.internal.zzfq r4, defpackage.lu2 r5) {
        /*
            boolean r0 = r5 instanceof com.google.android.recaptcha.internal.zzfp
            if (r0 == 0) goto L13
            r0 = r5
            com.google.android.recaptcha.internal.zzfp r0 = (com.google.android.recaptcha.internal.zzfp) r0
            int r1 = r0.zzb
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzb = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzfp r0 = new com.google.android.recaptcha.internal.zzfp
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.zza
            int r1 = r0.zzb
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.r7d.b(r5)
            goto L3b
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.r7d.b(r5)
            r0.zzb = r2
            java.lang.String r5 = "_GRECAPTCHA_KC"
            java.lang.Object r5 = r4.zza(r5, r0)
            g13 r4 = defpackage.g13.a
            if (r5 == r4) goto L43
        L3b:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L42
            java.lang.String r4 = ""
            return r4
        L42:
            return r5
        L43:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzfo.zza(com.google.android.recaptcha.internal.zzfq, lu2):java.lang.Object");
    }

    public static Object zzb(zzfq zzfqVar, String str, lu2 lu2Var) {
        Object objZzb = zzfqVar.zzb(kc9.W(new Pair("_GRECAPTCHA_KC", str)), lu2Var);
        return objZzb == g13.a ? objZzb : j6g.a;
    }
}

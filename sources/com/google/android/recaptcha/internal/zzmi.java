package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzmi extends c1f implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzmu zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmi(zzmu zzmuVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzc = zzmuVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzmi(this.zzc, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzmi) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r7 == r5) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[PHI: r7
  0x0055: PHI (r7v14 java.lang.Object) = (r7v11 java.lang.Object), (r7v0 java.lang.Object) binds: [B:16:0x0053, B:7:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.zzb
            java.lang.String r1 = "RN"
            r2 = 3
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r0 == 0) goto L21
            if (r0 == r4) goto L1d
            if (r0 == r3) goto L15
            defpackage.r7d.b(r7)
            if (r0 == r2) goto L55
            goto L6a
        L15:
            java.lang.Object r0 = r6.zza
            com.google.android.recaptcha.internal.zzmu r0 = (com.google.android.recaptcha.internal.zzmu) r0
            defpackage.r7d.b(r7)
            goto L3f
        L1d:
            defpackage.r7d.b(r7)
            goto L2e
        L21:
            defpackage.r7d.b(r7)
            com.google.android.recaptcha.internal.zzmu r7 = r6.zzc
            r6.zzb = r4
            java.lang.Object r7 = r7.zzu(r6)
            if (r7 == r5) goto L79
        L2e:
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            r7.removeJavascriptInterface(r1)
            com.google.android.recaptcha.internal.zzmu r7 = r6.zzc
            r6.zza = r7
            r6.zzb = r3
            java.lang.Object r7 = r7.zzu(r6)
            if (r7 == r5) goto L79
        L3f:
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            android.webkit.WebSettings r7 = r7.getSettings()
            r7.setJavaScriptEnabled(r4)
            com.google.android.recaptcha.internal.zzmu r7 = r6.zzc
            r0 = 0
            r6.zza = r0
            r6.zzb = r2
            java.lang.Object r7 = r7.zzu(r6)
            if (r7 == r5) goto L79
        L55:
            com.google.android.recaptcha.internal.zzmu r0 = r6.zzc
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            com.google.android.recaptcha.internal.zzmg r2 = r0.zzq()
            r7.addJavascriptInterface(r2, r1)
            r7 = 4
            r6.zzb = r7
            java.lang.Object r7 = r0.zzu(r6)
            if (r7 != r5) goto L6a
            goto L79
        L6a:
            com.google.android.recaptcha.internal.zzmu r6 = r6.zzc
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            com.google.android.recaptcha.internal.zzmh r0 = new com.google.android.recaptcha.internal.zzmh
            r0.<init>(r6)
            r7.setWebViewClient(r0)
            j6g r6 = defpackage.j6g.a
            return r6
        L79:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzmi.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

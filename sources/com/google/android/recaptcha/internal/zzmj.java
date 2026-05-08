package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzmj extends c1f implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzmu zzc;
    final /* synthetic */ zziu zzd;
    final /* synthetic */ String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmj(zzmu zzmuVar, zziu zziuVar, String str, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzc = zzmuVar;
        this.zzd = zziuVar;
        this.zze = str;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzmj(this.zzc, this.zzd, this.zze, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzmj) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (r0.zzb((com.google.android.recaptcha.internal.zzip) r6, r5) != r4) goto L16;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.zzb
            r1 = 2
            r2 = 0
            r3 = 1
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L19
            if (r0 == r1) goto L11
            defpackage.r7d.b(r6)
            goto L55
        L11:
            java.lang.Object r0 = r5.zza
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            defpackage.r7d.b(r6)
            goto L47
        L19:
            defpackage.r7d.b(r6)
            goto L2a
        L1d:
            defpackage.r7d.b(r6)
            com.google.android.recaptcha.internal.zzmu r6 = r5.zzc
            r5.zzb = r3
            java.lang.Object r6 = r6.zzu(r5)
            if (r6 == r4) goto L58
        L2a:
            android.webkit.WebView r6 = (android.webkit.WebView) r6
            r6.clearCache(r3)
            com.google.android.recaptcha.internal.zziu r0 = r5.zzd
            com.google.android.recaptcha.internal.zzmu r6 = r5.zzc
            java.lang.String r3 = r5.zze
            r5.zza = r0
            r5.zzb = r1
            com.google.android.recaptcha.internal.zzml r1 = new com.google.android.recaptcha.internal.zzml
            r1.<init>(r6, r3, r2)
            com.google.android.recaptcha.internal.zzip r6 = new com.google.android.recaptcha.internal.zzip
            r3 = 26
            r6.<init>(r3, r1, r2)
            if (r6 == r4) goto L58
        L47:
            com.google.android.recaptcha.internal.zzip r6 = (com.google.android.recaptcha.internal.zzip) r6
            r5.zza = r2
            r1 = 3
            r5.zzb = r1
            java.lang.Object r5 = r0.zzb(r6, r5)
            if (r5 != r4) goto L55
            goto L58
        L55:
            j6g r5 = defpackage.j6g.a
            return r5
        L58:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzmj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

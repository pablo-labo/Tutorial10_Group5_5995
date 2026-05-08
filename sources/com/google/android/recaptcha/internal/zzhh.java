package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzhh extends c1f implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzif zzc;
    final /* synthetic */ zzhj zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhh(zzif zzifVar, zzhj zzhjVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzc = zzifVar;
        this.zzd = zzhjVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzhh(this.zzc, this.zzd, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhh) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r5 == r3) goto L14;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.zzb
            r1 = 0
            r2 = 1
            g13 r3 = defpackage.g13.a
            if (r0 == 0) goto L16
            if (r0 == r2) goto Le
            defpackage.r7d.b(r5)
            goto L3f
        Le:
            java.lang.Object r0 = r4.zza
            com.google.android.recaptcha.internal.zzif r0 = (com.google.android.recaptcha.internal.zzif) r0
            defpackage.r7d.b(r5)
            goto L2d
        L16:
            defpackage.r7d.b(r5)
            com.google.android.recaptcha.internal.zzif r0 = r4.zzc
            com.google.android.recaptcha.internal.zzhj r5 = r4.zzd
            r4.zza = r0
            r4.zzb = r2
            com.google.android.recaptcha.internal.zzhc r2 = new com.google.android.recaptcha.internal.zzhc
            r2.<init>(r5, r1)
            com.google.android.recaptcha.internal.zziq r5 = new com.google.android.recaptcha.internal.zziq
            r5.<init>(r2)
            if (r5 == r3) goto L42
        L2d:
            com.google.android.recaptcha.internal.zziq r5 = (com.google.android.recaptcha.internal.zziq) r5
            r4.zza = r1
            r1 = 2
            r4.zzb = r1
            com.google.android.recaptcha.internal.zziu r0 = r0.zza()
            java.lang.Object r5 = r5.zza(r0, r4)
            if (r5 != r3) goto L3f
            goto L42
        L3f:
            com.google.android.recaptcha.internal.zzalo r5 = (com.google.android.recaptcha.internal.zzalo) r5
            return r5
        L42:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzhh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

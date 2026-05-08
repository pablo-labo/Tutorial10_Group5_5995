package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.j6g;
import defpackage.lu2;
import java.util.Optional;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzdh extends c1f implements Function2 {
    final /* synthetic */ Long zza;
    final /* synthetic */ zzdn zzb;
    final /* synthetic */ Optional zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(Long l, zzdn zzdnVar, Optional optional, lu2 lu2Var) {
        super(2, lu2Var);
        this.zza = l;
        this.zzb = zzdnVar;
        this.zzc = optional;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzdh(this.zza, this.zzb, this.zzc, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdh) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:3:0x0003, B:5:0x0008, B:8:0x0017, B:10:0x001d, B:14:0x0027), top: B:20:0x0003 }] */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            defpackage.r7d.b(r6)
            java.lang.Long r6 = r5.zza     // Catch: java.lang.Exception -> L2e
            r0 = 0
            if (r6 == 0) goto L1d
            com.google.android.recaptcha.internal.zzdn r1 = r5.zzb     // Catch: java.lang.Exception -> L2e
            java.util.Optional r2 = r5.zzc     // Catch: java.lang.Exception -> L2e
            long r3 = r6.longValue()     // Catch: java.lang.Exception -> L2e
            com.google.android.recaptcha.internal.zzd r6 = com.google.android.recaptcha.internal.zzdn.zzm(r1)     // Catch: java.lang.Exception -> L2e
            if (r6 != 0) goto L17
            r6 = r0
        L17:
            java.lang.Object r6 = r6.zzb(r3, r2)     // Catch: java.lang.Exception -> L2e
            if (r6 != 0) goto L34
        L1d:
            com.google.android.recaptcha.internal.zzdn r6 = r5.zzb     // Catch: java.lang.Exception -> L2e
            com.google.android.recaptcha.internal.zzd r6 = com.google.android.recaptcha.internal.zzdn.zzm(r6)     // Catch: java.lang.Exception -> L2e
            if (r6 != 0) goto L26
            goto L27
        L26:
            r0 = r6
        L27:
            java.util.Optional r5 = r5.zzc     // Catch: java.lang.Exception -> L2e
            java.lang.Object r6 = r0.zza(r5)     // Catch: java.lang.Exception -> L2e
            goto L34
        L2e:
            r5 = move-exception
            o7d$a r6 = new o7d$a
            r6.<init>(r5)
        L34:
            o7d r5 = new o7d
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzgz extends c1f implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzhj zzd;
    final /* synthetic */ zzif zze;
    final /* synthetic */ zzamf zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgz(long j, zzhj zzhjVar, zzif zzifVar, zzamf zzamfVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzc = j;
        this.zzd = zzhjVar;
        this.zze = zzifVar;
        this.zzf = zzamfVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzgz(this.zzc, this.zzd, this.zze, this.zzf, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgz) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws com.google.android.recaptcha.internal.zzeg {
        /*
            r12 = this;
            int r0 = r12.zzb
            if (r0 == 0) goto L10
            java.lang.Object r0 = r12.zza
            r1 = r0
            luc r1 = (defpackage.luc) r1
            defpackage.r7d.b(r13)     // Catch: java.lang.Exception -> Le
            r0 = r13
            goto L3f
        Le:
            r0 = move-exception
            goto L48
        L10:
            defpackage.r7d.b(r13)
            luc r6 = new luc
            r6.<init>()
            long r0 = r12.zzc     // Catch: java.lang.Exception -> L45
            com.google.android.recaptcha.internal.zzgy r2 = new com.google.android.recaptcha.internal.zzgy     // Catch: java.lang.Exception -> L45
            com.google.android.recaptcha.internal.zzif r3 = r12.zze     // Catch: java.lang.Exception -> L45
            com.google.android.recaptcha.internal.zzhj r4 = r12.zzd     // Catch: java.lang.Exception -> L45
            com.google.android.recaptcha.internal.zzamf r5 = r12.zzf     // Catch: java.lang.Exception -> L45
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L45
            r11 = r6
            r12.zza = r11     // Catch: java.lang.Exception -> L43
            r3 = 1
            r12.zzb = r3     // Catch: java.lang.Exception -> L43
            r5 = 1000(0x3e8, double:4.94E-321)
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            r9 = r2
            r2 = 20
            r3 = 100
            r10 = r12
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzeq.zzd(r0, r2, r3, r5, r7, r9, r10)     // Catch: java.lang.Exception -> L43
            g13 r1 = defpackage.g13.a
            if (r0 == r1) goto L42
            r1 = r11
        L3f:
            com.google.android.recaptcha.internal.zzamh r0 = (com.google.android.recaptcha.internal.zzamh) r0     // Catch: java.lang.Exception -> Le
            return r0
        L42:
            return r1
        L43:
            r0 = move-exception
            goto L47
        L45:
            r0 = move-exception
            r11 = r6
        L47:
            r1 = r11
        L48:
            T r1 = r1.element
            com.google.android.recaptcha.internal.zzeg r1 = (com.google.android.recaptcha.internal.zzeg) r1
            if (r1 != 0) goto L55
            com.google.android.recaptcha.internal.zzhj r1 = r12.zzd
            com.google.android.recaptcha.internal.zzeg r0 = com.google.android.recaptcha.internal.zzhj.zzd(r1, r0)
            throw r0
        L55:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

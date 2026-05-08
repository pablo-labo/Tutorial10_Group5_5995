package com.google.android.recaptcha.internal;

import defpackage.ewa;
import defpackage.lu2;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeq {
    public static final zzeq zza = new zzeq();

    private zzeq() {
    }

    public static final Object zzd(long j, int i, long j2, long j3, double d, Function1 function1, lu2 lu2Var) {
        return ewa.O(j, new zzep(20, 100L, 1000L, 2.0d, function1, null), lu2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        if (defpackage.ls3.b(r3, r1) != r7) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00bc -> B:18:0x0049). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zza(int r18, long r19, long r21, double r23, kotlin.jvm.functions.Function1 r25, defpackage.lu2 r26) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzeq.zza(int, long, long, double, kotlin.jvm.functions.Function1, lu2):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        if (defpackage.ls3.b(r6, r1) != r5) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00aa -> B:13:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzb(kotlin.jvm.functions.Function1 r17, long r18, long r20, double r22, kotlin.jvm.functions.Function1 r24, defpackage.lu2 r25) throws java.lang.Exception {
        /*
            r16 = this;
            r0 = r25
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzeo
            if (r1 == 0) goto L15
            r1 = r0
            com.google.android.recaptcha.internal.zzeo r1 = (com.google.android.recaptcha.internal.zzeo) r1
            int r2 = r1.zzh
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.zzh = r2
            goto L1c
        L15:
            com.google.android.recaptcha.internal.zzeo r1 = new com.google.android.recaptcha.internal.zzeo
            r2 = r16
            r1.<init>(r2, r0)
        L1c:
            java.lang.Object r0 = r1.zzf
            int r2 = r1.zzh
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r2 == 0) goto L5d
            if (r2 == r4) goto L49
            if (r2 != r3) goto L42
            long r6 = r1.zzd
            double r8 = r1.zze
            long r10 = r1.zzc
            java.lang.Object r2 = r1.zzb
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            java.lang.Object r12 = r1.zza
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            defpackage.r7d.b(r0)
        L3b:
            r14 = r12
            r12 = r1
            r1 = r14
            r14 = r10
            r10 = r8
            r8 = r14
            goto L6b
        L42:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r0)
            r0 = 0
            return r0
        L49:
            long r6 = r1.zzd
            double r8 = r1.zze
            long r10 = r1.zzc
            java.lang.Object r2 = r1.zzb
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            java.lang.Object r12 = r1.zza
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            defpackage.r7d.b(r0)     // Catch: java.lang.Exception -> L5b
            return r0
        L5b:
            r0 = move-exception
            goto L86
        L5d:
            defpackage.r7d.b(r0)
            r6 = r18
            r8 = r20
            r10 = r22
            r2 = r24
            r12 = r1
            r1 = r17
        L6b:
            r12.zza = r1     // Catch: java.lang.Exception -> L7f
            r12.zzb = r2     // Catch: java.lang.Exception -> L7f
            r12.zzc = r8     // Catch: java.lang.Exception -> L7f
            r12.zze = r10     // Catch: java.lang.Exception -> L7f
            r12.zzd = r6     // Catch: java.lang.Exception -> L7f
            r12.zzh = r4     // Catch: java.lang.Exception -> L7f
            java.lang.Object r0 = r2.invoke(r12)     // Catch: java.lang.Exception -> L7f
            if (r0 != r5) goto L7e
            goto Lad
        L7e:
            return r0
        L7f:
            r0 = move-exception
            r14 = r12
            r12 = r1
            r1 = r14
            r14 = r10
            r10 = r8
            r8 = r14
        L86:
            java.lang.Object r13 = r12.invoke(r0)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Lae
            double r6 = (double) r6
            double r6 = r6 * r8
            long r6 = (long) r6
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 <= 0) goto L9a
            r6 = r10
        L9a:
            r1.zza = r12
            r1.zzb = r2
            r1.zzc = r10
            r1.zze = r8
            r1.zzd = r6
            r1.zzh = r3
            java.lang.Object r0 = defpackage.ls3.b(r6, r1)
            if (r0 == r5) goto Lad
            goto L3b
        Lad:
            return r5
        Lae:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzeq.zzb(kotlin.jvm.functions.Function1, long, long, double, kotlin.jvm.functions.Function1, lu2):java.lang.Object");
    }
}

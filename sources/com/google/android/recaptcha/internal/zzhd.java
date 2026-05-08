package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzhd extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzhj zzb;
    final /* synthetic */ zzalo zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhd(zzhj zzhjVar, zzalo zzaloVar, long j, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzhjVar;
        this.zzc = zzaloVar;
        this.zzd = j;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzhd zzhdVar = new zzhd(this.zzb, this.zzc, this.zzd, lu2Var);
        zzhdVar.zze = obj;
        return zzhdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhd) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (((com.google.android.recaptcha.internal.zzip) r9).zza(r0, r8) == r4) goto L30;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws com.google.android.recaptcha.internal.zzeg {
        /*
            r8 = this;
            int r0 = r8.zza
            r1 = 2
            r2 = 1
            r3 = 0
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L24
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L13
            defpackage.r7d.b(r9)     // Catch: com.google.android.recaptcha.internal.zzeg -> L11
            goto L54
        L11:
            r9 = move-exception
            goto L57
        L13:
            java.lang.Object r8 = r8.zze
            com.google.android.recaptcha.internal.zzeg r8 = (com.google.android.recaptcha.internal.zzeg) r8
            defpackage.r7d.b(r9)
            goto Lae
        L1c:
            java.lang.Object r0 = r8.zze
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            defpackage.r7d.b(r9)     // Catch: com.google.android.recaptcha.internal.zzeg -> L11
            goto L47
        L24:
            defpackage.r7d.b(r9)
            java.lang.Object r9 = r8.zze
            r0 = r9
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            com.google.android.recaptcha.internal.zzhj r9 = r8.zzb
            com.google.android.recaptcha.internal.zzalo r5 = r8.zzc
            java.lang.String r6 = r5.zzl()
            com.google.android.recaptcha.internal.zzhj.zzn(r9, r6)
            com.google.android.recaptcha.internal.zzbf r9 = com.google.android.recaptcha.internal.zzhj.zzb(r9)     // Catch: com.google.android.recaptcha.internal.zzeg -> L11
            long r6 = r8.zzd     // Catch: com.google.android.recaptcha.internal.zzeg -> L11
            r8.zze = r0     // Catch: com.google.android.recaptcha.internal.zzeg -> L11
            r8.zza = r2     // Catch: com.google.android.recaptcha.internal.zzeg -> L11
            java.lang.Object r9 = r9.zzc(r6, r5, r8)     // Catch: com.google.android.recaptcha.internal.zzeg -> L11
            if (r9 == r4) goto Lac
        L47:
            com.google.android.recaptcha.internal.zzip r9 = (com.google.android.recaptcha.internal.zzip) r9     // Catch: com.google.android.recaptcha.internal.zzeg -> L11
            r8.zze = r3     // Catch: com.google.android.recaptcha.internal.zzeg -> L11
            r8.zza = r1     // Catch: com.google.android.recaptcha.internal.zzeg -> L11
            java.lang.Object r8 = r9.zza(r0, r8)     // Catch: com.google.android.recaptcha.internal.zzeg -> L11
            if (r8 != r4) goto L54
            goto Lac
        L54:
            j6g r8 = defpackage.j6g.a
            return r8
        L57:
            com.google.android.recaptcha.internal.zzhj r0 = r8.zzb
            com.google.android.recaptcha.internal.zzfa r1 = com.google.android.recaptcha.internal.zzhj.zzp(r0)
            e13 r1 = r1.zze()
            v03 r1 = r1.getCoroutineContext()
            ex7$a r2 = ex7.a.a
            v03$a r1 = r1.h1(r2)
            ex7 r1 = (defpackage.ex7) r1
            if (r1 == 0) goto L87
            r6e r1 = r1.a()
            java.util.Iterator r1 = r1.iterator()
        L77:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L87
            java.lang.Object r2 = r1.next()
            ex7 r2 = (defpackage.ex7) r2
            r2.h(r3)
            goto L77
        L87:
            com.google.android.recaptcha.internal.zzfa r0 = com.google.android.recaptcha.internal.zzhj.zzp(r0)
            e13 r0 = r0.zze()
            v03 r0 = r0.getCoroutineContext()
            ex7 r0 = defpackage.u63.I(r0)
            r6e r0 = r0.a()
            java.util.List r0 = defpackage.a7e.W(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r8.zze = r9
            r1 = 3
            r8.zza = r1
            java.lang.Object r8 = defpackage.ka2.z(r0, r8)
            if (r8 != r4) goto Lad
        Lac:
            return r4
        Lad:
            r8 = r9
        Lae:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzhd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

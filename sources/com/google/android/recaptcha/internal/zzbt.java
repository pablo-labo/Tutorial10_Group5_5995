package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.j6g;
import defpackage.lu2;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzbt extends c1f implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zziu zzc;
    final /* synthetic */ zzcg zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ List zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbt(zziu zziuVar, zzcg zzcgVar, String str, List list, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzc = zziuVar;
        this.zzd = zzcgVar;
        this.zze = str;
        this.zzf = list;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzbt(this.zzc, this.zzd, this.zze, this.zzf, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbt) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r5 == r2) goto L14;
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
            r1 = 1
            g13 r2 = defpackage.g13.a
            if (r0 == 0) goto L15
            if (r0 == r1) goto Ld
            defpackage.r7d.b(r5)
            goto L37
        Ld:
            java.lang.Object r0 = r4.zza
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            defpackage.r7d.b(r5)
            goto L28
        L15:
            defpackage.r7d.b(r5)
            com.google.android.recaptcha.internal.zziu r0 = r4.zzc
            com.google.android.recaptcha.internal.zzcg r5 = r4.zzd
            java.lang.String r3 = r4.zze
            r4.zza = r0
            r4.zzb = r1
            java.lang.Object r5 = r5.zzc(r3, r4)
            if (r5 == r2) goto L41
        L28:
            com.google.android.recaptcha.internal.zziq r5 = (com.google.android.recaptcha.internal.zziq) r5
            r1 = 0
            r4.zza = r1
            r1 = 2
            r4.zzb = r1
            java.lang.Object r5 = r5.zza(r0, r4)
            if (r5 != r2) goto L37
            goto L41
        L37:
            java.util.List r4 = r4.zzf
            com.google.android.recaptcha.internal.zzci r5 = (com.google.android.recaptcha.internal.zzci) r5
            r4.add(r5)
            j6g r4 = defpackage.j6g.a
            return r4
        L41:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbt.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

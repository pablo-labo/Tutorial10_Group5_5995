package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzbw extends c1f implements Function2 {
    Object zza;
    Object zzb;
    Object zzc;
    int zzd;
    final /* synthetic */ zzalo zze;
    final /* synthetic */ zzby zzf;
    final /* synthetic */ zziu zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbw(zzalo zzaloVar, zzby zzbyVar, zziu zziuVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zze = zzaloVar;
        this.zzf = zzbyVar;
        this.zzg = zziuVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzbw(this.zze, this.zzf, this.zzg, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbw) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b4 -> B:16:0x0082). Please report as a decompilation issue!!! */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.zzd
            r1 = 1
            g13 r2 = defpackage.g13.a
            if (r0 == 0) goto L26
            if (r0 == r1) goto L15
            java.lang.Object r0 = r12.zzb
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r3 = r12.zza
            com.google.android.recaptcha.internal.zzalq r3 = (com.google.android.recaptcha.internal.zzalq) r3
            defpackage.r7d.b(r13)
            goto L82
        L15:
            java.lang.Object r0 = r12.zzc
            com.google.android.recaptcha.internal.zziu r0 = (com.google.android.recaptcha.internal.zziu) r0
            java.lang.Object r3 = r12.zzb
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r12.zza
            com.google.android.recaptcha.internal.zzalq r4 = (com.google.android.recaptcha.internal.zzalq) r4
            defpackage.r7d.b(r13)
            goto La2
        L26:
            defpackage.r7d.b(r13)
            com.google.android.recaptcha.internal.zzalo r13 = r12.zze
            boolean r0 = r13.zzq()
            if (r0 != 0) goto L4a
            com.google.android.recaptcha.internal.zzeg r3 = new com.google.android.recaptcha.internal.zzeg
            com.google.android.recaptcha.internal.zzee r4 = com.google.android.recaptcha.internal.zzee.zzb
            com.google.android.recaptcha.internal.zzed r5 = com.google.android.recaptcha.internal.zzed.zzab
            r8 = 12
            r9 = 0
            r6 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            o7d$a r12 = new o7d$a
            r12.<init>(r3)
            o7d r13 = new o7d
            r13.<init>(r12)
            return r13
        L4a:
            com.google.android.recaptcha.internal.zzalq r3 = r13.zze()
            com.google.android.recaptcha.internal.zzaef r13 = r3.zzc()
            boolean r13 = r13.zzo()
            if (r13 == 0) goto L71
            com.google.android.recaptcha.internal.zzeg r4 = new com.google.android.recaptcha.internal.zzeg
            com.google.android.recaptcha.internal.zzee r5 = com.google.android.recaptcha.internal.zzee.zzb
            com.google.android.recaptcha.internal.zzed r6 = com.google.android.recaptcha.internal.zzed.zzab
            r9 = 12
            r10 = 0
            r7 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            o7d$a r12 = new o7d$a
            r12.<init>(r4)
            o7d r13 = new o7d
            r13.<init>(r12)
            return r13
        L71:
            com.google.android.recaptcha.internal.zzby r13 = r12.zzf
            com.google.android.recaptcha.internal.zzaef r0 = r3.zzc()
            com.google.android.recaptcha.internal.zzby.zzp(r13, r0)
            java.util.List r13 = com.google.android.recaptcha.internal.zzby.zzn(r13)
            java.util.Iterator r0 = r13.iterator()
        L82:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto Lb8
            java.lang.Object r13 = r0.next()
            com.google.android.recaptcha.internal.zzcg r13 = (com.google.android.recaptcha.internal.zzcg) r13
            com.google.android.recaptcha.internal.zziu r4 = r12.zzg
            r12.zza = r3
            r12.zzb = r0
            r12.zzc = r4
            r12.zzd = r1
            java.lang.Object r13 = r13.zzd(r3, r12)
            if (r13 == r2) goto Lb7
            r11 = r3
            r3 = r0
            r0 = r4
            r4 = r11
        La2:
            com.google.android.recaptcha.internal.zzip r13 = (com.google.android.recaptcha.internal.zzip) r13
            r12.zza = r4
            r12.zzb = r3
            r5 = 0
            r12.zzc = r5
            r5 = 2
            r12.zzd = r5
            java.lang.Object r13 = r0.zzb(r13, r12)
            if (r13 == r2) goto Lb7
            r0 = r3
            r3 = r4
            goto L82
        Lb7:
            return r2
        Lb8:
            j6g r12 = defpackage.j6g.a
            o7d r13 = new o7d
            r13.<init>(r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

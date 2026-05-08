package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzgj extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzgk zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgj(zzgk zzgkVar, long j, RecaptchaAction recaptchaAction, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzgkVar;
        this.zzc = j;
        this.zzd = recaptchaAction;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzgj zzgjVar = new zzgj(this.zzb, this.zzc, this.zzd, lu2Var);
        zzgjVar.zze = obj;
        return zzgjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgj) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096 A[Catch: Exception -> 0x00a7, zzeg -> 0x00ba, TryCatch #2 {zzeg -> 0x00ba, Exception -> 0x00a7, blocks: (B:5:0x000c, B:24:0x008d, B:27:0x0096, B:28:0x00a4, B:8:0x0017, B:21:0x007b, B:11:0x0026, B:13:0x0038, B:17:0x004f, B:19:0x0061, B:30:0x00a6), top: B:36:0x0008 }] */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws com.google.android.recaptcha.internal.zzeg {
        /*
            r18 = this;
            r6 = r18
            int r0 = r6.zza
            r7 = 0
            r1 = 1
            g13 r8 = defpackage.g13.a
            if (r0 == 0) goto L1e
            if (r0 == r1) goto L13
            defpackage.r7d.b(r19)     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            r0 = r19
            goto L8d
        L13:
            java.lang.Object r0 = r6.zze
            com.google.android.recaptcha.internal.zzif r0 = (com.google.android.recaptcha.internal.zzif) r0
            defpackage.r7d.b(r19)     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            r9 = r0
            r0 = r19
            goto L7b
        L1e:
            defpackage.r7d.b(r19)
            java.lang.Object r0 = r6.zze
            r9 = r0
            com.google.android.recaptcha.internal.zzif r9 = (com.google.android.recaptcha.internal.zzif) r9
            long r3 = r6.zzc     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            com.google.android.recaptcha.RecaptchaAction r2 = r6.zzd     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            pxc r0 = com.google.android.recaptcha.internal.zzgc.zza()     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            java.lang.String r5 = r2.getAction()     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            boolean r0 = r0.d(r5)     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            if (r0 != 0) goto L48
            com.google.android.recaptcha.internal.zzeg r10 = new com.google.android.recaptcha.internal.zzeg     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            com.google.android.recaptcha.internal.zzee r11 = com.google.android.recaptcha.internal.zzee.zzg     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            com.google.android.recaptcha.internal.zzed r12 = com.google.android.recaptcha.internal.zzed.zzh     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            r15 = 12
            r16 = 0
            r13 = 0
            r14 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            goto L49
        L48:
            r10 = r7
        L49:
            r11 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 >= 0) goto L5f
            com.google.android.recaptcha.internal.zzeg r11 = new com.google.android.recaptcha.internal.zzeg     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            com.google.android.recaptcha.internal.zzee r12 = com.google.android.recaptcha.internal.zzee.zzb     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            com.google.android.recaptcha.internal.zzed r13 = com.google.android.recaptcha.internal.zzed.zzI     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            r16 = 12
            r17 = 0
            r14 = 0
            r15 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            r10 = r11
        L5f:
            if (r10 != 0) goto La6
            com.google.android.recaptcha.internal.zzgk r0 = r6.zzb     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            com.google.android.recaptcha.internal.zzgb r0 = r0.zza()     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            com.google.android.recaptcha.internal.zziu r5 = r9.zza()     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            java.lang.String r5 = r5.zzc()     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            r6.zze = r9     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            r6.zza = r1     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            r1 = r5
            r5 = 0
            java.lang.Object r0 = r0.zza(r1, r2, r3, r5, r6)     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            if (r0 == r8) goto La5
        L7b:
            com.google.android.recaptcha.internal.zziq r0 = (com.google.android.recaptcha.internal.zziq) r0     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            r6.zze = r7     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            r1 = 2
            r6.zza = r1     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            com.google.android.recaptcha.internal.zziu r1 = r9.zza()     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            java.lang.Object r0 = r0.zza(r1, r6)     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            if (r0 != r8) goto L8d
            goto La5
        L8d:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            int r1 = r0.length()     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            if (r1 == 0) goto L96
            return r0
        L96:
            com.google.android.recaptcha.internal.zzeg r2 = new com.google.android.recaptcha.internal.zzeg     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            com.google.android.recaptcha.internal.zzee r3 = com.google.android.recaptcha.internal.zzee.zzb     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            com.google.android.recaptcha.internal.zzed r4 = com.google.android.recaptcha.internal.zzed.zzba     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            r7 = 12
            r8 = 0
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
            throw r2     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
        La5:
            return r8
        La6:
            throw r10     // Catch: java.lang.Exception -> La7 com.google.android.recaptcha.internal.zzeg -> Lba
        La7:
            r0 = move-exception
            com.google.android.recaptcha.internal.zzeg r1 = new com.google.android.recaptcha.internal.zzeg
            com.google.android.recaptcha.internal.zzee r2 = com.google.android.recaptcha.internal.zzee.zzb
            com.google.android.recaptcha.internal.zzed r3 = com.google.android.recaptcha.internal.zzed.zzX
            java.lang.String r4 = r0.getMessage()
            r6 = 8
            r7 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            throw r1
        Lba:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

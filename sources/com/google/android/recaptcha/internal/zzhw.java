package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzhw extends c1f implements Function2 {
    Object zza;
    double zzb;
    int zzc;
    final /* synthetic */ zzhx zzd;
    final /* synthetic */ long zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhw(zzhx zzhxVar, long j, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzd = zzhxVar;
        this.zze = j;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzhw zzhwVar = new zzhw(this.zzd, this.zze, lu2Var);
        zzhwVar.zzf = obj;
        return zzhwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhw) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4 A[Catch: zzeg -> 0x0015, PHI: r0 r13
  0x00b4: PHI (r0v7 com.google.android.recaptcha.internal.zziu) = (r0v6 com.google.android.recaptcha.internal.zziu), (r0v14 com.google.android.recaptcha.internal.zziu) binds: [B:33:0x00b2, B:12:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x00b4: PHI (r13v12 java.lang.Object) = (r13v11 java.lang.Object), (r13v0 java.lang.Object) binds: [B:33:0x00b2, B:12:0x001c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {zzeg -> 0x0015, blocks: (B:7:0x0010, B:37:0x00c2, B:12:0x001c, B:34:0x00b4, B:15:0x0027, B:32:0x009e, B:18:0x0036, B:29:0x008c, B:26:0x0069), top: B:45:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws com.google.android.recaptcha.internal.zzeg {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzhw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

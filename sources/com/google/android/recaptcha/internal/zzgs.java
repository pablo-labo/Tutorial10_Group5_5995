package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzgs extends c1f implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzgu zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ zzfv zzf;
    final /* synthetic */ zzir zzg;
    private /* synthetic */ Object zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgs(zzgu zzguVar, long j, String str, zzfv zzfvVar, zzir zzirVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzc = zzguVar;
        this.zzd = j;
        this.zze = str;
        this.zzf = zzfvVar;
        this.zzg = zzirVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzgs zzgsVar = new zzgs(this.zzc, this.zzd, this.zze, this.zzf, this.zzg, lu2Var);
        zzgsVar.zzh = obj;
        return zzgsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgs) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws com.google.android.recaptcha.internal.zzeg {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgs.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

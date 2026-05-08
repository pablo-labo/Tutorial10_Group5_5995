package com.google.android.recaptcha.internal;

import android.os.Build;
import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import defpackage.u63;
import defpackage.ut0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzbn extends c1f implements Function2 {
    final /* synthetic */ zzbo zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbn(zzbo zzboVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zza = zzboVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzbn(this.zza, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbn) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        r7d.b(obj);
        zzamv zzamvVarZza = zzamy.zza();
        zzbo zzboVar = this.zza;
        zzamx zzamxVarZzb = zzbo.zzb(zzboVar, Build.MANUFACTURER);
        zzamx zzamxVarZzb2 = zzbo.zzb(zzboVar, Build.MODEL);
        zzamx zzamxVarZzb3 = zzbo.zzb(zzboVar, Build.DEVICE);
        zzamx zzamxVarZzb4 = zzbo.zzb(zzboVar, Build.HARDWARE);
        zzamx zzamxVarZzb5 = zzbo.zzb(zzboVar, Build.FINGERPRINT);
        zzamx zzamxVarZzb6 = zzbo.zzb(zzboVar, Build.PRODUCT);
        zzamx zzamxVarZzb7 = zzbo.zzb(zzboVar, Build.BOARD);
        zzamx zzamxVarZzb8 = zzbo.zzb(zzboVar, Build.BRAND);
        zzamx zzamxVarZzb9 = zzbo.zzb(zzboVar, ut0.t0(Build.SUPPORTED_ABIS, ",", "[", "]", null, 56));
        long j = Build.TIME;
        zzamw zzamwVarZza = zzamx.zza();
        zzamwVarZza.zzh(j);
        zzamvVarZza.zza(u63.a0(zzamxVarZzb, zzamxVarZzb2, zzamxVarZzb3, zzamxVarZzb4, zzamxVarZzb5, zzamxVarZzb6, zzamxVarZzb7, zzamxVarZzb8, zzamxVarZzb9, (zzamx) zzamwVarZza.zzq(), zzbo.zzb(zzboVar, Build.ID), zzbo.zzb(zzboVar, Build.BOOTLOADER), zzbo.zzb(zzboVar, Build.DISPLAY), zzbo.zzb(zzboVar, Build.TYPE), zzbo.zzb(zzboVar, Build.TAGS)));
        return zzch.zzb(zzboVar, (zzamy) zzamvVarZza.zzq());
    }
}

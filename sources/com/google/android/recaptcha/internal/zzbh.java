package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.common.Feature;
import com.google.android.gms.recaptchabase.InitRequest;
import com.google.android.gms.tasks.Task;
import defpackage.c1f;
import defpackage.huh;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.ma6;
import defpackage.o7d;
import defpackage.oq2;
import defpackage.paf;
import defpackage.r7d;
import defpackage.vf0;
import defpackage.wfi;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzbh extends c1f implements Function2 {
    final /* synthetic */ zzbi zza;
    final /* synthetic */ zzalo zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbh(zzbi zzbiVar, zzalo zzaloVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zza = zzbiVar;
        this.zzb = zzaloVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzbh(this.zza, this.zzb, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbh) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        r7d.b(obj);
        zzbi zzbiVar = this.zza;
        if (!zzbiVar.zzb.zza(zzbiVar.zza)) {
            return new o7d(new o7d.a(new zzeg(zzee.zzb, zzed.zzar, null, null, 12, null)));
        }
        zzalo zzaloVar = this.zzb;
        if (!zzaloVar.zzn() || zzaloVar.zzb().zza().zzo()) {
            return new o7d(new o7d.a(new zzeg(zzee.zzb, zzed.zzaC, null, null, 12, null)));
        }
        zzbiVar.zzc = zzaloVar.zzb().zza().zzn();
        InitRequest initRequest = new InitRequest();
        Application application = zzbiVar.zza;
        application.getClass();
        wfi wfiVar = new wfi(application, null, wfi.k, vf0.d.g, ma6.a.c);
        paf.a aVarA = paf.a();
        aVarA.c = new Feature[]{huh.b};
        aVarA.a = new oq2(initRequest, 6);
        aVarA.d = 34001;
        Task taskE = wfiVar.e(0, aVarA.a());
        taskE.getClass();
        zzbiVar.zzd = zzfm.zza(taskE);
        return new o7d(j6g.a);
    }
}

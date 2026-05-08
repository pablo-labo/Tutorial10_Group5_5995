package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import defpackage.iy8;
import defpackage.oa6;
import defpackage.u63;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfu {
    public static final zzfu zza = new zzfu();

    private zzfu() {
    }

    public static final zzhy zzb(Application application, zzft zzftVar, WebView webView) {
        zzfa zzfaVar = new zzfa();
        zzjj zzjjVar = new zzjj(true);
        zziw zziwVar = new zziw(new zzjk(zzjjVar));
        zzji zzjiVar = new zzji(zziwVar);
        zzix zzixVar = new zzix(zzjjVar, zziwVar);
        zzer zzerVar = new zzer("https://www.recaptcha.net/recaptcha/api3");
        zzil zzilVar = new zzil(new zzim(zzerVar));
        zzjf zzjfVar = new zzjf("https://www.gstatic.com/recaptcha/verify_key/orcas/prod/android/verify_key.txt");
        zzik zzikVar = new zzik(application, zzilVar, zzfaVar);
        zzeh zzehVar = new zzeh();
        zzia zziaVar = new zzia(zzikVar, new zzhz(application, zzehVar), new zzec(null, 1, null));
        zzet zzetVar = new zzet();
        zzjt zzjtVar = new zzjt();
        zzka zzkaVar = new zzka(zzjtVar);
        zzfq zzfqVar = new zzfq(application);
        zzfr zzfrVar = new zzfr(application, new zzfs(application));
        zzdw zzdwVar = new zzdw(zzjfVar, zzfrVar, zzfaVar);
        StandardIntegrityManager standardIntegrityManagerCreateStandard = IntegrityManagerFactory.createStandard(application);
        zzdo zzdoVar = new zzdo(new zzg());
        iy8 iy8VarS = u63.s();
        iy8VarS.add(zzbs.zza(application, zzfaVar, zzfqVar, application.getContentResolver(), standardIntegrityManagerCreateStandard, zzdoVar));
        iy8VarS.add(new zzmu(application, new zzje(zzfrVar, new zziy()), new zzmx(), new zzjj(true), zzerVar, zzikVar, new zzke(zzkaVar), zzfaVar));
        iy8VarS.add(new zzdn(application, zzfaVar, new zzdy(), zzdwVar, new zzdc(), zzdoVar));
        oa6 oa6Var = oa6.b;
        iy8VarS.add(new zzbi(application, new zzes(oa6Var), null));
        return new zzhy(application, zzixVar, zzerVar, zzfqVar, zzjiVar, new zzes(oa6Var), zzfaVar, new zzbf(iy8VarS.l()), new zzem(), zziaVar, zzetVar, zzehVar, zzjtVar, zzdwVar);
    }
}

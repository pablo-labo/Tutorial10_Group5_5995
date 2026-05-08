package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.u63;
import defpackage.xd2;
import defpackage.z92;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmu extends zzax {
    public xd2 zza;
    public zzjn zzb;
    private final Application zzc;
    private final zzmx zzd;
    private final zzjj zze;
    private final zzer zzf;
    private final zzig zzg;
    private final zzke zzh;
    private zzalo zzk;
    private final zzje zzo;
    private final zzfa zzp;
    private final Map zzi = zzmv.zza();
    private final Map zzj = new LinkedHashMap();
    private final zzfe zzl = new zzfe(zzmy.zza);
    private final zznb zzm = zznb.zzc();
    private final zzmg zzn = new zzmg(this);

    public zzmu(Application application, zzje zzjeVar, zzmx zzmxVar, zzjj zzjjVar, zzer zzerVar, zzig zzigVar, zzke zzkeVar, zzfa zzfaVar) {
        this.zzc = application;
        this.zzo = zzjeVar;
        this.zzd = zzmxVar;
        this.zze = zzjjVar;
        this.zzf = zzerVar;
        this.zzg = zzigVar;
        this.zzh = zzkeVar;
        this.zzp = zzfaVar;
    }

    public static final /* synthetic */ Object zzt(zzmu zzmuVar, lu2 lu2Var) {
        return new zziq(new zzmq(zzmuVar, null));
    }

    public final zzjs zzC(zzalo zzaloVar, zzfg zzfgVar, WebView webView) {
        zzfa zzfaVar = this.zzp;
        zzjv zzjvVar = new zzjv(webView, zzfaVar.zzb());
        zzlx zzlxVar = new zzlx();
        zzlxVar.zzb(z92.A1(zzaloVar.zzm()));
        zzkd zzkdVarZza = this.zzh.zza(zzjvVar, zzfgVar, new zzem());
        zzly zzlyVar = new zzly(zzlxVar, new zzlv());
        Application application = this.zzc;
        zzkdVarZza.zzf(3, application);
        zzkdVarZza.zzf(5, zzme.class.getMethod("cs", new Object[0].getClass()));
        zzkdVarZza.zzf(6, new zzlz(application));
        zzkdVarZza.zzf(7, new zzmb());
        zzkdVarZza.zzf(8, new zzmf(application));
        zzkdVarZza.zzf(9, new zzmc(application));
        zzkdVarZza.zzf(10, new zzma(application));
        return new zzjs(zzfaVar.zze(), zzkdVarZza, zzlyVar, zzjm.zza());
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final Object zzb(String str, lu2 lu2Var) {
        zzalx zzalxVarZza = zzaly.zza();
        zzalxVarZza.zza(str);
        return zzalxVarZza.zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final Object zzc(String str, lu2 lu2Var) {
        return new zziq(new zzmn(this, str, null));
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final Object zzd(zzeg zzegVar, lu2 lu2Var) {
        return j6g.a;
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final Object zze(zzalo zzaloVar, lu2 lu2Var) {
        return new zziq(new zzmo(zzaloVar, this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final Object zzf(String str, long j, Exception exc, lu2 lu2Var) {
        exc.getMessage();
        xd2 xd2Var = (xd2) this.zzj.remove(str);
        if (xd2Var != null) {
            xd2Var.h0(exc);
        }
        return j6g.a;
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final Object zzg(Exception exc, lu2 lu2Var) {
        return ((exc instanceof TimeoutCancellationException) && this.zzn.zza() == null) ? new zzeg(zzee.zzc, zzed.zzH, null, null, 12, null) : zzay.zza(exc, new zzeg(zzee.zzb, zzed.zzV, exc.getMessage(), null, 8, null));
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final int zzk() {
        return 33;
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final int zzl() {
        return 32;
    }

    public final zzfe zzn() {
        return this.zzl;
    }

    public final zzmg zzq() {
        return this.zzn;
    }

    public final Object zzu(lu2 lu2Var) {
        return u63.q0(this.zzp.zzb().getCoroutineContext(), new zzmw(this.zzd, this.zzc, null), lu2Var);
    }

    public final Object zzv(lu2 lu2Var) throws Throwable {
        Object objQ0 = u63.q0(this.zzp.zzb().getCoroutineContext(), new zzmi(this, null), lu2Var);
        return objQ0 == g13.a ? objQ0 : j6g.a;
    }

    public final xd2 zzy() {
        xd2 xd2Var = this.zza;
        if (xd2Var != null) {
            return xd2Var;
        }
        return null;
    }
}

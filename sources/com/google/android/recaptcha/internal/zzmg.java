package com.google.android.recaptcha.internal;

import android.webkit.JavascriptInterface;
import defpackage.j6g;
import defpackage.xd2;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmg {
    final /* synthetic */ zzmu zza;
    private Long zzb;
    private final zznb zzc = zznb.zzb();

    public zzmg(zzmu zzmuVar) {
        this.zza = zzmuVar;
    }

    private final void zzb() {
        if (this.zzb == null) {
            zznb zznbVar = this.zzc;
            zznbVar.zzf();
            this.zzb = Long.valueOf(zznbVar.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzlce(String str) {
        zzb();
        zzakj zzakjVarZzh = zzakj.zzh(zzfj.zza(str));
        zzanm zzanmVarZzc = zzann.zzc();
        zzanmVarZzc.zzb(zzakjVarZzh);
        this.zza.zzg.zza((zzann) zzanmVarZzc.zzq());
    }

    @JavascriptInterface
    public final void zzlsm(String str) {
        zzb();
        zzanm zzanmVarZzc = zzann.zzc();
        zzanmVarZzc.zzc(zzaky.zzc(zzfj.zza(str)));
        this.zza.zzg.zza((zzann) zzanmVarZzc.zzq());
    }

    @JavascriptInterface
    public final void zzoid(String str) {
        zzb();
        zzani zzaniVarZzb = zzani.zzb(zzfj.zza(str));
        zzaniVarZzb.zzc().name();
        if (zzaniVarZzb.zzc() == zzanl.JS_CODE_SUCCESS) {
            zzmu zzmuVar = this.zza;
            zzmuVar.zzy().hashCode();
            if (zzmuVar.zzy().j0(j6g.a)) {
                return;
            }
            zzmuVar.zzy().hashCode();
            return;
        }
        zzaniVarZzb.zzc().name();
        int i = zzeg.zza;
        zzeg zzegVarZza = zzef.zza(zzaniVarZzb.zzc());
        zzmu zzmuVar2 = this.zza;
        zzmuVar2.zzy().hashCode();
        zzmuVar2.zzy().h0(zzegVarZza);
    }

    @JavascriptInterface
    public final void zzrp(String str) {
        zzb();
        zzjn zzjnVar = this.zza.zzb;
        if (zzjnVar == null) {
            zzjnVar = null;
        }
        zzjnVar.zza(str);
    }

    @JavascriptInterface
    public final void zzscd(String str) {
        zzb();
        zzaly zzalyVarZzc = zzaly.zzc(zzfj.zza(str));
        zzalyVarZzc.toString();
        xd2 xd2Var = (xd2) this.zza.zzj.remove(zzalyVarZzc.zzg());
        if (xd2Var != null) {
            xd2Var.j0(zzalyVarZzc);
        }
    }
}

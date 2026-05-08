package com.google.android.recaptcha.internal;

import android.app.Application;
import android.content.ContentResolver;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import defpackage.oa6;
import defpackage.u63;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbs {
    public static final zzby zza(Application application, zzfa zzfaVar, zzfq zzfqVar, ContentResolver contentResolver, StandardIntegrityManager standardIntegrityManager, zzdo zzdoVar) {
        return new zzby(u63.a0(new zzck(), new zzbr(zzfqVar), new zzbk(contentResolver), new zzbo(), new zzco(application, zzfaVar, standardIntegrityManager, new zzda(zzfaVar, standardIntegrityManager, 28800000L), new zzes(oa6.b)), new zzbm(application, zzdoVar)));
    }
}

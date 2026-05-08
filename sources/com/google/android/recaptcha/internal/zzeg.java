package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import defpackage.lc9;
import defpackage.wl7;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeg extends Exception {
    public static final /* synthetic */ int zza = 0;
    private static final Map zzb;
    private final zzee zzc;
    private final zzed zzd;
    private final String zze;
    private final Exception zzf;
    private final Map zzg;

    static {
        Pair pair = new Pair(zzanl.JS_NETWORK_ERROR, new zzeg(zzee.zzc, zzed.zzd, null, null, 12, null));
        zzanl zzanlVar = zzanl.JS_INTERNAL_ERROR;
        zzee zzeeVar = zzee.zzb;
        int i = 12;
        DefaultConstructorMarker defaultConstructorMarker = null;
        zzb = lc9.a0(pair, new Pair(zzanlVar, new zzeg(zzeeVar, zzed.zzc, null, 0 == true ? 1 : 0, 12, null)), new Pair(zzanl.JS_INVALID_SITE_KEY, new zzeg(zzee.zzd, zzed.zze, null, 0 == true ? 1 : 0, i, defaultConstructorMarker)), new Pair(zzanl.JS_INVALID_SITE_KEY_TYPE, new zzeg(zzee.zze, zzed.zzf, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, defaultConstructorMarker)), new Pair(zzanl.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzeg(zzee.zzf, zzed.zzg, null, null, 12, null)), new Pair(zzanl.JS_INVALID_ACTION, new zzeg(zzee.zzg, zzed.zzh, null, 0 == true ? 1 : 0, 12, null)), new Pair(zzanl.JS_PROGRAM_ERROR, new zzeg(zzeeVar, zzed.zzj, null, 0 == true ? 1 : 0, 12, null)));
    }

    public zzeg(zzee zzeeVar, zzed zzedVar, String str, Exception exc) {
        this.zzc = zzeeVar;
        this.zzd = zzedVar;
        this.zze = str;
        this.zzf = exc;
        zzee zzeeVar2 = zzee.zzc;
        RecaptchaErrorCode recaptchaErrorCode = RecaptchaErrorCode.NETWORK_ERROR;
        this.zzg = lc9.a0(new Pair(zzeeVar2, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new Pair(zzee.zzh, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new Pair(zzee.zzi, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new Pair(zzee.zzd, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, null, 2, null)), new Pair(zzee.zze, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, null, 2, null)), new Pair(zzee.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, null, 2, null)), new Pair(zzee.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, null, 2, null)), new Pair(zzee.zzb, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null)), new Pair(zzee.zzj, new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null)));
    }

    @Override // java.lang.Throwable
    public final /* synthetic */ Throwable getCause() {
        return this.zzf;
    }

    public final zzed zza() {
        return this.zzd;
    }

    public final zzee zzb() {
        return this.zzc;
    }

    public final RecaptchaException zzc() {
        zzed zzedVar = this.zzd;
        if (wl7.b(zzedVar, zzed.zzI)) {
            return new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null);
        }
        if (wl7.b(zzedVar, zzed.zzao)) {
            return new RecaptchaException(RecaptchaErrorCode.NO_NETWORK_FOUND, null, 2, null);
        }
        RecaptchaException recaptchaException = (RecaptchaException) this.zzg.get(this.zzc);
        return recaptchaException == null ? new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null) : recaptchaException;
    }

    public final String zzd() {
        return this.zze;
    }

    public /* synthetic */ zzeg(zzee zzeeVar, zzed zzedVar, String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(zzeeVar, zzedVar, (i & 4) != 0 ? null : str, null);
    }
}

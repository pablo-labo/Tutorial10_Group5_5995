package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import defpackage.e13;
import defpackage.u63;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjv {
    private final WebView zza;
    private final e13 zzb;

    public zzjv(WebView webView, e13 e13Var) {
        this.zza = webView;
        this.zzb = e13Var;
    }

    public final void zzb(String str, String... strArr) {
        u63.Y(this.zzb, null, null, new zzju((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3);
    }
}

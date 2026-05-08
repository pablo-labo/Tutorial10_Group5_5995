package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.sy3;
import java.io.ByteArrayInputStream;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmh extends WebViewClient {
    final /* synthetic */ zzmu zza;

    public zzmh(zzmu zzmuVar) {
        this.zza = zzmuVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        System.currentTimeMillis();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        long jZza = this.zza.zzm.zza(TimeUnit.MICROSECONDS);
        int i = zzej.zza;
        zzej.zza(zzek.zzb.zza(), jZza);
    }

    @Override // android.webkit.WebViewClient
    @sy3
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        zzmu zzmuVar = this.zza;
        zzee zzeeVar = zzee.zzc;
        zzed zzedVar = (zzed) zzmuVar.zzi.get(Integer.valueOf(i));
        if (zzedVar == null) {
            zzedVar = zzed.zzM;
        }
        zzeg zzegVar = new zzeg(zzeeVar, zzedVar, null, null, 12, null);
        zzmuVar.zzy().hashCode();
        zzegVar.getMessage();
        zzmuVar.zzy().h0(zzegVar);
    }

    @Override // android.webkit.WebViewClient
    @sy3
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Uri uri = Uri.parse(str);
        uri.getClass();
        if (zzjj.zzc(uri)) {
            zzmu zzmuVar = this.zza;
            if (!zzmuVar.zze.zza(uri)) {
                zzeg zzegVar = new zzeg(zzee.zzb, zzed.zzQ, null, null, 12, null);
                zzmuVar.zzy().hashCode();
                uri.toString();
                zzmuVar.zzy().h0(zzegVar);
                return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
            }
        }
        return super.shouldInterceptRequest(webView, str);
    }
}

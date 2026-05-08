package com.linecorp.linesdk.api;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.linecorp.linesdk.ManifestParser;
import defpackage.ax8;
import defpackage.cx8;
import defpackage.f11;
import defpackage.ft4;
import defpackage.h8f;
import defpackage.l5;
import defpackage.p5;
import defpackage.tw8;
import defpackage.vw8;
import java.lang.reflect.Proxy;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public class LineApiClientBuilder {
    private Uri apiBaseUri;
    private final String channelId;
    private final Context context;
    private boolean isEncryptorPreparationDisabled;
    private boolean isTokenAutoRefreshDisabled;
    private Uri openidDiscoveryDocumentUrl;

    public LineApiClientBuilder(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            l5.q("channel id is empty");
            throw null;
        }
        this.context = context.getApplicationContext();
        this.channelId = str;
        LineEnvConfig cx8Var = new ManifestParser().parse(context);
        cx8Var = cx8Var == null ? new cx8() : cx8Var;
        this.openidDiscoveryDocumentUrl = Uri.parse(cx8Var.getOpenIdDiscoveryDocumentUrl());
        this.apiBaseUri = Uri.parse(cx8Var.getApiServerBaseUri());
    }

    @Deprecated
    public LineApiClientBuilder apiBaseUri(Uri uri) {
        if (uri != null) {
            this.apiBaseUri = uri;
        }
        return this;
    }

    public tw8 build() {
        if (!this.isEncryptorPreparationDisabled) {
            Context context = this.context;
            if (!ft4.b) {
                ft4.b = true;
                Executors.newSingleThreadExecutor().execute(new ft4.a(context.getApplicationContext()));
            }
        }
        vw8 vw8Var = new vw8(this.channelId, new ax8(this.context, this.openidDiscoveryDocumentUrl, this.apiBaseUri), new h8f(this.apiBaseUri, this.context), new p5(this.context, this.channelId));
        return this.isTokenAutoRefreshDisabled ? vw8Var : (tw8) Proxy.newProxyInstance(vw8.class.getClassLoader(), new Class[]{tw8.class}, new f11(vw8Var));
    }

    public LineApiClientBuilder disableEncryptorPreparation() {
        this.isEncryptorPreparationDisabled = true;
        return this;
    }

    public LineApiClientBuilder disableTokenAutoRefresh() {
        this.isTokenAutoRefreshDisabled = true;
        return this;
    }

    @Deprecated
    public LineApiClientBuilder openidDiscoveryDocumentUrl(Uri uri) {
        if (uri != null) {
            this.openidDiscoveryDocumentUrl = uri;
        }
        return this;
    }
}

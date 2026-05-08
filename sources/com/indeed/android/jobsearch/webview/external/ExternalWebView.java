package com.indeed.android.jobsearch.webview.external;

import android.content.Context;
import android.util.AttributeSet;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.ac1;
import defpackage.d93;
import defpackage.lz2;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/indeed/android/jobsearch/webview/external/ExternalWebView;", "Lac1;", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "userAgentString", "Lj6g;", "setSpoofedUserAgentString", "(Ljava/lang/String;)V", "getCountryForHeader", "()Ljava/lang/String;", "getLanguageForHeader", "b", "Ljava/lang/String;", "getDefaultUserAgentString", "defaultUserAgentString", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExternalWebView extends ac1 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String defaultUserAgentString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        getSettings().setSupportMultipleWindows(true);
        String userAgentString = getSettings().getUserAgentString();
        userAgentString.getClass();
        this.defaultUserAgentString = userAgentString;
        ArrayList arrayList = lz2.a;
        lz2.d("ExternalWebView", "External WebView User Agent : " + getSettings().getUserAgentString(), false, null);
    }

    @Override // defpackage.ac1
    public final void a(String str) {
    }

    @Override // defpackage.ac1
    public final String b(String str) {
        return str;
    }

    @Override // defpackage.ac1
    public String getCountryForHeader() {
        return d93.a();
    }

    public final String getDefaultUserAgentString() {
        return this.defaultUserAgentString;
    }

    @Override // defpackage.ac1
    public String getLanguageForHeader() {
        return d93.e();
    }

    public final void setSpoofedUserAgentString(String userAgentString) {
        userAgentString.getClass();
        ArrayList arrayList = lz2.a;
        lz2.d("ExternalWebView", "Spoofed userAgent set: ".concat(userAgentString), false, null);
        getSettings().setUserAgentString(userAgentString);
    }
}

package com.indeed.android.jobsearch.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.ac1;
import defpackage.ajg;
import defpackage.b87;
import defpackage.d2f;
import defpackage.d93;
import defpackage.pxc;
import defpackage.wve;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nR$\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\n\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/indeed/android/jobsearch/webview/IndeedWebView;", "Lac1;", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getCountryForHeader", "()Ljava/lang/String;", "getLanguageForHeader", "", "value", "b", "Z", "getCanPullToRefresh", "()Z", "canPullToRefresh", "d", "Ljava/lang/String;", "getLastUrlToLoad", "setLastUrlToLoad", "(Ljava/lang/String;)V", "lastUrlToLoad", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IndeedWebView extends ac1 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean canPullToRefresh;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public String lastUrlToLoad;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndeedWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.canPullToRefresh = true;
    }

    @Override // defpackage.ac1
    public final void a(String str) {
        pxc pxcVar = b87.a;
        b87.b(str);
    }

    @Override // defpackage.ac1
    public final String b(String str) {
        d2f d2fVar = ajg.a;
        return ajg.a(str);
    }

    public final boolean getCanPullToRefresh() {
        return this.canPullToRefresh;
    }

    @Override // defpackage.ac1
    public String getCountryForHeader() {
        return d93.a();
    }

    @Override // defpackage.ac1
    public String getLanguageForHeader() {
        return d93.e();
    }

    public final String getLastUrlToLoad() {
        return this.lastUrlToLoad;
    }

    @Override // defpackage.ac1, android.webkit.WebView
    public final void loadUrl(String str) {
        str.getClass();
        if (wve.K(str, "http://", false) || wve.K(str, "https://", false)) {
            this.lastUrlToLoad = str;
        }
        super.loadUrl(str);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        if (!z && !this.c) {
            this.canPullToRefresh = z2;
        } else {
            this.canPullToRefresh = false;
            this.c = true;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.canPullToRefresh = false;
        } else if (actionMasked == 1 || actionMasked == 3 || actionMasked == 5 || actionMasked == 6) {
            this.c = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setLastUrlToLoad(String str) {
        this.lastUrlToLoad = str;
    }
}

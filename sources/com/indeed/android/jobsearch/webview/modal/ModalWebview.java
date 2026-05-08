package com.indeed.android.jobsearch.webview.modal;

import android.content.Context;
import android.util.AttributeSet;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.ac1;
import defpackage.b87;
import defpackage.d93;
import defpackage.pxc;
import defpackage.wl7;
import defpackage.yw9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/indeed/android/jobsearch/webview/modal/ModalWebview;", "Lac1;", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getCountryForHeader", "()Ljava/lang/String;", "getLanguageForHeader", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ModalWebview extends ac1 {
    public yw9.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalWebview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    @Override // defpackage.ac1
    public final void a(String str) {
        pxc pxcVar = b87.a;
        b87.b(str);
    }

    @Override // defpackage.ac1
    public final String b(String str) {
        yw9.a aVar = this.b;
        if (aVar != null) {
            return (String) aVar.invoke(str);
        }
        wl7.g("onResolveUserAgent");
        throw null;
    }

    @Override // defpackage.ac1
    public String getCountryForHeader() {
        return d93.a();
    }

    @Override // defpackage.ac1
    public String getLanguageForHeader() {
        return d93.e();
    }
}

package defpackage;

import com.datadog.android.rum.internal.utils.ViewUtilsKt;

/* JADX INFO: loaded from: classes3.dex */
public enum s8c {
    WEBVIEW_NOTIFICATIONS("WebviewNotifications"),
    NATIVE_MYJOBS("NativeMyjobs"),
    WEBVIEW_MYJOBS("WebviewMyjobs"),
    NATIVE_INBOX("NativeInbox"),
    WEBVIEW_INBOX("WebviewInbox"),
    HOMEPAGE("HomeScreen"),
    /* JADX INFO: Fake field, exist only in values array */
    POST_APPLY("PostApply"),
    UNKNOWN(ViewUtilsKt.UNKNOWN_DESTINATION_URL);

    private final String value;

    s8c(String str) {
        this.value = str;
    }

    public final String a() {
        return this.value;
    }
}

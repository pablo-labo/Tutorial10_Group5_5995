package com.facebook.react.bridge;

import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/facebook/react/bridge/JavaScriptContextHolder;", "", "", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "<init>", "(J)V", "get", "()J", "Lj6g;", "clear", "()V", "J", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JavaScriptContextHolder {
    private long context;

    public JavaScriptContextHolder(long j) {
        this.context = j;
    }

    public final synchronized void clear() {
        this.context = 0L;
    }

    /* JADX INFO: renamed from: get, reason: from getter */
    public final long getContext() {
        return this.context;
    }
}

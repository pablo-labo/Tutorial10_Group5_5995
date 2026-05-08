package com.datadog.android.core.internal.lifecycle;

import android.content.Context;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor;
import com.datadog.android.core.internal.utils.WorkManagerUtilsKt;
import defpackage.w2h;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleCallback;", "Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor$Callback;", "Landroid/content/Context;", "appContext", "", "instanceName", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;)V", "Lj6g;", "onStarted", "()V", "onResumed", "onStopped", "onPaused", "Ljava/lang/String;", "getInstanceName$dd_sdk_android_core_release", "()Ljava/lang/String;", "Lcom/datadog/android/api/InternalLogger;", "Ljava/lang/ref/Reference;", "contextWeakRef", "Ljava/lang/ref/Reference;", "getContextWeakRef$dd_sdk_android_core_release", "()Ljava/lang/ref/Reference;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ProcessLifecycleCallback implements ProcessLifecycleMonitor.Callback {
    private final Reference<Context> contextWeakRef;
    private final String instanceName;
    private final InternalLogger internalLogger;

    public ProcessLifecycleCallback(Context context, String str, InternalLogger internalLogger) {
        context.getClass();
        str.getClass();
        internalLogger.getClass();
        this.instanceName = str;
        this.internalLogger = internalLogger;
        this.contextWeakRef = new WeakReference(context);
    }

    public final Reference<Context> getContextWeakRef$dd_sdk_android_core_release() {
        return this.contextWeakRef;
    }

    /* JADX INFO: renamed from: getInstanceName$dd_sdk_android_core_release, reason: from getter */
    public final String getInstanceName() {
        return this.instanceName;
    }

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public void onPaused() {
    }

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public void onResumed() {
    }

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public void onStarted() {
        w2h w2hVar;
        Context context = this.contextWeakRef.get();
        if (context != null) {
            synchronized (w2h.m) {
                try {
                    w2hVar = w2h.k;
                    if (w2hVar == null) {
                        w2hVar = w2h.l;
                    }
                } finally {
                }
            }
            if (w2hVar != null) {
                WorkManagerUtilsKt.cancelUploadWorker(context, this.instanceName, this.internalLogger);
            }
        }
    }

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public void onStopped() throws Throwable {
        w2h w2hVar;
        Context context = this.contextWeakRef.get();
        if (context != null) {
            synchronized (w2h.m) {
                try {
                    w2hVar = w2h.k;
                    if (w2hVar == null) {
                        w2hVar = w2h.l;
                    }
                } finally {
                }
            }
            if (w2hVar != null) {
                WorkManagerUtilsKt.triggerUploadWorker(context, this.instanceName, this.internalLogger);
            }
        }
    }
}

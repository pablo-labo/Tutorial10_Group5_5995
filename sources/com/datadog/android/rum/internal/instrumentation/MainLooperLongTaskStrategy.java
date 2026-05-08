package com.datadog.android.rum.internal.instrumentation;

import android.content.Context;
import android.os.Looper;
import android.util.Printer;
import com.datadog.android.api.SdkCore;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.datadog.android.rum.internal.monitor.AdvancedRumMonitor;
import com.datadog.android.rum.tracking.TrackingStrategy;
import defpackage.u40;
import defpackage.wve;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u000bJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 R\u0016\u0010$\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010 R\u0016\u0010%\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010'¨\u0006)"}, d2 = {"Lcom/datadog/android/rum/internal/instrumentation/MainLooperLongTaskStrategy;", "Landroid/util/Printer;", "Lcom/datadog/android/rum/tracking/TrackingStrategy;", "", "thresholdMs", "<init>", "(J)V", "", "message", "Lj6g;", "detectLongTask", "(Ljava/lang/String;)V", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "register", "(Lcom/datadog/android/api/SdkCore;Landroid/content/Context;)V", "unregister", "(Landroid/content/Context;)V", "x", "println", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "J", "getThresholdMs$dd_sdk_android_rum_release", "()J", "thresholdNS", "startUptimeNs", "target", "Ljava/lang/String;", "Lcom/datadog/android/api/SdkCore;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class MainLooperLongTaskStrategy implements Printer, TrackingStrategy {
    private static final String PREFIX_END = "<<<<< Finished to ";
    private static final String PREFIX_START = ">>>>> Dispatching to ";
    private static final int PREFIX_START_LENGTH = 21;
    private SdkCore sdkCore;
    private long startUptimeNs;
    private String target = "";
    private final long thresholdMs;
    private final long thresholdNS;

    public MainLooperLongTaskStrategy(long j) {
        this.thresholdMs = j;
        this.thresholdNS = TimeUnit.MILLISECONDS.toNanos(j);
    }

    private final void detectLongTask(String message) {
        SdkCore sdkCore;
        long jNanoTime = System.nanoTime();
        if (wve.K(message, PREFIX_START, false)) {
            this.target = message.substring(PREFIX_START_LENGTH);
            this.startUptimeNs = jNanoTime;
            return;
        }
        if (wve.K(message, PREFIX_END, false)) {
            long j = jNanoTime - this.startUptimeNs;
            if (j <= this.thresholdNS || (sdkCore = this.sdkCore) == null) {
                return;
            }
            RumMonitor rumMonitor = GlobalRumMonitor.get(sdkCore);
            AdvancedRumMonitor advancedRumMonitor = rumMonitor instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor : null;
            if (advancedRumMonitor != null) {
                advancedRumMonitor.addLongTask(j, this.target);
            }
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!MainLooperLongTaskStrategy.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        return this.thresholdMs == ((MainLooperLongTaskStrategy) other).thresholdMs;
    }

    /* JADX INFO: renamed from: getThresholdMs$dd_sdk_android_rum_release, reason: from getter */
    public final long getThresholdMs() {
        return this.thresholdMs;
    }

    public int hashCode() {
        return Long.hashCode(this.thresholdMs);
    }

    @Override // android.util.Printer
    public void println(String x) {
        if (x != null) {
            detectLongTask(x);
        }
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public void register(SdkCore sdkCore, Context context) {
        sdkCore.getClass();
        context.getClass();
        this.sdkCore = sdkCore;
        Looper.getMainLooper().setMessageLogging(this);
    }

    public String toString() {
        return u40.c(this.thresholdMs, "MainLooperLongTaskStrategy(", ")");
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public void unregister(Context context) {
        Looper.getMainLooper().setMessageLogging(null);
    }
}

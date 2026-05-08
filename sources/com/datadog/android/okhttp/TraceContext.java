package com.datadog.android.okhttp;

import com.datadog.android.lint.InternalApi;
import defpackage.akb;
import defpackage.u40;
import defpackage.w20;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@InternalApi
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/datadog/android/okhttp/TraceContext;", "", "traceId", "", "spanId", "samplingPriority", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getSamplingPriority", "()I", "getSpanId", "()Ljava/lang/String;", "getTraceId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "dd-sdk-android-okhttp_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class TraceContext {
    private final int samplingPriority;
    private final String spanId;
    private final String traceId;

    public TraceContext(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.traceId = str;
        this.spanId = str2;
        this.samplingPriority = i;
    }

    public static /* synthetic */ TraceContext copy$default(TraceContext traceContext, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = traceContext.traceId;
        }
        if ((i2 & 2) != 0) {
            str2 = traceContext.spanId;
        }
        if ((i2 & 4) != 0) {
            i = traceContext.samplingPriority;
        }
        return traceContext.copy(str, str2, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSpanId() {
        return this.spanId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSamplingPriority() {
        return this.samplingPriority;
    }

    public final TraceContext copy(String traceId, String spanId, int samplingPriority) {
        traceId.getClass();
        spanId.getClass();
        return new TraceContext(traceId, spanId, samplingPriority);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraceContext)) {
            return false;
        }
        TraceContext traceContext = (TraceContext) other;
        return wl7.b(this.traceId, traceContext.traceId) && wl7.b(this.spanId, traceContext.spanId) && this.samplingPriority == traceContext.samplingPriority;
    }

    public final int getSamplingPriority() {
        return this.samplingPriority;
    }

    public final String getSpanId() {
        return this.spanId;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public int hashCode() {
        return Integer.hashCode(this.samplingPriority) + akb.d(this.traceId.hashCode() * 31, 31, this.spanId);
    }

    public String toString() {
        String str = this.traceId;
        String str2 = this.spanId;
        return w20.k(u40.f("TraceContext(traceId=", str, ", spanId=", str2, ", samplingPriority="), this.samplingPriority, ")");
    }
}

package com.datadog.android.rum.internal.domain.event;

import com.datadog.android.lint.InternalApi;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ia;
import defpackage.o6;
import defpackage.r6;
import defpackage.w40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@InternalApi
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Jm\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006+"}, d2 = {"Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "", "dnsStart", "", "dnsDuration", "connectStart", "connectDuration", "sslStart", "sslDuration", "firstByteStart", "firstByteDuration", "downloadStart", "downloadDuration", "(JJJJJJJJJJ)V", "getConnectDuration", "()J", "getConnectStart", "getDnsDuration", "getDnsStart", "getDownloadDuration", "getDownloadStart", "getFirstByteDuration", "getFirstByteStart", "getSslDuration", "getSslStart", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class ResourceTiming {
    private final long connectDuration;
    private final long connectStart;
    private final long dnsDuration;
    private final long dnsStart;
    private final long downloadDuration;
    private final long downloadStart;
    private final long firstByteDuration;
    private final long firstByteStart;
    private final long sslDuration;
    private final long sslStart;

    public /* synthetic */ ResourceTiming(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3, (i & 8) != 0 ? 0L : j4, (i & 16) != 0 ? 0L : j5, (i & 32) != 0 ? 0L : j6, (i & 64) != 0 ? 0L : j7, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? 0L : j8, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 0L : j9, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? 0L : j10);
    }

    public static /* synthetic */ ResourceTiming copy$default(ResourceTiming resourceTiming, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, int i, Object obj) {
        long j11;
        long j12;
        long j13 = (i & 1) != 0 ? resourceTiming.dnsStart : j;
        long j14 = (i & 2) != 0 ? resourceTiming.dnsDuration : j2;
        long j15 = (i & 4) != 0 ? resourceTiming.connectStart : j3;
        long j16 = (i & 8) != 0 ? resourceTiming.connectDuration : j4;
        long j17 = (i & 16) != 0 ? resourceTiming.sslStart : j5;
        long j18 = (i & 32) != 0 ? resourceTiming.sslDuration : j6;
        long j19 = (i & 64) != 0 ? resourceTiming.firstByteStart : j7;
        long j20 = j13;
        long j21 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? resourceTiming.firstByteDuration : j8;
        long j22 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? resourceTiming.downloadStart : j9;
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            j12 = j22;
            j11 = resourceTiming.downloadDuration;
        } else {
            j11 = j10;
            j12 = j22;
        }
        return resourceTiming.copy(j20, j14, j15, j16, j17, j18, j19, j21, j12, j11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDnsStart() {
        return this.dnsStart;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getDownloadDuration() {
        return this.downloadDuration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDnsDuration() {
        return this.dnsDuration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getConnectStart() {
        return this.connectStart;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getConnectDuration() {
        return this.connectDuration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getSslStart() {
        return this.sslStart;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getSslDuration() {
        return this.sslDuration;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getFirstByteStart() {
        return this.firstByteStart;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getFirstByteDuration() {
        return this.firstByteDuration;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getDownloadStart() {
        return this.downloadStart;
    }

    public final ResourceTiming copy(long dnsStart, long dnsDuration, long connectStart, long connectDuration, long sslStart, long sslDuration, long firstByteStart, long firstByteDuration, long downloadStart, long downloadDuration) {
        return new ResourceTiming(dnsStart, dnsDuration, connectStart, connectDuration, sslStart, sslDuration, firstByteStart, firstByteDuration, downloadStart, downloadDuration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourceTiming)) {
            return false;
        }
        ResourceTiming resourceTiming = (ResourceTiming) other;
        return this.dnsStart == resourceTiming.dnsStart && this.dnsDuration == resourceTiming.dnsDuration && this.connectStart == resourceTiming.connectStart && this.connectDuration == resourceTiming.connectDuration && this.sslStart == resourceTiming.sslStart && this.sslDuration == resourceTiming.sslDuration && this.firstByteStart == resourceTiming.firstByteStart && this.firstByteDuration == resourceTiming.firstByteDuration && this.downloadStart == resourceTiming.downloadStart && this.downloadDuration == resourceTiming.downloadDuration;
    }

    public final long getConnectDuration() {
        return this.connectDuration;
    }

    public final long getConnectStart() {
        return this.connectStart;
    }

    public final long getDnsDuration() {
        return this.dnsDuration;
    }

    public final long getDnsStart() {
        return this.dnsStart;
    }

    public final long getDownloadDuration() {
        return this.downloadDuration;
    }

    public final long getDownloadStart() {
        return this.downloadStart;
    }

    public final long getFirstByteDuration() {
        return this.firstByteDuration;
    }

    public final long getFirstByteStart() {
        return this.firstByteStart;
    }

    public final long getSslDuration() {
        return this.sslDuration;
    }

    public final long getSslStart() {
        return this.sslStart;
    }

    public int hashCode() {
        return Long.hashCode(this.downloadDuration) + ia.d(ia.d(ia.d(ia.d(ia.d(ia.d(ia.d(ia.d(Long.hashCode(this.dnsStart) * 31, 31, this.dnsDuration), 31, this.connectStart), 31, this.connectDuration), 31, this.sslStart), 31, this.sslDuration), 31, this.firstByteStart), 31, this.firstByteDuration), 31, this.downloadStart);
    }

    public String toString() {
        long j = this.dnsStart;
        long j2 = this.dnsDuration;
        long j3 = this.connectStart;
        long j4 = this.connectDuration;
        long j5 = this.sslStart;
        long j6 = this.sslDuration;
        long j7 = this.firstByteStart;
        long j8 = this.firstByteDuration;
        long j9 = this.downloadStart;
        long j10 = this.downloadDuration;
        StringBuilder sbI = w40.i(j, "ResourceTiming(dnsStart=", ", dnsDuration=");
        sbI.append(j2);
        o6.p(sbI, ", connectStart=", j3, ", connectDuration=");
        sbI.append(j4);
        o6.p(sbI, ", sslStart=", j5, ", sslDuration=");
        sbI.append(j6);
        o6.p(sbI, ", firstByteStart=", j7, ", firstByteDuration=");
        sbI.append(j8);
        o6.p(sbI, ", downloadStart=", j9, ", downloadDuration=");
        return r6.d(j10, ")", sbI);
    }

    public ResourceTiming(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.dnsStart = j;
        this.dnsDuration = j2;
        this.connectStart = j3;
        this.connectDuration = j4;
        this.sslStart = j5;
        this.sslDuration = j6;
        this.firstByteStart = j7;
        this.firstByteDuration = j8;
        this.downloadStart = j9;
        this.downloadDuration = j10;
    }

    public ResourceTiming() {
        this(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 1023, null);
    }
}

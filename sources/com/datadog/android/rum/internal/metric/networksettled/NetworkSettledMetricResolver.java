package com.datadog.android.rum.internal.metric.networksettled;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier;
import com.datadog.android.rum.metric.networksettled.NetworkSettledResourceContext;
import com.datadog.android.rum.metric.networksettled.TimeBasedInitialResourceIdentifier;
import defpackage.gu5;
import defpackage.mj8;
import java.util.HashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001a\u0010\nJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR$\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00140 j\b\u0012\u0004\u0012\u00020\u0014`!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010\u0018\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010)¨\u0006*"}, d2 = {"Lcom/datadog/android/rum/internal/metric/networksettled/NetworkSettledMetricResolver;", "", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "initialResourceIdentifier", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;Lcom/datadog/android/api/InternalLogger;)V", "", "computeMetric", "()Ljava/lang/Long;", "eventTimestampInNanos", "Lj6g;", "viewWasCreated", "(J)V", "Lcom/datadog/android/rum/internal/metric/networksettled/InternalResourceContext;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "resourceWasStarted", "(Lcom/datadog/android/rum/internal/metric/networksettled/InternalResourceContext;)V", "resourceWasStopped", "", "resourceId", "resourceWasDropped", "(Ljava/lang/String;)V", "viewWasStopped", "()V", "resolveMetric", "", "getResourceStartedCacheSize", "()I", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "Lcom/datadog/android/api/InternalLogger;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "resourceStartedTimestamps", "Ljava/util/HashSet;", "networkSettleMaxValue", "Ljava/lang/Long;", "viewCreatedTimestamp", "lastComputedMetric", "", "Z", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NetworkSettledMetricResolver {
    private final InitialResourceIdentifier initialResourceIdentifier;
    private final InternalLogger internalLogger;
    private volatile Long lastComputedMetric;
    private volatile Long networkSettleMaxValue;
    private final HashSet<String> resourceStartedTimestamps;
    private volatile Long viewCreatedTimestamp;
    private volatile boolean viewWasStopped;

    public NetworkSettledMetricResolver(InitialResourceIdentifier initialResourceIdentifier, InternalLogger internalLogger) {
        initialResourceIdentifier.getClass();
        internalLogger.getClass();
        this.initialResourceIdentifier = initialResourceIdentifier;
        this.internalLogger = internalLogger;
        this.resourceStartedTimestamps = new HashSet<>();
    }

    private final Long computeMetric() {
        if (this.viewCreatedTimestamp == null) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.DEBUG, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            return null;
        }
        if (this.resourceStartedTimestamps.size() <= 0) {
            return this.networkSettleMaxValue;
        }
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.DEBUG, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass2.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        return null;
    }

    public final int getResourceStartedCacheSize() {
        return this.resourceStartedTimestamps.size();
    }

    public final Long resolveMetric() {
        if (this.viewWasStopped) {
            return this.lastComputedMetric;
        }
        this.lastComputedMetric = computeMetric();
        return this.lastComputedMetric;
    }

    public final void resourceWasDropped(String resourceId) {
        resourceId.getClass();
        if (this.viewWasStopped) {
            return;
        }
        this.resourceStartedTimestamps.remove(resourceId);
    }

    public final void resourceWasStarted(InternalResourceContext context) {
        context.getClass();
        if (!this.viewWasStopped && this.initialResourceIdentifier.validate(new NetworkSettledResourceContext(context.getResourceId$dd_sdk_android_rum_release(), context.getEventCreatedAtNanos$dd_sdk_android_rum_release(), this.viewCreatedTimestamp))) {
            this.resourceStartedTimestamps.add(context.getResourceId$dd_sdk_android_rum_release());
        }
    }

    public final void resourceWasStopped(InternalResourceContext context) {
        context.getClass();
        if (this.viewWasStopped) {
            return;
        }
        Long l = this.viewCreatedTimestamp;
        Long l2 = this.networkSettleMaxValue;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        boolean zRemove = this.resourceStartedTimestamps.remove(context.getResourceId$dd_sdk_android_rum_release());
        if (l == null || !zRemove) {
            return;
        }
        long eventCreatedAtNanos$dd_sdk_android_rum_release = context.getEventCreatedAtNanos$dd_sdk_android_rum_release() - l.longValue();
        if (eventCreatedAtNanos$dd_sdk_android_rum_release > jLongValue) {
            this.networkSettleMaxValue = Long.valueOf(eventCreatedAtNanos$dd_sdk_android_rum_release);
        }
    }

    public final void viewWasCreated(long eventTimestampInNanos) {
        this.viewCreatedTimestamp = Long.valueOf(eventTimestampInNanos);
    }

    public final void viewWasStopped() {
        this.viewWasStopped = true;
        this.resourceStartedTimestamps.clear();
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver$computeMetric$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "[ViewNetworkSettledMetric] There was no view created yet for this resource";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver$computeMetric$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "[ViewNetworkSettledMetric] Not all the initial resources were stopped for this view";
        }
    }

    public /* synthetic */ NetworkSettledMetricResolver(InitialResourceIdentifier initialResourceIdentifier, InternalLogger internalLogger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TimeBasedInitialResourceIdentifier(0L, 1, null) : initialResourceIdentifier, internalLogger);
    }
}

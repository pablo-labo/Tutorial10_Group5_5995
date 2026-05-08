package com.datadog.android.rum.internal.metric.interactiontonextview;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.datadog.android.rum.internal.domain.event.RumEventMeta;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier;
import com.datadog.android.rum.metric.interactiontonextview.PreviousViewLastInteractionContext;
import com.datadog.android.rum.metric.interactiontonextview.TimeBasedInteractionIdentifier;
import defpackage.gu5;
import defpackage.l5;
import defpackage.mj8;
import defpackage.z92;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\u001cH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u001cH\u0001¢\u0006\u0004\b \u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R0\u0010'\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0%j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e`&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R0\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0%j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f`&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010(¨\u0006*"}, d2 = {"Lcom/datadog/android/rum/internal/metric/interactiontonextview/InteractionToNextViewMetricResolver;", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/rum/internal/metric/interactiontonextview/InteractionIngestionValidator;", "ingestionValidator", "Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "lastInteractionIdentifier", "<init>", "(Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/rum/internal/metric/interactiontonextview/InteractionIngestionValidator;Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;)V", "", RumEventMeta.VIEW_ID_KEY, "", "currentViewCreatedTimestamp", "Lcom/datadog/android/rum/internal/metric/interactiontonextview/InternalInteractionContext;", "resolveLastInteraction", "(Ljava/lang/String;J)Lcom/datadog/android/rum/internal/metric/interactiontonextview/InternalInteractionContext;", "Lj6g;", "purgeOldEntries", "()V", NdkCrashLog.TIMESTAMP_KEY_NAME, "onViewCreated", "(Ljava/lang/String;J)V", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "onActionSent", "(Lcom/datadog/android/rum/internal/metric/interactiontonextview/InternalInteractionContext;)V", "resolveMetric", "(Ljava/lang/String;)Ljava/lang/Long;", "", "lasInteractions$dd_sdk_android_rum_release", "()Ljava/util/Map;", "lasInteractions", "lastViewCreatedTimestamps$dd_sdk_android_rum_release", "lastViewCreatedTimestamps", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/rum/internal/metric/interactiontonextview/InteractionIngestionValidator;", "Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "lastInteractions", "Ljava/util/LinkedHashMap;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class InteractionToNextViewMetricResolver {
    public static final int MAX_ENTRIES = 4;
    private final InteractionIngestionValidator ingestionValidator;
    private final InternalLogger internalLogger;
    private final LastInteractionIdentifier lastInteractionIdentifier;
    private final LinkedHashMap<String, InternalInteractionContext> lastInteractions;
    private final LinkedHashMap<String, Long> lastViewCreatedTimestamps;

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.metric.interactiontonextview.InteractionToNextViewMetricResolver$resolveMetric$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ String $viewId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$viewId = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return l5.l("[ViewNetworkSettledMetric] The view was not yet created for this viewId:", this.$viewId);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.metric.interactiontonextview.InteractionToNextViewMetricResolver$resolveMetric$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        final /* synthetic */ String $viewId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(0);
            this.$viewId = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return l5.l("[ViewNetworkSettledMetric] The difference between the last interaction and the current view is negative for viewId:", this.$viewId);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.metric.interactiontonextview.InteractionToNextViewMetricResolver$resolveMetric$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass3 extends mj8 implements gu5<String> {
        final /* synthetic */ String $viewId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str) {
            super(0);
            this.$viewId = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return l5.l("[ViewNetworkSettledMetric] No previous interaction found for this viewId:", this.$viewId);
        }
    }

    public InteractionToNextViewMetricResolver(InternalLogger internalLogger, InteractionIngestionValidator interactionIngestionValidator, LastInteractionIdentifier lastInteractionIdentifier) {
        internalLogger.getClass();
        interactionIngestionValidator.getClass();
        lastInteractionIdentifier.getClass();
        this.internalLogger = internalLogger;
        this.ingestionValidator = interactionIngestionValidator;
        this.lastInteractionIdentifier = lastInteractionIdentifier;
        this.lastInteractions = new LinkedHashMap<>();
        this.lastViewCreatedTimestamps = new LinkedHashMap<>();
    }

    private final void purgeOldEntries() {
        while (this.lastInteractions.entrySet().size() > 4) {
            Set<Map.Entry<String, InternalInteractionContext>> setEntrySet = this.lastInteractions.entrySet();
            Set<Map.Entry<String, InternalInteractionContext>> setEntrySet2 = this.lastInteractions.entrySet();
            setEntrySet2.getClass();
            setEntrySet.remove(z92.N0(setEntrySet2));
        }
        while (this.lastViewCreatedTimestamps.entrySet().size() > 4) {
            LinkedHashMap<String, Long> linkedHashMap = this.lastViewCreatedTimestamps;
            Set<String> setKeySet = linkedHashMap.keySet();
            setKeySet.getClass();
            linkedHashMap.remove(z92.N0(setKeySet));
        }
    }

    private final InternalInteractionContext resolveLastInteraction(String viewId, long currentViewCreatedTimestamp) {
        Object objR0;
        InternalInteractionContext internalInteractionContext;
        Set<String> setKeySet = this.lastViewCreatedTimestamps.keySet();
        setKeySet.getClass();
        int iS0 = z92.S0(setKeySet, viewId);
        Set<String> setKeySet2 = this.lastViewCreatedTimestamps.keySet();
        setKeySet2.getClass();
        Set<String> set = setKeySet2;
        int i = iS0 - 1;
        if (set instanceof List) {
            objR0 = z92.R0(i, (List) set);
        } else if (i < 0) {
            objR0 = null;
        } else {
            int i2 = 0;
            for (Object obj : set) {
                int i3 = i2 + 1;
                if (i == i2) {
                    objR0 = obj;
                    break;
                }
                i2 = i3;
            }
            objR0 = null;
        }
        String str = (String) objR0;
        if (str != null && (internalInteractionContext = this.lastInteractions.get(str)) != null) {
            if (this.lastInteractionIdentifier.validate(new PreviousViewLastInteractionContext(internalInteractionContext.getActionType$dd_sdk_android_rum_release(), internalInteractionContext.getEventCreatedAtNanos$dd_sdk_android_rum_release(), Long.valueOf(currentViewCreatedTimestamp)))) {
                return internalInteractionContext;
            }
        }
        return null;
    }

    public final Map<String, InternalInteractionContext> lasInteractions$dd_sdk_android_rum_release() {
        return this.lastInteractions;
    }

    public final Map<String, Long> lastViewCreatedTimestamps$dd_sdk_android_rum_release() {
        return this.lastViewCreatedTimestamps;
    }

    public final void onActionSent(InternalInteractionContext context) {
        context.getClass();
        if (this.ingestionValidator.validate(context)) {
            this.lastInteractions.put(context.getViewId$dd_sdk_android_rum_release(), context);
        }
        purgeOldEntries();
    }

    public final void onViewCreated(String viewId, long timestamp) {
        viewId.getClass();
        this.lastViewCreatedTimestamps.put(viewId, Long.valueOf(timestamp));
        purgeOldEntries();
    }

    public final Long resolveMetric(String viewId) {
        viewId.getClass();
        purgeOldEntries();
        Long l = this.lastViewCreatedTimestamps.get(viewId);
        if (l == null) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, (gu5) new AnonymousClass1(viewId), (Throwable) null, false, (Map) null, 56, (Object) null);
            return null;
        }
        InternalInteractionContext internalInteractionContextResolveLastInteraction = resolveLastInteraction(viewId, l.longValue());
        if (internalInteractionContextResolveLastInteraction == null) {
            if (this.lastViewCreatedTimestamps.size() > 1) {
                InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, (gu5) new AnonymousClass3(viewId), (Throwable) null, false, (Map) null, 56, (Object) null);
            }
            return null;
        }
        long jLongValue = l.longValue() - internalInteractionContextResolveLastInteraction.getEventCreatedAtNanos$dd_sdk_android_rum_release();
        if (jLongValue > 0) {
            return Long.valueOf(jLongValue);
        }
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, (gu5) new AnonymousClass2(viewId), (Throwable) null, false, (Map) null, 56, (Object) null);
        return null;
    }

    public /* synthetic */ InteractionToNextViewMetricResolver(InternalLogger internalLogger, InteractionIngestionValidator interactionIngestionValidator, LastInteractionIdentifier lastInteractionIdentifier, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(internalLogger, (i & 2) != 0 ? new ActionTypeInteractionValidator() : interactionIngestionValidator, (i & 4) != 0 ? new TimeBasedInteractionIdentifier(0L, 1, null) : lastInteractionIdentifier);
    }
}

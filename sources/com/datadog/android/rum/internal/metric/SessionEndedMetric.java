package com.datadog.android.rum.internal.metric;

import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import com.datadog.android.rum.internal.domain.scope.RumViewManagerScope;
import com.datadog.android.rum.model.ViewEvent;
import defpackage.ak2;
import defpackage.ia;
import defpackage.kc9;
import defpackage.lc9;
import defpackage.o6;
import defpackage.pxc;
import defpackage.t92;
import defpackage.u63;
import defpackage.wl7;
import defpackage.z3;
import defpackage.z92;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 >2\u00020\u0001:\u0003>?@B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u001d\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u001d\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u001b\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020!2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020!¢\u0006\u0004\b*\u0010%J#\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f2\u0006\u0010+\u001a\u00020\u0006¢\u0006\u0004\b,\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R \u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0012018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R \u00106\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0012018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u0016\u0010=\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00100¨\u0006A"}, d2 = {"Lcom/datadog/android/rum/internal/metric/SessionEndedMetric;", "", "", RumSessionScope.RUM_SESSION_ID_BUS_MESSAGE_KEY, "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "startReason", "", "ntpOffsetAtStartMs", "", "hasTrackBackgroundEventsEnabled", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;JZ)V", "calculateDuration", "()J", "ntpOffsetAtEnd", "", "resolveRseAttributes", "(J)Ljava/util/Map;", "", "resolveNoViewCountsAttributes", "()Ljava/util/Map;", "resolveNtpOffsetAttributes", "resolveViewCountsAttributes", "resolveSDKErrorsCountAttributes", "resolveTop5ErrorsByKind", "key", "escapeNonAlphanumericCharacters", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/datadog/android/rum/model/ViewEvent;", "rumViewEvent", "onViewTracked", "(Lcom/datadog/android/rum/model/ViewEvent;)Z", "sdkErrorKind", "Lj6g;", "onErrorTracked", "(Ljava/lang/String;)V", "onSessionStopped", "()V", "Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;", "missedEventType", "onMissedEventTracked", "(Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;)V", "onSessionReplaySkippedFrameTracked", "ntpOffsetAtEndMs", "toMetricAttributes", "Ljava/lang/String;", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "J", "Z", "", "Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$TrackedView;", "trackedViewsById", "Ljava/util/Map;", "errorKindFrequencies", "missedEventCountByType", "Ljava/util/concurrent/atomic/AtomicInteger;", "sessionReplaySkippedFramesCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "firstTrackedView", "Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$TrackedView;", "lastTrackedView", "wasStopped", "Companion", "MissedEventType", "TrackedView", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class SessionEndedMetric {
    public static final String DURATION_KEY = "duration";
    public static final String HAS_BACKGROUND_EVENTS_TRACKING_ENABLED_KEY = "has_background_events_tracking_enabled";
    public static final String METRIC_TYPE_KEY = "metric_type";
    public static final String METRIC_TYPE_VALUE = "rum session ended";
    public static final String NO_VIEW_EVENTS_COUNT_ACTIONS_KEY = "actions";
    public static final String NO_VIEW_EVENTS_COUNT_ERRORS_KEY = "errors";
    public static final String NO_VIEW_EVENTS_COUNT_KEY = "no_view_events_count";
    public static final String NO_VIEW_EVENTS_COUNT_LONG_TASKS_KEY = "long_tasks";
    public static final String NO_VIEW_EVENTS_COUNT_RESOURCES_KEY = "resources";
    public static final String NTP_OFFSET_AT_END_KEY = "at_end";
    public static final String NTP_OFFSET_AT_START_KEY = "at_start";
    public static final String NTP_OFFSET_KEY = "ntp_offset";
    public static final String PRECONDITION_KEY = "precondition";
    public static final String PROCESS_TYPE_KEY = "process_type";
    public static final String PROCESS_TYPE_VALUE = "app";
    public static final String RSE_KEY = "rse";
    public static final String RUM_SESSION_ENDED_METRIC_NAME = "[Mobile Metric] RUM Session Ended";
    public static final String SDK_ERRORS_COUNT_BY_KIND_KEY = "by_kind";
    public static final String SDK_ERRORS_COUNT_KEY = "sdk_errors_count";
    public static final String SDK_ERRORS_COUNT_TOTAL_KEY = "total";
    public static final String SDK_ERROR_DEFAULT_KIND = "Empty error kind";
    public static final String SESSION_REPLAY_SKIPPED_FRAMES_COUNT = "sr_skipped_frames_count";
    private static final int TOP_ERROR_LIMIT = 5;
    public static final String VIEW_COUNTS_APP_LAUNCH_KEY = "app_launch";
    public static final String VIEW_COUNTS_BG_KEY = "background";
    public static final String VIEW_COUNTS_KEY = "views_count";
    public static final String VIEW_COUNTS_TOTAL_KEY = "total";
    public static final String VIEW_COUNT_WITH_HAS_REPLAY = "with_has_replay";
    public static final String WAS_STOPPED_KEY = "was_stopped";
    private final Map<String, Integer> errorKindFrequencies;
    private TrackedView firstTrackedView;
    private final boolean hasTrackBackgroundEventsEnabled;
    private TrackedView lastTrackedView;
    private final Map<MissedEventType, Integer> missedEventCountByType;
    private final long ntpOffsetAtStartMs;
    private final String sessionId;
    private AtomicInteger sessionReplaySkippedFramesCount;
    private final RumSessionScope.StartReason startReason;
    private final Map<String, TrackedView> trackedViewsById;
    private boolean wasStopped;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$TrackedView;", "", "viewUrl", "", "startMs", "", "durationNs", "hasReplay", "", "(Ljava/lang/String;JJZ)V", "getDurationNs", "()J", "getHasReplay", "()Z", "getStartMs", "getViewUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TrackedView {
        private final long durationNs;
        private final boolean hasReplay;
        private final long startMs;
        private final String viewUrl;

        public TrackedView(String str, long j, long j2, boolean z) {
            str.getClass();
            this.viewUrl = str;
            this.startMs = j;
            this.durationNs = j2;
            this.hasReplay = z;
        }

        public static /* synthetic */ TrackedView copy$default(TrackedView trackedView, String str, long j, long j2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = trackedView.viewUrl;
            }
            if ((i & 2) != 0) {
                j = trackedView.startMs;
            }
            if ((i & 4) != 0) {
                j2 = trackedView.durationNs;
            }
            if ((i & 8) != 0) {
                z = trackedView.hasReplay;
            }
            boolean z2 = z;
            return trackedView.copy(str, j, j2, z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getViewUrl() {
            return this.viewUrl;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getStartMs() {
            return this.startMs;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getDurationNs() {
            return this.durationNs;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getHasReplay() {
            return this.hasReplay;
        }

        public final TrackedView copy(String viewUrl, long startMs, long durationNs, boolean hasReplay) {
            viewUrl.getClass();
            return new TrackedView(viewUrl, startMs, durationNs, hasReplay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackedView)) {
                return false;
            }
            TrackedView trackedView = (TrackedView) other;
            return wl7.b(this.viewUrl, trackedView.viewUrl) && this.startMs == trackedView.startMs && this.durationNs == trackedView.durationNs && this.hasReplay == trackedView.hasReplay;
        }

        public final long getDurationNs() {
            return this.durationNs;
        }

        public final boolean getHasReplay() {
            return this.hasReplay;
        }

        public final long getStartMs() {
            return this.startMs;
        }

        public final String getViewUrl() {
            return this.viewUrl;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hasReplay) + ia.d(ia.d(this.viewUrl.hashCode() * 31, 31, this.startMs), 31, this.durationNs);
        }

        public String toString() {
            String str = this.viewUrl;
            long j = this.startMs;
            long j2 = this.durationNs;
            boolean z = this.hasReplay;
            StringBuilder sb = new StringBuilder("TrackedView(viewUrl=");
            sb.append(str);
            sb.append(", startMs=");
            sb.append(j);
            o6.p(sb, ", durationNs=", j2, ", hasReplay=");
            return z3.o(sb, z, ")");
        }
    }

    public SessionEndedMetric(String str, RumSessionScope.StartReason startReason, long j, boolean z) {
        str.getClass();
        startReason.getClass();
        this.sessionId = str;
        this.startReason = startReason;
        this.ntpOffsetAtStartMs = j;
        this.hasTrackBackgroundEventsEnabled = z;
        this.trackedViewsById = new LinkedHashMap();
        this.errorKindFrequencies = new LinkedHashMap();
        this.missedEventCountByType = new LinkedHashMap();
        this.sessionReplaySkippedFramesCount = new AtomicInteger(0);
    }

    private final long calculateDuration() {
        Long lValueOf;
        TrackedView trackedView = this.lastTrackedView;
        if (trackedView == null) {
            return 0L;
        }
        TrackedView trackedView2 = this.firstTrackedView;
        if (trackedView2 != null) {
            lValueOf = Long.valueOf(trackedView.getDurationNs() + TimeUnit.MILLISECONDS.toNanos(trackedView.getStartMs() - trackedView2.getStartMs()));
        } else {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return 0L;
    }

    private final String escapeNonAlphanumericCharacters(String key) {
        return new pxc("[^\\w']+").e(key, "_");
    }

    private final Map<String, Integer> resolveNoViewCountsAttributes() {
        Integer num = this.missedEventCountByType.get(MissedEventType.ACTION);
        Pair pair = new Pair(NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, Integer.valueOf(num != null ? num.intValue() : 0));
        Integer num2 = this.missedEventCountByType.get(MissedEventType.RESOURCE);
        Pair pair2 = new Pair(NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, Integer.valueOf(num2 != null ? num2.intValue() : 0));
        Integer num3 = this.missedEventCountByType.get(MissedEventType.ERROR);
        Pair pair3 = new Pair(NO_VIEW_EVENTS_COUNT_ERRORS_KEY, Integer.valueOf(num3 != null ? num3.intValue() : 0));
        Integer num4 = this.missedEventCountByType.get(MissedEventType.LONG_TASK);
        return lc9.a0(pair, pair2, pair3, new Pair(NO_VIEW_EVENTS_COUNT_LONG_TASKS_KEY, Integer.valueOf(num4 != null ? num4.intValue() : 0)));
    }

    private final Map<String, Long> resolveNtpOffsetAttributes(long ntpOffsetAtEnd) {
        return lc9.a0(new Pair(NTP_OFFSET_AT_START_KEY, Long.valueOf(this.ntpOffsetAtStartMs)), new Pair(NTP_OFFSET_AT_END_KEY, Long.valueOf(ntpOffsetAtEnd)));
    }

    private final Map<String, Object> resolveRseAttributes(long ntpOffsetAtEnd) {
        return lc9.a0(new Pair(PROCESS_TYPE_KEY, PROCESS_TYPE_VALUE), new Pair(PRECONDITION_KEY, this.startReason.getAsString()), new Pair("duration", Long.valueOf(calculateDuration())), new Pair(WAS_STOPPED_KEY, Boolean.valueOf(this.wasStopped)), new Pair(VIEW_COUNTS_KEY, resolveViewCountsAttributes()), new Pair(SDK_ERRORS_COUNT_KEY, resolveSDKErrorsCountAttributes()), new Pair(NO_VIEW_EVENTS_COUNT_KEY, resolveNoViewCountsAttributes()), new Pair(HAS_BACKGROUND_EVENTS_TRACKING_ENABLED_KEY, Boolean.valueOf(this.hasTrackBackgroundEventsEnabled)), new Pair(NTP_OFFSET_KEY, resolveNtpOffsetAttributes(ntpOffsetAtEnd)), new Pair(SESSION_REPLAY_SKIPPED_FRAMES_COUNT, Integer.valueOf(this.sessionReplaySkippedFramesCount.get())));
    }

    private final Map<String, Object> resolveSDKErrorsCountAttributes() {
        Collection<Integer> collectionValues = this.errorKindFrequencies.values();
        collectionValues.getClass();
        Iterator<T> it = collectionValues.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Number) it.next()).intValue();
        }
        return lc9.a0(new Pair("total", Integer.valueOf(iIntValue)), new Pair(SDK_ERRORS_COUNT_BY_KIND_KEY, resolveTop5ErrorsByKind()));
    }

    private final Map<String, Integer> resolveTop5ErrorsByKind() {
        int size = this.errorKindFrequencies.size();
        if (5 <= size) {
            size = 5;
        }
        List<Map.Entry> listSubList = z92.p1(this.errorKindFrequencies.entrySet(), new Comparator() { // from class: com.datadog.android.rum.internal.metric.SessionEndedMetric$resolveTop5ErrorsByKind$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ak2.i((Integer) ((Map.Entry) t2).getValue(), (Integer) ((Map.Entry) t).getValue());
            }
        }).subList(0, size);
        int iV = kc9.V(t92.r0(listSubList, 10));
        if (iV < 16) {
            iV = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
        for (Map.Entry entry : listSubList) {
            Pair pair = new Pair(escapeNonAlphanumericCharacters((String) entry.getKey()), entry.getValue());
            linkedHashMap.put(pair.d(), pair.e());
        }
        return linkedHashMap;
    }

    private final Map<String, Object> resolveViewCountsAttributes() {
        int i;
        int i2;
        Pair pair = new Pair("total", Integer.valueOf(this.trackedViewsById.size()));
        Collection<TrackedView> collectionValues = this.trackedViewsById.values();
        int i3 = 0;
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = collectionValues.iterator();
            i = 0;
            while (it.hasNext()) {
                if (wl7.b(((TrackedView) it.next()).getViewUrl(), RumViewManagerScope.RUM_BACKGROUND_VIEW_URL) && (i = i + 1) < 0) {
                    u63.n0();
                    throw null;
                }
            }
        }
        Pair pair2 = new Pair("background", Integer.valueOf(i));
        Collection<TrackedView> collectionValues2 = this.trackedViewsById.values();
        if ((collectionValues2 instanceof Collection) && collectionValues2.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<T> it2 = collectionValues2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                if (wl7.b(((TrackedView) it2.next()).getViewUrl(), RumViewManagerScope.RUM_APP_LAUNCH_VIEW_URL) && (i2 = i2 + 1) < 0) {
                    u63.n0();
                    throw null;
                }
            }
        }
        Pair pair3 = new Pair(VIEW_COUNTS_APP_LAUNCH_KEY, Integer.valueOf(i2));
        Collection<TrackedView> collectionValues3 = this.trackedViewsById.values();
        if (!(collectionValues3 instanceof Collection) || !collectionValues3.isEmpty()) {
            Iterator<T> it3 = collectionValues3.iterator();
            while (it3.hasNext()) {
                if (((TrackedView) it3.next()).getHasReplay() && (i3 = i3 + 1) < 0) {
                    u63.n0();
                    throw null;
                }
            }
        }
        return lc9.a0(pair, pair2, pair3, new Pair(VIEW_COUNT_WITH_HAS_REPLAY, Integer.valueOf(i3)));
    }

    public final void onErrorTracked(String sdkErrorKind) {
        if (sdkErrorKind == null) {
            sdkErrorKind = SDK_ERROR_DEFAULT_KIND;
        }
        Map<String, Integer> map = this.errorKindFrequencies;
        Integer num = map.get(sdkErrorKind);
        map.put(sdkErrorKind, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
    }

    public final void onMissedEventTracked(MissedEventType missedEventType) {
        missedEventType.getClass();
        Map<MissedEventType, Integer> map = this.missedEventCountByType;
        Integer num = map.get(missedEventType);
        map.put(missedEventType, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
    }

    public final void onSessionReplaySkippedFrameTracked() {
        this.sessionReplaySkippedFramesCount.incrementAndGet();
    }

    public final void onSessionStopped() {
        this.wasStopped = true;
    }

    public final boolean onViewTracked(ViewEvent rumViewEvent) {
        String url;
        rumViewEvent.getClass();
        if (!wl7.b(rumViewEvent.getSession().getId(), this.sessionId)) {
            return false;
        }
        TrackedView trackedView = this.trackedViewsById.get(rumViewEvent.getView().getId());
        if (trackedView == null || (url = trackedView.getViewUrl()) == null) {
            url = rumViewEvent.getView().getUrl();
        }
        String str = url;
        TrackedView trackedView2 = this.trackedViewsById.get(rumViewEvent.getView().getId());
        long startMs = trackedView2 != null ? trackedView2.getStartMs() : rumViewEvent.getDate();
        long timeSpent = rumViewEvent.getView().getTimeSpent();
        Boolean hasReplay = rumViewEvent.getSession().getHasReplay();
        TrackedView trackedView3 = new TrackedView(str, startMs, timeSpent, hasReplay != null ? hasReplay.booleanValue() : false);
        this.trackedViewsById.put(rumViewEvent.getView().getId(), trackedView3);
        if (this.firstTrackedView == null) {
            this.firstTrackedView = trackedView3;
        }
        this.lastTrackedView = trackedView3;
        return true;
    }

    public final Map<String, Object> toMetricAttributes(long ntpOffsetAtEndMs) {
        return lc9.a0(new Pair("metric_type", METRIC_TYPE_VALUE), new Pair(RSE_KEY, resolveRseAttributes(ntpOffsetAtEndMs)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;", "", "(Ljava/lang/String;I)V", "ACTION", "RESOURCE", "ERROR", "LONG_TASK", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum MissedEventType {
        ACTION,
        RESOURCE,
        ERROR,
        LONG_TASK;


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType$Companion;", "", "()V", "fromRawEvent", "Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;", "rawEvent", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final MissedEventType fromRawEvent(RumRawEvent rawEvent) {
                rawEvent.getClass();
                if (rawEvent instanceof RumRawEvent.AddError ? true : rawEvent instanceof RumRawEvent.StopResourceWithError) {
                    return MissedEventType.ERROR;
                }
                if (rawEvent instanceof RumRawEvent.StartAction) {
                    return MissedEventType.ACTION;
                }
                if (rawEvent instanceof RumRawEvent.StartResource) {
                    return MissedEventType.RESOURCE;
                }
                if (rawEvent instanceof RumRawEvent.AddLongTask) {
                    return MissedEventType.LONG_TASK;
                }
                return null;
            }

            private Companion() {
            }
        }
    }
}

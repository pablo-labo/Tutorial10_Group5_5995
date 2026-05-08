package com.datadog.android.rum.internal;

import android.app.ApplicationExitInfo;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.api.storage.EventType;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.feature.event.ThreadDump;
import com.datadog.android.core.internal.persistence.Deserializer;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.datadog.android.rum.internal.anr.ANRDetectorRunnable;
import com.datadog.android.rum.internal.anr.ANRException;
import com.datadog.android.rum.internal.anr.AndroidTraceParser;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.ViewEvent;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ab8;
import defpackage.bs4;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.l5;
import defpackage.mj8;
import defpackage.wl7;
import defpackage.zr4;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001EB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJi\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001cH\u0002¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020\u000e*\u00020(2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b)\u0010*J-\u00100\u001a\u00020/2\u000e\u0010,\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030+2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060-H\u0016¢\u0006\u0004\b0\u00101J-\u00103\u001a\u00020/2\u0006\u0010\"\u001a\u00020!2\u0006\u00102\u001a\u00020\u00052\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060-H\u0017¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00107R\u0018\u0010;\u001a\u000208*\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0018\u0010=\u001a\u00020<*\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R \u0010A\u001a\u0004\u0018\u00010\u001a*\b\u0012\u0004\u0012\u00020\u001a0\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u001a\u0010D\u001a\u0004\u0018\u00010\u0012*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lcom/datadog/android/rum/internal/DatadogLateCrashReporter;", "Lcom/datadog/android/rum/internal/LateCrashReporter;", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "Lab8;", "", "rumEventDeserializer", "Lcom/datadog/android/rum/internal/anr/AndroidTraceParser;", "androidTraceParser", "<init>", "(Lcom/datadog/android/core/InternalSdkCore;Lcom/datadog/android/core/internal/persistence/Deserializer;Lcom/datadog/android/rum/internal/anr/AndroidTraceParser;)V", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lcom/datadog/android/rum/model/ErrorEvent$SourceType;", "sourceType", "Lcom/datadog/android/rum/model/ErrorEvent$Category;", "category", "", "errorLogMessage", "", NdkCrashLog.TIMESTAMP_KEY_NAME, "timeSinceAppStartMs", "stacktrace", "errorType", "", "Lcom/datadog/android/core/feature/event/ThreadDump;", "threadDumps", "Lcom/datadog/android/rum/model/ViewEvent;", "viewEvent", "Lcom/datadog/android/rum/model/ErrorEvent;", "resolveErrorEventFromViewEvent", "(Lcom/datadog/android/api/context/DatadogContext;Lcom/datadog/android/rum/model/ErrorEvent$SourceType;Lcom/datadog/android/rum/model/ErrorEvent$Category;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/datadog/android/rum/model/ViewEvent;)Lcom/datadog/android/rum/model/ErrorEvent;", "Landroid/app/ApplicationExitInfo;", "anrExitInfo", "readThreadsDump", "(Landroid/app/ApplicationExitInfo;)Ljava/util/List;", "lastViewEvent", "updateViewEvent", "(Lcom/datadog/android/rum/model/ViewEvent;)Lcom/datadog/android/rum/model/ViewEvent;", "Lcom/datadog/android/rum/model/ErrorEvent$SourceType$Companion;", "tryFromSource", "(Lcom/datadog/android/rum/model/ErrorEvent$SourceType$Companion;Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$SourceType;", "", "event", "Lcom/datadog/android/api/storage/DataWriter;", "rumWriter", "Lj6g;", "handleNdkCrashEvent", "(Ljava/util/Map;Lcom/datadog/android/api/storage/DataWriter;)V", "lastRumViewEventJson", "handleAnrCrash", "(Landroid/app/ApplicationExitInfo;Lab8;Lcom/datadog/android/api/storage/DataWriter;)V", "Lcom/datadog/android/core/InternalSdkCore;", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "Lcom/datadog/android/rum/internal/anr/AndroidTraceParser;", "", "getSampleRate", "(Lcom/datadog/android/rum/model/ViewEvent;)F", "sampleRate", "", "isWithinSessionAvailability", "(Lcom/datadog/android/rum/model/ViewEvent;)Z", "getMainThread", "(Ljava/util/List;)Lcom/datadog/android/core/feature/event/ThreadDump;", "mainThread", "getRumSessionId", "(Lcom/datadog/android/api/context/DatadogContext;)Ljava/lang/String;", "rumSessionId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DatadogLateCrashReporter implements LateCrashReporter {
    public static final String INFO_RUM_FEATURE_NOT_REGISTERED = "RUM feature is not registered, won't report NDK crash info as RUM error.";
    public static final String MISSING_ANR_TRACE = "Last known exit reason has no trace information attached, cannot report fatal ANR.";
    public static final String NDK_CRASH_EVENT_MISSING_MANDATORY_FIELDS = "RUM feature received a NDK crash event where one or more mandatory (timestamp, signalName, stacktrace, message, lastViewEvent) fields are either missing or have wrong type.";
    private final AndroidTraceParser androidTraceParser;
    private final Deserializer<ab8, Object> rumEventDeserializer;
    private final InternalSdkCore sdkCore;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long VIEW_EVENT_AVAILABILITY_TIME_THRESHOLD = 14400000;

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.DatadogLateCrashReporter$tryFromSource$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05781 extends mj8 implements gu5<String> {
        final /* synthetic */ String $sourceType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05781(String str) {
            super(0);
            this.$sourceType = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return l5.l("Error parsing source type from NDK crash event: ", this.$sourceType);
        }
    }

    public /* synthetic */ DatadogLateCrashReporter(InternalSdkCore internalSdkCore, Deserializer deserializer, AndroidTraceParser androidTraceParser, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(internalSdkCore, (i & 2) != 0 ? new RumEventDeserializer(internalSdkCore.getInternalLogger()) : deserializer, (i & 4) != 0 ? new AndroidTraceParser(internalSdkCore.getInternalLogger()) : androidTraceParser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThreadDump getMainThread(List<ThreadDump> list) {
        Object next;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((ThreadDump) next).getName(), "main")) {
                break;
            }
        }
        return (ThreadDump) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getRumSessionId(DatadogContext datadogContext) {
        Map<String, Object> map = datadogContext.getFeaturesContext().get("rum");
        if (map == null) {
            map = bs4.a;
        }
        Object obj = map.get("session_id");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    private final float getSampleRate(ViewEvent viewEvent) {
        Number sessionSampleRate;
        ViewEvent.Configuration configuration = viewEvent.getDd().getConfiguration();
        if (configuration == null || (sessionSampleRate = configuration.getSessionSampleRate()) == null) {
            return 0.0f;
        }
        return sessionSampleRate.floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isWithinSessionAvailability(ViewEvent viewEvent) {
        return System.currentTimeMillis() - viewEvent.getDate() < VIEW_EVENT_AVAILABILITY_TIME_THRESHOLD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ThreadDump> readThreadsDump(ApplicationExitInfo anrExitInfo) throws IOException {
        InputStream traceInputStream = anrExitInfo.getTraceInputStream();
        if (traceInputStream != null) {
            return this.androidTraceParser.parse$dd_sdk_android_rum_release(traceInputStream);
        }
        InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) C05771.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        return zr4.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.datadog.android.rum.model.ErrorEvent resolveErrorEventFromViewEvent(com.datadog.android.api.context.DatadogContext r47, com.datadog.android.rum.model.ErrorEvent.SourceType r48, com.datadog.android.rum.model.ErrorEvent.Category r49, java.lang.String r50, long r51, java.lang.Long r53, java.lang.String r54, java.lang.String r55, java.util.List<com.datadog.android.core.feature.event.ThreadDump> r56, com.datadog.android.rum.model.ViewEvent r57) {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.DatadogLateCrashReporter.resolveErrorEventFromViewEvent(com.datadog.android.api.context.DatadogContext, com.datadog.android.rum.model.ErrorEvent$SourceType, com.datadog.android.rum.model.ErrorEvent$Category, java.lang.String, long, java.lang.Long, java.lang.String, java.lang.String, java.util.List, com.datadog.android.rum.model.ViewEvent):com.datadog.android.rum.model.ErrorEvent");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ErrorEvent.SourceType tryFromSource(ErrorEvent.SourceType.Companion companion, String str) {
        if (str == null) {
            return ErrorEvent.SourceType.NDK;
        }
        try {
            return ErrorEvent.SourceType.INSTANCE.fromJson(str);
        } catch (NoSuchElementException e) {
            InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.ERROR, InternalLogger.Target.TELEMETRY, (gu5) new C05781(str), (Throwable) e, false, (Map) null, 48, (Object) null);
            return ErrorEvent.SourceType.NDK;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewEvent updateViewEvent(ViewEvent lastViewEvent) {
        ViewEvent.Crash crash;
        ViewEvent.Crash crash2 = lastViewEvent.getView().getCrash();
        if (crash2 == null || (crash = crash2.copy(crash2.getCount() + 1)) == null) {
            crash = new ViewEvent.Crash(1L);
        }
        ViewEvent.Crash crash3 = crash;
        ViewEvent.ViewEventView view = lastViewEvent.getView();
        return ViewEvent.copy$default(lastViewEvent, 0L, null, null, null, null, null, null, null, view.copy((2013265919 & 1) != 0 ? view.id : null, (2013265919 & 2) != 0 ? view.referrer : null, (2013265919 & 4) != 0 ? view.url : null, (2013265919 & 8) != 0 ? view.name : null, (2013265919 & 16) != 0 ? view.loadingTime : null, (2013265919 & 32) != 0 ? view.networkSettledTime : null, (2013265919 & 64) != 0 ? view.interactionToNextViewTime : null, (2013265919 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? view.loadingType : null, (2013265919 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? view.timeSpent : 0L, (2013265919 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? view.firstContentfulPaint : null, (2013265919 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? view.largestContentfulPaint : null, (2013265919 & 2048) != 0 ? view.largestContentfulPaintTargetSelector : null, (2013265919 & 4096) != 0 ? view.firstInputDelay : null, (2013265919 & 8192) != 0 ? view.firstInputTime : null, (2013265919 & 16384) != 0 ? view.firstInputTargetSelector : null, (2013265919 & 32768) != 0 ? view.interactionToNextPaint : null, (2013265919 & 65536) != 0 ? view.interactionToNextPaintTime : null, (2013265919 & 131072) != 0 ? view.interactionToNextPaintTargetSelector : null, (2013265919 & 262144) != 0 ? view.cumulativeLayoutShift : null, (2013265919 & 524288) != 0 ? view.cumulativeLayoutShiftTime : null, (2013265919 & 1048576) != 0 ? view.cumulativeLayoutShiftTargetSelector : null, (2013265919 & 2097152) != 0 ? view.domComplete : null, (2013265919 & 4194304) != 0 ? view.domContentLoaded : null, (2013265919 & 8388608) != 0 ? view.domInteractive : null, (2013265919 & 16777216) != 0 ? view.loadEvent : null, (2013265919 & 33554432) != 0 ? view.firstByte : null, (2013265919 & 67108864) != 0 ? view.customTimings : null, (2013265919 & 134217728) != 0 ? view.isActive : Boolean.FALSE, (2013265919 & 268435456) != 0 ? view.isSlowRendered : null, (2013265919 & 536870912) != 0 ? view.action : null, (2013265919 & 1073741824) != 0 ? view.error : null, (2013265919 & Integer.MIN_VALUE) != 0 ? view.crash : crash3, (16383 & 1) != 0 ? view.longTask : null, (16383 & 2) != 0 ? view.frozenFrame : null, (16383 & 4) != 0 ? view.resource : null, (16383 & 8) != 0 ? view.frustration : null, (16383 & 16) != 0 ? view.inForegroundPeriods : null, (16383 & 32) != 0 ? view.memoryAverage : null, (16383 & 64) != 0 ? view.memoryMax : null, (16383 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? view.cpuTicksCount : null, (16383 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? view.cpuTicksPerSecond : null, (16383 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? view.refreshRateAverage : null, (16383 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? view.refreshRateMin : null, (16383 & 2048) != 0 ? view.flutterBuildTime : null, (16383 & 4096) != 0 ? view.flutterRasterTime : null, (16383 & 8192) != 0 ? view.jsRefreshRate : null), null, null, null, null, null, null, null, null, ViewEvent.Dd.copy$default(lastViewEvent.getDd(), null, null, null, lastViewEvent.getDd().getDocumentVersion() + 1, null, null, 55, null), null, null, null, null, 4062975, null);
    }

    @Override // com.datadog.android.rum.internal.LateCrashReporter
    public void handleAnrCrash(ApplicationExitInfo anrExitInfo, ab8 lastRumViewEventJson, DataWriter<Object> rumWriter) {
        anrExitInfo.getClass();
        lastRumViewEventJson.getClass();
        rumWriter.getClass();
        Object objDeserialize = this.rumEventDeserializer.deserialize(lastRumViewEventJson);
        ViewEvent viewEvent = objDeserialize instanceof ViewEvent ? (ViewEvent) objDeserialize : null;
        if (viewEvent == null) {
            return;
        }
        if (anrExitInfo.getTimestamp() > viewEvent.getDate()) {
            FeatureScope feature = this.sdkCore.getFeature("rum");
            if (feature == null) {
                InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) AnonymousClass1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            } else {
                FeatureScope.DefaultImpls.withWriteContext$default(feature, false, new AnonymousClass2(viewEvent, this, anrExitInfo, rumWriter), 1, null);
            }
        }
    }

    @Override // com.datadog.android.rum.internal.LateCrashReporter
    public void handleNdkCrashEvent(Map<?, ?> event, DataWriter<Object> rumWriter) {
        ViewEvent viewEvent;
        event.getClass();
        rumWriter.getClass();
        FeatureScope feature = this.sdkCore.getFeature("rum");
        if (feature == null) {
            InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.INFO, InternalLogger.Target.USER, (gu5) C05751.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            return;
        }
        Object obj = event.get("sourceType");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = event.get(NdkCrashLog.TIMESTAMP_KEY_NAME);
        Long l = obj2 instanceof Long ? (Long) obj2 : null;
        Object obj3 = event.get("timeSinceAppStartMs");
        Long l2 = obj3 instanceof Long ? (Long) obj3 : null;
        Object obj4 = event.get("signalName");
        String str2 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = event.get("stacktrace");
        String str3 = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = event.get("message");
        String str4 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = event.get("lastViewEvent");
        ab8 ab8Var = obj7 instanceof ab8 ? (ab8) obj7 : null;
        if (ab8Var != null) {
            Object objDeserialize = this.rumEventDeserializer.deserialize(ab8Var);
            viewEvent = objDeserialize instanceof ViewEvent ? (ViewEvent) objDeserialize : null;
        } else {
            viewEvent = null;
        }
        if (l == null || str2 == null || str3 == null || str4 == null || viewEvent == null) {
            InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) C05762.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        } else {
            FeatureScope.DefaultImpls.withWriteContext$default(feature, false, new AnonymousClass3(str, str4, l, l2, str3, str2, viewEvent, rumWriter), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/datadog/android/rum/internal/DatadogLateCrashReporter$Companion;", "", "()V", "INFO_RUM_FEATURE_NOT_REGISTERED", "", "MISSING_ANR_TRACE", "NDK_CRASH_EVENT_MISSING_MANDATORY_FIELDS", "VIEW_EVENT_AVAILABILITY_TIME_THRESHOLD", "", "getVIEW_EVENT_AVAILABILITY_TIME_THRESHOLD$dd_sdk_android_rum_release", "()J", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getVIEW_EVENT_AVAILABILITY_TIME_THRESHOLD$dd_sdk_android_rum_release() {
            return DatadogLateCrashReporter.VIEW_EVENT_AVAILABILITY_TIME_THRESHOLD;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.DatadogLateCrashReporter$handleAnrCrash$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "RUM feature is not registered, won't report NDK crash info as RUM error.";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.DatadogLateCrashReporter$handleNdkCrashEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05751 extends mj8 implements gu5<String> {
        public static final C05751 INSTANCE = new C05751();

        public C05751() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "RUM feature is not registered, won't report NDK crash info as RUM error.";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.DatadogLateCrashReporter$handleNdkCrashEvent$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05762 extends mj8 implements gu5<String> {
        public static final C05762 INSTANCE = new C05762();

        public C05762() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return DatadogLateCrashReporter.NDK_CRASH_EVENT_MISSING_MANDATORY_FIELDS;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.DatadogLateCrashReporter$readThreadsDump$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05771 extends mj8 implements gu5<String> {
        public static final C05771 INSTANCE = new C05771();

        public C05771() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return DatadogLateCrashReporter.MISSING_ANR_TRACE;
        }
    }

    public DatadogLateCrashReporter(InternalSdkCore internalSdkCore, Deserializer<ab8, Object> deserializer, AndroidTraceParser androidTraceParser) {
        internalSdkCore.getClass();
        deserializer.getClass();
        androidTraceParser.getClass();
        this.sdkCore = internalSdkCore;
        this.rumEventDeserializer = deserializer;
        this.androidTraceParser = androidTraceParser;
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.DatadogLateCrashReporter$handleNdkCrashEvent$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lcom/datadog/android/api/storage/EventBatchWriter;", "eventBatchWriter", "Lj6g;", "invoke", "(Lcom/datadog/android/api/context/DatadogContext;Lcom/datadog/android/api/storage/EventBatchWriter;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class AnonymousClass3 extends mj8 implements Function2<DatadogContext, EventBatchWriter, j6g> {
        final /* synthetic */ String $errorLogMessage;
        final /* synthetic */ ViewEvent $lastViewEvent;
        final /* synthetic */ DataWriter<Object> $rumWriter;
        final /* synthetic */ String $signalName;
        final /* synthetic */ String $sourceType;
        final /* synthetic */ String $stacktrace;
        final /* synthetic */ Long $timeSinceAppStartMs;
        final /* synthetic */ Long $timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, String str2, Long l, Long l2, String str3, String str4, ViewEvent viewEvent, DataWriter<Object> dataWriter) {
            super(2);
            this.$sourceType = str;
            this.$errorLogMessage = str2;
            this.$timestamp = l;
            this.$timeSinceAppStartMs = l2;
            this.$stacktrace = str3;
            this.$signalName = str4;
            this.$lastViewEvent = viewEvent;
            this.$rumWriter = dataWriter;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DatadogContext datadogContext, EventBatchWriter eventBatchWriter) {
            datadogContext.getClass();
            eventBatchWriter.getClass();
            DatadogLateCrashReporter datadogLateCrashReporter = DatadogLateCrashReporter.this;
            ErrorEvent errorEventResolveErrorEventFromViewEvent = datadogLateCrashReporter.resolveErrorEventFromViewEvent(datadogContext, datadogLateCrashReporter.tryFromSource(ErrorEvent.SourceType.INSTANCE, this.$sourceType), ErrorEvent.Category.EXCEPTION, this.$errorLogMessage, this.$timestamp.longValue(), this.$timeSinceAppStartMs, this.$stacktrace, this.$signalName, null, this.$lastViewEvent);
            DataWriter<Object> dataWriter = this.$rumWriter;
            EventType eventType = EventType.CRASH;
            dataWriter.write(eventBatchWriter, errorEventResolveErrorEventFromViewEvent, eventType);
            if (DatadogLateCrashReporter.this.isWithinSessionAvailability(this.$lastViewEvent)) {
                this.$rumWriter.write(eventBatchWriter, DatadogLateCrashReporter.this.updateViewEvent(this.$lastViewEvent), eventType);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ j6g invoke(DatadogContext datadogContext, EventBatchWriter eventBatchWriter) {
            invoke2(datadogContext, eventBatchWriter);
            return j6g.a;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.DatadogLateCrashReporter$handleAnrCrash$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lcom/datadog/android/api/storage/EventBatchWriter;", "eventBatchWriter", "Lj6g;", "invoke", "(Lcom/datadog/android/api/context/DatadogContext;Lcom/datadog/android/api/storage/EventBatchWriter;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class AnonymousClass2 extends mj8 implements Function2<DatadogContext, EventBatchWriter, j6g> {
        final /* synthetic */ ApplicationExitInfo $anrExitInfo;
        final /* synthetic */ ViewEvent $lastViewEvent;
        final /* synthetic */ DataWriter<Object> $rumWriter;
        final /* synthetic */ DatadogLateCrashReporter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ViewEvent viewEvent, DatadogLateCrashReporter datadogLateCrashReporter, ApplicationExitInfo applicationExitInfo, DataWriter<Object> dataWriter) {
            super(2);
            this.$lastViewEvent = viewEvent;
            this.this$0 = datadogLateCrashReporter;
            this.$anrExitInfo = applicationExitInfo;
            this.$rumWriter = dataWriter;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DatadogContext datadogContext, EventBatchWriter eventBatchWriter) throws IOException {
            datadogContext.getClass();
            eventBatchWriter.getClass();
            if (wl7.b(this.$lastViewEvent.getSession().getId(), this.this$0.getRumSessionId(datadogContext))) {
                return;
            }
            Long lastFatalAnrSent = this.this$0.sdkCore.getLastFatalAnrSent();
            long timestamp = this.$anrExitInfo.getTimestamp();
            if (lastFatalAnrSent != null && timestamp == lastFatalAnrSent.longValue()) {
                return;
            }
            List threadsDump = this.this$0.readThreadsDump(this.$anrExitInfo);
            if (threadsDump.isEmpty()) {
                return;
            }
            DatadogLateCrashReporter datadogLateCrashReporter = this.this$0;
            ErrorEvent.SourceType sourceType = ErrorEvent.SourceType.ANDROID;
            ErrorEvent.Category category = ErrorEvent.Category.ANR;
            long timestamp2 = this.$anrExitInfo.getTimestamp();
            ThreadDump mainThread = this.this$0.getMainThread(threadsDump);
            String stack = mainThread != null ? mainThread.getStack() : null;
            String str = stack == null ? "" : stack;
            String canonicalName = ANRException.class.getCanonicalName();
            ErrorEvent errorEventResolveErrorEventFromViewEvent = datadogLateCrashReporter.resolveErrorEventFromViewEvent(datadogContext, sourceType, category, ANRDetectorRunnable.ANR_MESSAGE, timestamp2, null, str, canonicalName == null ? "" : canonicalName, threadsDump, this.$lastViewEvent);
            DataWriter<Object> dataWriter = this.$rumWriter;
            EventType eventType = EventType.CRASH;
            dataWriter.write(eventBatchWriter, errorEventResolveErrorEventFromViewEvent, eventType);
            if (this.this$0.isWithinSessionAvailability(this.$lastViewEvent)) {
                this.$rumWriter.write(eventBatchWriter, this.this$0.updateViewEvent(this.$lastViewEvent), eventType);
            }
            this.this$0.sdkCore.writeLastFatalAnrSent(this.$anrExitInfo.getTimestamp());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ j6g invoke(DatadogContext datadogContext, EventBatchWriter eventBatchWriter) throws IOException {
            invoke2(datadogContext, eventBatchWriter);
            return j6g.a;
        }
    }
}

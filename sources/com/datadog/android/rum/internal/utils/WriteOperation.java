package com.datadog.android.rum.internal.utils;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.api.storage.EventType;
import com.datadog.android.api.storage.NoOpDataWriter;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import com.datadog.android.rum.internal.monitor.AdvancedRumMonitor;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.u63;
import defpackage.wl7;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00102\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0016\u001a\u00020\u00002\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\bj\u0002`\u0014¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\u00002\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\bj\u0002`\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R&\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\bj\u0002`\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR&\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\bj\u0002`\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001e¨\u0006\""}, d2 = {"Lcom/datadog/android/rum/internal/utils/WriteOperation;", "", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Lcom/datadog/android/api/storage/DataWriter;", "rumDataWriter", "Lcom/datadog/android/api/storage/EventType;", "eventType", "Lkotlin/Function1;", "Lcom/datadog/android/api/context/DatadogContext;", "eventSource", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lcom/datadog/android/api/storage/DataWriter;Lcom/datadog/android/api/storage/EventType;Lkotlin/jvm/functions/Function1;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Lj6g;", "notifyEventWriteFailure", "(Ljava/lang/Exception;)V", "Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "Lcom/datadog/android/rum/internal/utils/EventOutcomeAction;", RumEventDeserializer.EVENT_TYPE_ACTION, "onError", "(Lkotlin/jvm/functions/Function1;)Lcom/datadog/android/rum/internal/utils/WriteOperation;", "onSuccess", "submit", "()V", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "Lcom/datadog/android/api/storage/DataWriter;", "Lcom/datadog/android/api/storage/EventType;", "Lkotlin/jvm/functions/Function1;", "advancedRumMonitor", "Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class WriteOperation {
    public static final String NO_ERROR_CALLBACK_PROVIDED_WARNING = "Write operation failed, but no onError callback was provided.";
    public static final String WRITE_OPERATION_FAILED_ERROR = "Write operation failed.";
    public static final String WRITE_OPERATION_IGNORED = "Write operation ignored, session is expired or RUM feature is disabled.";
    private final AdvancedRumMonitor advancedRumMonitor;
    private final Function1<DatadogContext, Object> eventSource;
    private final EventType eventType;
    private Function1<? super AdvancedRumMonitor, j6g> onError;
    private Function1<? super AdvancedRumMonitor, j6g> onSuccess;
    private final DataWriter<Object> rumDataWriter;
    private final FeatureSdkCore sdkCore;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Function1<AdvancedRumMonitor, j6g> NO_OP_EVENT_OUTCOME_ACTION = WriteOperation$Companion$NO_OP_EVENT_OUTCOME_ACTION$1.INSTANCE;

    /* JADX WARN: Multi-variable type inference failed */
    public WriteOperation(FeatureSdkCore featureSdkCore, DataWriter<Object> dataWriter, EventType eventType, Function1<? super DatadogContext, ? extends Object> function1) {
        featureSdkCore.getClass();
        dataWriter.getClass();
        eventType.getClass();
        function1.getClass();
        this.sdkCore = featureSdkCore;
        this.rumDataWriter = dataWriter;
        this.eventType = eventType;
        this.eventSource = function1;
        RumMonitor rumMonitor = GlobalRumMonitor.get(featureSdkCore);
        this.advancedRumMonitor = rumMonitor instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor : null;
        Function1<AdvancedRumMonitor, j6g> function12 = NO_OP_EVENT_OUTCOME_ACTION;
        this.onError = function12;
        this.onSuccess = function12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyEventWriteFailure(Exception exception) {
        ArrayList arrayListD0 = u63.d0(InternalLogger.Target.USER);
        if (exception != null) {
            arrayListD0.add(InternalLogger.Target.TELEMETRY);
        }
        InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.ERROR, (List) arrayListD0, (gu5) AnonymousClass1.INSTANCE, (Throwable) exception, false, (Map) null, 48, (Object) null);
        AdvancedRumMonitor advancedRumMonitor = this.advancedRumMonitor;
        if (advancedRumMonitor != null) {
            if (wl7.b(this.onError, NO_OP_EVENT_OUTCOME_ACTION)) {
                InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, (gu5) WriteOperation$notifyEventWriteFailure$2$1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            }
            this.onError.invoke(advancedRumMonitor);
        }
    }

    public static /* synthetic */ void notifyEventWriteFailure$default(WriteOperation writeOperation, Exception exc, int i, Object obj) {
        if ((i & 1) != 0) {
            exc = null;
        }
        writeOperation.notifyEventWriteFailure(exc);
    }

    public final WriteOperation onError(Function1<? super AdvancedRumMonitor, j6g> action) {
        action.getClass();
        this.onError = action;
        return this;
    }

    public final WriteOperation onSuccess(Function1<? super AdvancedRumMonitor, j6g> action) {
        action.getClass();
        this.onSuccess = action;
        return this;
    }

    public final void submit() {
        FeatureScope feature = this.sdkCore.getFeature("rum");
        if (feature != null) {
            FeatureScope.DefaultImpls.withWriteContext$default(feature, false, new C06121(), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R'\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/datadog/android/rum/internal/utils/WriteOperation$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "Lj6g;", "Lcom/datadog/android/rum/internal/utils/EventOutcomeAction;", "NO_OP_EVENT_OUTCOME_ACTION", "Lkotlin/jvm/functions/Function1;", "getNO_OP_EVENT_OUTCOME_ACTION", "()Lkotlin/jvm/functions/Function1;", "", "NO_ERROR_CALLBACK_PROVIDED_WARNING", "Ljava/lang/String;", "WRITE_OPERATION_FAILED_ERROR", "WRITE_OPERATION_IGNORED", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function1<AdvancedRumMonitor, j6g> getNO_OP_EVENT_OUTCOME_ACTION() {
            return WriteOperation.NO_OP_EVENT_OUTCOME_ACTION;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.utils.WriteOperation$submit$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lcom/datadog/android/api/storage/EventBatchWriter;", "eventBatchWriter", "Lj6g;", "invoke", "(Lcom/datadog/android/api/context/DatadogContext;Lcom/datadog/android/api/storage/EventBatchWriter;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class C06121 extends mj8 implements Function2<DatadogContext, EventBatchWriter, j6g> {
        public C06121() {
            super(2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DatadogContext datadogContext, EventBatchWriter eventBatchWriter) {
            datadogContext.getClass();
            eventBatchWriter.getClass();
            boolean z = WriteOperation.this.rumDataWriter instanceof NoOpDataWriter;
            WriteOperation writeOperation = WriteOperation.this;
            if (z) {
                InternalLogger.DefaultImpls.log$default(writeOperation.sdkCore.getInternalLogger(), InternalLogger.Level.INFO, InternalLogger.Target.USER, (gu5) C01251.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
                AdvancedRumMonitor advancedRumMonitor = WriteOperation.this.advancedRumMonitor;
                if (advancedRumMonitor != null) {
                    WriteOperation.this.onError.invoke(advancedRumMonitor);
                    return;
                }
                return;
            }
            try {
                boolean zWrite = WriteOperation.this.rumDataWriter.write(eventBatchWriter, writeOperation.eventSource.invoke(datadogContext), WriteOperation.this.eventType);
                WriteOperation writeOperation2 = WriteOperation.this;
                if (!zWrite) {
                    WriteOperation.notifyEventWriteFailure$default(writeOperation2, null, 1, null);
                    return;
                }
                AdvancedRumMonitor advancedRumMonitor2 = writeOperation2.advancedRumMonitor;
                if (advancedRumMonitor2 != null) {
                    WriteOperation.this.onSuccess.invoke(advancedRumMonitor2);
                }
            } catch (Exception e) {
                WriteOperation.this.notifyEventWriteFailure(e);
            }
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.internal.utils.WriteOperation$submit$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
        public static final class C01251 extends mj8 implements gu5<String> {
            public static final C01251 INSTANCE = new C01251();

            public C01251() {
                super(0);
            }

            @Override // defpackage.gu5
            public final String invoke() {
                return WriteOperation.WRITE_OPERATION_IGNORED;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ j6g invoke(DatadogContext datadogContext, EventBatchWriter eventBatchWriter) {
            invoke2(datadogContext, eventBatchWriter);
            return j6g.a;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.utils.WriteOperation$notifyEventWriteFailure$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return WriteOperation.WRITE_OPERATION_FAILED_ERROR;
        }
    }
}

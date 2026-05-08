package com.datadog.android.ndk.internal;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.context.UserInfo;
import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.core.internal.persistence.Deserializer;
import com.datadog.android.core.internal.persistence.file.FileExtKt;
import com.datadog.android.core.internal.persistence.file.FileReader;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import com.datadog.android.log.LogAttributes;
import com.datadog.android.ndk.internal.NdkCrashHandler;
import com.datadog.android.rum.internal.RumFeature;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.a32;
import defpackage.ab8;
import defpackage.gu5;
import defpackage.hb5;
import defpackage.l5;
import defpackage.lc9;
import defpackage.m50;
import defpackage.mj8;
import defpackage.muf;
import defpackage.sy3;
import defpackage.u63;
import defpackage.wf3;
import defpackage.zve;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000 e2\u00020\u0001:\u0001eB\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0006\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001c\u001a\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0019H\u0002¢\u0006\u0004\b&\u0010\u001bJG\u0010+\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 2\b\u0010'\u001a\u0004\u0018\u00010\b2\b\u0010(\u001a\u0004\u0018\u00010\u00142\b\u0010)\u001a\u0004\u0018\u00010\f2\b\u0010*\u001a\u0004\u0018\u00010\n2\u0006\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b+\u0010,J-\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070.2\b\u0010-\u001a\u0004\u0018\u00010\u00142\u0006\u0010'\u001a\u00020\bH\u0002¢\u0006\u0004\b/\u00100J/\u00102\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 2\u0006\u00101\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0014H\u0003¢\u0006\u0004\b2\u00103JO\u00105\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 2\u0006\u00101\u001a\u00020\u00072\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070.2\u0006\u0010'\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\n2\b\u0010)\u001a\u0004\u0018\u00010\fH\u0003¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0019H\u0002¢\u0006\u0004\b7\u0010\u001bJ\u000f\u00108\u001a\u00020\u0019H\u0016¢\u0006\u0004\b8\u0010\u001bJ\u001f\u00109\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b9\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010;R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010;R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010;R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010<R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010=R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010>R\u001a\u0010\u0016\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER$\u0010-\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010)\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010*\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010U\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010\\\u001a\u00020[8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010b\u001a\u00020[8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010]\u001a\u0004\bc\u0010_\"\u0004\bd\u0010a¨\u0006f"}, d2 = {"Lcom/datadog/android/ndk/internal/DatadogNdkCrashHandler;", "Lcom/datadog/android/ndk/internal/NdkCrashHandler;", "Ljava/io/File;", "storageDir", "Ljava/util/concurrent/ExecutorService;", "dataPersistenceExecutorService", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "", "Lcom/datadog/android/ndk/internal/NdkCrashLog;", "ndkCrashLogDeserializer", "Lcom/datadog/android/api/context/NetworkInfo;", "networkInfoDeserializer", "Lcom/datadog/android/api/context/UserInfo;", "userInfoDeserializer", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/core/internal/persistence/file/FileReader;", "", "envFileReader", "Lkotlin/Function0;", "Lab8;", "lastRumViewEventProvider", "nativeCrashSourceType", "<init>", "(Ljava/io/File;Ljava/util/concurrent/ExecutorService;Lcom/datadog/android/core/internal/persistence/Deserializer;Lcom/datadog/android/core/internal/persistence/Deserializer;Lcom/datadog/android/core/internal/persistence/Deserializer;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/internal/persistence/file/FileReader;Lgu5;Ljava/lang/String;)V", "Lj6g;", "readCrashData", "()V", "file", "fileReader", "readFileContent", "(Ljava/io/File;Lcom/datadog/android/core/internal/persistence/file/FileReader;)Ljava/lang/String;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Lcom/datadog/android/ndk/internal/NdkCrashHandler$ReportTarget;", "reportTarget", "checkAndHandleNdkCrashReport", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lcom/datadog/android/ndk/internal/NdkCrashHandler$ReportTarget;)V", "clearAllReferences", "ndkCrashLog", "lastViewEvent", "lastUserInfo", "lastNetworkInfo", "handleNdkCrashLog", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lcom/datadog/android/ndk/internal/NdkCrashLog;Lab8;Lcom/datadog/android/api/context/UserInfo;Lcom/datadog/android/api/context/NetworkInfo;Lcom/datadog/android/ndk/internal/NdkCrashHandler$ReportTarget;)V", "lastRumViewEvent", "", "generateLogAttributes", "(Lab8;Lcom/datadog/android/ndk/internal/NdkCrashLog;)Ljava/util/Map;", "errorLogMessage", "sendCrashRumEvent", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Ljava/lang/String;Lcom/datadog/android/ndk/internal/NdkCrashLog;Lab8;)V", "logAttributes", "sendCrashLogEvent", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Ljava/lang/String;Ljava/util/Map;Lcom/datadog/android/ndk/internal/NdkCrashLog;Lcom/datadog/android/api/context/NetworkInfo;Lcom/datadog/android/api/context/UserInfo;)V", "clearCrashLog", "prepareData", "handleNdkCrash", "Ljava/util/concurrent/ExecutorService;", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/core/internal/persistence/file/FileReader;", "Lgu5;", "Ljava/lang/String;", "getNativeCrashSourceType$dd_sdk_android_core_release", "()Ljava/lang/String;", "ndkCrashDataDirectory", "Ljava/io/File;", "getNdkCrashDataDirectory$dd_sdk_android_core_release", "()Ljava/io/File;", "Lab8;", "getLastRumViewEvent$dd_sdk_android_core_release", "()Lab8;", "setLastRumViewEvent$dd_sdk_android_core_release", "(Lab8;)V", "Lcom/datadog/android/api/context/UserInfo;", "getLastUserInfo$dd_sdk_android_core_release", "()Lcom/datadog/android/api/context/UserInfo;", "setLastUserInfo$dd_sdk_android_core_release", "(Lcom/datadog/android/api/context/UserInfo;)V", "Lcom/datadog/android/api/context/NetworkInfo;", "getLastNetworkInfo$dd_sdk_android_core_release", "()Lcom/datadog/android/api/context/NetworkInfo;", "setLastNetworkInfo$dd_sdk_android_core_release", "(Lcom/datadog/android/api/context/NetworkInfo;)V", "lastNdkCrashLog", "Lcom/datadog/android/ndk/internal/NdkCrashLog;", "getLastNdkCrashLog$dd_sdk_android_core_release", "()Lcom/datadog/android/ndk/internal/NdkCrashLog;", "setLastNdkCrashLog$dd_sdk_android_core_release", "(Lcom/datadog/android/ndk/internal/NdkCrashLog;)V", "", "processedForLogs", "Z", "getProcessedForLogs$dd_sdk_android_core_release", "()Z", "setProcessedForLogs$dd_sdk_android_core_release", "(Z)V", "processedForRum", "getProcessedForRum$dd_sdk_android_core_release", "setProcessedForRum$dd_sdk_android_core_release", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DatadogNdkCrashHandler implements NdkCrashHandler {
    public static final String CRASH_DATA_FILE_NAME = "crash_log";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String ERROR_READ_NDK_DIR = "Error while trying to read the NDK crash directory";
    public static final String INFO_LOGS_FEATURE_NOT_REGISTERED = "Logs feature is not registered, won't report NDK crash info as log.";
    public static final String INFO_RUM_FEATURE_NOT_REGISTERED = "RUM feature is not registered, won't report NDK crash info as RUM error.";
    public static final String LOGGER_NAME = "ndk_crash";
    public static final String LOG_CRASH_MSG = "NDK crash detected with signal: %s";
    public static final String NDK_CRASH_REPORTS_FOLDER_NAME = "ndk_crash_reports_v2";
    private static final String NDK_CRASH_REPORTS_PENDING_FOLDER_NAME = "ndk_crash_reports_intermediary_v2";
    public static final String NETWORK_INFO_FILE_NAME = "network_information";
    private static final String RUM_VIEW_EVENT_FILE_NAME = "last_view_event";
    private static final int STORAGE_VERSION = 2;
    public static final String USER_INFO_FILE_NAME = "user_information";
    public static final String WARN_CANNOT_READ_VIEW_INFO_DATA = "Cannot read application, session, view IDs data from view event.";
    private final ExecutorService dataPersistenceExecutorService;
    private final FileReader<byte[]> envFileReader;
    private final InternalLogger internalLogger;
    private NdkCrashLog lastNdkCrashLog;
    private NetworkInfo lastNetworkInfo;
    private ab8 lastRumViewEvent;
    private final gu5<ab8> lastRumViewEventProvider;
    private UserInfo lastUserInfo;
    private final String nativeCrashSourceType;
    private final File ndkCrashDataDirectory;
    private final Deserializer<String, NdkCrashLog> ndkCrashLogDeserializer;
    private final Deserializer<String, NetworkInfo> networkInfoDeserializer;
    private boolean processedForLogs;
    private boolean processedForRum;
    private final Deserializer<String, UserInfo> userInfoDeserializer;

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NdkCrashHandler.ReportTarget.values().length];
            try {
                iArr[NdkCrashHandler.ReportTarget.RUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NdkCrashHandler.ReportTarget.LOGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.ndk.internal.DatadogNdkCrashHandler$clearCrashLog$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return l5.l("Unable to clear the NDK crash report file: ", DatadogNdkCrashHandler.this.getNdkCrashDataDirectory().getAbsolutePath());
        }
    }

    public DatadogNdkCrashHandler(File file, ExecutorService executorService, Deserializer<String, NdkCrashLog> deserializer, Deserializer<String, NetworkInfo> deserializer2, Deserializer<String, UserInfo> deserializer3, InternalLogger internalLogger, FileReader<byte[]> fileReader, gu5<ab8> gu5Var, String str) {
        file.getClass();
        executorService.getClass();
        deserializer.getClass();
        deserializer2.getClass();
        deserializer3.getClass();
        internalLogger.getClass();
        fileReader.getClass();
        gu5Var.getClass();
        str.getClass();
        this.dataPersistenceExecutorService = executorService;
        this.ndkCrashLogDeserializer = deserializer;
        this.networkInfoDeserializer = deserializer2;
        this.userInfoDeserializer = deserializer3;
        this.internalLogger = internalLogger;
        this.envFileReader = fileReader;
        this.lastRumViewEventProvider = gu5Var;
        this.nativeCrashSourceType = str;
        this.ndkCrashDataDirectory = INSTANCE.getNdkGrantedDir(file);
    }

    private final void checkAndHandleNdkCrashReport(FeatureSdkCore sdkCore, NdkCrashHandler.ReportTarget reportTarget) {
        DatadogNdkCrashHandler datadogNdkCrashHandler;
        NdkCrashHandler.ReportTarget reportTarget2;
        NdkCrashLog ndkCrashLog = this.lastNdkCrashLog;
        if (ndkCrashLog != null) {
            datadogNdkCrashHandler = this;
            reportTarget2 = reportTarget;
            datadogNdkCrashHandler.handleNdkCrashLog(sdkCore, ndkCrashLog, this.lastRumViewEvent, this.lastUserInfo, this.lastNetworkInfo, reportTarget2);
        } else {
            datadogNdkCrashHandler = this;
            reportTarget2 = reportTarget;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[reportTarget2.ordinal()];
        if (i == 1) {
            datadogNdkCrashHandler.processedForRum = true;
        } else if (i == 2) {
            datadogNdkCrashHandler.processedForLogs = true;
        }
        if (datadogNdkCrashHandler.processedForRum && datadogNdkCrashHandler.processedForLogs) {
            datadogNdkCrashHandler.clearAllReferences();
        }
    }

    private final void clearAllReferences() {
        this.lastRumViewEvent = null;
        this.lastNetworkInfo = null;
        this.lastUserInfo = null;
        this.lastNdkCrashLog = null;
    }

    private final void clearCrashLog() {
        if (FileExtKt.existsSafe(this.ndkCrashDataDirectory, this.internalLogger)) {
            try {
                File[] fileArrListFilesSafe = FileExtKt.listFilesSafe(this.ndkCrashDataDirectory, this.internalLogger);
                if (fileArrListFilesSafe != null) {
                    for (File file : fileArrListFilesSafe) {
                        hb5.P(file);
                    }
                }
            } catch (Throwable th) {
                InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new AnonymousClass2(), th, false, (Map) null, 48, (Object) null);
            }
        }
    }

    private final Map<String, String> generateLogAttributes(ab8 lastRumViewEvent, NdkCrashLog ndkCrashLog) {
        muf mufVar;
        if (lastRumViewEvent == null) {
            return lc9.a0(new Pair(LogAttributes.ERROR_STACK, ndkCrashLog.getStacktrace()), new Pair(LogAttributes.ERROR_SOURCE_TYPE, this.nativeCrashSourceType));
        }
        try {
            DatadogNdkCrashHandler$generateLogAttributes$logAttributes$extractId$1 datadogNdkCrashHandler$generateLogAttributes$logAttributes$extractId$1 = new DatadogNdkCrashHandler$generateLogAttributes$logAttributes$extractId$1(lastRumViewEvent);
            mufVar = new muf(datadogNdkCrashHandler$generateLogAttributes$logAttributes$extractId$1.invoke("application"), datadogNdkCrashHandler$generateLogAttributes$logAttributes$extractId$1.invoke("session"), datadogNdkCrashHandler$generateLogAttributes$logAttributes$extractId$1.invoke("view"));
        } catch (Exception e) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, (gu5) DatadogNdkCrashHandler$generateLogAttributes$logAttributes$1.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            mufVar = new muf(null, null, null);
        }
        String str = (String) mufVar.a();
        String str2 = (String) mufVar.b();
        String str3 = (String) mufVar.c();
        return (str == null || str2 == null || str3 == null) ? lc9.a0(new Pair(LogAttributes.ERROR_STACK, ndkCrashLog.getStacktrace()), new Pair(LogAttributes.ERROR_SOURCE_TYPE, this.nativeCrashSourceType)) : lc9.a0(new Pair("session_id", str2), new Pair("application_id", str), new Pair(LogAttributes.RUM_VIEW_ID, str3), new Pair(LogAttributes.ERROR_STACK, ndkCrashLog.getStacktrace()), new Pair(LogAttributes.ERROR_SOURCE_TYPE, this.nativeCrashSourceType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleNdkCrash$lambda$1(DatadogNdkCrashHandler datadogNdkCrashHandler, FeatureSdkCore featureSdkCore, NdkCrashHandler.ReportTarget reportTarget) {
        datadogNdkCrashHandler.getClass();
        featureSdkCore.getClass();
        reportTarget.getClass();
        datadogNdkCrashHandler.checkAndHandleNdkCrashReport(featureSdkCore, reportTarget);
    }

    private final void handleNdkCrashLog(FeatureSdkCore sdkCore, NdkCrashLog ndkCrashLog, ab8 lastViewEvent, UserInfo lastUserInfo, NetworkInfo lastNetworkInfo, NdkCrashHandler.ReportTarget reportTarget) {
        if (ndkCrashLog == null) {
            return;
        }
        String str = String.format(Locale.US, LOG_CRASH_MSG, Arrays.copyOf(new Object[]{ndkCrashLog.getSignalName()}, 1));
        int i = WhenMappings.$EnumSwitchMapping$0[reportTarget.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            sendCrashLogEvent(sdkCore, str, generateLogAttributes(lastViewEvent, ndkCrashLog), ndkCrashLog, lastNetworkInfo, lastUserInfo);
        } else if (lastViewEvent != null) {
            sendCrashRumEvent(sdkCore, str, ndkCrashLog, lastViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prepareData$lambda$0(DatadogNdkCrashHandler datadogNdkCrashHandler) {
        datadogNdkCrashHandler.getClass();
        datadogNdkCrashHandler.readCrashData();
    }

    private final void readCrashData() {
        try {
            if (FileExtKt.existsSafe(this.ndkCrashDataDirectory, this.internalLogger)) {
                try {
                    this.lastRumViewEvent = this.lastRumViewEventProvider.invoke();
                    File[] fileArrListFilesSafe = FileExtKt.listFilesSafe(this.ndkCrashDataDirectory, this.internalLogger);
                    if (fileArrListFilesSafe != null) {
                        for (File file : fileArrListFilesSafe) {
                            String name = file.getName();
                            if (name != null) {
                                int iHashCode = name.hashCode();
                                if (iHashCode != -528983909) {
                                    if (iHashCode != 408381112) {
                                        if (iHashCode == 1847397036 && name.equals(CRASH_DATA_FILE_NAME)) {
                                            String textSafe$default = FileExtKt.readTextSafe$default(file, null, this.internalLogger, 1, null);
                                            this.lastNdkCrashLog = textSafe$default != null ? this.ndkCrashLogDeserializer.deserialize(textSafe$default) : null;
                                        }
                                    } else if (name.equals(USER_INFO_FILE_NAME)) {
                                        String fileContent = readFileContent(file, this.envFileReader);
                                        this.lastUserInfo = fileContent != null ? this.userInfoDeserializer.deserialize(fileContent) : null;
                                    }
                                } else if (name.equals(NETWORK_INFO_FILE_NAME)) {
                                    String fileContent2 = readFileContent(file, this.envFileReader);
                                    this.lastNetworkInfo = fileContent2 != null ? this.networkInfoDeserializer.deserialize(fileContent2) : null;
                                }
                            }
                        }
                    }
                    clearCrashLog();
                } catch (SecurityException e) {
                    InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) C05672.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
                    clearCrashLog();
                }
            }
        } catch (Throwable th) {
            clearCrashLog();
            throw th;
        }
    }

    private final String readFileContent(File file, FileReader<byte[]> fileReader) {
        byte[] data = fileReader.readData(file);
        if (data.length == 0) {
            return null;
        }
        String str = new String(data, a32.b);
        if (!zve.L(str, "\\u0000", false) && !zve.L(str, "\u0000", false)) {
            return str;
        }
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.TELEMETRY, (gu5) new DatadogNdkCrashHandler$readFileContent$1$1(file, str, data), (Throwable) null, false, (Map) null, 56, (Object) null);
        return str;
    }

    private final void sendCrashLogEvent(FeatureSdkCore sdkCore, String errorLogMessage, Map<String, String> logAttributes, NdkCrashLog ndkCrashLog, NetworkInfo lastNetworkInfo, UserInfo lastUserInfo) {
        FeatureScope feature = sdkCore.getFeature("logs");
        if (feature != null) {
            feature.sendEvent(lc9.a0(new Pair("loggerName", "ndk_crash"), new Pair("type", "ndk_crash"), new Pair("message", errorLogMessage), new Pair(RumFeature.EVENT_ATTRIBUTES_PROPERTY, logAttributes), new Pair(NdkCrashLog.TIMESTAMP_KEY_NAME, Long.valueOf(ndkCrashLog.getTimestamp())), new Pair("networkInfo", lastNetworkInfo), new Pair("userInfo", lastUserInfo)));
        } else {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.INFO, InternalLogger.Target.USER, (gu5) AnonymousClass1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        }
    }

    private final void sendCrashRumEvent(FeatureSdkCore sdkCore, String errorLogMessage, NdkCrashLog ndkCrashLog, ab8 lastViewEvent) {
        FeatureScope feature = sdkCore.getFeature("rum");
        if (feature != null) {
            feature.sendEvent(lc9.a0(new Pair("type", "ndk_crash"), new Pair("sourceType", this.nativeCrashSourceType), new Pair(NdkCrashLog.TIMESTAMP_KEY_NAME, Long.valueOf(ndkCrashLog.getTimestamp())), new Pair("timeSinceAppStartMs", ndkCrashLog.getTimeSinceAppStartMs()), new Pair("signalName", ndkCrashLog.getSignalName()), new Pair("stacktrace", ndkCrashLog.getStacktrace()), new Pair("message", errorLogMessage), new Pair("lastViewEvent", lastViewEvent)));
        } else {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.INFO, InternalLogger.Target.USER, (gu5) C05681.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        }
    }

    /* JADX INFO: renamed from: getLastNdkCrashLog$dd_sdk_android_core_release, reason: from getter */
    public final NdkCrashLog getLastNdkCrashLog() {
        return this.lastNdkCrashLog;
    }

    /* JADX INFO: renamed from: getLastNetworkInfo$dd_sdk_android_core_release, reason: from getter */
    public final NetworkInfo getLastNetworkInfo() {
        return this.lastNetworkInfo;
    }

    /* JADX INFO: renamed from: getLastRumViewEvent$dd_sdk_android_core_release, reason: from getter */
    public final ab8 getLastRumViewEvent() {
        return this.lastRumViewEvent;
    }

    /* JADX INFO: renamed from: getLastUserInfo$dd_sdk_android_core_release, reason: from getter */
    public final UserInfo getLastUserInfo() {
        return this.lastUserInfo;
    }

    /* JADX INFO: renamed from: getNativeCrashSourceType$dd_sdk_android_core_release, reason: from getter */
    public final String getNativeCrashSourceType() {
        return this.nativeCrashSourceType;
    }

    /* JADX INFO: renamed from: getNdkCrashDataDirectory$dd_sdk_android_core_release, reason: from getter */
    public final File getNdkCrashDataDirectory() {
        return this.ndkCrashDataDirectory;
    }

    /* JADX INFO: renamed from: getProcessedForLogs$dd_sdk_android_core_release, reason: from getter */
    public final boolean getProcessedForLogs() {
        return this.processedForLogs;
    }

    /* JADX INFO: renamed from: getProcessedForRum$dd_sdk_android_core_release, reason: from getter */
    public final boolean getProcessedForRum() {
        return this.processedForRum;
    }

    @Override // com.datadog.android.ndk.internal.NdkCrashHandler
    public void handleNdkCrash(FeatureSdkCore sdkCore, NdkCrashHandler.ReportTarget reportTarget) {
        sdkCore.getClass();
        reportTarget.getClass();
        ConcurrencyExtKt.submitSafe(this.dataPersistenceExecutorService, "NDK crash report ", this.internalLogger, new wf3(0, this, sdkCore, reportTarget));
    }

    @Override // com.datadog.android.ndk.internal.NdkCrashHandler
    public void prepareData() {
        ConcurrencyExtKt.submitSafe(this.dataPersistenceExecutorService, "NDK crash check", this.internalLogger, new m50(this, 2));
    }

    public final void setLastNdkCrashLog$dd_sdk_android_core_release(NdkCrashLog ndkCrashLog) {
        this.lastNdkCrashLog = ndkCrashLog;
    }

    public final void setLastNetworkInfo$dd_sdk_android_core_release(NetworkInfo networkInfo) {
        this.lastNetworkInfo = networkInfo;
    }

    public final void setLastRumViewEvent$dd_sdk_android_core_release(ab8 ab8Var) {
        this.lastRumViewEvent = ab8Var;
    }

    public final void setLastUserInfo$dd_sdk_android_core_release(UserInfo userInfo) {
        this.lastUserInfo = userInfo;
    }

    public final void setProcessedForLogs$dd_sdk_android_core_release(boolean z) {
        this.processedForLogs = z;
    }

    public final void setProcessedForRum$dd_sdk_android_core_release(boolean z) {
        this.processedForRum = z;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0015J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0017J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0002\b\u0019J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0015\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u001dJ\u0015\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/datadog/android/ndk/internal/DatadogNdkCrashHandler$Companion;", "", "()V", "CRASH_DATA_FILE_NAME", "", "ERROR_READ_NDK_DIR", "INFO_LOGS_FEATURE_NOT_REGISTERED", "INFO_RUM_FEATURE_NOT_REGISTERED", "LOGGER_NAME", "LOG_CRASH_MSG", "NDK_CRASH_REPORTS_FOLDER_NAME", "NDK_CRASH_REPORTS_PENDING_FOLDER_NAME", "NETWORK_INFO_FILE_NAME", "RUM_VIEW_EVENT_FILE_NAME", "STORAGE_VERSION", "", "USER_INFO_FILE_NAME", "WARN_CANNOT_READ_VIEW_INFO_DATA", "getGrantedNetworkInfoFile", "Ljava/io/File;", "storageDir", "getGrantedNetworkInfoFile$dd_sdk_android_core_release", "getGrantedUserInfoFile", "getGrantedUserInfoFile$dd_sdk_android_core_release", "getLastViewEventFile", "getLastViewEventFile$dd_sdk_android_core_release", "getNdkGrantedDir", "getNdkPendingDir", "getPendingNetworkInfoFile", "getPendingNetworkInfoFile$dd_sdk_android_core_release", "getPendingUserInfoFile", "getPendingUserInfoFile$dd_sdk_android_core_release", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final File getNdkGrantedDir(File storageDir) {
            return new File(storageDir, DatadogNdkCrashHandler.NDK_CRASH_REPORTS_FOLDER_NAME);
        }

        private final File getNdkPendingDir(File storageDir) {
            return new File(storageDir, DatadogNdkCrashHandler.NDK_CRASH_REPORTS_PENDING_FOLDER_NAME);
        }

        public final File getGrantedNetworkInfoFile$dd_sdk_android_core_release(File storageDir) {
            storageDir.getClass();
            return new File(getNdkGrantedDir(storageDir), DatadogNdkCrashHandler.NETWORK_INFO_FILE_NAME);
        }

        public final File getGrantedUserInfoFile$dd_sdk_android_core_release(File storageDir) {
            storageDir.getClass();
            return new File(getNdkGrantedDir(storageDir), DatadogNdkCrashHandler.USER_INFO_FILE_NAME);
        }

        @sy3
        public final File getLastViewEventFile$dd_sdk_android_core_release(File storageDir) {
            storageDir.getClass();
            return new File(getNdkGrantedDir(storageDir), "last_view_event");
        }

        public final File getPendingNetworkInfoFile$dd_sdk_android_core_release(File storageDir) {
            storageDir.getClass();
            return new File(getNdkPendingDir(storageDir), DatadogNdkCrashHandler.NETWORK_INFO_FILE_NAME);
        }

        public final File getPendingUserInfoFile$dd_sdk_android_core_release(File storageDir) {
            storageDir.getClass();
            return new File(getNdkPendingDir(storageDir), DatadogNdkCrashHandler.USER_INFO_FILE_NAME);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.ndk.internal.DatadogNdkCrashHandler$readCrashData$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05672 extends mj8 implements gu5<String> {
        public static final C05672 INSTANCE = new C05672();

        public C05672() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return DatadogNdkCrashHandler.ERROR_READ_NDK_DIR;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.ndk.internal.DatadogNdkCrashHandler$sendCrashLogEvent$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return DatadogNdkCrashHandler.INFO_LOGS_FEATURE_NOT_REGISTERED;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.ndk.internal.DatadogNdkCrashHandler$sendCrashRumEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05681 extends mj8 implements gu5<String> {
        public static final C05681 INSTANCE = new C05681();

        public C05681() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "RUM feature is not registered, won't report NDK crash info as RUM error.";
        }
    }

    public /* synthetic */ DatadogNdkCrashHandler(File file, ExecutorService executorService, Deserializer deserializer, Deserializer deserializer2, Deserializer deserializer3, InternalLogger internalLogger, FileReader fileReader, gu5 gu5Var, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, executorService, deserializer, deserializer2, deserializer3, internalLogger, fileReader, gu5Var, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? "ndk" : str);
    }
}

package com.datadog.android.log;

import com.datadog.android.Datadog;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.api.feature.FeatureScope;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.log.internal.LogsFeature;
import defpackage.gu5;
import defpackage.mj8;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/datadog/android/log/Logs;", "", "<init>", "()V", "Lcom/datadog/android/log/LogsConfiguration;", "logsConfiguration", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Lj6g;", "enable", "(Lcom/datadog/android/log/LogsConfiguration;Lcom/datadog/android/api/SdkCore;)V", "", "isEnabled", "(Lcom/datadog/android/api/SdkCore;)Z", "", "key", "value", "addAttribute", "(Ljava/lang/String;Ljava/lang/Object;Lcom/datadog/android/api/SdkCore;)V", "removeAttribute", "(Ljava/lang/String;Lcom/datadog/android/api/SdkCore;)V", "LOGS_NOT_ENABLED_MESSAGE", "Ljava/lang/String;", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class Logs {
    public static final Logs INSTANCE = new Logs();
    public static final String LOGS_NOT_ENABLED_MESSAGE = "You're trying to add attributes to logs, but the feature is not enabled. Please enable it first.";

    private Logs() {
    }

    public static final void addAttribute(String key, Object value, SdkCore sdkCore) {
        key.getClass();
        sdkCore.getClass();
        FeatureSdkCore featureSdkCore = (FeatureSdkCore) sdkCore;
        FeatureScope feature = featureSdkCore.getFeature("logs");
        LogsFeature logsFeature = feature != null ? (LogsFeature) feature.unwrap() : null;
        if (logsFeature == null) {
            InternalLogger.DefaultImpls.log$default(featureSdkCore.getInternalLogger(), InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) AnonymousClass1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        } else {
            logsFeature.addAttribute$dd_sdk_android_logs_release(key, value);
        }
    }

    public static /* synthetic */ void addAttribute$default(String str, Object obj, SdkCore sdkCore, int i, Object obj2) {
        if ((i & 4) != 0) {
            sdkCore = Datadog.getInstance$default(null, 1, null);
        }
        addAttribute(str, obj, sdkCore);
    }

    public static final void enable(LogsConfiguration logsConfiguration, SdkCore sdkCore) {
        logsConfiguration.getClass();
        sdkCore.getClass();
        FeatureSdkCore featureSdkCore = (FeatureSdkCore) sdkCore;
        featureSdkCore.registerFeature(new LogsFeature(featureSdkCore, logsConfiguration.getCustomEndpointUrl$dd_sdk_android_logs_release(), logsConfiguration.getEventMapper$dd_sdk_android_logs_release()));
    }

    public static /* synthetic */ void enable$default(LogsConfiguration logsConfiguration, SdkCore sdkCore, int i, Object obj) {
        if ((i & 2) != 0) {
            sdkCore = Datadog.getInstance$default(null, 1, null);
        }
        enable(logsConfiguration, sdkCore);
    }

    public static final boolean isEnabled(SdkCore sdkCore) {
        sdkCore.getClass();
        return ((FeatureSdkCore) sdkCore).getFeature("logs") != null;
    }

    public static /* synthetic */ boolean isEnabled$default(SdkCore sdkCore, int i, Object obj) {
        if ((i & 1) != 0) {
            sdkCore = Datadog.getInstance$default(null, 1, null);
        }
        return isEnabled(sdkCore);
    }

    public static final void removeAttribute(String key, SdkCore sdkCore) {
        key.getClass();
        sdkCore.getClass();
        FeatureSdkCore featureSdkCore = (FeatureSdkCore) sdkCore;
        FeatureScope feature = featureSdkCore.getFeature("logs");
        LogsFeature logsFeature = feature != null ? (LogsFeature) feature.unwrap() : null;
        if (logsFeature == null) {
            InternalLogger.DefaultImpls.log$default(featureSdkCore.getInternalLogger(), InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) C05601.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        } else {
            logsFeature.removeAttribute$dd_sdk_android_logs_release(key);
        }
    }

    public static /* synthetic */ void removeAttribute$default(String str, SdkCore sdkCore, int i, Object obj) {
        if ((i & 2) != 0) {
            sdkCore = Datadog.getInstance$default(null, 1, null);
        }
        removeAttribute(str, sdkCore);
    }

    /* JADX INFO: renamed from: com.datadog.android.log.Logs$addAttribute$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return Logs.LOGS_NOT_ENABLED_MESSAGE;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.log.Logs$removeAttribute$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05601 extends mj8 implements gu5<String> {
        public static final C05601 INSTANCE = new C05601();

        public C05601() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return Logs.LOGS_NOT_ENABLED_MESSAGE;
        }
    }

    public static final boolean isEnabled() {
        return isEnabled$default(null, 1, null);
    }

    public static final void enable(LogsConfiguration logsConfiguration) {
        logsConfiguration.getClass();
        enable$default(logsConfiguration, null, 2, null);
    }

    public static final void addAttribute(String str, Object obj) {
        str.getClass();
        addAttribute$default(str, obj, null, 4, null);
    }

    public static final void removeAttribute(String str) {
        str.getClass();
        removeAttribute$default(str, null, 2, null);
    }
}

package com.datadog.android.log.internal.logger;

import android.util.Log;
import com.datadog.android.log.Logger;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.datadog.android.rum.internal.RumFeature;
import defpackage.pxc;
import defpackage.u40;
import defpackage.ut0;
import defpackage.w20;
import defpackage.wve;
import defpackage.zve;
import io.jsonwebtoken.JwtParser;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\r\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\fJW\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJk\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u00022\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010 J\u0011\u0010#\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b!\u0010\"J\u001f\u0010(\u001a\u0004\u0018\u00010\t2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0$H\u0000¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u0006\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b/\u0010.¨\u00061"}, d2 = {"Lcom/datadog/android/log/internal/logger/LogcatLogHandler;", "Lcom/datadog/android/log/internal/logger/LogHandler;", "", "serviceName", "", "useClassnameAsTag", "isDebug", "<init>", "(Ljava/lang/String;ZZ)V", "Ljava/lang/StackTraceElement;", "stackTraceElement", "resolveTag", "(Ljava/lang/StackTraceElement;)Ljava/lang/String;", "resolveSuffix", "", "level", "message", "", RumFeature.EVENT_THROWABLE_PROPERTY, "", "", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "tags", "", NdkCrashLog.TIMESTAMP_KEY_NAME, "Lj6g;", "handleLog", "(ILjava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;Ljava/util/Set;Ljava/lang/Long;)V", "errorKind", "errorMessage", "errorStacktrace", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/lang/Long;)V", "getCallerStackElement$dd_sdk_android_logs_release", "()Ljava/lang/StackTraceElement;", "getCallerStackElement", "", "stackTrace", "findValidCallStackElement$dd_sdk_android_logs_release", "([Ljava/lang/StackTraceElement;)Ljava/lang/StackTraceElement;", "findValidCallStackElement", "Ljava/lang/String;", "getServiceName$dd_sdk_android_logs_release", "()Ljava/lang/String;", "Z", "getUseClassnameAsTag$dd_sdk_android_logs_release", "()Z", "isDebug$dd_sdk_android_logs_release", "Companion", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class LogcatLogHandler implements LogHandler {
    private static final String[] IGNORED_CLASS_NAMES;
    private static final String[] IGNORED_PACKAGE_PREFIXES;
    private static final int MAX_TAG_LENGTH = 23;
    private final boolean isDebug;
    private final String serviceName;
    private final boolean useClassnameAsTag;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0 == true ? 1 : 0);
    private static final pxc ANONYMOUS_CLASS = new pxc("(\\$\\d+)+$");

    static {
        String canonicalName = Logger.class.getCanonicalName();
        String canonicalName2 = LogHandler.class.getCanonicalName();
        String canonicalName3 = LogHandler.class.getCanonicalName();
        IGNORED_CLASS_NAMES = new String[]{canonicalName, canonicalName2, canonicalName3 != null ? canonicalName3.concat("$DefaultImpls") : null, LogcatLogHandler.class.getCanonicalName(), ConditionalLogHandler.class.getCanonicalName(), CombinedLogHandler.class.getCanonicalName(), DatadogLogHandler.class.getCanonicalName()};
        IGNORED_PACKAGE_PREFIXES = new String[]{"com.datadog.android.timber", "timber.log"};
    }

    public LogcatLogHandler(String str, boolean z, boolean z2) {
        str.getClass();
        this.serviceName = str;
        this.useClassnameAsTag = z;
        this.isDebug = z2;
    }

    private final String resolveSuffix(StackTraceElement stackTraceElement) {
        if (stackTraceElement == null) {
            return "";
        }
        String methodName = stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        return w20.k(u40.f("\t| at .", methodName, "(", fileName, ":"), stackTraceElement.getLineNumber(), ")");
    }

    private final String resolveTag(StackTraceElement stackTraceElement) {
        String strO0;
        if (stackTraceElement == null) {
            strO0 = this.serviceName;
        } else {
            String className = stackTraceElement.getClassName();
            className.getClass();
            String strE = ANONYMOUS_CLASS.e(className, "");
            strO0 = zve.o0(JwtParser.SEPARATOR_CHAR, strE, strE);
        }
        strO0.getClass();
        return strO0;
    }

    public final StackTraceElement findValidCallStackElement$dd_sdk_android_logs_release(StackTraceElement[] stackTrace) {
        stackTrace.getClass();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!ut0.f0(stackTraceElement.getClassName(), IGNORED_CLASS_NAMES)) {
                for (String str : IGNORED_PACKAGE_PREFIXES) {
                    String className = stackTraceElement.getClassName();
                    className.getClass();
                    if (wve.K(className, str, false)) {
                        break;
                    }
                }
                return stackTraceElement;
            }
        }
        return null;
    }

    public final StackTraceElement getCallerStackElement$dd_sdk_android_logs_release() {
        if (!this.isDebug || !this.useClassnameAsTag) {
            return null;
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        stackTrace.getClass();
        return findValidCallStackElement$dd_sdk_android_logs_release(stackTrace);
    }

    /* JADX INFO: renamed from: getServiceName$dd_sdk_android_logs_release, reason: from getter */
    public final String getServiceName() {
        return this.serviceName;
    }

    /* JADX INFO: renamed from: getUseClassnameAsTag$dd_sdk_android_logs_release, reason: from getter */
    public final boolean getUseClassnameAsTag() {
        return this.useClassnameAsTag;
    }

    @Override // com.datadog.android.log.internal.logger.LogHandler
    public void handleLog(int level, String message, Throwable throwable, Map<String, ? extends Object> attributes, Set<String> tags, Long timestamp) {
        message.getClass();
        attributes.getClass();
        tags.getClass();
        StackTraceElement callerStackElement$dd_sdk_android_logs_release = getCallerStackElement$dd_sdk_android_logs_release();
        String strResolveTag = resolveTag(callerStackElement$dd_sdk_android_logs_release);
        Log.println(level, strResolveTag, message + resolveSuffix(callerStackElement$dd_sdk_android_logs_release));
        if (throwable != null) {
            Log.println(level, strResolveTag, Log.getStackTraceString(throwable));
        }
    }

    /* JADX INFO: renamed from: isDebug$dd_sdk_android_logs_release, reason: from getter */
    public final boolean getIsDebug() {
        return this.isDebug;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/log/internal/logger/LogcatLogHandler$Companion;", "", "<init>", "()V", "", "", "IGNORED_CLASS_NAMES", "[Ljava/lang/String;", "getIGNORED_CLASS_NAMES$dd_sdk_android_logs_release", "()[Ljava/lang/String;", "IGNORED_PACKAGE_PREFIXES", "getIGNORED_PACKAGE_PREFIXES$dd_sdk_android_logs_release", "Lpxc;", "ANONYMOUS_CLASS", "Lpxc;", "", "MAX_TAG_LENGTH", "I", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String[] getIGNORED_CLASS_NAMES$dd_sdk_android_logs_release() {
            return LogcatLogHandler.IGNORED_CLASS_NAMES;
        }

        public final String[] getIGNORED_PACKAGE_PREFIXES$dd_sdk_android_logs_release() {
            return LogcatLogHandler.IGNORED_PACKAGE_PREFIXES;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LogcatLogHandler(String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? false : z2);
    }

    @Override // com.datadog.android.log.internal.logger.LogHandler
    public void handleLog(int level, String message, String errorKind, String errorMessage, String errorStacktrace, Map<String, ? extends Object> attributes, Set<String> tags, Long timestamp) {
        message.getClass();
        attributes.getClass();
        tags.getClass();
        StackTraceElement callerStackElement$dd_sdk_android_logs_release = getCallerStackElement$dd_sdk_android_logs_release();
        String strResolveTag = resolveTag(callerStackElement$dd_sdk_android_logs_release);
        Log.println(level, strResolveTag, message + resolveSuffix(callerStackElement$dd_sdk_android_logs_release));
        if (errorStacktrace != null) {
            Log.println(level, strResolveTag, errorStacktrace);
        }
    }
}

package com.datadog.android.api.feature;

import android.content.Context;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/api/feature/Feature;", "", "Landroid/content/Context;", "appContext", "Lj6g;", "onInitialize", "(Landroid/content/Context;)V", "onStop", "()V", "", "getName", "()Ljava/lang/String;", "name", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface Feature {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String LOGS_FEATURE_NAME = "logs";
    public static final String NDK_CRASH_REPORTS_FEATURE_NAME = "ndk-crash-reporting";
    public static final String RUM_FEATURE_NAME = "rum";
    public static final String SESSION_REPLAY_FEATURE_NAME = "session-replay";
    public static final String SESSION_REPLAY_RESOURCES_FEATURE_NAME = "session-replay-resources";
    public static final String TRACING_FEATURE_NAME = "tracing";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/datadog/android/api/feature/Feature$Companion;", "", "()V", "LOGS_FEATURE_NAME", "", "NDK_CRASH_REPORTS_FEATURE_NAME", "RUM_FEATURE_NAME", "SESSION_REPLAY_FEATURE_NAME", "SESSION_REPLAY_RESOURCES_FEATURE_NAME", "TRACING_FEATURE_NAME", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String LOGS_FEATURE_NAME = "logs";
        public static final String NDK_CRASH_REPORTS_FEATURE_NAME = "ndk-crash-reporting";
        public static final String RUM_FEATURE_NAME = "rum";
        public static final String SESSION_REPLAY_FEATURE_NAME = "session-replay";
        public static final String SESSION_REPLAY_RESOURCES_FEATURE_NAME = "session-replay-resources";
        public static final String TRACING_FEATURE_NAME = "tracing";

        private Companion() {
        }
    }

    String getName();

    void onInitialize(Context appContext);

    void onStop();
}

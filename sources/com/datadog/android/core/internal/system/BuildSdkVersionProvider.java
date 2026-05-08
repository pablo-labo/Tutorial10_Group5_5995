package com.datadog.android.core.internal.system;

import android.os.Build;
import com.datadog.android.lint.InternalApi;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@InternalApi
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;", "", "version", "", "getVersion", "()I", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface BuildSdkVersionProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider$Companion;", "", "()V", "DEFAULT", "Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;", "getDEFAULT", "()Lcom/datadog/android/core/internal/system/BuildSdkVersionProvider;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final BuildSdkVersionProvider DEFAULT = new BuildSdkVersionProvider() { // from class: com.datadog.android.core.internal.system.BuildSdkVersionProvider$Companion$DEFAULT$1
            private final int version = Build.VERSION.SDK_INT;

            @Override // com.datadog.android.core.internal.system.BuildSdkVersionProvider
            public int getVersion() {
                return this.version;
            }
        };

        private Companion() {
        }

        public final BuildSdkVersionProvider getDEFAULT() {
            return DEFAULT;
        }
    }

    int getVersion();
}

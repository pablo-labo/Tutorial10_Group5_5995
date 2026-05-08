package com.datadog.android.rum.internal.vitals;

import android.view.Window;
import com.datadog.android.api.InternalLogger;
import defpackage.gu5;
import defpackage.ut7;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ)\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/JankStatsProvider;", "", "Landroid/view/Window;", "window", "Lut7$a;", "listener", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lut7;", "createJankStatsAndTrack", "(Landroid/view/Window;Lut7$a;Lcom/datadog/android/api/InternalLogger;)Lut7;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface JankStatsProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/JankStatsProvider$Companion;", "", "()V", "DEFAULT", "Lcom/datadog/android/rum/internal/vitals/JankStatsProvider;", "getDEFAULT", "()Lcom/datadog/android/rum/internal/vitals/JankStatsProvider;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final JankStatsProvider DEFAULT = new JankStatsProvider() { // from class: com.datadog.android.rum.internal.vitals.JankStatsProvider$Companion$DEFAULT$1
            @Override // com.datadog.android.rum.internal.vitals.JankStatsProvider
            public ut7 createJankStatsAndTrack(Window window, ut7.a listener, InternalLogger internalLogger) {
                window.getClass();
                listener.getClass();
                internalLogger.getClass();
                try {
                    return new ut7(window, listener);
                } catch (IllegalStateException e) {
                    InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) JankStatsProvider$Companion$DEFAULT$1$createJankStatsAndTrack$1.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
                    return null;
                }
            }
        };

        private Companion() {
        }

        public final JankStatsProvider getDEFAULT() {
            return DEFAULT;
        }
    }

    ut7 createJankStatsAndTrack(Window window, ut7.a listener, InternalLogger internalLogger);
}

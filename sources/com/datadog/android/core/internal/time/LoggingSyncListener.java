package com.datadog.android.core.internal.time;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.log.LogAttributes;
import com.datadog.android.rum.internal.RumFeature;
import defpackage.b2f;
import defpackage.gu5;
import defpackage.l5;
import defpackage.mj8;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/datadog/android/core/internal/time/LoggingSyncListener;", "Lb2f;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "", LogAttributes.HOST, "Lj6g;", "onStartSync", "(Ljava/lang/String;)V", "", "ticksDelta", "responseTimeMs", "onSuccess", "(JJ)V", "", RumFeature.EVENT_THROWABLE_PROPERTY, "onError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/datadog/android/api/InternalLogger;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class LoggingSyncListener implements b2f {
    private final InternalLogger internalLogger;

    /* JADX INFO: renamed from: com.datadog.android.core.internal.time.LoggingSyncListener$onError$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ String $host;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$host = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return l5.l("Kronos onError @host:", this.$host);
        }
    }

    public LoggingSyncListener(InternalLogger internalLogger) {
        internalLogger.getClass();
        this.internalLogger = internalLogger;
    }

    @Override // defpackage.b2f
    public void onError(String host, Throwable throwable) {
        host.getClass();
        throwable.getClass();
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) new AnonymousClass1(host), throwable, false, (Map) null, 48, (Object) null);
    }

    @Override // defpackage.b2f
    public void onStartSync(String host) {
        host.getClass();
    }

    @Override // defpackage.b2f
    public void onSuccess(long ticksDelta, long responseTimeMs) {
    }
}

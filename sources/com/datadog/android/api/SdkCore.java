package com.datadog.android.api;

import com.datadog.android.api.context.TimeInfo;
import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import com.datadog.android.privacy.TrackingConsent;
import defpackage.b0;
import defpackage.bs4;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\b\u0010\tJK\u0010\u0010\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\u00020\u00072\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH'¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H'¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/datadog/android/api/SdkCore;", "", "", "isCoreActive", "()Z", "Lcom/datadog/android/privacy/TrackingConsent;", BatchMetricsDispatcher.TRACKING_CONSENT_KEY, "Lj6g;", "setTrackingConsent", "(Lcom/datadog/android/privacy/TrackingConsent;)V", "", "id", "name", "email", "", "extraInfo", "setUserInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "addUserProperties", "(Ljava/util/Map;)V", "clearAllData", "()V", "getName", "()Ljava/lang/String;", "Lcom/datadog/android/api/context/TimeInfo;", "getTime", "()Lcom/datadog/android/api/context/TimeInfo;", "time", "getService", "service", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface SdkCore {

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void setUserInfo$default(SdkCore sdkCore, String str, String str2, String str3, Map map, int i, Object obj) {
            if (obj != null) {
                b0.u("Super calls with default arguments not supported in this target, function: setUserInfo");
                return;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                map = bs4.a;
            }
            sdkCore.setUserInfo(str, str2, str3, map);
        }
    }

    void addUserProperties(Map<String, ? extends Object> extraInfo);

    void clearAllData();

    String getName();

    String getService();

    TimeInfo getTime();

    boolean isCoreActive();

    void setTrackingConsent(TrackingConsent consent);

    void setUserInfo(String id, String name, String email, Map<String, ? extends Object> extraInfo);
}

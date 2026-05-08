package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.zzae;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface xli extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void endAdUnitExposure(String str, long j);

    void generateEventId(gmi gmiVar);

    void getAppInstanceId(gmi gmiVar);

    void getCachedAppInstanceId(gmi gmiVar);

    void getConditionalUserProperties(String str, String str2, gmi gmiVar);

    void getCurrentScreenClass(gmi gmiVar);

    void getCurrentScreenName(gmi gmiVar);

    void getGmpAppId(gmi gmiVar);

    void getMaxUserProperties(String str, gmi gmiVar);

    void getTestFlag(gmi gmiVar, int i);

    void getUserProperties(String str, String str2, boolean z, gmi gmiVar);

    void initForTests(Map map);

    void initialize(tn6 tn6Var, zzae zzaeVar, long j);

    void isDataCollectionEnabled(gmi gmiVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, gmi gmiVar, long j);

    void logHealthData(int i, String str, tn6 tn6Var, tn6 tn6Var2, tn6 tn6Var3);

    void onActivityCreated(tn6 tn6Var, Bundle bundle, long j);

    void onActivityDestroyed(tn6 tn6Var, long j);

    void onActivityPaused(tn6 tn6Var, long j);

    void onActivityResumed(tn6 tn6Var, long j);

    void onActivitySaveInstanceState(tn6 tn6Var, gmi gmiVar, long j);

    void onActivityStarted(tn6 tn6Var, long j);

    void onActivityStopped(tn6 tn6Var, long j);

    void performAction(Bundle bundle, gmi gmiVar, long j);

    void registerOnMeasurementEventListener(igh ighVar);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setCurrentScreen(tn6 tn6Var, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(igh ighVar);

    void setInstanceIdProvider(pgh pghVar);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, tn6 tn6Var, boolean z, long j);

    void unregisterOnMeasurementEventListener(igh ighVar);
}

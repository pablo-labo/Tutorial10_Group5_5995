package com.datadog.android.rum;

import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import defpackage.bs4;
import defpackage.j6g;
import defpackage.sy3;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ5\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00052\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00052\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J5\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00052\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0016J=\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0\rH\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ=\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00052\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001eJI\u0010%\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020#2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0\rH\u0016¢\u0006\u0004\b%\u0010&JO\u0010,\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0\rH\u0016¢\u0006\u0004\b,\u0010-JY\u0010,\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(2\u0006\u0010.\u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0\rH\u0016¢\u0006\u0004\b,\u00100J?\u00101\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0\rH\u0016¢\u0006\u0004\b1\u00102J?\u00104\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(2\b\u00103\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0\rH\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b6\u00107J\u001f\u00109\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00052\u0006\u00108\u001a\u00020\nH\u0016¢\u0006\u0004\b9\u0010:J#\u0010<\u001a\u00020\u00062\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\rH\u0016¢\u0006\u0004\b<\u0010=J!\u0010>\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00052\b\u00108\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b>\u0010:J\u0017\u0010?\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b?\u00107J\u001d\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0\rH\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0006H\u0016¢\u0006\u0004\bB\u0010\u0003J\u000f\u0010C\u001a\u00020\u0006H\u0016¢\u0006\u0004\bC\u0010\u0003J\u0017\u0010F\u001a\u00020\u00062\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u0011\u0010I\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bI\u0010JR\"\u0010K\u001a\u00020D8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010G¨\u0006P"}, d2 = {"Lcom/datadog/android/rum/NoOpRumMonitor;", "Lcom/datadog/android/rum/RumMonitor;", "<init>", "()V", "Lkotlin/Function1;", "", "Lj6g;", "callback", "getCurrentSessionId", "(Lkotlin/jvm/functions/Function1;)V", "", "key", "name", "", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "startView", "(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;)V", "stopView", "(Ljava/lang/Object;Ljava/util/Map;)V", "Lcom/datadog/android/rum/RumActionType;", "type", "addAction", "(Lcom/datadog/android/rum/RumActionType;Ljava/lang/String;Ljava/util/Map;)V", "startAction", "stopAction", "method", "url", "startResource", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/datadog/android/rum/RumResourceMethod;", "(Ljava/lang/String;Lcom/datadog/android/rum/RumResourceMethod;Ljava/lang/String;Ljava/util/Map;)V", "", "statusCode", "", "size", "Lcom/datadog/android/rum/RumResourceKind;", "kind", "stopResource", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Lcom/datadog/android/rum/RumResourceKind;Ljava/util/Map;)V", "message", "Lcom/datadog/android/rum/RumErrorSource;", "source", "", RumFeature.EVENT_THROWABLE_PROPERTY, "stopResourceWithError", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;)V", "stackTrace", "errorType", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "addError", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;)V", "stacktrace", "addErrorWithStacktrace", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/util/Map;)V", "addTiming", "(Ljava/lang/String;)V", "value", "addFeatureFlagEvaluation", "(Ljava/lang/String;Ljava/lang/Object;)V", "featureFlags", "addFeatureFlagEvaluations", "(Ljava/util/Map;)V", "addAttribute", "removeAttribute", "getAttributes", "()Ljava/util/Map;", "clearAttributes", "stopSession", "", "overwrite", "addViewLoadingTime", "(Z)V", "Lcom/datadog/android/rum/_RumInternalProxy;", "_getInternal", "()Lcom/datadog/android/rum/_RumInternalProxy;", RumEventDeserializer.TELEMETRY_TYPE_DEBUG, "Z", "getDebug", "()Z", "setDebug", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpRumMonitor implements RumMonitor {
    private boolean debug;

    @Override // com.datadog.android.rum.RumMonitor
    /* JADX INFO: renamed from: _getInternal */
    public _RumInternalProxy getInternalProxy() {
        return null;
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void addAction(RumActionType type, String name, Map<String, ? extends Object> attributes) {
        type.getClass();
        name.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void addAttribute(String key, Object value) {
        key.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void addError(String message, RumErrorSource source, Throwable throwable, Map<String, ? extends Object> attributes) {
        message.getClass();
        source.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void addErrorWithStacktrace(String message, RumErrorSource source, String stacktrace, Map<String, ? extends Object> attributes) {
        message.getClass();
        source.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void addFeatureFlagEvaluation(String name, Object value) {
        name.getClass();
        value.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void addFeatureFlagEvaluations(Map<String, ? extends Object> featureFlags) {
        featureFlags.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void addTiming(String name) {
        name.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void addViewLoadingTime(boolean overwrite) {
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void clearAttributes() {
    }

    @Override // com.datadog.android.rum.RumMonitor
    public Map<String, Object> getAttributes() {
        return bs4.a;
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void getCurrentSessionId(Function1<? super String, j6g> callback) {
        callback.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public boolean getDebug() {
        return this.debug;
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void removeAttribute(String key) {
        key.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void setDebug(boolean z) {
        this.debug = z;
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void startAction(RumActionType type, String name, Map<String, ? extends Object> attributes) {
        type.getClass();
        name.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void startResource(String key, RumResourceMethod method, String url, Map<String, ? extends Object> attributes) {
        key.getClass();
        method.getClass();
        url.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void startView(Object key, String name, Map<String, ? extends Object> attributes) {
        key.getClass();
        name.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void stopAction(RumActionType type, String name, Map<String, ? extends Object> attributes) {
        type.getClass();
        name.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void stopResource(String key, Integer statusCode, Long size, RumResourceKind kind, Map<String, ? extends Object> attributes) {
        key.getClass();
        kind.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void stopResourceWithError(String key, Integer statusCode, String message, RumErrorSource source, String stackTrace, String errorType, Map<String, ? extends Object> attributes) {
        key.getClass();
        message.getClass();
        source.getClass();
        stackTrace.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void stopSession() {
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void stopView(Object key, Map<String, ? extends Object> attributes) {
        key.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    @sy3
    public void startResource(String key, String method, String url, Map<String, ? extends Object> attributes) {
        key.getClass();
        method.getClass();
        url.getClass();
        attributes.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public void stopResourceWithError(String key, Integer statusCode, String message, RumErrorSource source, Throwable throwable, Map<String, ? extends Object> attributes) {
        key.getClass();
        message.getClass();
        source.getClass();
        throwable.getClass();
        attributes.getClass();
    }
}

package com.datadog.android.core.internal.utils;

import com.datadog.android.api.InternalLogger;
import defpackage.ab8;
import defpackage.fb8;
import defpackage.gu5;
import defpackage.ka8;
import defpackage.mj8;
import defpackage.u63;
import defpackage.w98;
import defpackage.xa8;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\f\u001a\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0012\u001a\u00020\u0011*\u0006\u0012\u0002\b\u00030\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0015\u001a\u00020\u0011*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0017H\u0000¢\u0006\u0004\b\u0015\u0010\u0018\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0019H\u0000¢\u0006\u0004\b\u0012\u0010\u001a\u001a!\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0014*\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"", "times", "", "retryDelayNs", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lkotlin/Function0;", "", "block", "retryWithDelay", "(IJLcom/datadog/android/api/InternalLogger;Lgu5;)Z", "loopsDelayInNanos", "(Lgu5;IJLcom/datadog/android/api/InternalLogger;)Z", "", "fromJsonElement", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "Lka8;", "toJsonArray", "(Ljava/lang/Iterable;)Lka8;", "", "toJsonObject", "(Ljava/util/Map;)Lka8;", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)Lka8;", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)Lka8;", "Lab8;", "", "asDeepMap", "(Lab8;)Ljava/util/Map;", "dd-sdk-android-core_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class MiscUtilsKt {
    public static final Map<String, Object> asDeepMap(ab8 ab8Var) {
        ab8Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = ab8Var.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            key.getClass();
            linkedHashMap.put(key, fromJsonElement(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static final Object fromJsonElement(Object obj) {
        if (obj instanceof xa8) {
            return null;
        }
        if (!(obj instanceof fb8)) {
            return obj instanceof ab8 ? asDeepMap((ab8) obj) : obj;
        }
        fb8 fb8Var = (fb8) obj;
        Serializable serializable = fb8Var.a;
        return serializable instanceof Boolean ? Boolean.valueOf(fb8Var.a()) : serializable instanceof Number ? fb8Var.f() : serializable instanceof String ? fb8Var.g() : obj;
    }

    public static final boolean retryWithDelay(gu5<Boolean> gu5Var, int i, long j, InternalLogger internalLogger) {
        gu5Var.getClass();
        internalLogger.getClass();
        long jNanoTime = System.nanoTime() - j;
        int i2 = 1;
        boolean zBooleanValue = false;
        while (i2 <= i && !zBooleanValue) {
            if (System.nanoTime() - jNanoTime >= j) {
                try {
                    zBooleanValue = gu5Var.invoke().booleanValue();
                } catch (Exception e) {
                    InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) AnonymousClass1.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
                    zBooleanValue = false;
                }
                jNanoTime = System.nanoTime();
                i2++;
            }
        }
        return zBooleanValue;
    }

    public static final ka8 toJsonArray(Iterable<?> iterable) {
        iterable.getClass();
        w98 w98Var = new w98();
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            w98Var.i(JsonSerializer.INSTANCE.toJsonElement(it.next()));
        }
        return w98Var;
    }

    public static final ka8 toJsonObject(Map<?, ?> map) {
        map.getClass();
        ab8 ab8Var = new ab8();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            ab8Var.i(String.valueOf(entry.getKey()), JsonSerializer.INSTANCE.toJsonElement(entry.getValue()));
        }
        return ab8Var;
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.utils.MiscUtilsKt$retryWithDelay$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 176)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Internal I/O operation failed";
        }
    }

    public static final ka8 toJsonArray(JSONArray jSONArray) {
        jSONArray.getClass();
        w98 w98Var = new w98();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            w98Var.i(JsonSerializer.INSTANCE.toJsonElement(jSONArray.get(i)));
        }
        return w98Var;
    }

    public static final ka8 toJsonObject(JSONObject jSONObject) {
        jSONObject.getClass();
        ab8 ab8Var = new ab8();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            ab8Var.i(next, JsonSerializer.INSTANCE.toJsonElement(jSONObject.get(next)));
        }
        return ab8Var;
    }

    public static final boolean retryWithDelay(int i, long j, InternalLogger internalLogger, gu5<Boolean> gu5Var) {
        internalLogger.getClass();
        gu5Var.getClass();
        long jNanoTime = System.nanoTime() - j;
        int i2 = 1;
        boolean zBooleanValue = false;
        while (i2 <= i && !zBooleanValue) {
            if (System.nanoTime() - jNanoTime >= j) {
                try {
                    zBooleanValue = gu5Var.invoke().booleanValue();
                } catch (Exception e) {
                    InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) AnonymousClass1.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
                    zBooleanValue = false;
                }
                jNanoTime = System.nanoTime();
                i2++;
            }
        }
        return zBooleanValue;
    }
}

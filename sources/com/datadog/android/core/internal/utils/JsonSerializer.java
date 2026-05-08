package com.datadog.android.core.internal.utils;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.lint.InternalApi;
import defpackage.ab8;
import defpackage.fb8;
import defpackage.gu5;
import defpackage.ka8;
import defpackage.u63;
import defpackage.w98;
import defpackage.wl7;
import defpackage.xa8;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@InternalApi
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b*\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/datadog/android/core/internal/utils/JsonSerializer;", "", "<init>", "()V", "item", "Lka8;", "toJsonElement", "(Ljava/lang/Object;)Lka8;", "", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "safeMapValuesToJson", "(Ljava/util/Map;Lcom/datadog/android/api/InternalLogger;)Ljava/util/Map;", "ITEM_SERIALIZATION_ERROR", "Ljava/lang/String;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class JsonSerializer {
    public static final JsonSerializer INSTANCE = new JsonSerializer();
    public static final String ITEM_SERIALIZATION_ERROR = "Error serializing value for key %s, value was dropped.";

    private JsonSerializer() {
    }

    @InternalApi
    public final Map<String, ka8> safeMapValuesToJson(Map<String, ? extends Object> map, InternalLogger internalLogger) {
        InternalLogger internalLogger2;
        map.getClass();
        internalLogger.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            try {
                Pair pair = new Pair(entry.getKey(), INSTANCE.toJsonElement(entry.getValue()));
                linkedHashMap.put(pair.d(), pair.e());
                internalLogger2 = internalLogger;
            } catch (Exception e) {
                internalLogger2 = internalLogger;
                InternalLogger.DefaultImpls.log$default(internalLogger2, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), (gu5) new JsonSerializer$safeMapValuesToJson$1$1(entry), (Throwable) e, false, (Map) null, 48, (Object) null);
            }
            internalLogger = internalLogger2;
        }
        return linkedHashMap;
    }

    @InternalApi
    public final ka8 toJsonElement(Object item) {
        if (wl7.b(item, MapUtilsKt.getNULL_MAP_VALUE())) {
            xa8 xa8Var = xa8.a;
            xa8Var.getClass();
            return xa8Var;
        }
        if (item == null) {
            xa8 xa8Var2 = xa8.a;
            xa8Var2.getClass();
            return xa8Var2;
        }
        xa8 xa8Var3 = xa8.a;
        if (item.equals(xa8Var3)) {
            xa8Var3.getClass();
            return xa8Var3;
        }
        if (item instanceof Boolean) {
            return new fb8((Boolean) item);
        }
        if (!(item instanceof Integer) && !(item instanceof Long) && !(item instanceof Float) && !(item instanceof Double)) {
            if (item instanceof String) {
                return new fb8((String) item);
            }
            if (item instanceof Date) {
                return new fb8(Long.valueOf(((Date) item).getTime()));
            }
            if (item instanceof w98) {
                return (ka8) item;
            }
            if (item instanceof Iterable) {
                return MiscUtilsKt.toJsonArray((Iterable<?>) item);
            }
            if (item instanceof Map) {
                return MiscUtilsKt.toJsonObject((Map<?, ?>) item);
            }
            if (!(item instanceof ab8) && !(item instanceof fb8)) {
                return item instanceof JSONObject ? MiscUtilsKt.toJsonObject((JSONObject) item) : item instanceof JSONArray ? MiscUtilsKt.toJsonArray((JSONArray) item) : new fb8(item.toString());
            }
            return (ka8) item;
        }
        return new fb8((Number) item);
    }
}

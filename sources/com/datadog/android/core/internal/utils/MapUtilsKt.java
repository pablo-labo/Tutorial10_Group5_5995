package com.datadog.android.core.internal.utils;

import defpackage.lc9;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\u0007\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t*\u0010\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t\u0018\u00010\u0007H\u0000\u001a6\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\u0007\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\f0\u000bH\u0000\"\u0017\u0010\u0000\u001a\u00020\u0001¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"NULL_MAP_VALUE", "Ljava/lang/Object;", "getNULL_MAP_VALUE$annotations", "()V", "getNULL_MAP_VALUE", "()Ljava/lang/Object;", "orEmpty", "", "K", "V", "toMutableMap", "", "Lkotlin/Pair;", "dd-sdk-android-core_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class MapUtilsKt {
    private static final Object NULL_MAP_VALUE = new Object();

    public static final Object getNULL_MAP_VALUE() {
        return NULL_MAP_VALUE;
    }

    public static /* synthetic */ void getNULL_MAP_VALUE$annotations() {
    }

    public static final <K, V> Map<K, V> orEmpty(Map<K, V> map) {
        return map == null ? new LinkedHashMap() : map;
    }

    public static final <K, V> Map<K, V> toMutableMap(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        iterable.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        lc9.h0(iterable, linkedHashMap);
        return linkedHashMap;
    }
}

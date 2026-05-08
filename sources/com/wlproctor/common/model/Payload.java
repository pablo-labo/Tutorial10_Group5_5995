package com.wlproctor.common.model;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.o7e;
import defpackage.wl7;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@o7e(with = a.class)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0001/B\u008f\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rHÆ\u0003J\u0098\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\nHÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00060"}, d2 = {"Lcom/wlproctor/common/model/Payload;", "", "doubleValue", "", "doubleArray", "", "longValue", "", "longArray", "stringValue", "", "stringArray", "map", "", "json", "(Ljava/lang/Double;Ljava/util/List;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "getDoubleArray", "()Ljava/util/List;", "getDoubleValue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getJson", "()Ljava/util/Map;", "getLongArray", "getLongValue", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMap", "getStringArray", "getStringValue", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Double;Ljava/util/List;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Lcom/wlproctor/common/model/Payload;", "equals", "", "other", "hashCode", "", "toString", "Companion", "wlproctor-consumer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Payload EMPTY = new Payload(null, null, null, null, null, null, null, null, 255, null);
    private final List<Double> doubleArray;
    private final Double doubleValue;
    private final Map<String, Object> json;
    private final List<Long> longArray;
    private final Long longValue;
    private final Map<String, Object> map;
    private final List<String> stringArray;
    private final String stringValue;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/wlproctor/common/model/Payload$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/wlproctor/common/model/Payload;", "serializer", "()Lkotlinx/serialization/KSerializer;", "wlproctor-consumer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<Payload> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ Payload(Double d, List list, Long l, List list2, String str, List list3, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : map, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Payload copy$default(Payload payload, Double d, List list, Long l, List list2, String str, List list3, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = payload.doubleValue;
        }
        if ((i & 2) != 0) {
            list = payload.doubleArray;
        }
        if ((i & 4) != 0) {
            l = payload.longValue;
        }
        if ((i & 8) != 0) {
            list2 = payload.longArray;
        }
        if ((i & 16) != 0) {
            str = payload.stringValue;
        }
        if ((i & 32) != 0) {
            list3 = payload.stringArray;
        }
        if ((i & 64) != 0) {
            map = payload.map;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            map2 = payload.json;
        }
        Map map3 = map;
        Map map4 = map2;
        String str2 = str;
        List list4 = list3;
        return payload.copy(d, list, l, list2, str2, list4, map3, map4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getDoubleValue() {
        return this.doubleValue;
    }

    public final List<Double> component2() {
        return this.doubleArray;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getLongValue() {
        return this.longValue;
    }

    public final List<Long> component4() {
        return this.longArray;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStringValue() {
        return this.stringValue;
    }

    public final List<String> component6() {
        return this.stringArray;
    }

    public final Map<String, Object> component7() {
        return this.map;
    }

    public final Map<String, Object> component8() {
        return this.json;
    }

    public final Payload copy(Double doubleValue, List<Double> doubleArray, Long longValue, List<Long> longArray, String stringValue, List<String> stringArray, Map<String, ? extends Object> map, Map<String, ? extends Object> json) {
        return new Payload(doubleValue, doubleArray, longValue, longArray, stringValue, stringArray, map, json);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Payload)) {
            return false;
        }
        Payload payload = (Payload) other;
        return wl7.b(this.doubleValue, payload.doubleValue) && wl7.b(this.doubleArray, payload.doubleArray) && wl7.b(this.longValue, payload.longValue) && wl7.b(this.longArray, payload.longArray) && wl7.b(this.stringValue, payload.stringValue) && wl7.b(this.stringArray, payload.stringArray) && wl7.b(this.map, payload.map) && wl7.b(this.json, payload.json);
    }

    public final List<Double> getDoubleArray() {
        return this.doubleArray;
    }

    public final Double getDoubleValue() {
        return this.doubleValue;
    }

    public final Map<String, Object> getJson() {
        return this.json;
    }

    public final List<Long> getLongArray() {
        return this.longArray;
    }

    public final Long getLongValue() {
        return this.longValue;
    }

    public final Map<String, Object> getMap() {
        return this.map;
    }

    public final List<String> getStringArray() {
        return this.stringArray;
    }

    public final String getStringValue() {
        return this.stringValue;
    }

    public int hashCode() {
        Double d = this.doubleValue;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        List<Double> list = this.doubleArray;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.longValue;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        List<Long> list2 = this.longArray;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.stringValue;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list3 = this.stringArray;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Map<String, Object> map = this.map;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Object> map2 = this.json;
        return iHashCode7 + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        return "Payload(doubleValue=" + this.doubleValue + ", doubleArray=" + this.doubleArray + ", longValue=" + this.longValue + ", longArray=" + this.longArray + ", stringValue=" + this.stringValue + ", stringArray=" + this.stringArray + ", map=" + this.map + ", json=" + this.json + ')';
    }

    public Payload(Double d, List<Double> list, Long l, List<Long> list2, String str, List<String> list3, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        this.doubleValue = d;
        this.doubleArray = list;
        this.longValue = l;
        this.longArray = list2;
        this.stringValue = str;
        this.stringArray = list3;
        this.map = map;
        this.json = map2;
    }

    public Payload() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}

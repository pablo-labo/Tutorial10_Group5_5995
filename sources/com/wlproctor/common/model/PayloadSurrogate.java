package com.wlproctor.common.model;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.o7e;
import defpackage.sy3;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/wlproctor/common/model/PayloadSurrogate;", "", "Companion", "$serializer", "wlproctor-consumer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PayloadSurrogate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final Double a;
    public final List<Double> b;
    public final Long c;
    public final List<Long> d;
    public final String e;
    public final List<String> f;
    public final JsonObject g;
    public final JsonObject h;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/wlproctor/common/model/PayloadSurrogate$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/wlproctor/common/model/PayloadSurrogate;", "wlproctor-consumer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PayloadSurrogate> serializer() {
            return PayloadSurrogate$$serializer.INSTANCE;
        }
    }

    @sy3
    public /* synthetic */ PayloadSurrogate(int i, Double d, List list, Long l, List list2, String str, List list3, JsonObject jsonObject, JsonObject jsonObject2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = jsonObject;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.h = null;
        } else {
            this.h = jsonObject2;
        }
    }

    public PayloadSurrogate(Double d, List<Double> list, Long l, List<Long> list2, String str, List<String> list3, JsonObject jsonObject, JsonObject jsonObject2) {
        this.a = d;
        this.b = list;
        this.c = l;
        this.d = list2;
        this.e = str;
        this.f = list3;
        this.g = jsonObject;
        this.h = jsonObject2;
    }

    public PayloadSurrogate() {
        this(null, null, null, null, null, null, null, null);
    }
}

package com.wlproctor.common;

import defpackage.bs4;
import defpackage.ewa;
import defpackage.o7e;
import defpackage.sy3;
import defpackage.wl7;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0002\u0004¨\u0006\u0005"}, d2 = {"Lcom/wlproctor/common/PayloadSpecification;", "", "Companion", "$serializer", "a", "wlproctor-consumer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PayloadSpecification {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final a a;
    public final Map<String, String> b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/wlproctor/common/PayloadSpecification$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/wlproctor/common/PayloadSpecification;", "wlproctor-consumer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PayloadSpecification> serializer() {
            return PayloadSpecification$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("doubleValue", 0);
            a = aVar;
            a aVar2 = new a("doubleArray", 1);
            a aVar3 = new a("longValue", 2);
            b = aVar3;
            a aVar4 = new a("longArray", 3);
            a aVar5 = new a("stringValue", 4);
            a aVar6 = new a("stringArray", 5);
            a aVar7 = new a("map", 6);
            c = aVar7;
            a aVar8 = new a("json", 7);
            d = aVar8;
            e = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    public PayloadSpecification() {
        throw null;
    }

    @sy3
    public /* synthetic */ PayloadSpecification(int i, a aVar, Map map) {
        if (1 != (i & 1)) {
            ewa.M(i, 1, PayloadSpecification$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = aVar;
        if ((i & 2) == 0) {
            this.b = bs4.a;
        } else {
            this.b = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayloadSpecification)) {
            return false;
        }
        PayloadSpecification payloadSpecification = (PayloadSpecification) obj;
        return this.a == payloadSpecification.a && wl7.b(this.b, payloadSpecification.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PayloadSpecification(type=" + this.a + ", schema=" + this.b + ')';
    }

    public PayloadSpecification(a aVar) {
        this.a = aVar;
        this.b = bs4.a;
    }
}

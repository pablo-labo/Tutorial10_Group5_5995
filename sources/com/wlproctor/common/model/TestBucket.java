package com.wlproctor.common.model;

import defpackage.ewa;
import defpackage.o7e;
import defpackage.sy3;
import defpackage.w40;
import defpackage.wl7;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/wlproctor/common/model/TestBucket;", "", "Companion", "$serializer", "wlproctor-consumer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TestBucket {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String a;
    public final int b;
    public final String c;
    public final Payload d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/wlproctor/common/model/TestBucket$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/wlproctor/common/model/TestBucket;", "wlproctor-consumer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TestBucket> serializer() {
            return TestBucket$$serializer.INSTANCE;
        }
    }

    @sy3
    public TestBucket(int i, String str, int i2, String str2, Payload payload) {
        if (3 != (i & 3)) {
            ewa.M(i, 3, TestBucket$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = i2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) != 0) {
            this.d = payload;
        } else {
            Payload.INSTANCE.getClass();
            this.d = Payload.EMPTY;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestBucket)) {
            return false;
        }
        TestBucket testBucket = (TestBucket) obj;
        return wl7.b(this.a, testBucket.a) && this.b == testBucket.b && wl7.b(this.c, testBucket.c) && wl7.b(this.d, testBucket.d);
    }

    public final int hashCode() {
        int iC = w40.c(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "TestBucket(name=" + this.a + ", value=" + this.b + ", description=" + this.c + ", payload=" + this.d + ')';
    }

    public TestBucket(String str, int i, String str2, Payload payload) {
        str.getClass();
        payload.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = payload;
    }
}

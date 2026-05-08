package defpackage;

import com.wlproctor.common.model.Payload;
import com.wlproctor.common.model.TestBucket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k2 {
    public Function1<? super ybf, Integer> a;
    public Function1<? super ybf, Payload> b;
    public final Map<String, TestBucket> c;
    public final Map<String, TestBucket> d;

    public static final class a extends mj8 implements Function1 {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ((ybf) obj).getClass();
            return null;
        }
    }

    public static final class b extends mj8 implements Function1 {
        public static final b a = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ((ybf) obj).getClass();
            return null;
        }
    }

    public k2(hpb hpbVar) {
        hpbVar.getClass();
        this.a = b.a;
        this.b = a.a;
        this.c = lc9.g0(hpbVar.a);
        this.d = lc9.g0(hpbVar.b);
    }

    public abstract ArrayList a();

    public final Payload b(ybf ybfVar) {
        Payload payload;
        ybfVar.getClass();
        Payload payloadInvoke = this.b.invoke(ybfVar);
        if (payloadInvoke != null) {
            return payloadInvoke;
        }
        TestBucket testBucket = this.c.get(ybfVar.getName());
        if (testBucket != null && (payload = testBucket.d) != null) {
            return payload;
        }
        TestBucket testBucket2 = this.d.get(ybfVar.getName());
        if (testBucket2 != null) {
            return testBucket2.d;
        }
        Payload.INSTANCE.getClass();
        return Payload.EMPTY;
    }

    public abstract List<vn1<?>> c(ybf ybfVar);

    public abstract List<ybf> d();

    public final int e(ybf ybfVar) {
        ybfVar.getClass();
        Integer numInvoke = this.a.invoke(ybfVar);
        if (numInvoke != null) {
            return numInvoke.intValue();
        }
        TestBucket testBucket = this.c.get(ybfVar.getName());
        if (testBucket != null) {
            return testBucket.b;
        }
        TestBucket testBucket2 = this.d.get(ybfVar.getName());
        return testBucket2 != null ? testBucket2.b : ybfVar.c();
    }
}

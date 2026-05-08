package defpackage;

import com.wlproctor.common.PayloadSpecification;
import com.wlproctor.common.model.Payload;
import defpackage.xh8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class mr7 implements kr7, xh8 {
    public final Lazy a = boa.E(qt8.a, new b(this));

    public static final class a implements ybf {
        public final String a;

        public a(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.ybf
        public final PayloadSpecification a() {
            return null;
        }

        @Override // defpackage.ybf
        public final int c() {
            return -1;
        }

        @Override // defpackage.ybf
        public final String getDescription() {
            return null;
        }

        @Override // defpackage.ybf
        public final String getName() {
            return this.a;
        }
    }

    public static final class b extends mj8 implements gu5<ed4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mr7 mr7Var) {
            super(0);
            this.$this_inject = mr7Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [ed4, java.lang.Object] */
        @Override // defpackage.gu5
        public final ed4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(ed4.class), a9cVar);
        }
    }

    @Override // defpackage.kr7
    public final String b() {
        return ep5.a.e();
    }

    @Override // defpackage.kr7
    public final String c() {
        return dd4.a.a();
    }

    @Override // defpackage.kr7
    public final lr7 e(String str) {
        str.getClass();
        a aVar = new a(str);
        Lazy lazy = this.a;
        int iE = ((ed4) lazy.getValue()).a.e(aVar);
        Payload payloadB = ((ed4) lazy.getValue()).a.b(aVar);
        payloadB.getClass();
        return new lr7(iE, (payloadB.getDoubleValue() == null && payloadB.getDoubleArray() == null && payloadB.getLongValue() == null && payloadB.getLongArray() == null && payloadB.getStringValue() == null && payloadB.getStringArray() == null && payloadB.getMap() == null && payloadB.getJson() == null) ? null : new nr7(payloadB.getDoubleValue(), payloadB.getDoubleArray(), payloadB.getLongValue(), payloadB.getLongArray(), payloadB.getStringValue(), payloadB.getStringArray(), payloadB.getMap(), payloadB.getJson()));
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}

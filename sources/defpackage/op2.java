package defpackage;

import defpackage.xh8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class op2 implements xh8 {
    public final String a;
    public final Lazy b;
    public final x42 c;
    public final a d;

    public static final class a extends a89<String, Integer> {
        public a() {
            super(3);
        }

        @Override // defpackage.a89
        public final void a(boolean z, String str, Integer num, Integer num2) {
            String str2 = str;
            int iIntValue = num.intValue();
            str2.getClass();
            if (z) {
                op2 op2Var = op2.this;
                ((gz4) op2Var.b.getValue()).a("webview_console_count", new mp2(op2Var, str2, iIntValue));
            }
        }
    }

    public static final class b extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(op2 op2Var) {
            super(0);
            this.$this_inject = op2Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public op2(String str) {
        str.getClass();
        this.a = str;
        this.b = boa.E(qt8.a, new b(this));
        this.c = new x42(30);
        this.d = new a();
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}

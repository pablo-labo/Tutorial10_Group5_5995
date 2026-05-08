package defpackage;

import android.content.Context;
import defpackage.xh8;
import java.util.Map;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class e87 implements xh8 {
    public static final Lazy a = boa.E(qt8.a, new a(new e87()));
    public static final d2f b;
    public static final d2f c;

    public static final class a extends mj8 implements gu5<Context> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e87 e87Var) {
            super(0);
            this.$this_inject = e87Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context, java.lang.Object] */
        @Override // defpackage.gu5
        public final Context invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(Context.class), a9cVar);
        }
    }

    static {
        int i = 4;
        b = new d2f(new kr(i));
        c = new d2f(new fc2(i));
        new d2f(new vy2(3));
        new d2f(new wy2(8));
    }

    public static Map a() {
        return (Map) b.getValue();
    }

    public static ck6 b(String str, String str2) {
        ck6 ck6Var;
        if (str2 != null) {
            ck6Var = (ck6) a().get(str + ":" + str2);
        } else {
            ck6Var = null;
        }
        if (ck6Var != null) {
            return ck6Var;
        }
        ck6 ck6Var2 = (ck6) a().get(str);
        return ck6Var2 == null ? (ck6) lc9.Y("US", a()) : ck6Var2;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}

package defpackage;

import androidx.compose.runtime.r;
import defpackage.xh8;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lxgg;", "Lbrg;", "Lxh8;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class xgg extends brg implements xh8 {
    public final g4a b = r.f(new vgg(0));
    public final Lazy c;
    public final Lazy d;

    public static final class a extends mj8 implements gu5<rbf> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xgg xggVar) {
            super(0);
            this.$this_inject = xggVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, rbf] */
        @Override // defpackage.gu5
        public final rbf invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(rbf.class), a9cVar);
        }
    }

    public static final class b extends mj8 implements gu5<zk6> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xgg xggVar) {
            super(0);
            this.$this_inject = xggVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, zk6] */
        @Override // defpackage.gu5
        public final zk6 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(zk6.class), a9cVar);
        }
    }

    public xgg() {
        a aVar = new a(this);
        qt8 qt8Var = qt8.a;
        this.c = boa.E(qt8Var, aVar);
        this.d = boa.E(qt8Var, new b(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.pu2 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.wgg
            if (r0 == 0) goto L13
            r0 = r7
            wgg r0 = (defpackage.wgg) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            wgg r0 = new wgg
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Object r6 = r0.L$0
            huc r6 = (defpackage.huc) r6
            defpackage.r7d.b(r7)
            goto L56
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            r6 = 0
            return r6
        L30:
            defpackage.r7d.b(r7)
            huc r7 = new huc
            r7.<init>()
            kotlin.Lazy r1 = r6.c
            java.lang.Object r1 = r1.getValue()
            rbf r1 = (defpackage.rbf) r1
            td r3 = new td
            r4 = 5
            r3.<init>(r4, r6, r7)
            r0.L$0 = r7
            r0.label = r2
            java.lang.Object r6 = r1.p(r3, r0)
            g13 r0 = defpackage.g13.a
            if (r6 != r0) goto L53
            return r0
        L53:
            r5 = r7
            r7 = r6
            r6 = r5
        L56:
            wg0 r7 = (defpackage.wg0) r7
            boolean r7 = r7.d()
            if (r7 == 0) goto L60
            r6.element = r2
        L60:
            boolean r6 = r6.element
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xgg.g(pu2):java.lang.Object");
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}

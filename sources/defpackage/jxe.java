package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class jxe<T> implements mde<T> {
    public final mde<T> a;
    public final Function2<wi5<? super T>, lu2<? super j6g>, Object> b;

    @uh3(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", l = {412}, m = "collect")
    public static final class a extends pu2 {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ jxe<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jxe<T> jxeVar, lu2<? super a> lu2Var) {
            super(lu2Var);
            this.this$0 = jxeVar;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            this.this$0.e(null, this);
            return g13.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jxe(mde<? extends T> mdeVar, Function2<? super wi5<? super T>, ? super lu2<? super j6g>, ? extends Object> function2) {
        this.a = mdeVar;
        this.b = function2;
    }

    @Override // defpackage.mde
    public final List<T> c() {
        return this.a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.vi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.wi5<? super T> r5, defpackage.lu2<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jxe.a
            if (r0 == 0) goto L13
            r0 = r6
            jxe$a r0 = (jxe.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            jxe$a r0 = new jxe$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L28
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L28:
            defpackage.r7d.b(r6)
            goto L43
        L2c:
            defpackage.r7d.b(r6)
            ixe r6 = new ixe
            kotlin.jvm.functions.Function2<wi5<? super T>, lu2<? super j6g>, java.lang.Object> r1 = r4.b
            r6.<init>(r5, r1)
            r0.label = r3
            mde<T> r4 = r4.a
            java.lang.Object r4 = r4.e(r6, r0)
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L43
            return r5
        L43:
            defpackage.r40.e()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxe.e(wi5, lu2):java.lang.Object");
    }
}

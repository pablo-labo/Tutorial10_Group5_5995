package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.countryselector.ChangeCountrySelectorViewModel$1", f = "ChangeCountrySelectorViewModel.kt", l = {39, 41}, m = "invokeSuspend")
public final class f12 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ h12 this$0;

    @uh3(c = "com.indeed.android.jobsearch.countryselector.ChangeCountrySelectorViewModel$1$1", f = "ChangeCountrySelectorViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<List<? extends n97>, lu2<? super j6g>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ h12 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h12 h12Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = h12Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.this$0, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends n97> list, lu2<? super j6g> lu2Var) {
            return ((a) create(list, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            List<n97> list = (List) this.L$0;
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            h12 h12Var = this.this$0;
            List<n97> list2 = list;
            if (list2.isEmpty()) {
                m97 m97Var = m97.a;
                list2 = (List) m97.b.getValue();
            }
            h12Var.j(list2);
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f12(h12 h12Var, lu2<? super f12> lu2Var) {
        super(2, lu2Var);
        this.this$0 = h12Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new f12(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((f12) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (defpackage.wg2.q((defpackage.vi5) r6, r0, r5) == r4) goto L15;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = r5.label
            r1 = 0
            r2 = 2
            r3 = 1
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.r7d.b(r6)
            goto L47
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r1
        L17:
            defpackage.r7d.b(r6)
            goto L35
        L1b:
            defpackage.r7d.b(r6)
            h12 r6 = r5.this$0
            yba r6 = r6.h()
            gse r6 = r6.d0
            h12 r0 = r5.this$0
            k82 r0 = defpackage.ee3.p(r0)
            r5.label = r3
            java.lang.Object r6 = defpackage.wg2.a0(r6, r0, r5)
            if (r6 != r4) goto L35
            goto L46
        L35:
            vi5 r6 = (defpackage.vi5) r6
            f12$a r0 = new f12$a
            h12 r3 = r5.this$0
            r0.<init>(r3, r1)
            r5.label = r2
            java.lang.Object r5 = defpackage.wg2.q(r6, r0, r5)
            if (r5 != r4) goto L47
        L46:
            return r4
        L47:
            j6g r5 = defpackage.j6g.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f12.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package defpackage;

import com.indeed.android.myjobs.data.model.AppStatusJob;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f26 implements vi5<List<? extends AppStatusJob>> {
    public final /* synthetic */ vi5 a;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ wi5 a;

        /* JADX INFO: renamed from: f26$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.myjobs.domain.usecase.GetLocalVisitedJobUsecase$invoke$$inlined$map$1$2", f = "GetLocalVisitedJobUsecase.kt", l = {50}, m = "emit")
        public static final class C0226a extends pu2 {
            int I$0;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            /* synthetic */ Object result;

            public C0226a(lu2 lu2Var) {
                super(lu2Var);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(wi5 wi5Var) {
            this.a = wi5Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // defpackage.wi5
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(java.lang.Object r5, defpackage.lu2 r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof f26.a.C0226a
                if (r0 == 0) goto L13
                r0 = r6
                f26$a$a r0 = (f26.a.C0226a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                f26$a$a r0 = new f26$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                int r1 = r0.label
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L34
                if (r1 != r2) goto L2e
                java.lang.Object r4 = r0.L$3
                wi5 r4 = (defpackage.wi5) r4
                java.lang.Object r4 = r0.L$1
                f26$a$a r4 = (f26.a.C0226a) r4
                defpackage.r7d.b(r6)
                goto L64
            L2e:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r4)
                return r3
            L34:
                defpackage.r7d.b(r6)
                java.util.List r5 = (java.util.List) r5
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                zc4 r6 = new zc4
                r6.<init>(r2)
                java.util.List r5 = defpackage.z92.p1(r5, r6)
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                r6 = 10
                java.util.List r5 = defpackage.z92.q1(r5, r6)
                r0.L$0 = r3
                r0.L$1 = r3
                r0.L$2 = r3
                r0.L$3 = r3
                r6 = 0
                r0.I$0 = r6
                r0.label = r2
                wi5 r4 = r4.a
                java.lang.Object r4 = r4.a(r5, r0)
                g13 r5 = defpackage.g13.a
                if (r4 != r5) goto L64
                return r5
            L64:
                j6g r4 = defpackage.j6g.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: f26.a.a(java.lang.Object, lu2):java.lang.Object");
        }
    }

    public f26(vi5 vi5Var) {
        this.a = vi5Var;
    }

    @Override // defpackage.vi5
    public final Object e(wi5<? super List<? extends AppStatusJob>> wi5Var, lu2 lu2Var) {
        Object objE = this.a.e(new a(wi5Var), lu2Var);
        return objE == g13.a ? objE : j6g.a;
    }
}

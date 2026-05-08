package defpackage;

import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.gka;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.NonIaBottomSheetViewModel$onTriggerEvent$1", f = "NonIaBottomSheetViewModel.kt", l = {35, 36, 53, 58}, m = "invokeSuspend")
public final class ika extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ gka.a $event;
    int label;
    final /* synthetic */ gka this$0;

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.NonIaBottomSheetViewModel$onTriggerEvent$1$1", f = "NonIaBottomSheetViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<j6g, lu2<? super j6g>, Object> {
        final /* synthetic */ gka.a $event;
        int label;
        final /* synthetic */ gka this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lu2 lu2Var, gka.a aVar, gka gkaVar) {
            super(2, lu2Var);
            this.this$0 = gkaVar;
            this.$event = aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(lu2Var, this.$event, this.this$0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(j6g j6gVar, lu2<? super j6g> lu2Var) {
            return ((a) create(j6gVar, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            List<SavedJobsDto> list = this.this$0.i().a;
            gka.a aVar = this.$event;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!wl7.b(((gka.a.b) aVar).a, ((SavedJobsDto) obj2).getJobkey())) {
                    arrayList.add(obj2);
                }
            }
            gka gkaVar = this.this$0;
            gkaVar.i();
            gkaVar.b.setValue(fka.a(gkaVar.i(), arrayList, !arrayList.isEmpty()));
            if (arrayList.isEmpty()) {
                this.this$0.j(gka.a.C0250a.a);
            }
            Function1<lx5, j6g> function1 = c05.a;
            c05.f("no", "nonIagrp1");
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.NonIaBottomSheetViewModel$onTriggerEvent$1$2", f = "NonIaBottomSheetViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<j6g, lu2<? super j6g>, Object> {
        final /* synthetic */ gka.a $event;
        int label;
        final /* synthetic */ gka this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lu2 lu2Var, gka.a aVar, gka gkaVar) {
            super(2, lu2Var);
            this.this$0 = gkaVar;
            this.$event = aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(lu2Var, this.$event, this.this$0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(j6g j6gVar, lu2<? super j6g> lu2Var) {
            return ((b) create(j6gVar, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            List<SavedJobsDto> list = this.this$0.i().a;
            gka.a aVar = this.$event;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!wl7.b(((gka.a.d) aVar).a, ((SavedJobsDto) obj2).getJobkey())) {
                    arrayList.add(obj2);
                }
            }
            gka gkaVar = this.this$0;
            gkaVar.i();
            gkaVar.b.setValue(fka.a(gkaVar.i(), arrayList, !arrayList.isEmpty()));
            Function1<lx5, j6g> function1 = c05.a;
            c05.f("yes", "nonIagrp1");
            if (arrayList.isEmpty()) {
                this.this$0.j(gka.a.C0250a.a);
            }
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ika(lu2 lu2Var, gka.a aVar, gka gkaVar) {
        super(2, lu2Var);
        this.$event = aVar;
        this.this$0 = gkaVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ika(lu2Var, this.$event, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ika) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (defpackage.wg2.q((defpackage.vi5) r8, r0, r7) != r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        if (defpackage.wg2.q((defpackage.vi5) r8, r0, r7) != r6) goto L34;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            r1 = 0
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            g13 r6 = defpackage.g13.a
            if (r0 == 0) goto L27
            if (r0 == r5) goto L23
            if (r0 == r4) goto L1e
            if (r0 == r3) goto L1a
            if (r0 != r2) goto L14
            goto L1e
        L14:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r1
        L1a:
            defpackage.r7d.b(r8)
            goto L88
        L1e:
            defpackage.r7d.b(r8)
            goto La7
        L23:
            defpackage.r7d.b(r8)
            goto L50
        L27:
            defpackage.r7d.b(r8)
            gka$a r8 = r7.$event
            boolean r0 = r8 instanceof gka.a.b
            if (r0 == 0) goto L64
            gka r0 = r7.this$0
            bkd r0 = r0.V
            bkd$a r2 = new bkd$a
            gka$a$b r8 = (gka.a.b) r8
            java.lang.String r8 = r8.a
            r2.<init>(r8)
            r7.label = r5
            r0.getClass()
            ckd r8 = new ckd
            r8.<init>(r0, r2, r1)
            kjd r0 = new kjd
            r0.<init>(r8)
            if (r0 != r6) goto L4f
            goto L9b
        L4f:
            r8 = r0
        L50:
            vi5 r8 = (defpackage.vi5) r8
            ika$a r0 = new ika$a
            gka r2 = r7.this$0
            gka$a r3 = r7.$event
            r0.<init>(r1, r3, r2)
            r7.label = r4
            java.lang.Object r7 = defpackage.wg2.q(r8, r0, r7)
            if (r7 != r6) goto La7
            goto L9b
        L64:
            boolean r0 = r8 instanceof gka.a.d
            if (r0 == 0) goto L9c
            gka r0 = r7.this$0
            s0a r0 = r0.W
            s0a$a r4 = new s0a$a
            gka$a$d r8 = (gka.a.d) r8
            java.lang.String r8 = r8.a
            java.lang.String r5 = defpackage.ie7.Z
            r4.<init>(r8, r5)
            r7.label = r3
            r0.getClass()
            t0a r8 = new t0a
            r8.<init>(r0, r4, r1)
            a22 r8 = defpackage.wg2.n(r8)
            if (r8 != r6) goto L88
            goto L9b
        L88:
            vi5 r8 = (defpackage.vi5) r8
            ika$b r0 = new ika$b
            gka r3 = r7.this$0
            gka$a r4 = r7.$event
            r0.<init>(r1, r4, r3)
            r7.label = r2
            java.lang.Object r7 = defpackage.wg2.q(r8, r0, r7)
            if (r7 != r6) goto La7
        L9b:
            return r6
        L9c:
            boolean r8 = r8 instanceof gka.a.c
            if (r8 == 0) goto La7
            gka r7 = r7.this$0
            gka$a$c r8 = gka.a.c.a
            r7.j(r8)
        La7:
            j6g r7 = defpackage.j6g.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ika.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

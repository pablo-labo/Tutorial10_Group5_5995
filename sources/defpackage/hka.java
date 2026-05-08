package defpackage;

import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.NonIaBottomSheetViewModel$loadData$1", f = "NonIaBottomSheetViewModel.kt", l = {87, 95}, m = "invokeSuspend")
public final class hka extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ gka this$0;

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.NonIaBottomSheetViewModel$loadData$1$1", f = "NonIaBottomSheetViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<List<? extends SavedJobsDto>, lu2<? super j6g>, Object> {
        final /* synthetic */ fka $previousState;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ gka this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fka fkaVar, gka gkaVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$previousState = fkaVar;
            this.this$0 = gkaVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$previousState, this.this$0, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends SavedJobsDto> list, lu2<? super j6g> lu2Var) {
            return ((a) create(list, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 207
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: hka.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hka(gka gkaVar, lu2<? super hka> lu2Var) {
        super(2, lu2Var);
        this.this$0 = gkaVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new hka(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((hka) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (defpackage.wg2.q((defpackage.vi5) r11, r2, r10) == r4) goto L15;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.label
            r1 = 2
            r2 = 1
            r3 = 0
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L23
            if (r0 == r2) goto L1b
            if (r0 != r1) goto L15
            java.lang.Object r10 = r10.L$0
            fka r10 = (defpackage.fka) r10
            defpackage.r7d.b(r11)
            goto L69
        L15:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r10)
            return r3
        L1b:
            java.lang.Object r0 = r10.L$0
            fka r0 = (defpackage.fka) r0
            defpackage.r7d.b(r11)
            goto L55
        L23:
            defpackage.r7d.b(r11)
            gka r11 = r10.this$0
            xo6 r11 = r11.i()
            r0 = r11
            fka r0 = (defpackage.fka) r0
            gka r11 = r10.this$0
            q66 r11 = r11.f
            q66$a r5 = new q66$a
            long r6 = java.lang.System.currentTimeMillis()
            r8 = 15552000000(0x39ef8b000, double:7.683708924E-314)
            long r6 = r6 - r8
            r5.<init>(r6)
            r10.L$0 = r0
            r10.label = r2
            r11.getClass()
            r66 r2 = new r66
            r2.<init>(r11, r5, r3)
            a22 r11 = defpackage.wg2.n(r2)
            if (r11 != r4) goto L55
            goto L68
        L55:
            vi5 r11 = (defpackage.vi5) r11
            hka$a r2 = new hka$a
            gka r5 = r10.this$0
            r2.<init>(r0, r5, r3)
            r10.L$0 = r3
            r10.label = r1
            java.lang.Object r10 = defpackage.wg2.q(r11, r2, r10)
            if (r10 != r4) goto L69
        L68:
            return r4
        L69:
            j6g r10 = defpackage.j6g.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hka.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

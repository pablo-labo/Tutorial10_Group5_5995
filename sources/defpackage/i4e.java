package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.selection.SelectionManager$suggestSelectionForLongPressOrDoubleClick$2", f = "SelectionManager.kt", l = {436}, m = "invokeSuspend")
public final class i4e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ luc<kjf> $selectionInSelectable;
    final /* synthetic */ kuc $targetSelectableId;
    final /* synthetic */ luc<CharSequence> $textInSelectable;
    int label;
    final /* synthetic */ j4e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4e(j4e j4eVar, luc<CharSequence> lucVar, luc<kjf> lucVar2, kuc kucVar, lu2<? super i4e> lu2Var) {
        super(2, lu2Var);
        this.this$0 = j4eVar;
        this.$textInSelectable = lucVar;
        this.$selectionInSelectable = lucVar2;
        this.$targetSelectableId = kucVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new i4e(this.this$0, this.$textInSelectable, this.$selectionInSelectable, this.$targetSelectableId, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((i4e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.label
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L12
            if (r0 != r2) goto Lc
            defpackage.r7d.b(r10)
            goto L34
        Lc:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r9)
            return r1
        L12:
            defpackage.r7d.b(r10)
            j4e r10 = r9.this$0
            dcb r10 = r10.x
            if (r10 == 0) goto L37
            luc<java.lang.CharSequence> r0 = r9.$textInSelectable
            T r0 = r0.element
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            luc<kjf> r3 = r9.$selectionInSelectable
            T r3 = r3.element
            kjf r3 = (defpackage.kjf) r3
            long r3 = r3.a
            r9.label = r2
            java.lang.Object r10 = r10.b(r0, r3, r9)
            g13 r0 = defpackage.g13.a
            if (r10 != r0) goto L34
            return r0
        L34:
            kjf r10 = (defpackage.kjf) r10
            goto L38
        L37:
            r10 = r1
        L38:
            if (r10 == 0) goto Lb7
            long r2 = r10.a
            luc<kjf> r10 = r9.$selectionInSelectable
            T r10 = r10.element
            boolean r10 = defpackage.kjf.a(r10, r2)
            if (r10 != 0) goto Lb7
            j4e r10 = r9.this$0
            p4e r10 = r10.a
            k3a<uzd> r10 = r10.c
            kuc r0 = r9.$targetSelectableId
            long r4 = r0.element
            java.lang.Object r10 = r10.b(r4)
            uzd r10 = (defpackage.uzd) r10
            if (r10 == 0) goto Lb7
            le0 r0 = r10.getText()
            luc<java.lang.CharSequence> r4 = r9.$textInSelectable
            T r4 = r4.element
            if (r0 != r4) goto Lb7
            mif r10 = r10.j()
            if (r10 != 0) goto L6b
            j6g r9 = defpackage.j6g.a
            return r9
        L6b:
            p2e r0 = new p2e
            p2e$a r4 = new p2e$a
            r5 = 32
            long r5 = r2 >> r5
            int r5 = (int) r5
            b5d r6 = defpackage.w74.n(r10, r5)
            kuc r7 = r9.$targetSelectableId
            long r7 = r7.element
            r4.<init>(r6, r5, r7)
            p2e$a r5 = new p2e$a
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r6
            int r2 = (int) r2
            b5d r10 = defpackage.w74.n(r10, r2)
            kuc r3 = r9.$targetSelectableId
            long r6 = r3.element
            r5.<init>(r10, r2, r6)
            r10 = 0
            r0.<init>(r4, r5, r10)
            j4e r10 = r9.this$0
            p4e r10 = r10.a
            k3a r2 = defpackage.j59.a
            k3a r2 = new k3a
            r2.<init>()
            r2.h(r0, r6)
            g4a r10 = r10.k
            gme r10 = (defpackage.gme) r10
            r10.setValue(r2)
            j4e r10 = r9.this$0
            kotlin.jvm.functions.Function1<? super p2e, j6g> r10 = r10.d
            r10.invoke(r0)
            j4e r9 = r9.this$0
            r9.u = r1
        Lb7:
            j6g r9 = defpackage.j6g.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i4e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

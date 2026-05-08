package defpackage;

import defpackage.bdf;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$tryShowContextMenu$1", f = "TextContextMenuGesturesModifier.kt", l = {106, 107}, m = "invokeSuspend")
public final class cdf extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ bdf.b $dataProvider;
    final /* synthetic */ hdf $provider;
    int label;
    final /* synthetic */ bdf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdf(bdf bdfVar, hdf hdfVar, bdf.b bVar, lu2<? super cdf> lu2Var) {
        super(2, lu2Var);
        this.this$0 = bdfVar;
        this.$provider = hdfVar;
        this.$dataProvider = bVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new cdf(this.this$0, this.$provider, this.$dataProvider, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((cdf) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r5.a(r0, r4) == r3) goto L17;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            r1 = 2
            r2 = 1
            g13 r3 = defpackage.g13.a
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.r7d.b(r5)
            goto L3a
        L10:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L17:
            defpackage.r7d.b(r5)
            goto L2d
        L1b:
            defpackage.r7d.b(r5)
            bdf r5 = r4.this$0
            kotlin.jvm.functions.Function1<? super lu2<? super j6g>, ? extends java.lang.Object> r5 = r5.f0
            if (r5 == 0) goto L2d
            r4.label = r2
            java.lang.Object r5 = r5.invoke(r4)
            if (r5 != r3) goto L2d
            goto L39
        L2d:
            hdf r5 = r4.$provider
            bdf$b r0 = r4.$dataProvider
            r4.label = r1
            java.lang.Object r4 = r5.a(r0, r4)
            if (r4 != r3) goto L3a
        L39:
            return r3
        L3a:
            j6g r4 = defpackage.j6g.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

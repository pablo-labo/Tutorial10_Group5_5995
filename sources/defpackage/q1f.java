package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class q1f extends mj8 implements Function1<qa4<w1f>, j6g> {
    final /* synthetic */ boolean $enableDismissFromEndToStart;
    final /* synthetic */ boolean $enableDismissFromStartToEnd;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ float $width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1f(boolean z, boolean z2, float f, boolean z3) {
        super(1);
        this.$enableDismissFromStartToEnd = z;
        this.$isRtl = z2;
        this.$width = f;
        this.$enableDismissFromEndToStart = z3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(qa4<w1f> qa4Var) {
        qa4<w1f> qa4Var2 = qa4Var;
        qa4Var2.a(w1f.c, 0.0f);
        if (this.$enableDismissFromStartToEnd) {
            boolean z = this.$isRtl;
            float f = this.$width;
            if (z) {
                f = -f;
            }
            qa4Var2.a(w1f.a, f);
        }
        if (this.$enableDismissFromEndToStart) {
            boolean z2 = this.$isRtl;
            float f2 = this.$width;
            if (!z2) {
                f2 = -f2;
            }
            qa4Var2.a(w1f.b, f2);
        }
        return j6g.a;
    }
}

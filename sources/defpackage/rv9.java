package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class rv9 extends mj8 implements Function1<qa4<jee>, j6g> {
    final /* synthetic */ float $fullHeight;
    final /* synthetic */ long $sheetSize;
    final /* synthetic */ hee $sheetState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv9(float f, long j, hee heeVar) {
        super(1);
        this.$fullHeight = f;
        this.$sheetSize = j;
        this.$sheetState = heeVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(qa4<jee> qa4Var) {
        qa4<jee> qa4Var2 = qa4Var;
        qa4Var2.a(jee.a, this.$fullHeight);
        float f = (int) (this.$sheetSize & 4294967295L);
        float f2 = this.$fullHeight / 2.0f;
        if (f > f2 && !this.$sheetState.a) {
            qa4Var2.a(jee.c, f2);
        }
        int i = (int) (this.$sheetSize & 4294967295L);
        if (i != 0) {
            qa4Var2.a(jee.b, Math.max(0.0f, this.$fullHeight - i));
        }
        return j6g.a;
    }
}

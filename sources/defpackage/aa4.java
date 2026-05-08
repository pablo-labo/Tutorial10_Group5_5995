package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {1015, 1037}, m = "invokeSuspend")
public final class aa4 extends n7d implements Function2<l61, lu2<? super j6g>, Object> {
    final /* synthetic */ luc<yeb> $currentDown;
    final /* synthetic */ huc $deepPress;
    final /* synthetic */ luc<yeb> $longPress;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa4(huc hucVar, luc<yeb> lucVar, luc<yeb> lucVar2, lu2<? super aa4> lu2Var) {
        super(2, lu2Var);
        this.$deepPress = hucVar;
        this.$currentDown = lucVar;
        this.$longPress = lucVar2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        aa4 aa4Var = new aa4(this.$deepPress, this.$currentDown, this.$longPress, lu2Var);
        aa4Var.L$0 = obj;
        return aa4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(l61 l61Var, lu2<? super j6g> lu2Var) {
        return ((aa4) create(l61Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d9 A[EDGE_INSN: B:69:0x00d9->B:45:0x00d9 BREAK  A[LOOP:0: B:40:0x00c6->B:44:0x00d6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x006d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v13, types: [T, yeb] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b7 -> B:39:0x00ba). Please report as a decompilation issue!!! */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

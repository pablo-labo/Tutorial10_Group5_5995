package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {143, 147, 170}, m = "invokeSuspend")
public final class ome extends c1f implements Function2<wi5<Object>, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<Object> $block;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ome(gu5<Object> gu5Var, lu2<? super ome> lu2Var) {
        super(2, lu2Var);
        this.$block = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        ome omeVar = new ome(this.$block, lu2Var);
        omeVar.L$0 = obj;
        return omeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<Object> wi5Var, lu2<? super j6g> lu2Var) throws Throwable {
        ((ome) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
        return g13.a;
    }

    /* JADX WARN: Path cross not found for [B:37:0x00f3, B:58:0x0157], limit reached: 105 */
    /* JADX WARN: Path cross not found for [B:58:0x0157, B:37:0x00f3], limit reached: 105 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0165 A[EDGE_INSN: B:103:0x0165->B:61:0x0165 BREAK  A[LOOP:0: B:36:0x00f1->B:83:0x01c4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3 A[Catch: all -> 0x0058, TryCatch #2 {all -> 0x0058, blocks: (B:35:0x00ef, B:37:0x00f3, B:40:0x00fc, B:42:0x0111, B:44:0x011f, B:46:0x0129, B:50:0x013a, B:56:0x014f, B:59:0x0158, B:62:0x0167, B:66:0x0184, B:68:0x018d, B:80:0x01b8, B:81:0x01bb, B:15:0x0050, B:63:0x0179, B:65:0x0181, B:78:0x01b4, B:79:0x01b7, B:64:0x017d), top: B:97:0x0050, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0167 A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #2 {all -> 0x0058, blocks: (B:35:0x00ef, B:37:0x00f3, B:40:0x00fc, B:42:0x0111, B:44:0x011f, B:46:0x0129, B:50:0x013a, B:56:0x014f, B:59:0x0158, B:62:0x0167, B:66:0x0184, B:68:0x018d, B:80:0x01b8, B:81:0x01bb, B:15:0x0050, B:63:0x0179, B:65:0x0181, B:78:0x01b4, B:79:0x01b7, B:64:0x017d), top: B:97:0x0050, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c4 A[LOOP:0: B:36:0x00f1->B:83:0x01c4, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01a3 -> B:72:0x01a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x01bc -> B:73:0x01aa). Please report as a decompilation issue!!! */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ome.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

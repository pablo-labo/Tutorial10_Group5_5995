package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", f = "TapGestureDetector.kt", l = {386, 409}, m = "invokeSuspend")
public final class r8f extends n7d implements Function2<l61, lu2<? super j6g>, Object> {
    final /* synthetic */ peb $pass;
    final /* synthetic */ luc<m59> $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8f(peb pebVar, luc<m59> lucVar, lu2<? super r8f> lu2Var) {
        super(2, lu2Var);
        this.$pass = pebVar;
        this.$result = lucVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        r8f r8fVar = new r8f(this.$pass, this.$result, lu2Var);
        r8fVar.L$0 = obj;
        return r8fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(l61 l61Var, lu2<? super j6g> lu2Var) {
        return ((r8f) create(l61Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r14.c != 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        r13.$result.element = m59.c.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        r14 = r5.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r6 >= r14) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        r7 = r5.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r7.b() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        if (defpackage.mh2.n(r7, r0.a(), r0.r0()) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        r13.$result.element = m59.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        r13.L$0 = r0;
        r13.label = 2;
        r14 = r0.B1(defpackage.peb.c, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        if (r14 != r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        r13.$result.element = m59.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d9, code lost:
    
        return defpackage.j6g.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v12, types: [T, m59$a] */
    /* JADX WARN: Type inference failed for: r14v13, types: [T, m59$c] */
    /* JADX WARN: Type inference failed for: r14v20, types: [T, m59$a] */
    /* JADX WARN: Type inference failed for: r14v5, types: [T, m59$b] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009b -> B:34:0x009e). Please report as a decompilation issue!!! */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r8f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

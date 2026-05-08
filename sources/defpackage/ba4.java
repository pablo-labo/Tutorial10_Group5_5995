package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13", f = "DragGestureDetector.kt", l = {249, 255, 1105, 1142, 282, 1181, 1219, 1231}, m = "invokeSuspend")
public final class ba4 extends n7d implements Function2<l61, lu2<? super j6g>, Object> {
    final /* synthetic */ Function2<yeb, ooa, j6g> $onDrag;
    final /* synthetic */ gu5<j6g> $onDragCancel;
    final /* synthetic */ Function1<yeb, j6g> $onDragEnd;
    final /* synthetic */ wu5<yeb, yeb, ooa, j6g> $onDragStart;
    final /* synthetic */ dwa $orientationLock;
    final /* synthetic */ kuc $overSlop;
    final /* synthetic */ gu5<Boolean> $shouldAwaitTouchSlop;
    float F$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ba4(gu5<Boolean> gu5Var, kuc kucVar, dwa dwaVar, wu5<? super yeb, ? super yeb, ? super ooa, j6g> wu5Var, Function2<? super yeb, ? super ooa, j6g> function2, gu5<j6g> gu5Var2, Function1<? super yeb, j6g> function1, lu2<? super ba4> lu2Var) {
        super(2, lu2Var);
        this.$shouldAwaitTouchSlop = gu5Var;
        this.$overSlop = kucVar;
        this.$orientationLock = dwaVar;
        this.$onDragStart = wu5Var;
        this.$onDrag = function2;
        this.$onDragCancel = gu5Var2;
        this.$onDragEnd = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        ba4 ba4Var = new ba4(this.$shouldAwaitTouchSlop, this.$overSlop, this.$orientationLock, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, lu2Var);
        ba4Var.L$0 = obj;
        return ba4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(l61 l61Var, lu2<? super j6g> lu2Var) {
        return ((ba4) create(l61Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0434, code lost:
    
        if (r5.B1(r2, r24) == r13) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x04a4, code lost:
    
        if (r7 == r13) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0532, code lost:
    
        if (r7 == 0.0f) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x018b, code lost:
    
        if (r6 != r13) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0195, code lost:
    
        if (r1 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02d7, code lost:
    
        if (r6 == r13) goto L165;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0380 A[PHI: r1 r4 r5 r6 r7 r8 r11 r12 r16 r18
  0x0380: PHI (r1v36 float) = (r1v23 float), (r1v37 float) binds: [B:8:0x0068, B:113:0x037c] A[DONT_GENERATE, DONT_INLINE]
  0x0380: PHI (r4v37 yeb) = (r4v27 yeb), (r4v39 yeb) binds: [B:8:0x0068, B:113:0x037c] A[DONT_GENERATE, DONT_INLINE]
  0x0380: PHI (r5v29 l61) = (r5v24 l61), (r5v32 l61) binds: [B:8:0x0068, B:113:0x037c] A[DONT_GENERATE, DONT_INLINE]
  0x0380: PHI (r6v37 l61) = (r6v21 l61), (r6v39 l61) binds: [B:8:0x0068, B:113:0x037c] A[DONT_GENERATE, DONT_INLINE]
  0x0380: PHI (r7v27 java.lang.Object) = (r7v13 java.lang.Object), (r7v36 java.lang.Object) binds: [B:8:0x0068, B:113:0x037c] A[DONT_GENERATE, DONT_INLINE]
  0x0380: PHI (r8v38 fpf) = (r8v20 fpf), (r8v39 fpf) binds: [B:8:0x0068, B:113:0x037c] A[DONT_GENERATE, DONT_INLINE]
  0x0380: PHI (r11v13 kuc) = (r11v11 kuc), (r11v14 kuc) binds: [B:8:0x0068, B:113:0x037c] A[DONT_GENERATE, DONT_INLINE]
  0x0380: PHI (r12v23 kuc) = (r12v17 kuc), (r12v24 kuc) binds: [B:8:0x0068, B:113:0x037c] A[DONT_GENERATE, DONT_INLINE]
  0x0380: PHI (r16v20 long) = (r16v15 long), (r16v21 long) binds: [B:8:0x0068, B:113:0x037c] A[DONT_GENERATE, DONT_INLINE]
  0x0380: PHI (r18v20 long) = (r18v15 long), (r18v21 long) binds: [B:8:0x0068, B:113:0x037c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x020f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01dd A[PHI: r1 r4 r5 r6 r7 r12 r14 r15 r16 r18
  0x01dd: PHI (r1v14 float) = (r1v12 float), (r1v15 float) binds: [B:11:0x00ea, B:31:0x01d9] A[DONT_GENERATE, DONT_INLINE]
  0x01dd: PHI (r4v12 l61) = (r4v10 l61), (r4v14 l61) binds: [B:11:0x00ea, B:31:0x01d9] A[DONT_GENERATE, DONT_INLINE]
  0x01dd: PHI (r5v8 l61) = (r5v6 l61), (r5v11 l61) binds: [B:11:0x00ea, B:31:0x01d9] A[DONT_GENERATE, DONT_INLINE]
  0x01dd: PHI (r6v9 yeb) = (r6v7 yeb), (r6v10 yeb) binds: [B:11:0x00ea, B:31:0x01d9] A[DONT_GENERATE, DONT_INLINE]
  0x01dd: PHI (r7v5 kuc) = (r7v3 kuc), (r7v6 kuc) binds: [B:11:0x00ea, B:31:0x01d9] A[DONT_GENERATE, DONT_INLINE]
  0x01dd: PHI (r12v5 kuc) = (r12v3 kuc), (r12v6 kuc) binds: [B:11:0x00ea, B:31:0x01d9] A[DONT_GENERATE, DONT_INLINE]
  0x01dd: PHI (r14v4 fpf) = (r14v2 fpf), (r14v5 fpf) binds: [B:11:0x00ea, B:31:0x01d9] A[DONT_GENERATE, DONT_INLINE]
  0x01dd: PHI (r15v3 java.lang.Object) = (r15v2 java.lang.Object), (r15v11 java.lang.Object) binds: [B:11:0x00ea, B:31:0x01d9] A[DONT_GENERATE, DONT_INLINE]
  0x01dd: PHI (r16v7 long) = (r16v5 long), (r16v8 long) binds: [B:11:0x00ea, B:31:0x01d9] A[DONT_GENERATE, DONT_INLINE]
  0x01dd: PHI (r18v7 long) = (r18v5 long), (r18v8 long) binds: [B:11:0x00ea, B:31:0x01d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x0349 -> B:80:0x02a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x034f -> B:112:0x0364). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x03ec -> B:112:0x0364). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:147:0x0415 -> B:112:0x0364). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:149:0x0434 -> B:151:0x0438). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:155:0x0447 -> B:80:0x02a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:164:0x04a4 -> B:166:0x04a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x01a7 -> B:28:0x01a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0214 -> B:28:0x01a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x025e -> B:73:0x0290). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0264 -> B:30:0x01c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0285 -> B:70:0x0287). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x0307 -> B:86:0x02c1). Please report as a decompilation issue!!! */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

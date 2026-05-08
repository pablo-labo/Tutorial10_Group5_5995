package defpackage;

import defpackage.v94;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", l = {436, 438, 440, 447, 449, 452}, m = "invokeSuspend")
public final class ia4 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ja4 this$0;

    @uh3(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", l = {443}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<Function1<? super v94.b, ? extends j6g>, lu2<? super j6g>, Object> {
        final /* synthetic */ luc<v94> $event;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ ja4 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(luc<v94> lucVar, ja4 ja4Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$event = lucVar;
            this.this$0 = ja4Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$event, this.this$0, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Function1<? super v94.b, ? extends j6g> function1, lu2<? super j6g> lu2Var) {
            return ((a) create(function1, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004f -> B:24:0x0052). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0055 -> B:26:0x0056). Please report as a decompilation issue!!! */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                int r0 = r5.label
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L1a
                if (r0 != r2) goto L14
                java.lang.Object r0 = r5.L$1
                luc r0 = (defpackage.luc) r0
                java.lang.Object r3 = r5.L$0
                kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
                defpackage.r7d.b(r6)
                goto L52
            L14:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r5)
                return r1
            L1a:
                defpackage.r7d.b(r6)
                java.lang.Object r6 = r5.L$0
                kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
                r3 = r6
            L22:
                luc<v94> r6 = r5.$event
                T r6 = r6.element
                boolean r0 = r6 instanceof v94.d
                if (r0 != 0) goto L59
                boolean r0 = r6 instanceof v94.a
                if (r0 != 0) goto L59
                boolean r0 = r6 instanceof v94.b
                if (r0 == 0) goto L35
                v94$b r6 = (v94.b) r6
                goto L36
            L35:
                r6 = r1
            L36:
                if (r6 == 0) goto L3b
                r3.invoke(r6)
            L3b:
                luc<v94> r0 = r5.$event
                ja4 r6 = r5.this$0
                go1 r6 = r6.j0
                if (r6 == 0) goto L55
                r5.L$0 = r3
                r5.L$1 = r0
                r5.label = r2
                java.lang.Object r6 = r6.c(r5)
                g13 r4 = defpackage.g13.a
                if (r6 != r4) goto L52
                return r4
            L52:
                v94 r6 = (defpackage.v94) r6
                goto L56
            L55:
                r6 = r1
            L56:
                r0.element = r6
                goto L22
            L59:
                j6g r5 = defpackage.j6g.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ia4.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia4(ja4 ja4Var, lu2<? super ia4> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ja4Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        ia4 ia4Var = new ia4(this.this$0, lu2Var);
        ia4Var.L$0 = obj;
        return ia4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ia4) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:
    
        if (defpackage.ja4.f2(r7, r6) != r2) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:44:0x00cf, B:40:0x00bb], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:46:0x00d3, B:19:0x005a], limit reached: 56 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030 A[PHI: r0 r3
  0x0030: PHI (r0v14 luc) = (r0v6 luc), (r0v19 luc) binds: [B:13:0x002d, B:36:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x0030: PHI (r3v8 e13) = (r3v5 e13), (r3v10 e13) binds: [B:13:0x002d, B:36:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[PHI: r4
  0x005a: PHI (r4v7 e13) = (r4v0 e13), (r4v3 e13), (r4v3 e13), (r4v3 e13), (r4v5 e13), (r4v8 e13) binds: [B:18:0x0052, B:45:0x00d1, B:47:0x00e0, B:41:0x00ca, B:30:0x0088, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb A[Catch: CancellationException -> 0x00cd, TryCatch #0 {CancellationException -> 0x00cd, blocks: (B:38:0x00b5, B:40:0x00bb, B:44:0x00cf, B:46:0x00d3), top: B:55:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf A[Catch: CancellationException -> 0x00cd, TryCatch #0 {CancellationException -> 0x00cd, blocks: (B:38:0x00b5, B:40:0x00bb, B:44:0x00cf, B:46:0x00d3), top: B:55:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0088 -> B:19:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00ca -> B:19:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00d1 -> B:19:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00e0 -> B:19:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00f0 -> B:11:0x0023). Please report as a decompilation issue!!! */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ia4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

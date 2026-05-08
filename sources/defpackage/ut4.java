package defpackage;

import defpackage.ht4;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", l = {242}, m = "invokeSuspend")
public final class ut4 extends c1f implements Function2<e13, lu2<? super ht4.a>, Object> {
    final /* synthetic */ bz4 $eventListener;
    final /* synthetic */ qva $options;
    final /* synthetic */ v27 $request;
    final /* synthetic */ ht4.a $result;
    final /* synthetic */ List<qrf> $transformations;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ht4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ut4(ht4 ht4Var, ht4.a aVar, qva qvaVar, List<? extends qrf> list, bz4 bz4Var, v27 v27Var, lu2<? super ut4> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ht4Var;
        this.$result = aVar;
        this.$options = qvaVar;
        this.$transformations = list;
        this.$eventListener = bz4Var;
        this.$request = v27Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        ut4 ut4Var = new ut4(this.this$0, this.$result, this.$options, this.$transformations, this.$eventListener, this.$request, lu2Var);
        ut4Var.L$0 = obj;
        return ut4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super ht4.a> lu2Var) {
        return ((ut4) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Path cross not found for [B:16:0x0051, B:10:0x0039], limit reached: 24 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008d -> B:22:0x0090). Please report as a decompilation issue!!! */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            r1 = 1
            if (r0 == 0) goto L23
            if (r0 != r1) goto L1c
            int r0 = r8.I$1
            int r2 = r8.I$0
            java.lang.Object r3 = r8.L$2
            qva r3 = (defpackage.qva) r3
            java.lang.Object r4 = r8.L$1
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r8.L$0
            e13 r5 = (defpackage.e13) r5
            defpackage.r7d.b(r9)
            goto L90
        L1c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r8)
            r8 = 0
            return r8
        L23:
            defpackage.r7d.b(r9)
            java.lang.Object r9 = r8.L$0
            e13 r9 = (defpackage.e13) r9
            ht4 r0 = r8.this$0
            ht4$a r2 = r8.$result
            android.graphics.drawable.Drawable r2 = r2.a
            qva r3 = r8.$options
            r0.getClass()
            boolean r0 = r2 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L51
            r0 = r2
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            android.graphics.Bitmap$Config r4 = r0.getConfig()
            if (r4 != 0) goto L48
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
        L48:
            android.graphics.Bitmap$Config[] r5 = defpackage.m.a
            boolean r4 = defpackage.ut0.f0(r4, r5)
            if (r4 == 0) goto L51
            goto L5d
        L51:
            android.graphics.Bitmap$Config r0 = r3.b
            hie r4 = r3.c
            tmd r5 = r3.d
            boolean r3 = r3.e
            android.graphics.Bitmap r0 = defpackage.hh1.r(r2, r0, r4, r5, r3)
        L5d:
            bz4 r2 = r8.$eventListener
            r2.getClass()
            java.util.List<qrf> r2 = r8.$transformations
            qva r3 = r8.$options
            int r4 = r2.size()
            r5 = 0
            r7 = r5
            r5 = r9
            r9 = r0
            r0 = r4
            r4 = r2
            r2 = r7
        L71:
            if (r2 >= r0) goto L9b
            java.lang.Object r9 = r4.get(r2)
            qrf r9 = (defpackage.qrf) r9
            hie r6 = r3.c
            r8.L$0 = r5
            r8.L$1 = r4
            r8.L$2 = r3
            r8.I$0 = r2
            r8.I$1 = r0
            r8.label = r1
            java.lang.Object r9 = r9.b()
            g13 r6 = defpackage.g13.a
            if (r9 != r6) goto L90
            return r6
        L90:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            v03 r6 = r5.getCoroutineContext()
            defpackage.u63.u(r6)
            int r2 = r2 + r1
            goto L71
        L9b:
            bz4 r0 = r8.$eventListener
            r0.getClass()
            ht4$a r0 = r8.$result
            v27 r8 = r8.$request
            android.content.Context r8 = r8.a
            android.content.res.Resources r8 = r8.getResources()
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            r1.<init>(r8, r9)
            boolean r8 = r0.b
            ze3 r9 = r0.c
            java.lang.String r0 = r0.d
            ht4$a r2 = new ht4$a
            r2.<init>(r1, r8, r9, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ut4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

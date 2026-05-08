package defpackage;

import coil.memory.MemoryCache;
import defpackage.hi7;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {75}, m = "invokeSuspend")
public final class tt4 extends c1f implements Function2<e13, lu2<? super nye>, Object> {
    final /* synthetic */ MemoryCache.Key $cacheKey;
    final /* synthetic */ hi7.a $chain;
    final /* synthetic */ bz4 $eventListener;
    final /* synthetic */ Object $mappedData;
    final /* synthetic */ qva $options;
    final /* synthetic */ v27 $request;
    int label;
    final /* synthetic */ ht4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt4(ht4 ht4Var, v27 v27Var, Object obj, qva qvaVar, bz4 bz4Var, MemoryCache.Key key, hi7.a aVar, lu2<? super tt4> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ht4Var;
        this.$request = v27Var;
        this.$mappedData = obj;
        this.$options = qvaVar;
        this.$eventListener = bz4Var;
        this.$cacheKey = key;
        this.$chain = aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new tt4(this.this$0, this.$request, this.$mappedData, this.$options, this.$eventListener, this.$cacheKey, this.$chain, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super nye> lu2Var) {
        return ((tt4) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.label
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L13
            if (r0 != r2) goto Ld
            defpackage.r7d.b(r14)
            r8 = r13
            goto L2c
        Ld:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r13)
            return r1
        L13:
            defpackage.r7d.b(r14)
            ht4 r3 = r13.this$0
            v27 r4 = r13.$request
            java.lang.Object r5 = r13.$mappedData
            qva r6 = r13.$options
            bz4 r7 = r13.$eventListener
            r13.label = r2
            r8 = r13
            java.lang.Object r14 = defpackage.ht4.c(r3, r4, r5, r6, r7, r8)
            g13 r13 = defpackage.g13.a
            if (r14 != r13) goto L2c
            return r13
        L2c:
            ht4$a r14 = (ht4.a) r14
            ht4 r13 = r8.this$0
            qei r13 = r13.c
            coil.memory.MemoryCache$Key r0 = r8.$cacheKey
            v27 r3 = r8.$request
            vt1 r3 = r3.m
            boolean r3 = r3.c()
            r4 = 0
            if (r3 != 0) goto L41
        L3f:
            r13 = r4
            goto L83
        L41:
            java.lang.Object r13 = r13.a
            frc r13 = (defpackage.frc) r13
            coil.memory.MemoryCache r13 = r13.b()
            if (r13 == 0) goto L3f
            if (r0 != 0) goto L4e
            goto L3f
        L4e:
            android.graphics.drawable.Drawable r3 = r14.a
            boolean r5 = r3 instanceof android.graphics.drawable.BitmapDrawable
            if (r5 == 0) goto L57
            android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
            goto L58
        L57:
            r3 = r1
        L58:
            if (r3 == 0) goto L3f
            android.graphics.Bitmap r3 = r3.getBitmap()
            if (r3 != 0) goto L61
            goto L3f
        L61:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            boolean r6 = r14.b
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.String r7 = "coil#is_sampled"
            r5.put(r7, r6)
            java.lang.String r6 = r14.d
            if (r6 == 0) goto L7a
            java.lang.String r7 = "coil#disk_cache_key"
            r5.put(r7, r6)
        L7a:
            coil.memory.MemoryCache$a r6 = new coil.memory.MemoryCache$a
            r6.<init>(r3, r5)
            r13.c(r0, r6)
            r13 = r2
        L83:
            android.graphics.drawable.Drawable r6 = r14.a
            v27 r7 = r8.$request
            r0 = r8
            ze3 r8 = r14.c
            coil.memory.MemoryCache$Key r3 = r0.$cacheKey
            if (r13 == 0) goto L90
            r9 = r3
            goto L91
        L90:
            r9 = r1
        L91:
            java.lang.String r10 = r14.d
            boolean r11 = r14.b
            hi7$a r13 = r0.$chain
            android.graphics.Bitmap$Config[] r14 = defpackage.m.a
            boolean r14 = r13 instanceof defpackage.mrc
            if (r14 == 0) goto La5
            mrc r13 = (defpackage.mrc) r13
            boolean r13 = r13.g
            if (r13 == 0) goto La5
            r12 = r2
            goto La6
        La5:
            r12 = r4
        La6:
            nye r5 = new nye
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tt4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

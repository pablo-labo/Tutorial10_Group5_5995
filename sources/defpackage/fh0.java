package defpackage;

import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$maybeWriteToCache$2", f = "ApolloCacheInterceptor.kt", l = {85, 89}, m = "invokeSuspend", v = 1)
public final class fh0 extends c1f implements Function1<lu2<? super j6g>, Object> {
    final /* synthetic */ lb3 $customScalarAdapters;
    final /* synthetic */ Set<String> $extraKeys;
    final /* synthetic */ rh0<Object> $request;
    final /* synthetic */ sh0<Object> $response;
    int label;
    final /* synthetic */ ih0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh0(sh0<Object> sh0Var, rh0<Object> rh0Var, ih0 ih0Var, lb3 lb3Var, Set<String> set, lu2<? super fh0> lu2Var) {
        super(1, lu2Var);
        this.$response = sh0Var;
        this.$request = rh0Var;
        this.this$0 = ih0Var;
        this.$customScalarAdapters = lb3Var;
        this.$extraKeys = set;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new fh0(this.$response, this.$request, this.this$0, this.$customScalarAdapters, this.$extraKeys, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super j6g> lu2Var) {
        return ((fh0) create(lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009d, code lost:
    
        if (r11 == r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b8, code lost:
    
        if (r10.a(r11, r9) != r3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ba, code lost:
    
        return r3;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.label
            r1 = 2
            r2 = 1
            g13 r3 = defpackage.g13.a
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L18
            if (r0 != r1) goto L11
            defpackage.r7d.b(r11)
            goto Lbb
        L11:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r10)
            r10 = 0
            return r10
        L18:
            defpackage.r7d.b(r11)
            r9 = r10
            goto La0
        L1e:
            defpackage.r7d.b(r11)
            sh0<java.lang.Object> r11 = r10.$response
            D extends pua$a r11 = r11.c
            if (r11 == 0) goto La3
            rh0<java.lang.Object> r11 = r10.$request
            r11.getClass()
            k15 r11 = r11.c
            mt1$a r0 = defpackage.mt1.a
            k15$a r11 = r11.c(r0)
            mt1 r11 = (defpackage.mt1) r11
            lt1 r11 = defpackage.lt1.b
            sh0<java.lang.Object> r4 = r10.$response
            r4.getClass()
            k15 r4 = r4.g
            k15$a r0 = r4.c(r0)
            mt1 r0 = (defpackage.mt1) r0
            r11.getClass()
            r11.getClass()
            lt1$a r0 = new lt1$a
            r0.<init>()
            java.util.Map<java.lang.String, java.lang.String> r4 = r11.a
            r4.getClass()
            java.util.LinkedHashMap r0 = r0.a
            r0.putAll(r4)
            java.util.Map<java.lang.String, java.lang.String> r11 = r11.a
            r11.getClass()
            r0.putAll(r11)
            lt1 r8 = new lt1
            r8.<init>(r0)
            rh0<java.lang.Object> r11 = r10.$request
            r11.getClass()
            k15 r11 = r11.c
            gue$a r0 = defpackage.gue.a
            k15$a r11 = r11.c(r0)
            gue r11 = (defpackage.gue) r11
            rh0<java.lang.Object> r11 = r10.$request
            r11.getClass()
            k15 r11 = r11.c
            sn9$a r0 = defpackage.sn9.a
            k15$a r11 = r11.c(r0)
            sn9 r11 = (defpackage.sn9) r11
            ih0 r11 = r10.this$0
            fl3 r4 = r11.a
            rh0<java.lang.Object> r11 = r10.$request
            pua<D extends pua$a> r5 = r11.a
            sh0<java.lang.Object> r11 = r10.$response
            D extends pua$a r6 = r11.c
            r6.getClass()
            lb3 r7 = r10.$customScalarAdapters
            r10.label = r2
            r9 = r10
            java.lang.Object r11 = r4.d(r5, r6, r7, r8, r9)
            if (r11 != r3) goto La0
            goto Lba
        La0:
            java.util.Set r11 = (java.util.Set) r11
            goto La6
        La3:
            r9 = r10
            is4 r11 = defpackage.is4.a
        La6:
            ih0 r10 = r9.this$0
            fl3 r10 = r10.a
            java.util.Set<java.lang.String> r0 = r9.$extraKeys
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.LinkedHashSet r11 = defpackage.bbe.o(r11, r0)
            r9.label = r1
            java.lang.Object r10 = r10.a(r11, r9)
            if (r10 != r3) goto Lbb
        Lba:
            return r3
        Lbb:
            j6g r10 = defpackage.j6g.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fh0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

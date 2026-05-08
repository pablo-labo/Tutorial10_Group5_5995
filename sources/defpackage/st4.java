package defpackage;

import android.content.Context;
import defpackage.ii7;
import defpackage.qn9;
import defpackage.vt4;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil3.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {66}, m = "invokeSuspend")
public final class st4 extends c1f implements Function2<e13, lu2<? super mye>, Object> {
    final /* synthetic */ qn9.b $cacheKey;
    final /* synthetic */ ii7.a $chain;
    final /* synthetic */ cz4 $eventListener;
    final /* synthetic */ Object $mappedData;
    final /* synthetic */ nva $options;
    final /* synthetic */ w27 $request;
    int label;
    final /* synthetic */ vt4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st4(vt4 vt4Var, w27 w27Var, Object obj, nva nvaVar, cz4 cz4Var, qn9.b bVar, ii7.a aVar, lu2<? super st4> lu2Var) {
        super(2, lu2Var);
        this.this$0 = vt4Var;
        this.$request = w27Var;
        this.$mappedData = obj;
        this.$options = nvaVar;
        this.$eventListener = cz4Var;
        this.$cacheKey = bVar;
        this.$chain = aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new st4(this.this$0, this.$request, this.$mappedData, this.$options, this.$eventListener, this.$cacheKey, this.$chain, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super mye> lu2Var) {
        return ((st4) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        st4 st4Var;
        boolean z;
        qn9 qn9VarD;
        g13 g13Var = g13.a;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            vt4 vt4Var = this.this$0;
            w27 w27Var = this.$request;
            Object obj2 = this.$mappedData;
            nva nvaVar = this.$options;
            cz4 cz4Var = this.$eventListener;
            this.label = 1;
            st4Var = this;
            obj = vt4.c(vt4Var, w27Var, obj2, nvaVar, cz4Var, st4Var);
            if (obj == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            st4Var = this;
        }
        vt4.a aVar = (vt4.a) obj;
        la0 la0Var = st4Var.this$0.b;
        synchronized (la0Var) {
            try {
                xqc xqcVar = la0Var.a.get();
                if (xqcVar == null) {
                    la0Var.a();
                } else if (la0Var.b == null) {
                    Context context = xqcVar.a.a;
                    la0Var.b = context;
                    context.registerComponentCallbacks(la0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        un9 un9Var = st4Var.this$0.d;
        qn9.b bVar = st4Var.$cacheKey;
        w27 w27Var2 = st4Var.$request;
        if (bVar == null || !w27Var2.j.c() || !aVar.a.b() || (qn9VarD = un9Var.a.d()) == null) {
            z = false;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("coil#is_sampled", Boolean.valueOf(aVar.b));
            String str = aVar.d;
            if (str != null) {
                linkedHashMap.put("coil#disk_cache_key", str);
            }
            qn9VarD.e(bVar, new qn9.c(aVar.a, linkedHashMap));
            z = true;
        }
        k07 k07Var = aVar.a;
        w27 w27Var3 = st4Var.$request;
        we3 we3Var = aVar.c;
        qn9.b bVar2 = z ? st4Var.$cacheKey : null;
        String str2 = aVar.d;
        boolean z2 = aVar.b;
        ii7.a aVar2 = st4Var.$chain;
        return new mye(k07Var, w27Var3, we3Var, bVar2, str2, z2, (aVar2 instanceof lrc) && ((lrc) aVar2).g);
    }
}

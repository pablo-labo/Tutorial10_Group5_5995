package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryItemCount$2", f = "RoomPagingUtil.kt", l = {159}, m = "invokeSuspend")
public final class jfd extends c1f implements Function2<drf, lu2<? super Integer>, Object> {
    final /* synthetic */ String $countQuery;
    final /* synthetic */ kfd $sourceQuery;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfd(String str, kfd kfdVar, lu2<? super jfd> lu2Var) {
        super(2, lu2Var);
        this.$countQuery = str;
        this.$sourceQuery = kfdVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        jfd jfdVar = new jfd(this.$countQuery, this.$sourceQuery, lu2Var);
        jfdVar.L$0 = obj;
        return jfdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drf drfVar, lu2<? super Integer> lu2Var) {
        return ((jfd) create(drfVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                r7d.b(obj);
                return obj;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        drf drfVar = (drf) this.L$0;
        String str = this.$countQuery;
        or orVar = new or(this.$sourceQuery, 19);
        this.label = 1;
        Object objB = drfVar.b(str, orVar, this);
        g13 g13Var = g13.a;
        return objB == g13Var ? g13Var : objB;
    }
}

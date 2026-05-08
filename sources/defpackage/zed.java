package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2", f = "RoomDatabase.kt", l = {468}, m = "invokeSuspend")
public final class zed extends c1f implements Function2<e13, lu2<Object>, Object> {
    final /* synthetic */ Function2<drf, lu2<Object>, Object> $block;
    final /* synthetic */ xed $this_useReaderConnection;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zed(xed xedVar, Function2<? super drf, ? super lu2<Object>, ? extends Object> function2, lu2<? super zed> lu2Var) {
        super(2, lu2Var);
        this.$this_useReaderConnection = xedVar;
        this.$block = function2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new zed(this.$this_useReaderConnection, this.$block, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<Object> lu2Var) {
        return ((zed) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
        xed xedVar = this.$this_useReaderConnection;
        Function2<drf, lu2<Object>, Object> function2 = this.$block;
        this.label = 1;
        Object objX = xedVar.x(true, function2, this);
        g13 g13Var = g13.a;
        return objX == g13Var ? g13Var : objX;
    }
}

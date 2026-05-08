package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2", f = "RoomDatabase.android.kt", l = {1970}, m = "invokeSuspend")
public final class bfd extends c1f implements Function1<lu2<Object>, Object> {
    final /* synthetic */ Function1<lu2<Object>, Object> $block;
    final /* synthetic */ xed $this_withTransaction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public bfd(xed xedVar, Function1<? super lu2<Object>, ? extends Object> function1, lu2<? super bfd> lu2Var) {
        super(1, lu2Var);
        this.$this_withTransaction = xedVar;
        this.$block = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new bfd(this.$this_withTransaction, this.$block, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<Object> lu2Var) {
        return ((bfd) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        try {
            if (i == 0) {
                r7d.b(obj);
                this.$this_withTransaction.c();
                Function1<lu2<Object>, Object> function1 = this.$block;
                this.label = 1;
                obj = function1.invoke(this);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            this.$this_withTransaction.w();
            return obj;
        } finally {
            this.$this_withTransaction.s();
        }
    }
}

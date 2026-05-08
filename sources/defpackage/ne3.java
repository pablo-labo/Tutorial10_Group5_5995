package defpackage;

import defpackage.pe3;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
public final class ne3<T> extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ pe3.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne3(pe3.a aVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = aVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return pe3.a.a(this.this$0, null, null, this);
    }
}

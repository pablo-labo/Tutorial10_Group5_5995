package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class f60 extends mj8 implements Function1<m74, l74> {
    final /* synthetic */ g60 $callbacks;
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f60(Context context, g60 g60Var) {
        super(1);
        this.$context = context;
        this.$callbacks = g60Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final l74 invoke(m74 m74Var) {
        this.$context.getApplicationContext().registerComponentCallbacks(this.$callbacks);
        return new e60(this.$context, this.$callbacks);
    }
}

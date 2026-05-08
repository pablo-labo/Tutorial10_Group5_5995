package defpackage;

import java.io.IOException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class m64 extends mj8 implements Function1<IOException, j6g> {
    final /* synthetic */ i64 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m64(i64 i64Var) {
        super(1);
        this.this$0 = i64Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(IOException iOException) {
        this.this$0.Z = true;
        return j6g.a;
    }
}

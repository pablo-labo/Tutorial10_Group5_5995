package defpackage;

import android.content.Context;
import defpackage.a44;
import defpackage.m05;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class ox5 extends mj8 implements Function1<px5, j6g> {
    final /* synthetic */ hz4 $config;
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox5(hz4 hz4Var, Context context) {
        super(1);
        this.$config = hz4Var;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(px5 px5Var) {
        px5 px5Var2 = px5Var;
        px5Var2.getClass();
        a44.a aVar = a44.Companion;
        hz4 hz4Var = this.$config;
        aVar.getClass();
        px5Var2.a = a44.a.a(hz4Var, mx5.a).a();
        m05.a aVar2 = m05.Companion;
        Context context = this.$context;
        hz4 hz4Var2 = this.$config;
        aVar2.getClass();
        px5Var2.b = m05.a.a(context, hz4Var2, nx5.a).a();
        return j6g.a;
    }
}

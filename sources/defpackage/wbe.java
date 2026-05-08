package defpackage;

import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wbe extends mj8 implements Function1<cd6, j6g> {
    final /* synthetic */ ShadowGraphicsLayerElement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbe(ShadowGraphicsLayerElement shadowGraphicsLayerElement) {
        super(1);
        this.this$0 = shadowGraphicsLayerElement;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(cd6 cd6Var) {
        cd6 cd6Var2 = cd6Var;
        cd6Var2.s(cd6Var2.t1(this.this$0.b));
        cd6Var2.r1(this.this$0.c);
        cd6Var2.n(this.this$0.d);
        cd6Var2.j(this.this$0.e);
        cd6Var2.o(this.this$0.f);
        return j6g.a;
    }
}

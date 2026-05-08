package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class js1 implements Function2<View, Float, j6g> {
    public final /* synthetic */ is1 a;
    public final /* synthetic */ int b;

    public js1(is1 is1Var, int i) {
        this.a = is1Var;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(View view, Float f) {
        View view2 = view;
        view2.getClass();
        this.a.q(view2, Integer.valueOf(this.b), f);
        return j6g.a;
    }
}

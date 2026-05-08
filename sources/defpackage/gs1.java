package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class gs1 implements Function2<View, Integer, j6g> {
    public final /* synthetic */ fs1 a;
    public final /* synthetic */ Object b;

    public gs1(fs1 fs1Var, Object obj) {
        this.a = fs1Var;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(View view, Integer num) {
        View view2 = view;
        view2.getClass();
        this.a.q(view2, this.b, num);
        return j6g.a;
    }
}

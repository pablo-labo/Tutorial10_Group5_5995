package defpackage;

import android.view.View;
import defpackage.cj1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ls1 implements Function2<View, String, j6g> {
    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(View view, String str) {
        cj1 cj1VarA;
        View view2 = view;
        String str2 = str;
        view2.getClass();
        if (str2 != null) {
            cj1.a.getClass();
            cj1VarA = cj1.a.a(str2);
        } else {
            cj1VarA = null;
        }
        v71.n(view2, cj1VarA);
        return j6g.a;
    }
}

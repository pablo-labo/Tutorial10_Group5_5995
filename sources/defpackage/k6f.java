package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k6f implements tpa {
    @Override // defpackage.tpa
    public final rzg b(View view, rzg rzgVar) {
        view.getClass();
        kf7 kf7VarG = rzgVar.a.g(7);
        kf7VarG.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ja.k("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = kf7VarG.a;
        marginLayoutParams.bottomMargin = kf7VarG.d;
        marginLayoutParams.rightMargin = kf7VarG.c;
        view.setLayoutParams(marginLayoutParams);
        return rzg.b;
    }
}

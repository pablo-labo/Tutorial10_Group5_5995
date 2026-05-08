package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class z extends RecyclerView.j {
    public boolean g;

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean a(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, RecyclerView.j.b bVar, RecyclerView.j.b bVar2) {
        int i;
        int i2;
        int i3 = bVar.a;
        int i4 = bVar.b;
        if (b0Var2.o()) {
            int i5 = bVar.a;
            i2 = bVar.b;
            i = i5;
        } else {
            i = bVar2.a;
            i2 = bVar2.b;
        }
        k kVar = (k) this;
        if (b0Var == b0Var2) {
            return kVar.g(b0Var, i3, i4, i, i2);
        }
        View view = b0Var.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        kVar.l(b0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = b0Var2.a;
        kVar.l(b0Var2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList<k.a> arrayList = kVar.k;
        k.a aVar = new k.a();
        aVar.a = b0Var;
        aVar.b = b0Var2;
        aVar.c = i3;
        aVar.d = i4;
        aVar.e = i;
        aVar.f = i2;
        arrayList.add(aVar);
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean g(RecyclerView.b0 b0Var, int i, int i2, int i3, int i4);
}

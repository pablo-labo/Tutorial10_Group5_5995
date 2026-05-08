package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class t extends o {
    public final /* synthetic */ u q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Context context) {
        super(context);
        this.q = uVar;
    }

    @Override // androidx.recyclerview.widget.o, androidx.recyclerview.widget.RecyclerView.w
    public final void c(View view, RecyclerView.w.a aVar) {
        u uVar = this.q;
        int[] iArrB = uVar.b(uVar.a.getLayoutManager(), view);
        int i = iArrB[0];
        int i2 = iArrB[1];
        int iCeil = (int) Math.ceil(((double) g(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (iCeil > 0) {
            aVar.a = i;
            aVar.b = i2;
            aVar.c = iCeil;
            aVar.e = this.j;
            aVar.f = true;
        }
    }

    @Override // androidx.recyclerview.widget.o
    public final float f(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.o
    public final int g(int i) {
        return Math.min(100, super.g(i));
    }
}

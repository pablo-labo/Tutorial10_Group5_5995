package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class m1f implements v6 {
    public final /* synthetic */ SwipeDismissBehavior a;

    public m1f(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    @Override // defpackage.v6
    public final boolean a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = this.a;
        if (!swipeDismissBehavior.s(view)) {
            return false;
        }
        WeakHashMap<View, prg> weakHashMap = epg.a;
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.c;
        view.offsetLeftAndRight((!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }
}

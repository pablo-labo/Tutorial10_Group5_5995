package defpackage;

import android.graphics.RectF;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public final class z70 {
    public static int[] a(hif hifVar, RectF rectF, int i, final s5 s5Var) {
        return hifVar.f.getRangeForRect(rectF, i == 1 ? new ig0(new kn2(hifVar.f.getText(), hifVar.j())) : new GraphemeClusterSegmentFinder(hifVar.f.getText(), hifVar.a), new Layout.TextInclusionStrategy() { // from class: y70
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) s5Var.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }
}

package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.horcrux.svg.VirtualView;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class is3 extends gs3 {
    @Override // defpackage.gs3, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f) {
    }

    @Override // com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }
}

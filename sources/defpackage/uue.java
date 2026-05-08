package defpackage;

import android.graphics.Canvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class uue extends zs3 implements eb4 {
    public final i70 f0;
    public final ff4 g0;
    public RenderNode h0;

    public uue(k1f k1fVar, i70 i70Var, ff4 ff4Var) {
        this.f0 = i70Var;
        this.g0 = ff4Var;
        c2(k1fVar);
    }

    public static boolean f2(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final RenderNode g2() {
        RenderNode renderNode = this.h0;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeA = tue.a();
        this.h0 = renderNodeA;
        return renderNodeA;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01e9 A[PHI: r20
  0x01e9: PHI (r20v2 boolean) = (r20v1 boolean), (r20v11 boolean) binds: [B:92:0x019e, B:100:0x01b9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.eb4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(defpackage.sm8 r26) {
        /*
            Method dump skipped, instruction units count: 881
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uue.y(sm8):void");
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import defpackage.noa;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g17 extends ba1 {
    public final ij8 D;
    public final Rect E;
    public final Rect F;
    public final RectF G;
    public final n79 H;
    public final kd4 I;
    public noa J;
    public noa.a K;

    public g17(j79 j79Var, hl8 hl8Var) {
        super(j79Var, hl8Var);
        this.D = new ij8(3);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
        String str = hl8Var.g;
        s69 s69Var = j79Var.a;
        this.H = s69Var == null ? null : (n79) ((HashMap) s69Var.c()).get(str);
        id4 id4Var = this.p.x;
        if (id4Var != null) {
            this.I = new kd4(this, this, id4Var);
        }
    }

    @Override // defpackage.ba1, defpackage.vc4
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        if (this.H != null) {
            float fC = ckg.c();
            if (this.o.Z) {
                rectF.set(0.0f, 0.0f, r4.a * fC, r4.b * fC);
            } else {
                if (q() != null) {
                    rectF.set(0.0f, 0.0f, r4.getWidth() * fC, r4.getHeight() * fC);
                } else {
                    rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            this.n.mapRect(rectF);
        }
    }

    @Override // defpackage.ba1
    public final void k(Canvas canvas, Matrix matrix, int i, hd4 hd4Var) {
        n79 n79Var;
        Bitmap bitmapQ = q();
        if (bitmapQ == null || bitmapQ.isRecycled() || (n79Var = this.H) == null) {
            return;
        }
        float fC = ckg.c();
        ij8 ij8Var = this.D;
        ij8Var.setAlpha(i);
        kd4 kd4Var = this.I;
        if (kd4Var != null) {
            hd4Var = kd4Var.b(matrix, i);
        }
        int width = bitmapQ.getWidth();
        int height = bitmapQ.getHeight();
        Rect rect = this.E;
        rect.set(0, 0, width, height);
        boolean z = this.o.Z;
        Rect rect2 = this.F;
        if (z) {
            rect2.set(0, 0, (int) (n79Var.a * fC), (int) (n79Var.b * fC));
        } else {
            rect2.set(0, 0, (int) (bitmapQ.getWidth() * fC), (int) (bitmapQ.getHeight() * fC));
        }
        boolean z2 = hd4Var != null;
        if (z2) {
            if (this.J == null) {
                this.J = new noa();
            }
            if (this.K == null) {
                this.K = new noa.a();
            }
            noa.a aVar = this.K;
            aVar.a = 255;
            aVar.b = null;
            hd4Var.getClass();
            hd4 hd4Var2 = new hd4(hd4Var);
            aVar.b = hd4Var2;
            hd4Var2.b(i);
            float f = rect2.left;
            float f2 = rect2.top;
            float f3 = rect2.right;
            float f4 = rect2.bottom;
            RectF rectF = this.G;
            rectF.set(f, f2, f3, f4);
            matrix.mapRect(rectF);
            canvas = this.J.e(canvas, rectF, this.K);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapQ, rect, rect2, ij8Var);
        if (z2) {
            this.J.c();
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap q() {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g17.q():android.graphics.Bitmap");
    }
}

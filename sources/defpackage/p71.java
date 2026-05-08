package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p71 extends Drawable {
    public final Context a;
    public aj1 b;
    public r7i c;
    public RectF e;
    public cn2 f;
    public int h;
    public Path j;
    public List<r71> k;
    public final Paint l;
    public final float d = 0.8f;
    public boolean g = true;
    public final RectF i = new RectF();

    public p71(Context context, aj1 aj1Var, r7i r7iVar) {
        this.a = context;
        this.b = aj1Var;
        this.c = r7iVar;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.h);
        this.l = paint;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015e  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instruction units count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p71.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    @sy3
    public final int getOpacity() {
        int alpha = this.l.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        rect.getClass();
        super.onBoundsChange(rect);
        this.g = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.l.setAlpha(gf9.b((Color.alpha(this.h) / 255.0f) * (i / 255.0f) * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.horcrux.svg.SVGLength;
import com.horcrux.svg.u;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class xif extends u {
    public String i0;
    public ijf j0;
    public hjf k0;
    public SVGLength l0;

    @Override // com.horcrux.svg.u, com.horcrux.svg.h, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f) {
        g(canvas, paint, f);
    }

    @Override // com.horcrux.svg.u, com.horcrux.svg.h, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        return n(canvas, paint);
    }

    @Override // com.horcrux.svg.h
    public final void k() {
    }

    @Override // com.horcrux.svg.u, com.horcrux.svg.h
    public final void l() {
    }

    @Override // com.horcrux.svg.u
    public final void p(String str) {
        gjf.valueOf(str);
        invalidate();
    }
}

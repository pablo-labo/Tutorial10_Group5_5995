package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.a;
import com.facebook.react.bridge.ReactContext;
import defpackage.d5g;
import defpackage.j82;
import defpackage.l82;
import defpackage.m27;
import defpackage.m5d;
import defpackage.mkf;
import defpackage.n7g;
import defpackage.n82;
import defpackage.q07;
import defpackage.q27;
import defpackage.u1;
import defpackage.web;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class j extends RenderableView {
    public int V;
    public String W;
    public SVGLength a;
    public int a0;
    public SVGLength b;
    public final AtomicBoolean b0;
    public SVGLength c;
    public SVGLength d;
    public String e;
    public int f;

    public j(mkf mkfVar) {
        super(mkfVar);
        this.b0 = new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f) {
        Uri uriB;
        AtomicBoolean atomicBoolean = this.b0;
        if (atomicBoolean.get()) {
            return;
        }
        q27 q27Var = q27.p;
        web.h(q27Var, "ImagePipelineFactory was not initialized!");
        m27 m27VarE = q27Var.e();
        ReactContext reactContext = this.mContext;
        String str = this.e;
        reactContext.getClass();
        ((28 & 16) != 0 ? q07.a : null).getClass();
        try {
            uriB = Uri.parse(str);
            if (uriB.getScheme() == null) {
                uriB = m5d.b(reactContext, str);
            }
        } catch (NullPointerException unused) {
            uriB = m5d.b(reactContext, str);
        }
        com.facebook.imagepipeline.request.a aVarA = ImageRequestBuilder.d(uriB).a();
        n82<l82> n82Var = m27VarE.f.get(m27VarE.h.a(aVarA, null));
        try {
            if (!n82.W(n82Var)) {
                atomicBoolean.set(true);
                u1 u1VarA = m27VarE.a(aVarA, this.mContext, null, null, null);
                i iVar = new i(this);
                if (d5g.b == null) {
                    d5g.b = new d5g();
                }
                u1VarA.f(iVar, d5g.b);
                return;
            }
            float f2 = f * this.mOpacity;
            ReactContext reactContext2 = this.mContext;
            CancellationException cancellationException = m27.l;
            u1 u1VarA2 = m27VarE.a(aVarA, reactContext2, a.c.BITMAP_MEMORY_CACHE, null, null);
            try {
                try {
                    n82 n82Var2 = (n82) u1VarA2.getResult();
                    try {
                        if (n82Var2 == null) {
                            u1VarA2.close();
                            return;
                        }
                        try {
                            l82 l82Var = (l82) n82Var2.P();
                            if (!(l82Var instanceof j82)) {
                                n82Var2.close();
                                u1VarA2.close();
                                return;
                            }
                            Bitmap bitmapT1 = ((j82) l82Var).t1();
                            if (bitmapT1 == null) {
                                n82Var2.close();
                                u1VarA2.close();
                            } else {
                                g(canvas, paint, bitmapT1, f2);
                                n82Var2.close();
                                u1VarA2.close();
                            }
                        } catch (Exception e) {
                            throw new IllegalStateException(e);
                        }
                    } catch (Throwable th) {
                        n82Var2.close();
                        throw th;
                    }
                } catch (Exception e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (Throwable th2) {
                u1VarA2.close();
                throw th2;
            }
        } finally {
            n82.G(n82Var);
        }
    }

    public final void g(Canvas canvas, Paint paint, Bitmap bitmap, float f) {
        if (this.f == 0 || this.V == 0) {
            this.f = bitmap.getWidth();
            this.V = bitmap.getHeight();
        }
        RectF rectFH = h();
        RectF rectF = new RectF(0.0f, 0.0f, this.f, this.V);
        n7g.c(rectF, rectFH, this.W, this.a0).mapRect(rectF);
        canvas.clipPath(getPath(canvas, paint));
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        Paint paint2 = new Paint();
        paint2.setAlpha((int) (f * 255.0f));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
        this.mCTM.mapRect(rectF);
        setClientRect(rectF);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        this.mPath = path;
        path.addRect(h(), Path.Direction.CW);
        return this.mPath;
    }

    public final RectF h() {
        double dRelativeOnWidth = relativeOnWidth(this.a);
        double dRelativeOnHeight = relativeOnHeight(this.b);
        double dRelativeOnWidth2 = relativeOnWidth(this.c);
        double dRelativeOnHeight2 = relativeOnHeight(this.d);
        if (dRelativeOnWidth2 == 0.0d) {
            dRelativeOnWidth2 = this.f * this.mScale;
        }
        if (dRelativeOnHeight2 == 0.0d) {
            dRelativeOnHeight2 = this.V * this.mScale;
        }
        return new RectF((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) (dRelativeOnWidth + dRelativeOnWidth2), (float) (dRelativeOnHeight + dRelativeOnHeight2));
    }
}

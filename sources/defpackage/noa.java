package defpackage;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class noa {
    public static final Matrix B = new Matrix();
    public hd4 A;
    public Canvas a;
    public a b;
    public b c;
    public RectF d;
    public RectF e;
    public Rect f;
    public RectF g;
    public RectF h;
    public Rect i;
    public RectF j;
    public ij8 k;
    public Bitmap l;
    public Canvas m;
    public Rect n;
    public ij8 o;
    public Matrix p;
    public float[] q;
    public Bitmap r;
    public Bitmap s;
    public Canvas t;
    public Canvas u;
    public ij8 v;
    public BlurMaskFilter w;
    public float x = 0.0f;
    public RenderNode y;
    public RenderNode z;

    public static class a {
        public int a = 255;
        public hd4 b = null;

        public final boolean a() {
            return this.b != null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final /* synthetic */ b[] e;

        static {
            b bVar = new b("DIRECT", 0);
            a = bVar;
            b bVar2 = new b("SAVE_LAYER", 1);
            b = bVar2;
            b bVar3 = new b("BITMAP", 2);
            c = bVar3;
            b bVar4 = new b("RENDER_NODE", 3);
            d = bVar4;
            e = new b[]{bVar, bVar2, bVar3, bVar4};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) e.clone();
        }
    }

    public static Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap((int) Math.ceil(((double) rectF.width()) * 1.05d), (int) Math.ceil(((double) rectF.height()) * 1.05d), config);
    }

    public static boolean d(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public final RectF b(RectF rectF, hd4 hd4Var) {
        if (this.e == null) {
            this.e = new RectF();
        }
        if (this.g == null) {
            this.g = new RectF();
        }
        this.e.set(rectF);
        this.e.offsetTo(rectF.left + hd4Var.b, rectF.top + hd4Var.c);
        RectF rectF2 = this.e;
        float f = hd4Var.a;
        rectF2.inset(-f, -f);
        this.g.set(rectF);
        this.e.union(this.g);
        return this.e;
    }

    public final void c() {
        float f;
        ij8 ij8Var;
        if (this.a == null || this.b == null || this.q == null || this.d == null) {
            r6.g("OffscreenBitmap: finish() call without matching start()");
            return;
        }
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            this.a.restore();
        } else {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    if (this.y == null) {
                        r6.g("RenderNode is not ready; should've been initialized at start() time");
                        return;
                    }
                    int i = Build.VERSION.SDK_INT;
                    if (i < 29) {
                        r6.g("RenderNode not supported but we chose it as render strategy");
                        return;
                    }
                    this.a.save();
                    Canvas canvas = this.a;
                    float[] fArr = this.q;
                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                    this.y.endRecording();
                    if (this.b.a()) {
                        Canvas canvas2 = this.a;
                        hd4 hd4Var = this.b.b;
                        if (this.y == null || this.z == null) {
                            r6.g("Cannot render to render node outside a start()/finish() block");
                            return;
                        }
                        if (i < 31) {
                            b0.o("RenderEffect is not supported on API level <31");
                            return;
                        }
                        float[] fArr2 = this.q;
                        float f2 = fArr2 != null ? fArr2[0] : 1.0f;
                        f = fArr2 != null ? fArr2[4] : 1.0f;
                        hd4 hd4Var2 = this.A;
                        if (hd4Var2 == null || hd4Var.a != hd4Var2.a || hd4Var.b != hd4Var2.b || hd4Var.c != hd4Var2.c || hd4Var.d != hd4Var2.d) {
                            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(hd4Var.d, PorterDuff.Mode.SRC_IN));
                            float f3 = hd4Var.a;
                            if (f3 > 0.0f) {
                                float f4 = ((f2 + f) * f3) / 2.0f;
                                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(f4, f4, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
                            }
                            this.z.setRenderEffect(renderEffectCreateColorFilterEffect);
                            this.A = hd4Var;
                        }
                        RectF rectFB = b(this.d, hd4Var);
                        RectF rectF = new RectF(rectFB.left * f2, rectFB.top * f, rectFB.right * f2, rectFB.bottom * f);
                        this.z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                        RecordingCanvas recordingCanvasBeginRecording = this.z.beginRecording((int) rectF.width(), (int) rectF.height());
                        recordingCanvasBeginRecording.translate((hd4Var.b * f2) + (-rectF.left), (hd4Var.c * f) + (-rectF.top));
                        recordingCanvasBeginRecording.drawRenderNode(this.y);
                        this.z.endRecording();
                        canvas2.save();
                        canvas2.translate(rectF.left, rectF.top);
                        canvas2.drawRenderNode(this.z);
                        canvas2.restore();
                    }
                    this.a.drawRenderNode(this.y);
                    this.a.restore();
                }
            } else {
                if (this.l == null) {
                    r6.g("Bitmap is not ready; should've been initialized at start() time");
                    return;
                }
                if (this.b.a()) {
                    Canvas canvas3 = this.a;
                    hd4 hd4Var3 = this.b.b;
                    RectF rectF2 = this.d;
                    if (rectF2 == null || this.l == null) {
                        r6.g("Cannot render to bitmap outside a start()/finish() block");
                        return;
                    }
                    RectF rectFB2 = b(rectF2, hd4Var3);
                    if (this.f == null) {
                        this.f = new Rect();
                    }
                    this.f.set((int) Math.floor(rectFB2.left), (int) Math.floor(rectFB2.top), (int) Math.ceil(rectFB2.right), (int) Math.ceil(rectFB2.bottom));
                    float[] fArr3 = this.q;
                    float f5 = fArr3 != null ? fArr3[0] : 1.0f;
                    f = fArr3 != null ? fArr3[4] : 1.0f;
                    if (this.h == null) {
                        this.h = new RectF();
                    }
                    this.h.set(rectFB2.left * f5, rectFB2.top * f, rectFB2.right * f5, rectFB2.bottom * f);
                    if (this.i == null) {
                        this.i = new Rect();
                    }
                    this.i.set(0, 0, Math.round(this.h.width()), Math.round(this.h.height()));
                    if (d(this.r, this.h)) {
                        Bitmap bitmap = this.r;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        Bitmap bitmap2 = this.s;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        this.r = a(this.h, Bitmap.Config.ARGB_8888);
                        this.s = a(this.h, Bitmap.Config.ALPHA_8);
                        this.t = new Canvas(this.r);
                        this.u = new Canvas(this.s);
                    } else {
                        Canvas canvas4 = this.t;
                        if (canvas4 == null || this.u == null || (ij8Var = this.o) == null) {
                            r6.g("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                            return;
                        } else {
                            canvas4.drawRect(this.i, ij8Var);
                            this.u.drawRect(this.i, this.o);
                        }
                    }
                    if (this.s == null) {
                        r6.g("Expected to have allocated a shadow mask bitmap");
                        return;
                    }
                    if (this.v == null) {
                        this.v = new ij8(1);
                    }
                    RectF rectF3 = this.d;
                    this.u.drawBitmap(this.l, Math.round((rectF3.left - rectFB2.left) * f5), Math.round((rectF3.top - rectFB2.top) * f), (Paint) null);
                    if (this.w == null || this.x != hd4Var3.a) {
                        float f6 = ((f5 + f) * hd4Var3.a) / 2.0f;
                        if (f6 > 0.0f) {
                            this.w = new BlurMaskFilter(f6, BlurMaskFilter.Blur.NORMAL);
                        } else {
                            this.w = null;
                        }
                        this.x = hd4Var3.a;
                    }
                    this.v.setColor(hd4Var3.d);
                    float f7 = hd4Var3.a;
                    ij8 ij8Var2 = this.v;
                    if (f7 > 0.0f) {
                        ij8Var2.setMaskFilter(this.w);
                    } else {
                        ij8Var2.setMaskFilter(null);
                    }
                    this.v.setFilterBitmap(true);
                    this.t.drawBitmap(this.s, Math.round(hd4Var3.b * f5), Math.round(hd4Var3.c * f), this.v);
                    canvas3.drawBitmap(this.r, this.i, this.f, this.k);
                }
                if (this.n == null) {
                    this.n = new Rect();
                }
                this.n.set(0, 0, (int) (this.d.width() * this.q[0]), (int) (this.d.height() * this.q[4]));
                this.a.drawBitmap(this.l, this.n, this.d, this.k);
            }
        }
        this.a = null;
    }

    public final Canvas e(Canvas canvas, RectF rectF, a aVar) {
        b bVar;
        if (this.a != null) {
            r6.g("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
            return null;
        }
        if (this.q == null) {
            this.q = new float[9];
        }
        if (this.p == null) {
            this.p = new Matrix();
        }
        canvas.getMatrix(this.p);
        this.p.getValues(this.q);
        float[] fArr = this.q;
        float f = fArr[0];
        float f2 = fArr[4];
        if (this.j == null) {
            this.j = new RectF();
        }
        this.j.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
        this.a = canvas;
        this.b = aVar;
        if (aVar.a >= 255 && !aVar.a()) {
            bVar = b.a;
        } else if (aVar.a()) {
            int i = Build.VERSION.SDK_INT;
            bVar = (i < 29 || !canvas.isHardwareAccelerated() || i <= 31) ? b.c : b.d;
        } else {
            bVar = b.b;
        }
        this.c = bVar;
        if (this.d == null) {
            this.d = new RectF();
        }
        this.d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.k == null) {
            this.k = new ij8();
        }
        this.k.reset();
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 0) {
            canvas.save();
            return canvas;
        }
        if (iOrdinal == 1) {
            this.k.setAlpha(aVar.a);
            this.k.setColorFilter(null);
            ij8 ij8Var = this.k;
            Matrix matrix = ckg.a;
            canvas.saveLayer(rectF, ij8Var);
            return canvas;
        }
        Matrix matrix2 = B;
        if (iOrdinal == 2) {
            if (this.o == null) {
                ij8 ij8Var2 = new ij8();
                this.o = ij8Var2;
                ij8Var2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (d(this.l, this.j)) {
                Bitmap bitmap = this.l;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.l = a(this.j, Bitmap.Config.ARGB_8888);
                this.m = new Canvas(this.l);
            } else {
                Canvas canvas2 = this.m;
                if (canvas2 == null) {
                    r6.g("If needNewBitmap() returns true, we should have a canvas ready");
                    return null;
                }
                canvas2.setMatrix(matrix2);
                this.m.drawRect(-1.0f, -1.0f, this.j.width() + 1.0f, this.j.height() + 1.0f, this.o);
            }
            v2b.a(this.k, null);
            this.k.setColorFilter(null);
            this.k.setAlpha(aVar.a);
            Canvas canvas3 = this.m;
            canvas3.scale(f, f2);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (iOrdinal != 3) {
            b0.o("Invalid render strategy for OffscreenLayer");
            return null;
        }
        if (Build.VERSION.SDK_INT < 29) {
            r6.g("RenderNode not supported but we chose it as render strategy");
            return null;
        }
        if (this.y == null) {
            this.y = new RenderNode("OffscreenLayer.main");
        }
        if (aVar.a() && this.z == null) {
            this.z = new RenderNode("OffscreenLayer.shadow");
            this.A = null;
        }
        this.y.setAlpha(aVar.a / 255.0f);
        if (aVar.a()) {
            RenderNode renderNode = this.z;
            if (renderNode == null) {
                r6.g("Must initialize shadowRenderNode when we have shadow");
                return null;
            }
            renderNode.setAlpha(aVar.a / 255.0f);
        }
        this.y.setHasOverlappingRendering(true);
        RenderNode renderNode2 = this.y;
        RectF rectF2 = this.j;
        renderNode2.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.y.beginRecording((int) this.j.width(), (int) this.j.height());
        recordingCanvasBeginRecording.setMatrix(matrix2);
        recordingCanvasBeginRecording.scale(f, f2);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }
}

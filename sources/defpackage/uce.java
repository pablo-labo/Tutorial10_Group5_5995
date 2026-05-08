package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class uce {

    @Deprecated
    public float a;

    @Deprecated
    public float b;

    @Deprecated
    public float c;

    @Deprecated
    public float d;

    @Deprecated
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public static class a extends f {
        public final c b;

        public a(c cVar) {
            this.b = cVar;
        }

        @Override // uce.f
        public final void a(Matrix matrix, zbe zbeVar, int i, Canvas canvas) {
            c cVar = this.b;
            float f = cVar.f;
            float f2 = cVar.g;
            RectF rectF = new RectF(cVar.b, cVar.c, cVar.d, cVar.e);
            Paint paint = zbeVar.b;
            boolean z = f2 < 0.0f;
            Path path = zbeVar.g;
            int[] iArr = zbe.k;
            if (z) {
                iArr[0] = 0;
                iArr[1] = zbeVar.f;
                iArr[2] = zbeVar.e;
                iArr[3] = zbeVar.d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f, f2);
                path.close();
                float f3 = -i;
                rectF.inset(f3, f3);
                iArr[0] = 0;
                iArr[1] = zbeVar.d;
                iArr[2] = zbeVar.e;
                iArr[3] = zbeVar.f;
            }
            float fWidth = rectF.width() / 2.0f;
            if (fWidth <= 0.0f) {
                return;
            }
            float f4 = 1.0f - (i / fWidth);
            float[] fArr = zbe.l;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, zbeVar.h);
            }
            canvas.drawArc(rectF, f, f2, true, paint);
            canvas.restore();
        }
    }

    public static class b extends f {
        public final d b;
        public final float c;
        public final float d;

        public b(d dVar, float f, float f2) {
            this.b = dVar;
            this.c = f;
            this.d = f2;
        }

        @Override // uce.f
        public final void a(Matrix matrix, zbe zbeVar, int i, Canvas canvas) {
            d dVar = this.b;
            float f = dVar.c;
            float f2 = this.d;
            float f3 = dVar.b;
            float f4 = this.c;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(f4, f2);
            matrix2.preRotate(b());
            zbeVar.getClass();
            rectF.bottom += i;
            rectF.offset(0.0f, -i);
            int i2 = zbeVar.f;
            int[] iArr = zbe.i;
            iArr[0] = i2;
            iArr[1] = zbeVar.e;
            iArr[2] = zbeVar.d;
            Paint paint = zbeVar.c;
            float f5 = rectF.left;
            paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, zbe.j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }

        public final float b() {
            d dVar = this.b;
            return (float) Math.toDegrees(Math.atan((dVar.c - this.d) / (dVar.b - this.c)));
        }
    }

    public static class c extends e {
        public static final RectF h = new RectF();

        @Deprecated
        public final float b;

        @Deprecated
        public final float c;

        @Deprecated
        public final float d;

        @Deprecated
        public final float e;

        @Deprecated
        public float f;

        @Deprecated
        public float g;

        public c(float f, float f2, float f3, float f4) {
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
        }

        @Override // uce.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            float f = this.d;
            float f2 = this.e;
            RectF rectF = h;
            rectF.set(this.b, this.c, f, f2);
            path.arcTo(rectF, this.f, this.g, false);
            path.transform(matrix);
        }
    }

    public static class d extends e {
        public float b;
        public float c;

        @Override // uce.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.c);
            path.transform(matrix);
        }
    }

    public static abstract class e {
        public final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static abstract class f {
        public static final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, zbe zbeVar, int i, Canvas canvas);
    }

    public uce() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f2) {
        float f3 = this.d;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.b;
        float f6 = this.c;
        c cVar = new c(f5, f6, f5, f6);
        cVar.f = this.d;
        cVar.g = f4;
        this.g.add(new a(cVar));
        this.d = f2;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((e) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f2, float f3) {
        d dVar = new d();
        dVar.b = f2;
        dVar.c = f3;
        this.f.add(dVar);
        b bVar = new b(dVar, this.b, this.c);
        float fB = bVar.b() + 270.0f;
        float fB2 = bVar.b() + 270.0f;
        a(fB);
        this.g.add(bVar);
        this.d = fB2;
        this.b = f2;
        this.c = f3;
    }

    public final void d(float f2, float f3, float f4) {
        this.a = f2;
        this.b = 0.0f;
        this.c = f2;
        this.d = f3;
        this.e = (f3 + f4) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}

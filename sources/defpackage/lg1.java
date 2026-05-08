package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import defpackage.f37;
import defpackage.ig1;
import java.util.Set;
import uqc.a;

/* JADX INFO: loaded from: classes.dex */
public final class lg1 extends mj8 implements gu5<vj3> {
    final /* synthetic */ ig1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg1(ig1 ig1Var) {
        super(0);
        this.this$0 = ig1Var;
    }

    @Override // defpackage.gu5
    public final vj3 invoke() throws Exception {
        d25 d25Var;
        Rect rect;
        boolean z;
        Context context;
        int i;
        boolean z2;
        int iMin;
        double dMax;
        Bitmap bitmapCreateBitmap;
        ig1 ig1Var = this.this$0;
        BitmapFactory.Options options = new BitmapFactory.Options();
        qva qvaVar = ig1Var.b;
        f37 f37Var = ig1Var.a;
        ig1.a aVar = new ig1.a(f37Var.K1());
        uqc uqcVar = new uqc(aVar);
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(uqcVar.peek().new a(), null, options);
        Exception exc = aVar.b;
        if (exc != null) {
            throw exc;
        }
        options.inJustDecodeBounds = false;
        Paint paint = o25.a;
        String str = options.outMimeType;
        Set<String> set = p25.a;
        if (str == null || !p25.a.contains(str)) {
            d25Var = d25.c;
        } else {
            e25 e25Var = new e25(new h25(uqcVar.peek().new a()));
            int iD = e25Var.d(1, "Orientation");
            d25Var = new d25(e25Var.n(), iD == 2 || iD == 7 || iD == 4 || iD == 5);
        }
        int i2 = d25Var.b;
        boolean z3 = d25Var.a;
        Exception exc2 = aVar.b;
        if (exc2 != null) {
            throw exc2;
        }
        options.inMutable = false;
        qvaVar.getClass();
        Context context2 = qvaVar.a;
        hie hieVar = qvaVar.c;
        options.inPremultiplied = qvaVar.g;
        Bitmap.Config config = qvaVar.b;
        if ((z3 || i2 > 0) && (config == null || config == Bitmap.Config.HARDWARE)) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (qvaVar.f && config == Bitmap.Config.ARGB_8888 && wl7.b(options.outMimeType, "image/jpeg")) {
            config = Bitmap.Config.RGB_565;
        }
        Bitmap.Config config2 = options.outConfig;
        Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
        if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
            config = config3;
        }
        options.inPreferredConfig = config;
        f37.a aVarA = f37Var.a();
        if ((aVarA instanceof y5d) && wl7.b(hieVar, hie.c)) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((y5d) aVarA).a;
            options.inTargetDensity = context2.getResources().getDisplayMetrics().densityDpi;
            rect = null;
            z2 = false;
            z = z3;
            context = context2;
        } else {
            int i3 = options.outWidth;
            if (i3 > 0) {
                int i4 = options.outHeight;
                if (i4 <= 0) {
                    i = 1;
                    rect = null;
                    z = z3;
                    context = context2;
                } else {
                    int i5 = (i2 == 90 || i2 == 270) ? i4 : i3;
                    if (i2 != 90 && i2 != 270) {
                        i3 = i4;
                    }
                    tmd tmdVar = qvaVar.d;
                    hie hieVar2 = hie.c;
                    int iD2 = wl7.b(hieVar, hieVar2) ? i5 : m.d(hieVar.a, tmdVar);
                    int iD3 = wl7.b(hieVar, hieVar2) ? i3 : m.d(hieVar.b, tmdVar);
                    int iHighestOneBit = Integer.highestOneBit(i5 / iD2);
                    rect = null;
                    int iHighestOneBit2 = Integer.highestOneBit(i3 / iD3);
                    int iOrdinal = tmdVar.ordinal();
                    if (iOrdinal == 0) {
                        iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                    } else {
                        if (iOrdinal != 1) {
                            l.g();
                            return null;
                        }
                        iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                    }
                    if (iMin < 1) {
                        iMin = 1;
                    }
                    options.inSampleSize = iMin;
                    z = z3;
                    context = context2;
                    double d = iMin;
                    double d2 = ((double) iD2) / (((double) i5) / d);
                    double d3 = ((double) iD3) / (((double) i3) / d);
                    int iOrdinal2 = tmdVar.ordinal();
                    if (iOrdinal2 == 0) {
                        dMax = Math.max(d2, d3);
                    } else {
                        if (iOrdinal2 != 1) {
                            l.g();
                            return null;
                        }
                        dMax = Math.min(d2, d3);
                    }
                    if (qvaVar.e && dMax > 1.0d) {
                        dMax = 1.0d;
                    }
                    boolean z4 = dMax == 1.0d;
                    options.inScaled = !z4;
                    if (!z4) {
                        if (dMax > 1.0d) {
                            options.inDensity = gf9.a(2.147483647E9d / dMax);
                            options.inTargetDensity = Integer.MAX_VALUE;
                        } else {
                            options.inDensity = Integer.MAX_VALUE;
                            options.inTargetDensity = gf9.a(2.147483647E9d * dMax);
                        }
                    }
                    z2 = false;
                }
            } else {
                rect = null;
                z = z3;
                context = context2;
                i = 1;
            }
            options.inSampleSize = i;
            z2 = false;
            options.inScaled = false;
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(uqcVar.new a(), rect, options);
            uqcVar.close();
            Exception exc3 = aVar.b;
            if (exc3 != null) {
                throw exc3;
            }
            if (bitmapDecodeStream == null) {
                r6.g("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                return null;
            }
            bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
            if (z || i2 > 0) {
                Matrix matrix = new Matrix();
                float width = bitmapDecodeStream.getWidth() / 2.0f;
                float height = bitmapDecodeStream.getHeight() / 2.0f;
                if (z) {
                    matrix.postScale(-1.0f, 1.0f, width, height);
                }
                if (i2 > 0) {
                    matrix.postRotate(i2, width, height);
                }
                RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                matrix.mapRect(rectF);
                float f = rectF.left;
                if (f != 0.0f || rectF.top != 0.0f) {
                    matrix.postTranslate(-f, -rectF.top);
                }
                if (i2 == 90 || i2 == 270) {
                    int height2 = bitmapDecodeStream.getHeight();
                    int width2 = bitmapDecodeStream.getWidth();
                    Bitmap.Config config4 = bitmapDecodeStream.getConfig();
                    if (config4 == null) {
                        config4 = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                    bitmapCreateBitmap.getClass();
                } else {
                    int width3 = bitmapDecodeStream.getWidth();
                    int height3 = bitmapDecodeStream.getHeight();
                    Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                    if (config5 == null) {
                        config5 = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config5);
                    bitmapCreateBitmap.getClass();
                }
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, o25.a);
                bitmapDecodeStream.recycle();
                bitmapDecodeStream = bitmapCreateBitmap;
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmapDecodeStream);
            boolean z5 = true;
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z5 = z2;
            }
            return new vj3(bitmapDrawable, z5);
        } finally {
        }
    }
}

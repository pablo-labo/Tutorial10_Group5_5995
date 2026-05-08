package defpackage;

import android.content.Context;
import android.graphics.Point;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.image.ImageDecoderException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class og1 extends qfe<DecoderInputBuffer, x17, ImageDecoderException> implements u07 {
    public final Context n;
    public final int o;

    public static final class a {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
        
            if (android.os.Build.VERSION.SDK_INT >= 34) goto L42;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int a(androidx.media3.common.a r5) {
            /*
                r4 = this;
                java.lang.String r4 = r5.n
                r0 = 0
                if (r4 == 0) goto L7f
                boolean r4 = defpackage.st9.m(r4)
                if (r4 != 0) goto Ld
                goto L7f
            Ld:
                java.lang.String r4 = r5.n
                java.lang.String r5 = defpackage.vjg.a
                r4.getClass()
                int r5 = r4.hashCode()
                r1 = 4
                r2 = 1
                r3 = -1
                switch(r5) {
                    case -1487656890: goto L61;
                    case -1487464693: goto L56;
                    case -1487464690: goto L4b;
                    case -1487394660: goto L40;
                    case -1487018032: goto L35;
                    case -879272239: goto L2a;
                    case -879258763: goto L1f;
                    default: goto L1e;
                }
            L1e:
                goto L6b
            L1f:
                java.lang.String r5 = "image/png"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L28
                goto L6b
            L28:
                r3 = 6
                goto L6b
            L2a:
                java.lang.String r5 = "image/bmp"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L33
                goto L6b
            L33:
                r3 = 5
                goto L6b
            L35:
                java.lang.String r5 = "image/webp"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L3e
                goto L6b
            L3e:
                r3 = r1
                goto L6b
            L40:
                java.lang.String r5 = "image/jpeg"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L49
                goto L6b
            L49:
                r3 = 3
                goto L6b
            L4b:
                java.lang.String r5 = "image/heif"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L54
                goto L6b
            L54:
                r3 = 2
                goto L6b
            L56:
                java.lang.String r5 = "image/heic"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L5f
                goto L6b
            L5f:
                r3 = r2
                goto L6b
            L61:
                java.lang.String r5 = "image/avif"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L6a
                goto L6b
            L6a:
                r3 = r0
            L6b:
                switch(r3) {
                    case 0: goto L6f;
                    case 1: goto L75;
                    case 2: goto L75;
                    case 3: goto L75;
                    case 4: goto L75;
                    case 5: goto L75;
                    case 6: goto L75;
                    default: goto L6e;
                }
            L6e:
                goto L7a
            L6f:
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 34
                if (r4 < r5) goto L7a
            L75:
                int r4 = androidx.media3.exoplayer.l.f(r1, r0, r0, r0)
                return r4
            L7a:
                int r4 = androidx.media3.exoplayer.l.f(r2, r0, r0, r0)
                return r4
            L7f:
                int r4 = androidx.media3.exoplayer.l.f(r0, r0, r0, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: og1.a.a(androidx.media3.common.a):int");
        }
    }

    public og1(Context context) {
        super(new DecoderInputBuffer[1], new x17[1]);
        this.n = context;
        this.o = -1;
    }

    @Override // defpackage.qfe
    public final DecoderInputBuffer g() {
        return new DecoderInputBuffer(1);
    }

    @Override // defpackage.qfe
    public final ck3 h() {
        return new ng1(this);
    }

    @Override // defpackage.qfe
    public final DecoderException i(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    @Override // defpackage.qfe
    public final DecoderException j(DecoderInputBuffer decoderInputBuffer, ck3 ck3Var, boolean z) {
        x17 x17Var = (x17) ck3Var;
        ByteBuffer byteBuffer = decoderInputBuffer.d;
        byteBuffer.getClass();
        ka2.q(byteBuffer.hasArray());
        ka2.l(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.o;
            if (iMax == -1) {
                Context context = this.n;
                if (context != null) {
                    Point pointW = vjg.w(context);
                    int i = pointW.x;
                    int i2 = pointW.y;
                    androidx.media3.common.a aVar = decoderInputBuffer.b;
                    if (aVar != null) {
                        int i3 = aVar.M;
                        if (i3 != -1) {
                            i *= i3;
                        }
                        int i4 = aVar.N;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                    }
                    iMax = (Math.max(i, i2) * 2) - 1;
                } else {
                    iMax = 4096;
                }
            }
            x17Var.d = fh1.a(byteBuffer.remaining(), byteBuffer.array(), iMax);
            x17Var.b = decoderInputBuffer.f;
            return null;
        } catch (ParserException e) {
            return new ImageDecoderException("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new ImageDecoderException(e2);
        }
    }
}

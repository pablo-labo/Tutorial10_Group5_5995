package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import defpackage.v86;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class lr1 implements j5d<ByteBuffer, v86> {
    public static final a f = new a();
    public static final b g = new b();
    public final Context a;
    public final ArrayList b;
    public final t86 e;
    public final a d = f;
    public final b c = g;

    public static class a {
    }

    public static class b {
        public final ArrayDeque a;

        public b() {
            char[] cArr = xjg.a;
            this.a = new ArrayDeque(0);
        }

        public final synchronized void a(c96 c96Var) {
            c96Var.b = null;
            c96Var.c = null;
            this.a.offer(c96Var);
        }
    }

    public lr1(Context context, ArrayList arrayList, bh1 bh1Var, kt0 kt0Var) {
        this.a = context.getApplicationContext();
        this.b = arrayList;
        this.e = new t86(bh1Var, kt0Var);
    }

    public static int d(b96 b96Var, int i, int i2) {
        int iMin = Math.min(b96Var.g / i2, b96Var.f / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbF = uz.f("Downsampling GIF, sampleSize: ", iMax, ", target dimens: [", i, "x");
            sbF.append(i2);
            sbF.append("], actual dimens: [");
            sbF.append(b96Var.f);
            sbF.append("x");
            sbF.append(b96Var.g);
            sbF.append("]");
            Log.v("BufferGifDecoder", sbF.toString());
        }
        return iMax;
    }

    @Override // defpackage.j5d
    public final boolean a(ByteBuffer byteBuffer, ova ovaVar) {
        return !((Boolean) ovaVar.c(d96.b)).booleanValue() && com.bumptech.glide.load.a.c(this.b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // defpackage.j5d
    public final f5d<v86> b(ByteBuffer byteBuffer, int i, int i2, ova ovaVar) {
        c96 c96Var;
        ByteBuffer byteBuffer2 = byteBuffer;
        b bVar = this.c;
        synchronized (bVar) {
            try {
                c96 c96Var2 = (c96) bVar.a.poll();
                if (c96Var2 == null) {
                    c96Var2 = new c96();
                }
                c96Var = c96Var2;
                c96Var.b = null;
                Arrays.fill(c96Var.a, (byte) 0);
                c96Var.c = new b96();
                c96Var.d = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
                c96Var.b = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                c96Var.b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return c(byteBuffer2, i, i2, c96Var, ovaVar);
        } finally {
            this.c.a(c96Var);
        }
    }

    public final w86 c(ByteBuffer byteBuffer, int i, int i2, c96 c96Var, ova ovaVar) {
        StringBuilder sb;
        int i3 = n39.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            b96 b96VarB = c96Var.b();
            if (b96VarB.c > 0 && b96VarB.b == 0) {
                Bitmap.Config config = ovaVar.c(d96.a) == oj3.b ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iD = d(b96VarB, i, i2);
                a aVar = this.d;
                t86 t86Var = this.e;
                aVar.getClass();
                bre breVar = new bre(t86Var, b96VarB, byteBuffer, iD);
                breVar.c(config);
                breVar.a();
                Bitmap nextFrame = breVar.getNextFrame();
                if (nextFrame == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(n39.a(jElapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                w86 w86Var = new w86(new v86(new v86.a(new z86(com.bumptech.glide.a.a(this.a), breVar, i, i2, o6g.b, nextFrame))));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + n39.a(jElapsedRealtimeNanos));
                }
                return w86Var;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(n39.a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + n39.a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }
}

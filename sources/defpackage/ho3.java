package defpackage;

import android.graphics.ColorSpace;
import com.facebook.imagepipeline.decoder.DecodeException;
import defpackage.a17;
import defpackage.ize;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class ho3 implements t07 {
    public final t07 a;
    public final t07 b;
    public final t07 c;
    public final ibb d;
    public final a f = new a();
    public final ize.b e = ize.b;

    public class a implements t07 {
        public a() {
        }

        @Override // defpackage.t07
        public final l82 a(vs4 vs4Var, int i, h47 h47Var, r07 r07Var) {
            ColorSpace colorSpace;
            vs4Var.b0();
            z07 z07Var = vs4Var.b;
            ho3 ho3Var = ho3.this;
            ho3Var.e.getClass();
            Boolean bool = Boolean.FALSE;
            if (bool.booleanValue()) {
                r07Var.getClass();
                vs4Var.b0();
                colorSpace = vs4Var.Y;
            } else {
                r07Var.getClass();
                colorSpace = null;
            }
            if (z07Var == jo3.a) {
                n82 n82VarB = ho3Var.d.b(vs4Var, r07Var.a, i, colorSpace);
                try {
                    n82VarB.getClass();
                    vs4Var.b0();
                    int i2 = vs4Var.c;
                    vs4Var.b0();
                    int i3 = vs4Var.d;
                    int i4 = jm3.X;
                    jm3 jm3Var = new jm3(n82VarB, h47Var, i2, i3);
                    jm3Var.f0(bool, "is_rounded");
                    n82VarB.close();
                    return jm3Var;
                } catch (Throwable th) {
                    n82.G(n82VarB);
                    throw th;
                }
            }
            if (z07Var == jo3.c) {
                vs4Var.b0();
                if (vs4Var.e != -1) {
                    vs4Var.b0();
                    if (vs4Var.f != -1) {
                        r07Var.getClass();
                        t07 t07Var = ho3Var.a;
                        return t07Var != null ? t07Var.a(vs4Var, i, h47Var, r07Var) : ho3Var.b(vs4Var, r07Var);
                    }
                }
                throw new DecodeException("image width or height is incorrect", vs4Var);
            }
            if (z07Var == jo3.j) {
                r07Var.getClass();
                t07 t07Var2 = ho3Var.b;
                return t07Var2 != null ? t07Var2.a(vs4Var, i, h47Var, r07Var) : ho3Var.b(vs4Var, r07Var);
            }
            if (z07Var != jo3.m) {
                if (z07Var != z07.c) {
                    return ho3Var.b(vs4Var, r07Var);
                }
                throw new DecodeException("unknown image format", vs4Var);
            }
            t07 t07Var3 = ho3Var.c;
            if (t07Var3 != null) {
                return t07Var3.a(vs4Var, i, h47Var, r07Var);
            }
            return null;
        }
    }

    public ho3(t07 t07Var, t07 t07Var2, w5h w5hVar, ibb ibbVar) {
        this.a = t07Var;
        this.b = t07Var2;
        this.c = w5hVar;
        this.d = ibbVar;
    }

    @Override // defpackage.t07
    public final l82 a(vs4 vs4Var, int i, h47 h47Var, r07 r07Var) {
        InputStream inputStreamV;
        r07Var.getClass();
        vs4Var.b0();
        z07 z07Var = vs4Var.b;
        if ((z07Var == null || z07Var == z07.c) && (inputStreamV = vs4Var.v()) != null) {
            Lazy<a17> lazy = a17.d;
            try {
                vs4Var.b = a17.a.a(inputStreamV);
            } catch (IOException e) {
                bf9.f(e);
                throw null;
            }
        }
        return this.f.a(vs4Var, i, h47Var, r07Var);
    }

    public final jm3 b(vs4 vs4Var, r07 r07Var) {
        n82 n82VarA = this.d.a(vs4Var, r07Var.a);
        try {
            n82VarA.getClass();
            h47 h47Var = h47.d;
            vs4Var.b0();
            int i = vs4Var.c;
            vs4Var.b0();
            int i2 = vs4Var.d;
            int i3 = jm3.X;
            jm3 jm3Var = new jm3(n82VarA, h47Var, i, i2);
            jm3Var.f0(Boolean.FALSE, "is_rounded");
            n82VarA.close();
            return jm3Var;
        } catch (Throwable th) {
            n82.G(n82VarA);
            throw th;
        }
    }
}

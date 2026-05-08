package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.common.util.ExceptionWithNoStacktrace;
import com.facebook.imagepipeline.decoder.DecodeException;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.a;
import defpackage.n82;
import defpackage.o82;
import defpackage.rj3;
import defpackage.sz7;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class rj3 implements opb<n82<l82>> {
    public final cr1 a;
    public final Executor b;
    public final t07 c;
    public final j3c d;
    public final f94 e;
    public final boolean f;
    public final opb<vs4> g;
    public final int h;
    public final o82 i;

    public final class a extends c {
        @Override // rj3.c
        public final int j(vs4 vs4Var) {
            vs4Var.getClass();
            return vs4Var.G();
        }

        @Override // rj3.c
        public final h47 k() {
            h47 h47Var = new h47();
            h47Var.a = 0;
            h47Var.b = false;
            h47Var.c = false;
            return h47Var;
        }

        @Override // rj3.c
        public final synchronized boolean o(vs4 vs4Var, int i) {
            return w81.b(i) ? false : this.h.e(vs4Var, i);
        }
    }

    public final class b extends c {
        public final k3c k;
        public final j3c l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(rj3 rj3Var, xq2 xq2Var, ppb ppbVar, k3c k3cVar, j3c j3cVar, int i) {
            super(rj3Var, xq2Var, ppbVar, i);
            xq2Var.getClass();
            j3cVar.getClass();
            this.k = k3cVar;
            this.l = j3cVar;
            this.i = 0;
        }

        @Override // rj3.c
        public final int j(vs4 vs4Var) {
            vs4Var.getClass();
            return this.k.f;
        }

        @Override // rj3.c
        public final h47 k() {
            return this.l.b(this.k.e);
        }

        @Override // rj3.c
        public final synchronized boolean o(vs4 vs4Var, int i) {
            if (vs4Var == null) {
                return false;
            }
            try {
                boolean zE = this.h.e(vs4Var, i);
                if (w81.b(i) || w81.h(i, 8)) {
                    if (!w81.h(i, 4) && vs4.W(vs4Var)) {
                        vs4Var.b0();
                        if (vs4Var.b == jo3.a) {
                            if (!this.k.b(vs4Var)) {
                                return false;
                            }
                            int i2 = this.k.e;
                            int i3 = this.i;
                            if (i2 <= i3) {
                                return false;
                            }
                            if (i2 < this.l.a(i3) && !this.k.g) {
                                return false;
                            }
                            this.i = i2;
                        }
                    }
                }
                return zE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract class c extends xs3<vs4, n82<l82>> {
        public final ppb c;
        public final String d;
        public final tpb e;
        public final r07 f;
        public boolean g;
        public final sz7 h;
        public int i;
        public final /* synthetic */ rj3 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(final rj3 rj3Var, xq2 xq2Var, ppb ppbVar, final int i) {
            super(xq2Var);
            xq2Var.getClass();
            this.j = rj3Var;
            this.c = ppbVar;
            this.d = "ProgressiveDecoder";
            this.e = ppbVar.G();
            r07 r07Var = ppbVar.Q().g;
            r07Var.getClass();
            this.f = r07Var;
            this.h = new sz7(rj3Var.b, new sz7.a() { // from class: sj3
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // sz7.a
                public final void a(vs4 vs4Var, int i2) {
                    long j;
                    long j2;
                    vs4 encodedImage;
                    rj3.c cVar;
                    l82 l82Var;
                    l82 l82VarA;
                    im3 im3Var;
                    rj3.c cVar2 = this.a;
                    rj3 rj3Var2 = rj3Var;
                    int i3 = i;
                    ppb ppbVar2 = cVar2.c;
                    if (vs4Var != null) {
                        a aVarQ = ppbVar2.Q();
                        vs4Var.b0();
                        ppbVar2.f0(vs4Var.b.a, "image_format");
                        Uri uri = aVarQ.b;
                        vs4Var.Z = uri != null ? uri.toString() : null;
                        f94 f94Var = aVarQ.q;
                        if (f94Var == null) {
                            f94Var = rj3Var2.e;
                        }
                        boolean zH = w81.h(i2, 16);
                        if ((f94Var == f94.a || (f94Var == f94.b && !zH)) && (rj3Var2.f || !rhg.c(aVarQ.b))) {
                            yfd yfdVar = aVarQ.i;
                            yfdVar.getClass();
                            vs4Var.V = cr8.m(yfdVar, aVarQ.h, vs4Var, i3);
                        }
                        ppbVar2.h().b().getClass();
                        int i4 = cVar2.i;
                        String str = "unknown";
                        r07 r07Var2 = cVar2.f;
                        tpb tpbVar = cVar2.e;
                        vs4Var.b0();
                        if ((vs4Var.b == jo3.a || !w81.b(i2)) && !cVar2.g && vs4.W(vs4Var)) {
                            vs4Var.b0();
                            if (wl7.b(vs4Var.b, jo3.c)) {
                                vs4Var.b0();
                                long j3 = vs4Var.e;
                                vs4Var.b0();
                                if (j3 * ((long) vs4Var.f) * ((long) eh1.b(r07Var2.a)) > 104857600) {
                                    vs4Var.b0();
                                    int i5 = vs4Var.e;
                                    vs4Var.b0();
                                    int i6 = vs4Var.f;
                                    Bitmap.Config config = r07Var2.a;
                                    StringBuilder sbF = uz.f("Image is too big to attempt decoding: w = ", i5, ", h = ", i6, ", pixel config = ");
                                    sbF.append(config);
                                    sbF.append(", max bitmap size = 104857600");
                                    IllegalStateException illegalStateException = new IllegalStateException(sbF.toString());
                                    tpbVar.h(ppbVar2, "DecodeProducer", illegalStateException, null);
                                    cVar2.l(illegalStateException);
                                    return;
                                }
                            }
                            vs4Var.b0();
                            z07 z07Var = vs4Var.b;
                            z07Var.getClass();
                            String str2 = z07Var.a;
                            vs4Var.b0();
                            int i7 = vs4Var.e;
                            vs4Var.b0();
                            String str3 = i7 + "x" + vs4Var.f;
                            String strValueOf = String.valueOf(vs4Var.V);
                            boolean zA = w81.a(i2);
                            boolean z = zA && !w81.h(i2, 8);
                            boolean zH2 = w81.h(i2, 4);
                            x4d x4dVar = ppbVar2.Q().h;
                            if (x4dVar != null) {
                                str = x4dVar.a + "x" + x4dVar.b;
                            }
                            String str4 = str;
                            try {
                                sz7 sz7Var = cVar2.h;
                                synchronized (sz7Var) {
                                    j = sz7Var.i - sz7Var.h;
                                }
                                String string = ppbVar2.Q().b.toString();
                                string.getClass();
                                long j4 = j;
                                int iG = (z || zH2) ? vs4Var.G() : cVar2.j(vs4Var);
                                h47 h47VarK = (z || zH2) ? h47.d : cVar2.k();
                                tpbVar.k(ppbVar2, "DecodeProducer");
                                try {
                                    try {
                                        h47VarK.getClass();
                                        try {
                                            l82VarA = cVar2.j.c.a(vs4Var, iG, h47VarK, cVar2.f);
                                        } catch (Exception e) {
                                            e = e;
                                            j2 = j4;
                                            cVar = cVar2;
                                            j4 = j2;
                                            l82Var = null;
                                            h47VarK.getClass();
                                            rj3.c cVar3 = cVar;
                                            tpbVar.h(ppbVar2, "DecodeProducer", e, cVar3.i(l82Var, j4, h47VarK, zA, str2, str3, str4, strValueOf));
                                            cVar3.l(e);
                                            vs4Var.close();
                                        }
                                        try {
                                            int i8 = vs4Var.V != 1 ? i2 | 16 : i2;
                                            tpbVar.a(ppbVar2, "DecodeProducer", cVar2.i(l82VarA, j4, h47VarK, zA, str2, str3, str4, strValueOf));
                                            cVar2.n(vs4Var, l82VarA, i4);
                                            o82.a aVar = cVar2.j.i.a;
                                            if (l82VarA == null) {
                                                im3Var = null;
                                            } else {
                                                n82.a aVar2 = n82.e;
                                                aVar.b();
                                                im3Var = new im3(l82VarA, aVar2, aVar, null, true);
                                            }
                                            try {
                                                cVar2.m(w81.a(i8));
                                                cVar2.b.v(i8, im3Var);
                                                vs4Var.close();
                                            } finally {
                                                n82.G(im3Var);
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            cVar = cVar2;
                                            l82Var = l82VarA;
                                            h47VarK.getClass();
                                            rj3.c cVar32 = cVar;
                                            tpbVar.h(ppbVar2, "DecodeProducer", e, cVar32.i(l82Var, j4, h47VarK, zA, str2, str3, str4, strValueOf));
                                            cVar32.l(e);
                                            vs4Var.close();
                                        }
                                    } catch (DecodeException e3) {
                                        j2 = j4;
                                        try {
                                            encodedImage = e3.getEncodedImage();
                                            cVar = cVar2;
                                        } catch (Exception e4) {
                                            e = e4;
                                            cVar = cVar2;
                                            j4 = j2;
                                            l82Var = null;
                                            h47VarK.getClass();
                                            rj3.c cVar322 = cVar;
                                            tpbVar.h(ppbVar2, "DecodeProducer", e, cVar322.i(l82Var, j4, h47VarK, zA, str2, str3, str4, strValueOf));
                                            cVar322.l(e);
                                            vs4Var.close();
                                        }
                                        try {
                                            j4 = j2;
                                            try {
                                                s55.p(cVar2.d, "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", e3.getMessage(), string, encodedImage.s(), Integer.valueOf(encodedImage.G()));
                                                throw e3;
                                            } catch (Exception e5) {
                                                e = e5;
                                                l82Var = null;
                                                h47VarK.getClass();
                                                rj3.c cVar3222 = cVar;
                                                tpbVar.h(ppbVar2, "DecodeProducer", e, cVar3222.i(l82Var, j4, h47VarK, zA, str2, str3, str4, strValueOf));
                                                cVar3222.l(e);
                                                vs4Var.close();
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            j4 = j2;
                                            l82Var = null;
                                            h47VarK.getClass();
                                            rj3.c cVar32222 = cVar;
                                            tpbVar.h(ppbVar2, "DecodeProducer", e, cVar32222.i(l82Var, j4, h47VarK, zA, str2, str3, str4, strValueOf));
                                            cVar32222.l(e);
                                            vs4Var.close();
                                        }
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    cVar = cVar2;
                                    l82Var = null;
                                    h47VarK.getClass();
                                    rj3.c cVar322222 = cVar;
                                    tpbVar.h(ppbVar2, "DecodeProducer", e, cVar322222.i(l82Var, j4, h47VarK, zA, str2, str3, str4, strValueOf));
                                    cVar322222.l(e);
                                    vs4Var.close();
                                }
                            } catch (Throwable th) {
                                vs4Var.close();
                                throw th;
                            }
                        }
                    }
                }
            });
            ppbVar.v(new tj3(this));
        }

        @Override // defpackage.xs3, defpackage.w81
        public final void c() {
            m(true);
            this.b.u();
        }

        @Override // defpackage.xs3, defpackage.w81
        public final void d(Throwable th) {
            th.getClass();
            l(th);
        }

        @Override // defpackage.w81
        public final void e(int i, Object obj) {
            vs4 vs4Var = (vs4) obj;
            it5.a();
            boolean zA = w81.a(i);
            ppb ppbVar = this.c;
            if (zA) {
                if (vs4Var == null) {
                    wl7.b(ppbVar.d0("cached_value_found"), Boolean.TRUE);
                    ppbVar.h().b().getClass();
                    l(new ExceptionWithNoStacktrace("Encoded image is null."));
                    return;
                } else if (!vs4Var.Q()) {
                    l(new ExceptionWithNoStacktrace("Encoded image is not valid."));
                    return;
                }
            }
            if (o(vs4Var, i)) {
                boolean zH = w81.h(i, 4);
                if (zA || zH || ppbVar.N()) {
                    this.h.c();
                }
            }
        }

        @Override // defpackage.xs3, defpackage.w81
        public final void f(float f) {
            super.f(f * 0.99f);
        }

        public final g47 i(l82 l82Var, long j, h47 h47Var, boolean z, String str, String str2, String str3, String str4) {
            Map<String, Object> extras;
            Object obj;
            String string = null;
            if (!this.e.j(this.c, "DecodeProducer")) {
                return null;
            }
            String strValueOf = String.valueOf(j);
            String strValueOf2 = String.valueOf(h47Var.b);
            String strValueOf3 = String.valueOf(z);
            if (l82Var != null && (extras = l82Var.getExtras()) != null && (obj = extras.get("non_fatal_decode_error")) != null) {
                string = obj.toString();
            }
            if (!(l82Var instanceof p82)) {
                String str5 = string;
                HashMap map = new HashMap(7);
                map.put("queueTime", strValueOf);
                map.put("hasGoodQuality", strValueOf2);
                map.put("isFinal", strValueOf3);
                map.put("encodedImageSize", str2);
                map.put("imageFormat", str);
                map.put("requestedImageSize", str3);
                map.put("sampleSize", str4);
                if (str5 != null) {
                    map.put("non_fatal_decode_error", str5);
                }
                return new g47(map);
            }
            Bitmap bitmapT1 = ((p82) l82Var).t1();
            bitmapT1.getClass();
            String str6 = string;
            String str7 = bitmapT1.getWidth() + "x" + bitmapT1.getHeight();
            HashMap map2 = new HashMap(8);
            map2.put("bitmapSize", str7);
            map2.put("queueTime", strValueOf);
            map2.put("hasGoodQuality", strValueOf2);
            map2.put("isFinal", strValueOf3);
            map2.put("encodedImageSize", str2);
            map2.put("imageFormat", str);
            map2.put("requestedImageSize", str3);
            map2.put("sampleSize", str4);
            int byteCount = bitmapT1.getByteCount();
            StringBuilder sb = new StringBuilder();
            sb.append(byteCount);
            map2.put("byteCount", sb.toString());
            if (str6 != null) {
                map2.put("non_fatal_decode_error", str6);
            }
            return new g47(map2);
        }

        public abstract int j(vs4 vs4Var);

        public abstract h47 k();

        public final void l(Throwable th) {
            m(true);
            this.b.t(th);
        }

        public final void m(boolean z) {
            vs4 vs4Var;
            synchronized (this) {
                if (z) {
                    if (!this.g) {
                        this.b.w(1.0f);
                        this.g = true;
                        j6g j6gVar = j6g.a;
                        sz7 sz7Var = this.h;
                        synchronized (sz7Var) {
                            vs4Var = sz7Var.e;
                            sz7Var.e = null;
                            sz7Var.f = 0;
                        }
                        vs4.h(vs4Var);
                    }
                }
            }
        }

        public final void n(vs4 vs4Var, l82 l82Var, int i) {
            vs4Var.b0();
            Object objValueOf = Integer.valueOf(vs4Var.e);
            ig6 ig6Var = this.c;
            ig6Var.f0(objValueOf, "encoded_width");
            vs4Var.b0();
            ig6Var.f0(Integer.valueOf(vs4Var.f), "encoded_height");
            ig6Var.f0(Integer.valueOf(vs4Var.G()), "encoded_size");
            vs4Var.b0();
            ig6Var.f0(vs4Var.Y, "image_color_space");
            if (l82Var instanceof j82) {
                ig6Var.f0(String.valueOf(((j82) l82Var).t1().getConfig()), "bitmap_config");
            }
            if (l82Var != null) {
                l82Var.W(ig6Var.getExtras());
            }
            ig6Var.f0(Integer.valueOf(i), "last_scan_num");
        }

        public abstract boolean o(vs4 vs4Var, int i);
    }

    public rj3(cr1 cr1Var, Executor executor, t07 t07Var, j3c j3cVar, f94 f94Var, boolean z, opb opbVar, int i, o82 o82Var) {
        cr1Var.getClass();
        executor.getClass();
        t07Var.getClass();
        j3cVar.getClass();
        f94Var.getClass();
        opbVar.getClass();
        o82Var.getClass();
        this.a = cr1Var;
        this.b = executor;
        this.c = t07Var;
        this.d = j3cVar;
        this.e = f94Var;
        this.f = z;
        this.g = opbVar;
        this.h = i;
        this.i = o82Var;
    }

    @Override // defpackage.opb
    public final void a(xq2<n82<l82>> xq2Var, ppb ppbVar) {
        rj3 rj3Var;
        ppb ppbVar2;
        xq2<vs4> bVar;
        xq2Var.getClass();
        ppbVar.getClass();
        it5.a();
        com.facebook.imagepipeline.request.a aVarQ = ppbVar.Q();
        if (rhg.c(aVarQ.b) || ImageRequestBuilder.c(aVarQ.b)) {
            rj3Var = this;
            ppbVar2 = ppbVar;
            bVar = new b(rj3Var, xq2Var, ppbVar2, new k3c(this.a), this.d, this.h);
        } else {
            bVar = new a(this, xq2Var, ppbVar, this.h);
            rj3Var = this;
            ppbVar2 = ppbVar;
        }
        rj3Var.g.a(bVar, ppbVar2);
    }
}

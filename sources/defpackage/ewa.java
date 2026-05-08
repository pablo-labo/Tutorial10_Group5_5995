package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.common.ParserException;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider;
import com.facebook.soloader.a;
import com.facebook.soloader.g;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.deeplink.b;
import defpackage.abd;
import defpackage.c8e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.function.DoubleUnaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import okhttp3.MediaType;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes.dex */
@fd8
public class ewa implements sw4, nvh, ReactNativeFeatureFlagsProvider, ntc {
    public static final ux0 W;
    public static final ux0 X;
    public static wg2 c;
    public final /* synthetic */ int a;
    public static final ewa b = new ewa(1);
    public static final int[] d = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] e = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] f = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] V = {R.attr.name, R.attr.pathData};
    public static final ewa Y = new ewa(6);
    public static final Object Z = new Object();
    public static final ewa a0 = new ewa(10);
    public static final ewa b0 = new ewa(11);
    public static final ewa c0 = new ewa(12);

    static {
        int i = 4;
        W = new ux0("NULL", i);
        X = new ux0("UNINITIALIZED", i);
    }

    public /* synthetic */ ewa(int i) {
        this.a = i;
    }

    public static boolean A(b bVar) {
        String strE = bVar.e();
        dd4 dd4Var = dd4.a;
        if (!dd4.f() || !((h2g) cr8.p(h2g.class)).b() || !D(bVar) || strE == null) {
            return false;
        }
        r97.a.getClass();
        if (r97.o(strE)) {
            return r97.h(strE) || r97.y(strE) || r97.l(strE) || r97.m(strE);
        }
        return false;
    }

    public static boolean B(b bVar) {
        String strE = bVar.e();
        dd4 dd4Var = dd4.a;
        if (!dd4.f() || !((h2g) cr8.p(h2g.class)).b() || !D(bVar) || strE == null) {
            return false;
        }
        r97.a.getClass();
        return r97.p(strE);
    }

    public static boolean C(b bVar) {
        String strE = bVar.e();
        dd4 dd4Var = dd4.a;
        if (!dd4.f() || !((h2g) cr8.p(h2g.class)).b() || !D(bVar) || strE == null) {
            return false;
        }
        r97.a.getClass();
        return r97.q(strE);
    }

    public static boolean D(b bVar) {
        return (bVar instanceof b.c) || (bVar instanceof b.e);
    }

    public static boolean E(b bVar) {
        dd4 dd4Var = dd4.a;
        if (dd4.f()) {
            return false;
        }
        String strE = bVar.e();
        if (strE != null) {
            r97.a.getClass();
            if (r97.A(strE)) {
                return false;
            }
        }
        if ((!((h2g) cr8.p(h2g.class)).b() && !dd4.i()) || !D(bVar) || strE == null) {
            return false;
        }
        r97.a.getClass();
        return r97.u(strE);
    }

    public static boolean F(b bVar) {
        dd4 dd4Var = dd4.a;
        if (dd4.f()) {
            return false;
        }
        String strE = bVar.e();
        if ((!((h2g) cr8.p(h2g.class)).b() && !i6a.j()) || !D(bVar) || strE == null) {
            return false;
        }
        r97.a.getClass();
        return r97.f(strE);
    }

    public static boolean G(b bVar) {
        dd4 dd4Var = dd4.a;
        if (dd4.f()) {
            return false;
        }
        String strE = bVar.e();
        if ((!((h2g) cr8.p(h2g.class)).b() && !dd4.j()) || !D(bVar) || strE == null) {
            return false;
        }
        r97.a.getClass();
        return r97.g(strE);
    }

    public static boolean H(b bVar) {
        dd4 dd4Var = dd4.a;
        if (dd4.f()) {
            return false;
        }
        String strE = bVar.e();
        if (!((h2g) cr8.p(h2g.class)).b() || !((h2g) cr8.p(h2g.class)).a() || !D(bVar) || strE == null) {
            return false;
        }
        r97.a.getClass();
        return r97.l(strE);
    }

    public static final int I(rn8 rn8Var, dwa dwaVar) {
        return (int) (dwaVar == dwa.a ? rn8Var.m() & 4294967295L : rn8Var.m() >> 32);
    }

    public static final Object J(lmf lmfVar, Function2 function2) {
        u63.T(lmfVar, new v74(ls3.c(lmfVar.d.getContext()).R0(lmfVar.e, lmfVar, lmfVar.c)));
        return a6g.a(lmfVar, false, lmfVar, function2);
    }

    public static void K(zfb zfbVar, long j) {
        web.e(Boolean.valueOf(j >= 0));
        while (j > 0) {
            long jSkip = zfbVar.skip(j);
            if (jSkip <= 0) {
                if (zfbVar.read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j -= jSkip;
        }
    }

    public static final ui8 L(rxf rxfVar) {
        rxfVar.getClass();
        aj3 aj3VarD = rxfVar.d();
        aj3VarD.getClass();
        boolean z = aj3VarD instanceof w62;
        ylg ylgVar = ylg.OUT_VARIANCE;
        if (z) {
            List<rxf> parameters = ((w62) aj3VarD).j().getParameters();
            parameters.getClass();
            List<rxf> list = parameters;
            ArrayList arrayList = new ArrayList(t92.r0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                kwf kwfVarJ = ((rxf) it.next()).j();
                kwfVarJ.getClass();
                arrayList.add(kwfVarJ);
            }
            List<ui8> upperBounds = rxfVar.getUpperBounds();
            upperBounds.getClass();
            ei8 ei8VarE = b04.e(rxfVar);
            ui8 ui8VarJ = TypeSubstitutor.e(new ire(arrayList)).j((ui8) z92.O0(upperBounds), ylgVar);
            return ui8VarJ == null ? ei8VarE.n() : ui8VarJ;
        }
        if (!(aj3VarD instanceof kv5)) {
            l5.q("Unsupported descriptor type to build star projection type based on type parameters of it");
            return null;
        }
        List<rxf> typeParameters = ((kv5) aj3VarD).getTypeParameters();
        typeParameters.getClass();
        List<rxf> list2 = typeParameters;
        ArrayList arrayList2 = new ArrayList(t92.r0(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            kwf kwfVarJ2 = ((rxf) it2.next()).j();
            kwfVarJ2.getClass();
            arrayList2.add(kwfVarJ2);
        }
        List<ui8> upperBounds2 = rxfVar.getUpperBounds();
        upperBounds2.getClass();
        ei8 ei8VarE2 = b04.e(rxfVar);
        ui8 ui8VarJ2 = TypeSubstitutor.e(new ire(arrayList2)).j((ui8) z92.O0(upperBounds2), ylgVar);
        return ui8VarJ2 == null ? ei8VarE2.n() : ui8VarJ2;
    }

    public static final void M(int i, int i2, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(serialDescriptor.e(i4));
            }
            i3 >>>= 1;
        }
        throw new MissingFieldException(serialDescriptor.getA(), arrayList);
    }

    public static final long N(long j, wm8 wm8Var) {
        return wm8Var == wm8.a ? mq2.a(iq2.j(j), iq2.h(j), iq2.i(j), iq2.g(j)) : mq2.a(iq2.i(j), iq2.g(j), iq2.j(j), iq2.h(j));
    }

    public static final Object O(long j, Function2 function2, lu2 lu2Var) {
        if (j > 0) {
            return J(new lmf(j, lu2Var), function2);
        }
        throw new TimeoutCancellationException("Timed out immediately", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, lmf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object P(long r6, kotlin.jvm.functions.Function2 r8, defpackage.pu2 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.mmf
            if (r0 == 0) goto L13
            r0 = r9
            mmf r0 = (defpackage.mmf) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            mmf r0 = new mmf
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L36
            if (r1 != r3) goto L30
            java.lang.Object r6 = r0.L$1
            luc r6 = (defpackage.luc) r6
            java.lang.Object r7 = r0.L$0
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            defpackage.r7d.b(r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L2e
            return r9
        L2e:
            r7 = move-exception
            goto L60
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r2
        L36:
            defpackage.r7d.b(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L40
            goto L66
        L40:
            luc r9 = new luc
            r9.<init>()
            r0.L$0 = r8     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5e
            r0.L$1 = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5e
            r0.J$0 = r6     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5e
            r0.label = r3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5e
            lmf r1 = new lmf     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5e
            r1.<init>(r6, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5e
            r9.element = r1     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5e
            java.lang.Object r6 = J(r1, r8)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5e
            g13 r7 = defpackage.g13.a
            if (r6 != r7) goto L5d
            return r7
        L5d:
            return r6
        L5e:
            r7 = move-exception
            r6 = r9
        L60:
            ex7 r8 = r7.a
            T r6 = r6.element
            if (r8 != r6) goto L67
        L66:
            return r2
        L67:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewa.P(long, kotlin.jvm.functions.Function2, pu2):java.lang.Object");
    }

    public static Object Q(Function2 function2, Object obj, lu2 lu2Var) {
        function2.getClass();
        v03 context = lu2Var.getContext();
        x81 zl7Var = context == vr4.a ? new zl7(lu2Var) : new am7(lu2Var, context);
        pxf.d(2, function2);
        return function2.invoke(obj, zl7Var);
    }

    public static final CharSequence R(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static v70 e(int i, int i2, int i3) {
        ColorSpace colorSpace;
        ColorSpace rgb;
        abd abdVar = ya2.e;
        w70.b(i3);
        Bitmap.Config configB = w70.b(i3);
        if (wl7.b(abdVar, abdVar)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (wl7.b(abdVar, ya2.q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (wl7.b(abdVar, ya2.r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (wl7.b(abdVar, ya2.o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (wl7.b(abdVar, ya2.j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (wl7.b(abdVar, ya2.i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (wl7.b(abdVar, ya2.t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (wl7.b(abdVar, ya2.s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (wl7.b(abdVar, ya2.k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (wl7.b(abdVar, ya2.l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (wl7.b(abdVar, ya2.g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (wl7.b(abdVar, ya2.h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (wl7.b(abdVar, ya2.f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (wl7.b(abdVar, ya2.m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (wl7.b(abdVar, ya2.p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!wl7.b(abdVar, ya2.n)) {
                if (Build.VERSION.SDK_INT >= 34 && (rgb = xa2.a(abdVar)) != null) {
                    rgb = rgb;
                } else if (abdVar != null) {
                    String str = abdVar.a;
                    float[] fArrA = abdVar.d.a();
                    hrf hrfVar = abdVar.g;
                    ColorSpace.Rgb.TransferParameters transferParameters = hrfVar != null ? new ColorSpace.Rgb.TransferParameters(hrfVar.b, hrfVar.c, hrfVar.d, hrfVar.e, hrfVar.f, hrfVar.g, hrfVar.a) : null;
                    if (transferParameters != null) {
                        ColorSpace rgb2 = new ColorSpace.Rgb(str, abdVar.h, fArrA, transferParameters);
                        rgb = rgb2;
                    } else {
                        float[] fArr = abdVar.h;
                        final abd.c cVar = abdVar.l;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: va2
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d2) {
                                return ((Number) cVar.invoke(Double.valueOf(d2))).doubleValue();
                            }
                        };
                        final abd.b bVar = abdVar.o;
                        rgb = new ColorSpace.Rgb(str, fArr, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: wa2
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d2) {
                                return ((Number) bVar.invoke(Double.valueOf(d2))).doubleValue();
                            }
                        }, abdVar.e, abdVar.f);
                    }
                } else {
                    colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return new v70(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configB, true, rgb));
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        rgb = colorSpace;
        return new v70(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configB, true, rgb));
    }

    public static final long f(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(final defpackage.xrd r4, final float r5, defpackage.ae0 r6, defpackage.yi3 r7, final kotlin.jvm.functions.Function1 r8, defpackage.pu2 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.rle
            if (r0 == 0) goto L13
            r0 = r9
            rle r0 = (defpackage.rle) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            rle r0 = new rle
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            float r5 = r0.F$0
            java.lang.Object r4 = r0.L$1
            iuc r4 = (defpackage.iuc) r4
            java.lang.Object r6 = r0.L$0
            ae0 r6 = (defpackage.ae0) r6
            defpackage.r7d.b(r9)
            goto L68
        L2f:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L36:
            defpackage.r7d.b(r9)
            iuc r9 = new iuc
            r9.<init>()
            java.lang.Object r1 = r6.i()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L4f
            r1 = r2
            goto L50
        L4f:
            r1 = 0
        L50:
            r1 = r1 ^ r2
            ple r3 = new ple
            r3.<init>()
            r0.L$0 = r6
            r0.L$1 = r9
            r0.F$0 = r5
            r0.label = r2
            java.lang.Object r4 = defpackage.x0f.d(r6, r7, r1, r3, r0)
            g13 r7 = defpackage.g13.a
            if (r4 != r7) goto L67
            return r7
        L67:
            r4 = r9
        L68:
            vd0 r7 = new vd0
            float r4 = r4.element
            float r5 = r5 - r4
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r5)
            r7.<init>(r4, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewa.g(xrd, float, ae0, yi3, kotlin.jvm.functions.Function1, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(final defpackage.xrd r8, float r9, final float r10, defpackage.ae0 r11, defpackage.vpe r12, final kotlin.jvm.functions.Function1 r13, defpackage.pu2 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.sle
            if (r0 == 0) goto L14
            r0 = r14
            sle r0 = (defpackage.sle) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            sle r0 = new sle
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.result
            int r0 = r6.label
            r7 = 0
            r1 = 1
            if (r0 == 0) goto L3b
            if (r0 != r1) goto L34
            float r8 = r6.F$1
            float r9 = r6.F$0
            java.lang.Object r10 = r6.L$1
            iuc r10 = (defpackage.iuc) r10
            java.lang.Object r11 = r6.L$0
            ae0 r11 = (defpackage.ae0) r11
            defpackage.r7d.b(r14)
            goto L82
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r8)
            r8 = 0
            return r8
        L3b:
            defpackage.r7d.b(r14)
            iuc r14 = new iuc
            r14.<init>()
            java.lang.Object r0 = r11.i()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r9)
            java.lang.Object r3 = r11.i()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L62
            r3 = r1
            goto L63
        L62:
            r3 = 0
        L63:
            r4 = r3 ^ 1
            qle r5 = new qle
            r5.<init>()
            r6.L$0 = r11
            r6.L$1 = r14
            r6.F$0 = r9
            r6.F$1 = r0
            r6.label = r1
            r1 = r11
            r3 = r12
            java.lang.Object r8 = defpackage.x0f.e(r1, r2, r3, r4, r5, r6)
            g13 r10 = defpackage.g13.a
            if (r8 != r10) goto L7f
            return r10
        L7f:
            r10 = r14
            r8 = r0
            r11 = r1
        L82:
            java.lang.Object r12 = r11.i()
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            float r8 = l(r12, r8)
            vd0 r12 = new vd0
            float r10 = r10.element
            float r9 = r9 - r10
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r9)
            r9 = 29
            ae0 r8 = defpackage.boa.m(r11, r7, r8, r9)
            r12.<init>(r10, r8)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewa.h(xrd, float, float, ae0, vpe, kotlin.jvm.functions.Function1, pu2):java.lang.Object");
    }

    public static final ExtractedText i(jhf jhfVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = jhfVar.a.b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = jhfVar.b;
        extractedText.selectionStart = kjf.f(j);
        extractedText.selectionEnd = kjf.e(j);
        extractedText.flags = !zve.M(jhfVar.a.b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final void j(xd0 xd0Var, xrd xrdVar, Function1 function1, float f2) {
        float fE;
        try {
            fE = xrdVar.e(f2);
        } catch (CancellationException unused) {
            xd0Var.a();
            fE = 0.0f;
        }
        function1.invoke(Float.valueOf(fE));
        if (Math.abs(f2 - fE) > 0.5f) {
            xd0Var.a();
        }
    }

    @Pure
    public static void k(String str, boolean z) throws ParserException {
        if (!z) {
            throw ParserException.a(null, str);
        }
    }

    public static final float l(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        return (f3 <= 0.0f ? f2 >= f3 : f2 <= f3) ? f2 : f3;
    }

    public static long m(long j, wm8 wm8Var) {
        wm8 wm8Var2 = wm8.a;
        return mq2.a(wm8Var == wm8Var2 ? iq2.j(j) : iq2.i(j), wm8Var == wm8Var2 ? iq2.h(j) : iq2.g(j), wm8Var == wm8Var2 ? iq2.i(j) : iq2.j(j), wm8Var == wm8Var2 ? iq2.g(j) : iq2.h(j));
    }

    public static t52 n(t52 t52Var) {
        nq5 nq5VarG = yz3.g(t52Var);
        String str = iw7.a;
        mq5 mq5Var = iw7.k.get(nq5VarG);
        if (mq5Var != null) {
            return b04.e(t52Var).j(mq5Var);
        }
        w40.m("Given class ", t52Var, " is not a read-only collection");
        return null;
    }

    public static final ge0 o(ge0 ge0Var) {
        ge0 ge0VarC = ge0Var.c();
        int iB = ge0VarC.b();
        for (int i = 0; i < iB; i++) {
            ge0VarC.e(ge0Var.a(i), i);
        }
        return ge0VarC;
    }

    public static long p(int i, long j) {
        return mq2.a(0, iq2.h(j), (i & 4) != 0 ? iq2.i(j) : 0, iq2.g(j));
    }

    public static final c65 q(ra8 ra8Var, MediaType mediaType) {
        ra8Var.getClass();
        return new c65(mediaType, new c8e.a(ra8Var));
    }

    public static dne r(String str, UnsatisfiedLinkError unsatisfiedLinkError) {
        dne dneVar;
        if (unsatisfiedLinkError.getMessage() == null || !unsatisfiedLinkError.getMessage().contains("ELF")) {
            Matcher matcher = Pattern.compile("\\P{ASCII}+").matcher(str);
            if (matcher.find()) {
                Log.w("SoLoader", "Library name is corrupted, contains non-ASCII characters " + matcher.group());
                p39.a("Corrupted lib name detected");
                dneVar = new bne(str, "corrupted lib name: " + unsatisfiedLinkError.toString());
            } else {
                dneVar = new dne(str, unsatisfiedLinkError.toString());
            }
        } else {
            p39.a("Corrupted lib file detected");
            dneVar = new ane(str, unsatisfiedLinkError.toString());
        }
        dneVar.initCause(unsatisfiedLinkError);
        return dneVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static lu2 s(lu2 lu2Var, lu2 lu2Var2, Function2 function2) {
        function2.getClass();
        if (function2 instanceof x81) {
            return ((x81) function2).create(lu2Var, lu2Var2);
        }
        v03 context = lu2Var2.getContext();
        return context == vr4.a ? new xl7(lu2Var2, lu2Var, function2) : new yl7(lu2Var2, context, function2, lu2Var);
    }

    public static int t(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case DatadogLogGenerator.CRASH /* 9 */:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case ModuleDescriptor.MODULE_VERSION /* 14 */:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static final String u(int i, androidx.compose.runtime.b bVar) {
        bVar.M(AndroidCompositionLocals_androidKt.a);
        Resources resources = ((Context) bVar.M(AndroidCompositionLocals_androidKt.b)).getResources();
        return i == 0 ? resources.getString(com.indeed.android.jobsearch.R.string.navigation_menu) : i == 1 ? resources.getString(com.indeed.android.jobsearch.R.string.close_drawer) : i == 2 ? resources.getString(com.indeed.android.jobsearch.R.string.close_sheet) : i == 3 ? resources.getString(com.indeed.android.jobsearch.R.string.default_error_message) : i == 4 ? resources.getString(com.indeed.android.jobsearch.R.string.dropdown_menu) : i == 5 ? resources.getString(com.indeed.android.jobsearch.R.string.range_start) : i == 6 ? resources.getString(com.indeed.android.jobsearch.R.string.range_end) : i == 7 ? resources.getString(com.indeed.android.jobsearch.R.string.mc2_snackbar_pane_title) : "";
    }

    public static lu2 v(lu2 lu2Var) {
        lu2<Object> lu2VarIntercepted;
        lu2Var.getClass();
        pu2 pu2Var = lu2Var instanceof pu2 ? (pu2) lu2Var : null;
        return (pu2Var == null || (lu2VarIntercepted = pu2Var.intercepted()) == null) ? lu2Var : lu2VarIntercepted;
    }

    public static boolean w(b bVar) {
        String strE = bVar.e();
        if (!((h2g) cr8.p(h2g.class)).h() || !D(bVar) || strE == null) {
            return false;
        }
        r97.a.getClass();
        return r97.e(strE);
    }

    public static boolean x(b bVar) {
        dd4 dd4Var = dd4.a;
        if (dd4.f()) {
            return false;
        }
        String strE = bVar.e();
        if (!D(bVar)) {
            return false;
        }
        if (strE == null) {
            return true;
        }
        r97.a.getClass();
        return r97.h(strE) || r97.y(strE) || r97.l(strE) || r97.m(strE);
    }

    public static boolean y(b bVar) {
        String strE = bVar.e();
        dd4 dd4Var = dd4.a;
        if (!dd4.f() || !dd4.g() || !((h2g) cr8.p(h2g.class)).b() || !D(bVar) || strE == null) {
            return false;
        }
        r97.a.getClass();
        return r97.u(strE);
    }

    public static boolean z(b bVar) {
        String strE = bVar.e();
        dd4 dd4Var = dd4.a;
        if (!dd4.f() || !((h2g) cr8.p(h2g.class)).b() || !D(bVar) || strE == null) {
            return false;
        }
        r97.a.getClass();
        return r97.n(strE);
    }

    @Override // defpackage.sw4
    public void a(t52 t52Var, ArrayList arrayList) {
        throw new IllegalStateException("Incomplete hierarchy for class " + t52Var.getName() + ", unresolved classes " + arrayList);
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean animatedShouldSignalBatch() {
        return false;
    }

    @Override // defpackage.ntc
    public boolean b(UnsatisfiedLinkError unsatisfiedLinkError, ene[] eneVarArr) {
        if (!(unsatisfiedLinkError instanceof dne) || (unsatisfiedLinkError instanceof cne)) {
            return false;
        }
        String strA = ((dne) unsatisfiedLinkError).a();
        StringBuilder sb = new StringBuilder("Reunpacking NonApk UnpackingSoSources due to ");
        sb.append(unsatisfiedLinkError);
        sb.append(strA == null ? "" : ", retrying for specific library ".concat(strA));
        Log.e("SoLoader", sb.toString());
        for (ene eneVar : eneVarArr) {
            if (eneVar instanceof g) {
                g gVar = (g) eneVar;
                if (gVar instanceof a) {
                    continue;
                } else {
                    try {
                        Log.e("SoLoader", "Runpacking " + gVar.c());
                        gVar.e(2);
                    } catch (Exception e2) {
                        Log.e("SoLoader", "Encountered an exception while reunpacking " + gVar.c() + " for library " + strA + ": ", e2);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean commonTestFlag() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean cxxNativeAnimatedEnabled() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean cxxNativeAnimatedRemoveJsSync() {
        return false;
    }

    @Override // defpackage.sw4
    public void d(hv1 hv1Var) {
        hv1Var.getClass();
        throw new IllegalStateException("Cannot infer visibility for " + hv1Var);
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableMainQueueSyncDispatchIOS() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableMountItemReorderingAndroid() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableTextLayoutManagerCacheAndroid() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAccessibilityOrder() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAccumulatedUpdatesInRawPropsAndroid() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAndroidTextMeasurementOptimizations() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableCppPropsIteratorSetter() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableCustomFocusSearchOnClippedElementsAndroid() {
        return true;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableDestroyShadowTreeRevisionAsync() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableDoubleMeasurementFixAndroid() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableEagerRootViewAttachment() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricLogs() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFixForParentTagDuringReparenting() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFontScaleChangesUpdatingLayout() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableIOSTextBaselineOffsetPerLine() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableIOSViewClipToPaddingBox() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableInteropViewManagerClassLookUpOptimizationIOS() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLayoutAnimationsOnAndroid() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLayoutAnimationsOnIOS() {
        return true;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableMainQueueCoordinatorOnIOS() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableMainQueueModulesOnIOS() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableModuleArgumentNSNullConversionIOS() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableNativeCSSParsing() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableNetworkEventReporting() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableNewBackgroundAndBorderDrawables() {
        return true;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enablePreparedTextLayout() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enablePropsUpdateReconciliationAndroid() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableResourceTimingAPI() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableSynchronousStateUpdates() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewCulling() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecycling() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecyclingForText() {
        return true;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecyclingForView() {
        return true;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableVirtualViewDebugFeatures() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableVirtualViewRenderState() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableVirtualViewWindowFocusDetection() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixMappingOfEventPrioritiesBetweenFabricAndReact() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxEnabledRelease() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxNetworkInspectionEnabled() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean hideOffscreenVirtualViewsOnIOS() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public double preparedTextCacheSize() {
        return 200.0d;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean preventShadowTreeCommitExhaustion() {
        return this instanceof tmc;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean traceTurboModulePromiseRejectionsOnAndroid() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean updateRuntimeShadowNodeReferencesOnCommit() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useAlwaysAvailableJSErrorHandling() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useFabricInterop() {
        return true;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNativeEqualsInNativeReadableArrayAndroid() {
        return this instanceof tmc;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNativeTransformHelperAndroid() {
        return this instanceof tmc;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useOptimizedEventBatchingOnAndroid() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useRawPropsJsiValue() {
        return false;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useShadowNodeStateOnClone() {
        return this instanceof umc;
    }

    @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public double virtualViewPrerenderRatio() {
        return 5.0d;
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 10:
                List<svh<?>> list = djh.a;
                return Integer.valueOf((int) ((ubi) vbi.b.zza()).m());
            case 11:
                List<svh<?>> list2 = djh.a;
                return Long.valueOf(((ubi) vbi.b.zza()).zzb());
            default:
                List<svh<?>> list3 = djh.a;
                return Integer.valueOf((int) ((ubi) vbi.b.zza()).a());
        }
    }
}

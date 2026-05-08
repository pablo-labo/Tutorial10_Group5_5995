package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.indeed.android.jobsearch.R;
import defpackage.kab;
import defpackage.wle;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class wab implements zfe, hme, nvh, Continuation {
    public static final ah2 V;
    public static final ah2 f;
    public final /* synthetic */ int a;
    public static final float[][] b = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] c = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] d = {95.047f, 100.0f, 108.883f};
    public static final float[][] e = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final ah2 W = new ah2(-1352643054, new ch2(2), false);
    public static final ah2 X = new ah2(-1006742182, new ch2(3), false);
    public static final wab Y = new wab(6);
    public static final wab Z = new wab(7);
    public static final wab a0 = new wab(10);
    public static final wab b0 = new wab(11);
    public static final wab c0 = new wab(12);
    public static final wab d0 = new wab(13);
    public static final wab e0 = new wab(14);

    static {
        byte b2 = 0;
        f = new ah2(128653139, new ch2(b2), false);
        V = new ah2(-1736111940, new fj2(b2, b2), false);
    }

    public /* synthetic */ wab(int i) {
        this.a = i;
    }

    public static lw7 A(jyf jyfVar, boolean z, wp8 wp8Var, int i) {
        boolean z2 = (i & 1) != 0 ? false : z;
        boolean z3 = (i & 2) == 0;
        if ((i & 4) != 0) {
            wp8Var = null;
        }
        return new lw7(jyfVar, z3, z2, wp8Var != null ? pi3.k(wp8Var) : null, 34);
    }

    public static final qtc B(Rect rect) {
        return new qtc(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final qtc C(RectF rectF) {
        return new qtc(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static String D(int i) {
        return i == 1 ? "AboveBaseline" : i == 2 ? "Top" : i == 3 ? "Bottom" : i == 4 ? "Center" : i == 5 ? "TextTop" : i == 6 ? "TextBottom" : i == 7 ? "TextCenter" : "Invalid";
    }

    public static long E(long j) {
        long j2 = ((j >>> 1) ^ j) & 2459565876494606882L;
        long j3 = j ^ (j2 ^ (j2 << 1));
        long j4 = ((j3 >>> 2) ^ j3) & 868082074056920076L;
        long j5 = j3 ^ (j4 ^ (j4 << 2));
        long j6 = ((j5 >>> 4) ^ j5) & 67555025218437360L;
        long j7 = j5 ^ (j6 ^ (j6 << 4));
        long j8 = ((j7 >>> 8) ^ j7) & 280375465148160L;
        long j9 = j7 ^ (j8 ^ (j8 << 8));
        long j10 = ((j9 >>> 16) ^ j9) & 4294901760L;
        return j9 ^ (j10 ^ (j10 << 16));
    }

    public static float F() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static final void a(final boolean z, gu5 gu5Var, final gu5 gu5Var2, gu5 gu5Var3, final boolean z2, b bVar, final int i) {
        gu5 gu5Var4;
        gu5 gu5Var5;
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        c cVarH = bVar.h(-619706541);
        int i2 = (cVarH.a(z) ? 4 : 2) | i | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var3) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.a(z2) ? 16384 : 8192);
        if (!cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            gu5Var4 = gu5Var;
            gu5Var5 = gu5Var3;
            cVarH.D();
        } else if (z) {
            cVarH.L(-1907888377);
            d(((i2 >> 6) & 896) | ((i2 >> 3) & 126), gu5Var, gu5Var2, cVarH, z2);
            cVarH.U(false);
            gu5Var4 = gu5Var;
            gu5Var5 = gu5Var3;
        } else {
            cVarH.L(-1907717071);
            gu5Var4 = gu5Var;
            gu5Var5 = gu5Var3;
            qof.a(gu5Var4, gu5Var5, false, cVarH, ((i2 >> 3) & 14) | ((i2 >> 6) & 112), 4);
            cVarH.U(false);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            final gu5 gu5Var6 = gu5Var4;
            final gu5 gu5Var7 = gu5Var5;
            iVarW.d = new Function2(z, gu5Var6, gu5Var2, gu5Var7, z2, i) { // from class: vt5
                public final /* synthetic */ boolean a;
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ boolean e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    wab.a(this.a, this.b, this.c, this.d, this.e, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(final Object obj, final int i, final lr8 lr8Var, final ah2 ah2Var, b bVar, final int i2) {
        int i3;
        c cVarH = bVar.h(872548579);
        if ((i2 & 6) == 0) {
            i3 = (cVarH.x(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cVarH.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= cVarH.x(lr8Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i2 & 3072) == 0) {
            i3 |= cVarH.x(ah2Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if (cVarH.o(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zK = cVarH.K(obj) | cVarH.K(lr8Var);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zK || objV == c0020a) {
                objV = new ir8(obj, lr8Var);
                cVarH.p(objV);
            }
            ir8 ir8Var = (ir8) objV;
            ir8Var.c = i;
            g4a g4aVar = ir8Var.g;
            ne4 ne4Var = lab.a;
            kab kabVar = (kab) cVarH.M(ne4Var);
            wle.e.getClass();
            wle wleVarA = wle.a.a();
            Function1<Object, j6g> function1E = wleVarA != null ? wleVarA.e() : null;
            wle wleVarB = wle.a.b(wleVarA);
            try {
                if (kabVar != ((kab) ((gme) g4aVar).getValue())) {
                    ((gme) g4aVar).setValue(kabVar);
                    if (ir8Var.d > 0) {
                        kab.a aVar = ir8Var.e;
                        if (aVar != null) {
                            aVar.release();
                        }
                        ir8Var.e = kabVar != null ? kabVar.a() : null;
                    }
                }
                j6g j6gVar = j6g.a;
                wle.a.e(wleVarA, wleVarB, function1E);
                boolean zK2 = cVarH.K(ir8Var);
                Object objV2 = cVarH.v();
                int i4 = 6;
                if (zK2 || objV2 == c0020a) {
                    objV2 = new ji(ir8Var, i4);
                    cVarH.p(objV2);
                }
                to4.b(ir8Var, (Function1) objV2, cVarH);
                rm2.a(ne4Var.a(ir8Var), ah2Var, cVarH, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                wle.a.e(wleVarA, wleVarB, function1E);
                throw th;
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: jr8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    wab.b(obj, i, lr8Var, ah2Var, (b) obj2, ka2.L(i2 | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final long c(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void d(final int i, final gu5 gu5Var, final gu5 gu5Var2, b bVar, final boolean z) {
        int i2;
        c cVarH = bVar.h(88823983);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(gu5Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.a(z) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        int i3 = 0;
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            final String strI = ak2.I(R.string.a11y_home_button, cVarH);
            iv6.a(h4.d, null, false, null, false, null, bh2.c(-1558268846, new wt5(gu5Var, i3), cVarH), bh2.c(-1951267791, new wu5() { // from class: xt5
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((fhd) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        if (z) {
                            bVar2.L(-2131331735);
                            nof.c(gu5Var2, R.drawable.ic_idl_home_24, fv6.i4, strI, "AuthHomeButton", ar6.Stroke, bVar2, 1597824, 32);
                        } else {
                            bVar2.L(-2134058991);
                        }
                        bVar2.F();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, 113246214, 126);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: yt5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wab.d(ka2.L(i | 1), gu5Var, gu5Var2, (b) obj, z);
                    return j6g.a;
                }
            };
        }
    }

    public static final mq5 e(mq5 mq5Var, String str) {
        return mq5Var.a(n8a.h(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int f(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wab.f(int, int, int, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(defpackage.nsd r4, float r5, defpackage.yd0 r6, defpackage.pu2 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.qrd
            if (r0 == 0) goto L13
            r0 = r7
            qrd r0 = (defpackage.qrd) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            qrd r0 = new qrd
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            java.lang.Object r4 = r0.L$0
            iuc r4 = (defpackage.iuc) r4
            defpackage.r7d.b(r7)
            goto L4d
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L30:
            defpackage.r7d.b(r7)
            iuc r7 = new iuc
            r7.<init>()
            rrd r1 = new rrd
            r1.<init>(r5, r6, r7, r2)
            r0.L$0 = r7
            r0.label = r3
            n4a r5 = defpackage.n4a.a
            java.lang.Object r4 = r4.a(r5, r1, r0)
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L4c
            return r5
        L4c:
            r4 = r7
        L4d:
            float r4 = r4.element
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wab.g(nsd, float, yd0, pu2):java.lang.Object");
    }

    public static int h(int i) {
        int i2 = i & 65535;
        int i3 = (i2 | (i2 << 8)) & 16711935;
        int i4 = (i3 | (i3 << 4)) & 252645135;
        int i5 = (i4 | (i4 << 2)) & 858993459;
        return (i5 | (i5 << 1)) & 1431655765;
    }

    public static long i(int i) {
        int i2 = ((i >>> 8) ^ i) & 65280;
        int i3 = i ^ (i2 ^ (i2 << 8));
        int i4 = ((i3 >>> 4) ^ i3) & 15728880;
        int i5 = i3 ^ (i4 ^ (i4 << 4));
        int i6 = ((i5 >>> 2) ^ i5) & 202116108;
        int i7 = i5 ^ (i6 ^ (i6 << 2));
        int i8 = ((i7 >>> 1) ^ i7) & 572662306;
        int i9 = i7 ^ (i8 ^ (i8 << 1));
        return ((((long) (i9 >>> 1)) & 1431655765) << 32) | (1431655765 & ((long) i9));
    }

    public static void j(int i, long j, long[] jArr) {
        long j2 = ((j >>> 16) ^ j) & 4294901760L;
        long j3 = j ^ (j2 ^ (j2 << 16));
        long j4 = ((j3 >>> 8) ^ j3) & 280375465148160L;
        long j5 = j3 ^ (j4 ^ (j4 << 8));
        long j6 = ((j5 >>> 4) ^ j5) & 67555025218437360L;
        long j7 = j5 ^ (j6 ^ (j6 << 4));
        long j8 = ((j7 >>> 2) ^ j7) & 868082074056920076L;
        long j9 = j7 ^ (j8 ^ (j8 << 2));
        long j10 = ((j9 >>> 1) ^ j9) & 2459565876494606882L;
        long j11 = j9 ^ (j10 ^ (j10 << 1));
        jArr[i] = j11 & 6148914691236517205L;
        jArr[i + 1] = (j11 >>> 1) & 6148914691236517205L;
    }

    public static int l(int i) {
        int i2 = i & 255;
        int i3 = (i2 | (i2 << 4)) & 3855;
        int i4 = (i3 | (i3 << 2)) & 13107;
        return (i4 | (i4 << 1)) & 21845;
    }

    public static final int m(int i, Object obj) {
        return (i * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public static int n(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = d;
        return eb2.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static void o(String str) {
        throw new IllegalArgumentException(l5.l("Unknown library: ", str));
    }

    public static boolean p(int i) {
        return 5 <= i;
    }

    public static float q(int i) {
        float f2 = i / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static void r(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof w0h) {
                editorInfo.hintText = ((w0h) parent).a();
                return;
            }
        }
    }

    public static void s(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static void t(int i, String str, String str2) {
        Log.println(i, "unknown:" + str, str2);
    }

    public static void u(int i, String str, String str2, Throwable th) {
        String strL = l5.l("unknown:", str);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append('\n');
        sb.append(th == null ? "" : Log.getStackTraceString(th));
        Log.println(i, strL, sb.toString());
    }

    public static boolean v(fyf fyfVar, fdd fddVar, fdd fddVar2) {
        if (fyfVar.L(fddVar) == fyfVar.L(fddVar2) && fyfVar.n0(fddVar) == fyfVar.n0(fddVar2) && fyfVar.r(fddVar) == fyfVar.r(fddVar2) && fyfVar.d0(fyfVar.V(fddVar), fyfVar.V(fddVar2))) {
            if (fyfVar.c0(fddVar, fddVar2)) {
                return true;
            }
            int iL = fyfVar.L(fddVar);
            for (int i = 0; i < iL; i++) {
                dwf dwfVarH = fyfVar.H(fddVar, i);
                dwf dwfVarH2 = fyfVar.H(fddVar2, i);
                if (fyfVar.N(dwfVarH) == fyfVar.N(dwfVarH2)) {
                    if (!fyfVar.N(dwfVarH)) {
                        if (fyfVar.O(dwfVarH) == fyfVar.O(dwfVarH2)) {
                            p7g p7gVarD = fyfVar.d(dwfVarH);
                            p7gVarD.getClass();
                            p7g p7gVarD2 = fyfVar.d(dwfVarH2);
                            p7gVarD2.getClass();
                            if (!w(fyfVar, p7gVarD, p7gVarD2)) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean w(fyf fyfVar, zi8 zi8Var, zi8 zi8Var2) {
        if (zi8Var == zi8Var2) {
            return true;
        }
        mge mgeVarE = fyfVar.E(zi8Var);
        mge mgeVarE2 = fyfVar.E(zi8Var2);
        if (mgeVarE != null && mgeVarE2 != null) {
            return v(fyfVar, mgeVarE, mgeVarE2);
        }
        jh5 jh5VarF0 = fyfVar.f0(zi8Var);
        jh5 jh5VarF02 = fyfVar.f0(zi8Var2);
        return jh5VarF0 != null && jh5VarF02 != null && v(fyfVar, fyfVar.R(jh5VarF0), fyfVar.R(jh5VarF02)) && v(fyfVar, fyfVar.z(jh5VarF0), fyfVar.z(jh5VarF02));
    }

    public static final Rect x(ph7 ph7Var) {
        return new Rect(ph7Var.a, ph7Var.b, ph7Var.c, ph7Var.d);
    }

    @sy3
    public static final Rect y(qtc qtcVar) {
        return new Rect((int) qtcVar.a, (int) qtcVar.b, (int) qtcVar.c, (int) qtcVar.d);
    }

    public static final RectF z(qtc qtcVar) {
        return new RectF(qtcVar.a, qtcVar.b, qtcVar.c, qtcVar.d);
    }

    @Override // defpackage.hme
    public boolean k(Object obj, Object obj2) {
        return wl7.b(obj, obj2);
    }

    @Override // defpackage.zfe
    public void lock() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.a) {
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return Integer.valueOf(DataOkHttpUploader.HTTP_FORBIDDEN);
            default:
                if (task.isSuccessful()) {
                    return null;
                }
                Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 10:
                return "StructuralEqualityPolicy";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.zfe
    public void unlock() {
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 11:
                List<svh<?>> list = djh.a;
                return Integer.valueOf((int) ((ubi) vbi.b.zza()).j());
            case 12:
                List<svh<?>> list2 = djh.a;
                return Double.valueOf(((xhi) yhi.b.zza()).zzb());
            default:
                List<svh<?>> list3 = djh.a;
                return Integer.valueOf((int) ((ubi) vbi.b.zza()).i());
        }
    }
}

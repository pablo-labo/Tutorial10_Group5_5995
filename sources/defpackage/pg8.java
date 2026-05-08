package defpackage;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.iy8;
import defpackage.nwf;
import defpackage.w2;
import io.jsonwebtoken.JwtParser;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes.dex */
@fd8
public class pg8 implements nvh, hna, nb4 {
    public static final ah2 a = new ah2(-1735958874, new vj2(0), false);
    public static final kd9 b = new kd9("MARKDOWN_FILE");
    public static final kd9 c = new kd9("UNORDERED_LIST");
    public static final kd9 d = new kd9("ORDERED_LIST");
    public static final kd9 e = new kd9("LIST_ITEM");
    public static final kd9 f = new kd9("BLOCK_QUOTE");
    public static final kd9 V = new kd9("CODE_FENCE");
    public static final kd9 W = new kd9("CODE_BLOCK");
    public static final kd9 X = new kd9("CODE_SPAN");
    public static final kd9 Y = new kd9("HTML_BLOCK");
    public static final kd9 Z = new kd9("PARAGRAPH", true);
    public static final kd9 a0 = new kd9("EMPH");
    public static final kd9 b0 = new kd9("STRONG");
    public static final kd9 c0 = new kd9("LINK_DEFINITION");
    public static final kd9 d0 = new kd9("LINK_LABEL", true);
    public static final kd9 e0 = new kd9("LINK_DESTINATION", true);
    public static final kd9 f0 = new kd9("LINK_TITLE", true);
    public static final kd9 g0 = new kd9("LINK_TEXT", true);
    public static final kd9 h0 = new kd9("INLINE_LINK");
    public static final kd9 i0 = new kd9("FULL_REFERENCE_LINK");
    public static final kd9 j0 = new kd9("SHORT_REFERENCE_LINK");
    public static final kd9 k0 = new kd9("IMAGE");
    public static final kd9 l0 = new kd9("AUTOLINK");
    public static final kd9 m0 = new kd9("SETEXT_1");
    public static final kd9 n0 = new kd9("SETEXT_2");
    public static final kd9 o0 = new kd9("ATX_1");
    public static final kd9 p0 = new kd9("ATX_2");
    public static final kd9 q0 = new kd9("ATX_3");
    public static final kd9 r0 = new kd9("ATX_4");
    public static final kd9 s0 = new kd9("ATX_5");
    public static final kd9 t0 = new kd9("ATX_6");
    public static final StackTraceElement[] u0 = new StackTraceElement[0];
    public static final int[] v0 = {-1, -1, -2, -1, -1, -1};
    public static final int[] w0 = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};
    public static final int[] x0 = {-1, -1, -3, -1, -2, -1, 1, 0, 2};
    public static final pg8 y0 = new pg8();
    public static final String[] z0 = {"app_background", "app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "ad_reward", "screen_view", "ga_extra_parameter", "session_start_with_rollout", "firebase_campaign"};
    public static final String[] A0 = {"_ab", "_cd", "_ae", "_ui", "_ug", "_in", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_e", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "_ar", "_vs", "_ep", "_ssr", "_cmp"};
    public static final String[] B0 = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};
    public static final pg8 C0 = new pg8();

    public static final int A(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final void B() {
        throw new IllegalStateException("Invalid applier");
    }

    public static void C(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        v1.g0(iArr, iArr2, iArr4);
        J(iArr4, iArr3);
    }

    public static final g4a D(g3a g3aVar, b bVar) {
        Object objD = Boolean.FALSE;
        zv8 zv8Var = (zv8) bVar.M(r09.a);
        Object objV = bVar.v();
        b.a.C0020a c0020a = b.a.a;
        if (objV == c0020a) {
            if (g3aVar.e != pz8.k) {
                objD = g3aVar.d();
            }
            objV = r.f(objD);
            bVar.p(objV);
        }
        g4a g4aVar = (g4a) objV;
        boolean zX = bVar.x(g3aVar) | bVar.x(zv8Var);
        Object objV2 = bVar.v();
        if (zX || objV2 == c0020a) {
            objV2 = new qz8(0, g3aVar, zv8Var, g4aVar);
            bVar.p(objV2);
        }
        to4.a(g3aVar, zv8Var, (Function1) objV2, bVar);
        return g4aVar;
    }

    public static final long E(String str) {
        char cCharAt;
        int length = str.length();
        int i = (length <= 0 || !zve.M("+-", str.charAt(0))) ? 0 : 1;
        if (length - i > 16) {
            int i2 = i;
            while (true) {
                if (i < length) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 == '0') {
                        if (i2 == i) {
                            i2++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i++;
                } else if (length - i2 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!wve.K(str, "+", false) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(awe.w0(1, str));
    }

    public static final String F(String str, byte[] bArr) {
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= iMax) {
                if (i == i2) {
                    return str;
                }
                if (i >= length) {
                    w2.a.a(0, i2, bArr.length);
                    return new String(bArr, 0, i2, a32.b);
                }
            } else if (str.charAt(i) == '%') {
                int i3 = i + 3;
                try {
                    String strSubstring = str.substring(i + 1, i3);
                    ypd.s(16);
                    bArr[i2] = (byte) Integer.parseInt(strSubstring, 16);
                    i2++;
                    i = i3;
                } catch (NumberFormatException unused) {
                    bArr[i2] = (byte) str.charAt(i);
                    i2++;
                    i++;
                }
            }
            bArr[i2] = (byte) str.charAt(i);
            i2++;
            i++;
        }
    }

    public static final Object G(xed xedVar, Function1 function1, lu2 lu2Var) {
        return xedVar.q() ? web.I(xedVar, new gc3(xedVar, function1, null), lu2Var) : u63.q0(((eu2) xedVar.j()).a, new hc3(xedVar, function1, null), lu2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object H(defpackage.lu2 r14, defpackage.xed r15, kotlin.jvm.functions.Function1 r16, boolean r17, boolean r18) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof defpackage.jc3
            if (r0 == 0) goto L14
            r0 = r14
            jc3 r0 = (defpackage.jc3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r14 = r0
            goto L1a
        L14:
            jc3 r0 = new jc3
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r0 = r14.result
            int r1 = r14.label
            r2 = 0
            r3 = 3
            r4 = 2
            r6 = 1
            g13 r7 = defpackage.g13.a
            if (r1 == 0) goto L4e
            if (r1 == r6) goto L4a
            if (r1 == r4) goto L36
            if (r1 != r3) goto L30
            defpackage.r7d.b(r0)
            return r0
        L30:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r14)
            return r2
        L36:
            boolean r1 = r14.Z$1
            boolean r4 = r14.Z$0
            java.lang.Object r5 = r14.L$1
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            java.lang.Object r6 = r14.L$0
            xed r6 = (defpackage.xed) r6
            defpackage.r7d.b(r0)
            r12 = r4
            r11 = r5
            r10 = r6
        L48:
            r13 = r1
            goto L97
        L4a:
            defpackage.r7d.b(r0)
            return r0
        L4e:
            defpackage.r7d.b(r0)
            boolean r0 = r15.q()
            if (r0 == 0) goto L7b
            boolean r0 = r15.u()
            if (r0 == 0) goto L7b
            boolean r0 = r15.r()
            if (r0 == 0) goto L7b
            kc3 r0 = new kc3
            r1 = 0
            r2 = r15
            r3 = r16
            r5 = r17
            r4 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r0
            r14.label = r6
            java.lang.Object r14 = r15.x(r5, r1, r14)
            if (r14 != r7) goto L7a
            goto Lab
        L7a:
            return r14
        L7b:
            r5 = r17
            r1 = r18
            r14.L$0 = r15
            r6 = r16
            r14.L$1 = r6
            r14.Z$0 = r5
            r14.Z$1 = r1
            r14.label = r4
            v03 r4 = v(r15, r1, r14)
            if (r4 != r7) goto L92
            goto Lab
        L92:
            r10 = r15
            r0 = r4
            r12 = r5
            r11 = r6
            goto L48
        L97:
            v03 r0 = (defpackage.v03) r0
            ic3 r8 = new ic3
            r9 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r14.L$0 = r2
            r14.L$1 = r2
            r14.label = r3
            java.lang.Object r14 = defpackage.u63.q0(r0, r8, r14)
            if (r14 != r7) goto Lac
        Lab:
            return r7
        Lac:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg8.H(lu2, xed, kotlin.jvm.functions.Function1, boolean, boolean):java.lang.Object");
    }

    public static final Cursor I(xed xedVar, xze xzeVar, boolean z) throws IOException {
        xedVar.getClass();
        xedVar.a();
        xedVar.b();
        Cursor cursorZ = xedVar.l().getWritableDatabase().z(xzeVar);
        if (z && (cursorZ instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorZ;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(cursorZ.getColumnNames(), cursorZ.getCount());
                    while (cursorZ.moveToNext()) {
                        Object[] objArr = new Object[cursorZ.getColumnCount()];
                        int columnCount = cursorZ.getColumnCount();
                        for (int i = 0; i < columnCount; i++) {
                            int type = cursorZ.getType(i);
                            if (type == 0) {
                                objArr[i] = null;
                            } else if (type == 1) {
                                objArr[i] = Long.valueOf(cursorZ.getLong(i));
                            } else if (type == 2) {
                                objArr[i] = Double.valueOf(cursorZ.getDouble(i));
                            } else if (type == 3) {
                                objArr[i] = cursorZ.getString(i);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i] = cursorZ.getBlob(i);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    cursorZ.close();
                    return matrixCursor;
                } finally {
                }
            }
        }
        return cursorZ;
    }

    public static void J(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[6]) & 4294967295L;
        long j2 = ((long) iArr[7]) & 4294967295L;
        long j3 = ((long) iArr[8]) & 4294967295L;
        long j4 = ((long) iArr[9]) & 4294967295L;
        long j5 = (((long) iArr[10]) & 4294967295L) + j;
        long j6 = (((long) iArr[11]) & 4294967295L) + j2;
        long j7 = (((long) iArr[0]) & 4294967295L) + j5;
        int i = (int) j7;
        long j8 = (((long) iArr[1]) & 4294967295L) + j6 + (j7 >> 32);
        int i2 = (int) j8;
        iArr2[1] = i2;
        long j9 = j5 + j3;
        long j10 = j6 + j4;
        long j11 = (((long) iArr[2]) & 4294967295L) + j9 + (j8 >> 32);
        long j12 = j11 & 4294967295L;
        long j13 = (((long) iArr[3]) & 4294967295L) + j10 + (j11 >> 32);
        iArr2[3] = (int) j13;
        long j14 = (((long) iArr[4]) & 4294967295L) + (j9 - j) + (j13 >> 32);
        iArr2[4] = (int) j14;
        long j15 = (((long) iArr[5]) & 4294967295L) + (j10 - j2) + (j14 >> 32);
        iArr2[5] = (int) j15;
        long j16 = j15 >> 32;
        long j17 = j12 + j16;
        long j18 = j16 + (((long) i) & 4294967295L);
        iArr2[0] = (int) j18;
        long j19 = j18 >> 32;
        if (j19 != 0) {
            long j20 = j19 + (((long) i2) & 4294967295L);
            iArr2[1] = (int) j20;
            j17 += j20 >> 32;
        }
        iArr2[2] = (int) j17;
        if (((j17 >> 32) == 0 || ka6.t0(6, 3, iArr2) == 0) && !(iArr2[5] == -1 && v1.c0(iArr2, v0))) {
            return;
        }
        j(iArr2);
    }

    public static void K(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) + j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = (4294967295L & ((long) iArr[2])) + j2 + j4;
            iArr[2] = (int) j6;
            j = j6 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || ka6.t0(6, 3, iArr) == 0) && !(iArr[5] == -1 && v1.c0(iArr, v0))) {
            return;
        }
        j(iArr);
    }

    public static final void L(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final void M(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static void N(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        v1.o0(iArr, iArr3);
        J(iArr3, iArr2);
    }

    public static void O(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        v1.o0(iArr, iArr3);
        J(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            v1.o0(iArr2, iArr3);
            J(iArr3, iArr2);
        }
    }

    public static TypeSubstitutor P(List list, byf byfVar, aj3 aj3Var, ArrayList arrayList) {
        if (byfVar == null) {
            d(1);
            throw null;
        }
        if (aj3Var == null) {
            d(2);
            throw null;
        }
        if (arrayList == null) {
            d(3);
            throw null;
        }
        TypeSubstitutor typeSubstitutorQ = Q(list, byfVar, aj3Var, arrayList, null);
        if (typeSubstitutorQ != null) {
            return typeSubstitutorQ;
        }
        g7.l("Substitution failed");
        return null;
    }

    public static TypeSubstitutor Q(List list, byf byfVar, aj3 aj3Var, List list2, boolean[] zArr) {
        if (byfVar == null) {
            d(6);
            throw null;
        }
        if (aj3Var == null) {
            d(7);
            throw null;
        }
        if (list2 == null) {
            d(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            rxf rxfVar = (rxf) it.next();
            sxf sxfVarO0 = sxf.O0(aj3Var, rxfVar.getAnnotations(), rxfVar.v(), rxfVar.z(), rxfVar.getName(), i, rxfVar.M());
            map.put(rxfVar.j(), new yxf(sxfVarO0.o()));
            map2.put(rxfVar, sxfVarO0);
            list2.add(sxfVarO0);
            i++;
        }
        nwf.a aVar = nwf.b;
        mwf mwfVar = new mwf(map);
        TypeSubstitutor typeSubstitutorF = TypeSubstitutor.f(byfVar, mwfVar);
        TypeSubstitutor typeSubstitutorF2 = TypeSubstitutor.f(new cyf(byfVar), mwfVar);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            rxf rxfVar2 = (rxf) it2.next();
            sxf sxfVar = (sxf) map2.get(rxfVar2);
            for (ui8 ui8Var : rxfVar2.getUpperBounds()) {
                v62 v62VarD = ui8Var.M0().d();
                ui8 ui8VarJ = (((v62VarD instanceof rxf) && boa.y((rxf) v62VarD, null, 6)) ? typeSubstitutorF : typeSubstitutorF2).j(ui8Var, ylg.OUT_VARIANCE);
                if (ui8VarJ == null) {
                    return null;
                }
                if (ui8VarJ != ui8Var && zArr != null) {
                    zArr[0] = true;
                }
                if (sxfVar.a0) {
                    r6.g("Type parameter descriptor is already initialized: ".concat(sxfVar.Q0()));
                    return null;
                }
                if (!pnb.D(ui8VarJ)) {
                    sxfVar.Z.add(ui8VarJ);
                }
            }
            if (sxfVar.a0) {
                r6.g("Type parameter descriptor is already initialized: ".concat(sxfVar.Q0()));
                return null;
            }
            sxfVar.a0 = true;
        }
        return typeSubstitutorF;
    }

    public static void R(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v1.q0(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                j2 = j3 >> 32;
            }
            long j4 = ((4294967295L & ((long) iArr3[2])) - 1) + j2;
            iArr3[2] = (int) j4;
            if ((j4 >> 32) != 0) {
                ka6.U(6, 3, iArr3);
            }
        }
    }

    public static final long S(double d2, be4 be4Var) {
        double dJ = jh2.j(d2, be4Var, be4.NANOSECONDS);
        if (Double.isNaN(dJ)) {
            l5.q("Duration value cannot be NaN.");
            return 0L;
        }
        long jC = gf9.c(dJ);
        return (-4611686018426999999L > jC || jC >= 4611686018427000000L) ? p(gf9.c(jh2.j(d2, be4Var, be4.MILLISECONDS))) : q(jC);
    }

    public static final long T(int i, be4 be4Var) {
        if (be4Var.compareTo(be4.SECONDS) > 0) {
            return U(i, be4Var);
        }
        return q(be4.NANOSECONDS.a().convert(i, be4Var.a()));
    }

    public static final long U(long j, be4 be4Var) {
        TimeUnit timeUnitA = be4Var.a();
        be4 be4Var2 = be4.NANOSECONDS;
        long jConvert = timeUnitA.convert(4611686018426999999L, be4Var2.a());
        return ((-jConvert) > j || j > jConvert) ? o(nic.E(be4.MILLISECONDS.a().convert(j, be4Var.a()), -4611686018427387903L, 4611686018427387903L)) : q(be4Var2.a().convert(j, be4Var.a()));
    }

    public static lhg V(String str) {
        String strSubstring;
        String strSubstring2;
        String str2 = w5b.b;
        String strI = !wl7.b(str2, "/") ? wve.I(str, str2, "/") : str;
        int i = 0;
        boolean z = true;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (i < strI.length()) {
            char cCharAt = strI.charAt(i);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i4 == -1 && i2 == -1) {
                            i4 = i + 1;
                        }
                    } else if (z && i4 == -1 && i2 == -1) {
                        int i7 = i + 2;
                        if (i7 < str.length() && str.charAt(i + 1) == '/' && str.charAt(i7) == '/') {
                            i5 = i + 3;
                            z = false;
                            i6 = i;
                            i = i7;
                        } else if (strI.equals(str)) {
                            i3 = i + 1;
                            i6 = i;
                            i = i3;
                            i5 = i;
                        }
                    }
                } else if (i3 == -1 && i4 == -1 && i2 == -1) {
                    i3 = i5 == -1 ? 0 : i;
                    z = false;
                }
            } else if (i2 == -1) {
                i2 = i + 1;
            }
            i++;
        }
        int iMin = Math.min(i2 == -1 ? Integer.MAX_VALUE : i2 - 1, strI.length());
        int iMin2 = Math.min(i4 == -1 ? Integer.MAX_VALUE : i4 - 1, iMin);
        if (i5 != -1) {
            strSubstring2 = strI.substring(0, i6);
            strSubstring = strI.substring(i5, Math.min(i3 != -1 ? i3 : Integer.MAX_VALUE, iMin2));
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        String strSubstring3 = i3 != -1 ? strI.substring(i3, iMin2) : null;
        String strSubstring4 = i4 != -1 ? strI.substring(i4, iMin) : null;
        String strSubstring5 = i2 != -1 ? strI.substring(i2, strI.length()) : null;
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String strF = strSubstring2 != null ? F(strSubstring2, bArr) : null;
        String strF2 = strSubstring != null ? F(strSubstring, bArr) : null;
        String strF3 = strSubstring3 != null ? F(strSubstring3, bArr) : null;
        if (strSubstring4 != null) {
            F(strSubstring4, bArr);
        }
        if (strSubstring5 != null) {
            F(strSubstring5, bArr);
        }
        return new lhg(strI, str2, strF, strF2, strF3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [j4a] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [j4a] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static final void W(ts3 ts3Var, Object obj, Function1 function1) {
        ria riaVar;
        if (!ts3Var.k().c0) {
            ae7.b("visitAncestors called on an unattached node");
        }
        e.c cVar = ts3Var.k().e;
        pm8 pm8VarF = us3.f(ts3Var);
        while (pm8VarF != null) {
            if ((pm8VarF.t0.f.d & 262144) != 0) {
                while (cVar != null) {
                    if ((cVar.c & 262144) != 0) {
                        ?? B = cVar;
                        ?? j4aVar = 0;
                        while (B != 0) {
                            if (B instanceof jtf) {
                                jtf jtfVar = (jtf) B;
                                if (!(wl7.b(obj, jtfVar.E()) ? ((Boolean) function1.invoke(jtfVar)).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((B.c & 262144) != 0) && (B instanceof zs3)) {
                                    e.c cVar2 = ((zs3) B).e0;
                                    int i = 0;
                                    B = B;
                                    j4aVar = j4aVar;
                                    while (cVar2 != null) {
                                        if ((cVar2.c & 262144) != 0) {
                                            i++;
                                            j4aVar = j4aVar;
                                            if (i == 1) {
                                                B = cVar2;
                                            } else {
                                                if (j4aVar == 0) {
                                                    j4aVar = new j4a(new e.c[16]);
                                                }
                                                if (B != 0) {
                                                    j4aVar.b(B);
                                                    B = 0;
                                                }
                                                j4aVar.b(cVar2);
                                            }
                                        }
                                        cVar2 = cVar2.f;
                                        B = B;
                                        j4aVar = j4aVar;
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            B = us3.b(j4aVar);
                        }
                    }
                    cVar = cVar.e;
                }
            }
            pm8VarF = pm8VarF.K();
            cVar = (pm8VarF == null || (riaVar = pm8VarF.t0) == null) ? null : riaVar.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, jtf, ts3] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [j4a] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [j4a] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void X(jtf jtfVar, Function1 function1) {
        ria riaVar;
        e.c cVar = (e.c) jtfVar;
        if (!cVar.a.c0) {
            ae7.b("visitAncestors called on an unattached node");
        }
        e.c cVar2 = cVar.a.e;
        pm8 pm8VarF = us3.f(jtfVar);
        while (pm8VarF != null) {
            if ((pm8VarF.t0.f.d & 262144) != 0) {
                while (cVar2 != null) {
                    if ((cVar2.c & 262144) != 0) {
                        ?? B = cVar2;
                        ?? j4aVar = 0;
                        while (B != 0) {
                            boolean zBooleanValue = true;
                            if (B instanceof jtf) {
                                jtf jtfVar2 = (jtf) B;
                                if (wl7.b(jtfVar.E(), jtfVar2.E()) && jtfVar.getClass() == jtfVar2.getClass()) {
                                    zBooleanValue = ((Boolean) function1.invoke(jtfVar2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((B.c & 262144) != 0) && (B instanceof zs3)) {
                                    e.c cVar3 = ((zs3) B).e0;
                                    int i = 0;
                                    B = B;
                                    j4aVar = j4aVar;
                                    while (cVar3 != null) {
                                        if ((cVar3.c & 262144) != 0) {
                                            i++;
                                            j4aVar = j4aVar;
                                            if (i == 1) {
                                                B = cVar3;
                                            } else {
                                                if (j4aVar == 0) {
                                                    j4aVar = new j4a(new e.c[16]);
                                                }
                                                if (B != 0) {
                                                    j4aVar.b(B);
                                                    B = 0;
                                                }
                                                j4aVar.b(cVar3);
                                            }
                                        }
                                        cVar3 = cVar3.f;
                                        B = B;
                                        j4aVar = j4aVar;
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            B = us3.b(j4aVar);
                        }
                    }
                    cVar2 = cVar2.e;
                }
            }
            pm8VarF = pm8VarF.K();
            cVar2 = (pm8VarF == null || (riaVar = pm8VarF.t0) == null) ? null : riaVar.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [j4a] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [j4a] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void Y(jtf jtfVar, Function1 function1) {
        if (!jtfVar.k().c0) {
            ae7.b("visitSubtreeIf called on an unattached node");
        }
        j4a j4aVar = new j4a(new e.c[16]);
        e.c cVar = jtfVar.k().f;
        if (cVar == null) {
            us3.a(j4aVar, jtfVar.k());
        } else {
            j4aVar.b(cVar);
        }
        while (true) {
            int i = j4aVar.c;
            if (i == 0) {
                return;
            }
            e.c cVar2 = (e.c) j4aVar.k(i - 1);
            if ((cVar2.d & 262144) != 0) {
                for (e.c cVar3 = cVar2; cVar3 != null; cVar3 = cVar3.f) {
                    if ((cVar3.c & 262144) != 0) {
                        ?? B = cVar3;
                        ?? j4aVar2 = 0;
                        while (B != 0) {
                            if (B instanceof jtf) {
                                jtf jtfVar2 = (jtf) B;
                                itf itfVar = (wl7.b(jtfVar.E(), jtfVar2.E()) && jtfVar.getClass() == jtfVar2.getClass()) ? (itf) function1.invoke(jtfVar2) : itf.a;
                                if (itfVar == itf.c) {
                                    return;
                                }
                                if (itfVar == itf.b) {
                                    break;
                                }
                            } else if ((B.c & 262144) != 0 && (B instanceof zs3)) {
                                e.c cVar4 = ((zs3) B).e0;
                                int i2 = 0;
                                B = B;
                                j4aVar2 = j4aVar2;
                                while (cVar4 != null) {
                                    if ((cVar4.c & 262144) != 0) {
                                        i2++;
                                        j4aVar2 = j4aVar2;
                                        if (i2 == 1) {
                                            B = cVar4;
                                        } else {
                                            if (j4aVar2 == 0) {
                                                j4aVar2 = new j4a(new e.c[16]);
                                            }
                                            if (B != 0) {
                                                j4aVar2.b(B);
                                                B = 0;
                                            }
                                            j4aVar2.b(cVar4);
                                        }
                                    }
                                    cVar4 = cVar4.f;
                                    B = B;
                                    j4aVar2 = j4aVar2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            B = us3.b(j4aVar2);
                        }
                    }
                }
            }
            us3.a(j4aVar, cVar2);
        }
    }

    public static IllegalArgumentException Z(Class cls, ReflectiveOperationException reflectiveOperationException) {
        StringBuilder sb = new StringBuilder("unable to create new instance of class ");
        sb.append(cls.getName());
        ArrayList arrayList = new ArrayList();
        if (cls.isArray()) {
            arrayList.add("because it is an array");
        } else if (cls.isPrimitive()) {
            arrayList.add("because it is primitive");
        } else if (cls == Void.class) {
            arrayList.add("because it is void");
        } else {
            if (Modifier.isInterface(cls.getModifiers())) {
                arrayList.add("because it is an interface");
            } else if (Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add("because it is abstract");
            }
            if (cls.getEnclosingClass() != null && !Modifier.isStatic(cls.getModifiers())) {
                arrayList.add("because it is not static");
            }
            if (Modifier.isPublic(cls.getModifiers())) {
                try {
                    cls.getConstructor(null);
                } catch (NoSuchMethodException unused) {
                    arrayList.add("because it has no accessible default constructor");
                }
            } else {
                arrayList.add("possibly because it is not public");
            }
        }
        int size = arrayList.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            if (z) {
                sb.append(" and");
            } else {
                z = true;
            }
            sb.append(" ");
            sb.append(str);
        }
        return new IllegalArgumentException(sb.toString(), reflectiveOperationException);
    }

    public static Iterable a0(Object obj) {
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        Class<?> cls = obj.getClass();
        Object[] objArr = {cls};
        if (cls.isArray()) {
            return !cls.getComponentType().isPrimitive() ? Arrays.asList((Object[]) obj) : new uqh(obj);
        }
        l5.q(ojh.z("not an array or Iterable: %s", objArr));
        return null;
    }

    public static /* synthetic */ void d(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 4 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static final LinearGradient e(long j, long j2, List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                l5.q("colors must have length of at least 2 if colorStops is omitted.");
                return null;
            }
        } else if (list.size() != list2.size()) {
            l5.q("colors and colorStops arguments must have equal length.");
            return null;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = pnb.P(((da2) list.get(i)).a);
        }
        return new LinearGradient(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, iArr, list2 != null ? z92.w1(list2) : null, Shader.TileMode.CLAMP);
    }

    public static final void f(gu5 gu5Var, String str, gu5 gu5Var2, gu5 gu5Var3, gu5 gu5Var4, gu5 gu5Var5, gu5 gu5Var6, b bVar, int i) {
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        gu5Var5.getClass();
        gu5Var6.getClass();
        c cVarH = bVar.h(-1334163511);
        int i2 = i | (cVarH.x(gu5Var) ? 4 : 2) | (cVarH.K(str) ? 32 : 16) | (cVarH.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var3) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var4) ? 16384 : 8192) | (cVarH.x(gu5Var5) ? 131072 : 65536) | (cVarH.x(gu5Var6) ? 1048576 : 524288);
        if (cVarH.o(i2 & 1, (599187 & i2) != 599186)) {
            Boolean bool = Boolean.FALSE;
            ArrayList arrayListD0 = u63.d0(new c9d(R.string.resume_option_preview, null, R.drawable.ic_idl_filepreview_filled, bool, gu5Var2), new c9d(R.string.resume_option_download, null, R.drawable.ic_idl_downloadresume_stroke_ifl7, bool, gu5Var3), new c9d(R.string.resume_option_replace_file, null, R.drawable.ic_idl_replacefile_stroke_ifl7, bool, gu5Var5), new c9d(R.string.resume_option_delete, null, R.drawable.ic_idl_trash_can_24, bool, gu5Var6));
            if (c0h.G() && c0h.B() && gu5Var4 != null) {
                cVarH.L(-436542616);
                Integer numValueOf = Integer.valueOf(R.string.profile_option_resume_sync_to_profile_explainer);
                Boolean bool2 = Boolean.TRUE;
                boolean z = (57344 & i2) == 16384;
                Object objV = cVarH.v();
                b.a.C0020a c0020a = b.a.a;
                if (z || objV == c0020a) {
                    objV = new ec(9, gu5Var4);
                    cVarH.p(objV);
                }
                arrayListD0.add(2, new c9d(R.string.profile_option_resume_sync_to_profile, numValueOf, R.drawable.ic_idl_renew_stroke_ifl7, bool2, (gu5) objV));
                j6g j6gVar = j6g.a;
                Object objV2 = cVarH.v();
                if (objV2 == c0020a) {
                    objV2 = new g8d(2, null);
                    cVarH.p(objV2);
                }
                to4.d(cVarH, j6gVar, (Function2) objV2);
            } else {
                cVarH.L(-438779111);
            }
            cVarH.U(false);
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            if (!lowerCase.equals("pdf")) {
                String lowerCase2 = str.toLowerCase(locale);
                lowerCase2.getClass();
                if (!lowerCase2.equals("txt")) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : arrayListD0) {
                        if (((c9d) obj).a != R.string.resume_option_preview) {
                            arrayList.add(obj);
                        }
                    }
                    arrayListD0 = new ArrayList(arrayList);
                }
            }
            la1.a(gu5Var, ak2.I(R.string.resume_options_sheet_header, cVarH), arrayListD0, "ResumeOptionsSheet", cVarH, (i2 & 14) | 3072);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new qj8(gu5Var, str, gu5Var2, gu5Var3, gu5Var4, gu5Var5, gu5Var6, i);
        }
    }

    public static lhg g(String str) {
        String str2 = w5b.b;
        StringBuilder sb = new StringBuilder();
        sb.append("file");
        sb.append(':');
        if (str != null) {
            sb.append(str);
        }
        return new lhg(sb.toString(), str2, "file", null, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final g4a h(boolean z, ei7 ei7Var, ar3 ar3Var, float f2, float f3, b bVar, int i) {
        b bVar2;
        ese eseVarG;
        ese eseVarG2;
        g4a g4aVarP = wg2.p(ei7Var, bVar, (i >> 6) & 14);
        ar3Var.getClass();
        bVar.L(998675979);
        long j = !z ? ar3Var.h : ((Boolean) wg2.p(ei7Var, bVar, ((i & 8190) >> 6) & 14).getValue()).booleanValue() ? ar3Var.e : ar3Var.f;
        if (z) {
            bVar.L(318144948);
            bVar2 = bVar;
            eseVarG = vhe.a(j, zd0.d(150, 0, null, 6), null, bVar2, 48, 12);
            bVar2.F();
        } else {
            bVar2 = bVar;
            bVar2.L(318247806);
            eseVarG = r.g(new da2(j), bVar2);
            bVar2.F();
        }
        bVar2.F();
        if (!((Boolean) g4aVarP.getValue()).booleanValue()) {
            f2 = f3;
        }
        if (z) {
            bVar2.L(1361102414);
            eseVarG2 = vc0.a(f2, zd0.d(150, 0, null, 6), bVar2, 48);
            bVar2.F();
        } else {
            bVar2.L(1361206636);
            eseVarG2 = r.g(new j94(f3), bVar2);
            bVar2.F();
        }
        return r.g(new bj1(((j94) eseVarG2.getValue()).a, new kne(((da2) eseVarG.getValue()).a)), bVar2);
    }

    public static final long i(String str) {
        be4 be4Var;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            l5.q("The string is empty");
            return 0L;
        }
        int i = wd4.d;
        char cCharAt2 = str.charAt(0);
        int i2 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z = i2 > 0 && zve.m0(str, '-');
        if (length <= i2) {
            l5.q("No components");
            return 0L;
        }
        if (str.charAt(i2) != 'P') {
            o6.h();
            return 0L;
        }
        int i3 = i2 + 1;
        if (i3 == length) {
            o6.h();
            return 0L;
        }
        be4 be4Var2 = null;
        long jN = 0;
        boolean z2 = false;
        while (i3 < length) {
            if (str.charAt(i3) != 'T') {
                int i4 = i3;
                while (i4 < str.length() && (('0' <= (cCharAt = str.charAt(i4)) && cCharAt < ':') || zve.M("+-.", cCharAt))) {
                    i4++;
                }
                String strSubstring = str.substring(i3, i4);
                if (strSubstring.length() == 0) {
                    o6.h();
                    return 0L;
                }
                int length2 = strSubstring.length() + i3;
                if (length2 < 0 || length2 >= str.length()) {
                    l5.q("Missing unit for value ".concat(strSubstring));
                    return 0L;
                }
                char cCharAt3 = str.charAt(length2);
                int i5 = length2 + 1;
                be4 be4Var3 = be4.SECONDS;
                if (z2) {
                    if (cCharAt3 == 'H') {
                        be4Var = be4.HOURS;
                    } else if (cCharAt3 == 'M') {
                        be4Var = be4.MINUTES;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        be4Var = be4Var3;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    be4Var = be4.DAYS;
                }
                if (be4Var2 != null && be4Var2.compareTo(be4Var) <= 0) {
                    l5.q("Unexpected order of duration components");
                    return 0L;
                }
                int iR = zve.R(strSubstring, JwtParser.SEPARATOR_CHAR, 0, false, 6);
                jN = (be4Var != be4Var3 || iR <= 0) ? wd4.n(jN, U(E(strSubstring), be4Var)) : wd4.n(wd4.n(jN, U(E(strSubstring.substring(0, iR)), be4Var)), S(Double.parseDouble(strSubstring.substring(iR)), be4Var));
                be4Var2 = be4Var;
                i3 = i5;
            } else {
                if (z2 || (i3 = i3 + 1) == length) {
                    o6.h();
                    return 0L;
                }
                z2 = true;
            }
        }
        return z ? wd4.r(jN) : jN;
    }

    public static void j(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = (4294967295L & ((long) iArr[2])) + 1 + j2;
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            ka6.t0(6, 3, iArr);
        }
    }

    public static final List k(vte vteVar, int i, int i2, ArrayList arrayList, gh7 gh7Var, int i3, int i4, int i5, int i6, Function1 function1) {
        int i7;
        vte vteVar2 = vteVar;
        if (vteVar2 == null || arrayList.isEmpty() || gh7Var.b == 0) {
            return zr4.a;
        }
        z2a z2aVarA = vteVar2.a(i, i2, gh7Var);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = arrayList.get(i8);
            int index = ((br8) obj).getIndex();
            int[] iArr = gh7Var.a;
            int i9 = gh7Var.b;
            int i10 = 0;
            while (true) {
                if (i10 >= i9) {
                    break;
                }
                if (iArr[i10] == index) {
                    arrayList3.add(obj);
                    break;
                }
                i10++;
            }
        }
        int[] iArr2 = z2aVarA.a;
        int i11 = z2aVarA.b;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = iArr2[i12];
            Iterator it = arrayList.iterator();
            int i14 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i14 = -1;
                    break;
                }
                if (((br8) it.next()).getIndex() == i13) {
                    break;
                }
                i14++;
            }
            br8 br8Var = i14 == -1 ? (br8) function1.invoke(Integer.valueOf(i13)) : (br8) arrayList.remove(i14);
            ArrayList arrayList4 = arrayList3;
            int iH = br8Var.h();
            if (i14 == -1) {
                i7 = Integer.MIN_VALUE;
            } else {
                long jK = br8Var.k(0);
                i7 = (int) (br8Var.f() ? jK & 4294967295L : jK >> 32);
            }
            int iB = vteVar2.b(arrayList4, i13, iH, i7, i3);
            br8Var.j();
            br8Var.g(iB, 0, i5, i6);
            arrayList2.add(br8Var);
            i12++;
            vteVar2 = vteVar;
            arrayList3 = arrayList4;
        }
        return arrayList2;
    }

    public static void l(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                ja.k(p6.c(i2, "at index "));
                return;
            }
        }
    }

    public static final void m(long j, dwa dwaVar) {
        if (dwaVar == dwa.a) {
            if (iq2.g(j) != Integer.MAX_VALUE) {
                return;
            }
            de7.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (iq2.h(j) != Integer.MAX_VALUE) {
                return;
            }
            de7.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final void n(zhd zhdVar) {
        zhdVar.getClass();
        iy8 iy8VarS = u63.s();
        iid iidVarQ1 = zhdVar.Q1("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (iidVarQ1.M1()) {
            try {
                iy8VarS.add(iidVarQ1.r1(0));
            } finally {
            }
        }
        j6g j6gVar = j6g.a;
        pi3.d(iidVarQ1, null);
        ListIterator listIterator = iy8VarS.l().listIterator(0);
        while (true) {
            iy8.b bVar = (iy8.b) listIterator;
            if (!bVar.hasNext()) {
                return;
            }
            String str = (String) bVar.next();
            if (wve.K(str, "room_fts_content_sync_", false)) {
                zkd.y(zhdVar, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static final long o(long j) {
        long j2 = (j << 1) + 1;
        int i = wd4.d;
        int i2 = yd4.a;
        return j2;
    }

    public static final long p(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? o(nic.E(j, -4611686018427387903L, 4611686018427387903L)) : q(j * 1000000);
    }

    public static final long q(long j) {
        long j2 = j << 1;
        int i = wd4.d;
        int i2 = yd4.a;
        return j2;
    }

    public static pn3 r(b bVar) {
        boolean zC = bVar.c(6.0f) | bVar.c(12.0f) | bVar.c(8.0f) | bVar.c(8.0f);
        Object objV = bVar.v();
        if (zC || objV == b.a.a) {
            objV = new pn3();
            bVar.p(objV);
        }
        return (pn3) objV;
    }

    public static final boolean s(long j, long j2) {
        return j == j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, jtf, ts3] */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [j4a] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [j4a] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final jtf t(jtf jtfVar) {
        ria riaVar;
        e.c cVar = (e.c) jtfVar;
        if (!cVar.a.c0) {
            ae7.b("visitAncestors called on an unattached node");
        }
        e.c cVar2 = cVar.a.e;
        pm8 pm8VarF = us3.f(jtfVar);
        while (pm8VarF != null) {
            if ((pm8VarF.t0.f.d & 262144) != 0) {
                while (cVar2 != null) {
                    if ((cVar2.c & 262144) != 0) {
                        ?? B = cVar2;
                        ?? j4aVar = 0;
                        while (B != 0) {
                            if (B instanceof jtf) {
                                jtf jtfVar2 = (jtf) B;
                                if (wl7.b(jtfVar.E(), jtfVar2.E()) && jtfVar.getClass() == jtfVar2.getClass()) {
                                    return jtfVar2;
                                }
                            } else if ((B.c & 262144) != 0 && (B instanceof zs3)) {
                                e.c cVar3 = ((zs3) B).e0;
                                int i = 0;
                                B = B;
                                j4aVar = j4aVar;
                                while (cVar3 != null) {
                                    if ((cVar3.c & 262144) != 0) {
                                        i++;
                                        j4aVar = j4aVar;
                                        if (i == 1) {
                                            B = cVar3;
                                        } else {
                                            if (j4aVar == 0) {
                                                j4aVar = new j4a(new e.c[16]);
                                            }
                                            if (B != 0) {
                                                j4aVar.b(B);
                                                B = 0;
                                            }
                                            j4aVar.b(cVar3);
                                        }
                                    }
                                    cVar3 = cVar3.f;
                                    B = B;
                                    j4aVar = j4aVar;
                                }
                                if (i == 1) {
                                }
                            }
                            B = us3.b(j4aVar);
                        }
                    }
                    cVar2 = cVar2.e;
                }
            }
            pm8VarF = pm8VarF.K();
            cVar2 = (pm8VarF == null || (riaVar = pm8VarF.t0) == null) ? null : riaVar.e;
        }
        return null;
    }

    public static String u(File file, String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(file);
        String str3 = File.separator;
        File file2 = new File(l6.i(sb, str3, str));
        if (!file2.isDirectory() && !file2.mkdirs()) {
            throw new IOException("Couldn't create directory '" + file2 + "'");
        }
        String string = UUID.randomUUID().toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file2);
        sb2.append(str3);
        sb2.append(string);
        if (!str2.startsWith(".")) {
            str2 = ".".concat(str2);
        }
        sb2.append(str2);
        return sb2.toString();
    }

    public static final v03 v(xed xedVar, boolean z, pu2 pu2Var) {
        if (!xedVar.q()) {
            return ((eu2) xedVar.j()).a;
        }
        arf arfVar = (arf) pu2Var.getContext().h1(arf.c);
        if (arfVar != null) {
            qu2 qu2Var = arfVar.a;
            eu2 eu2Var = xedVar.a;
            if (eu2Var == null) {
                wl7.g("coroutineScope");
                throw null;
            }
            v03 v03VarD1 = eu2Var.a.d1(qu2Var);
            if (v03VarD1 != null) {
                return v03VarD1;
            }
        }
        if (z) {
            v03 v03Var = xedVar.b;
            if (v03Var != null) {
                return v03Var;
            }
            wl7.g("transactionContext");
            throw null;
        }
        eu2 eu2Var2 = xedVar.a;
        if (eu2Var2 != null) {
            return eu2Var2.a;
        }
        wl7.g("coroutineScope");
        throw null;
    }

    public static final long w(b bVar) {
        return bVar.k();
    }

    public static final String x(lhg lhgVar) {
        List listZ = z(lhgVar);
        String str = lhgVar.b;
        if (listZ.isEmpty()) {
            return null;
        }
        String str2 = lhgVar.e;
        str2.getClass();
        if (!wve.K(str2, str, false)) {
            str = "";
        }
        return z92.W0(listZ, lhgVar.b, str, null, null, 60);
    }

    public static final long y(KeyEvent keyEvent) {
        return ak2.a(keyEvent.getKeyCode());
    }

    public static final List z(lhg lhgVar) {
        String str = lhgVar.e;
        if (str == null) {
            return zr4.a;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (i < str.length()) {
            int i2 = i + 1;
            int iR = zve.R(str, '/', i2, false, 4);
            if (iR == -1) {
                iR = str.length();
            }
            String strSubstring = str.substring(i2, iR);
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i = iR;
        }
        return arrayList;
    }

    @Override // defpackage.nb4
    public Drawable a(l82 l82Var) {
        q82 q82Var = l82Var instanceof q82 ? (q82) l82Var : null;
        if (q82Var != null) {
            return q82Var.i1();
        }
        return null;
    }

    @Override // defpackage.hna
    public Object b() {
        return new LinkedHashSet();
    }

    @Override // defpackage.nb4
    public boolean c(l82 l82Var) {
        return l82Var instanceof q82;
    }

    @Override // defpackage.nvh
    public Object zza() {
        List<svh<?>> list = djh.a;
        return Boolean.valueOf(((ugi) rgi.b.zza()).zza());
    }
}

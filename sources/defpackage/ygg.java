package defpackage;

import android.graphics.Color;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.n;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.a;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.R;
import defpackage.ad3;
import java.math.BigInteger;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class ygg implements ad3.c, nvh, hna {
    public static final nfa W;
    public static final ah2 c;
    public final /* synthetic */ int a;
    public static final ah2 b = new ah2(351125143, new jm0(1), false);
    public static final Object d = new Object();
    public static final ygg e = new ygg(4);
    public static final eq8[] f = new eq8[0];
    public static final StackTraceElement[] V = new StackTraceElement[0];
    public static final int[] X = {-4553, -2, -1, -1, -1, -1};
    public static final int[] Y = {20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};
    public static final int[] Z = {-20729809, -9107, -2, -1, -1, -1, 9105, 2};
    public static final ygg a0 = new ygg(9);
    public static final ygg b0 = new ygg(10);
    public static final ygg c0 = new ygg(11);
    public static final ygg d0 = new ygg(12);
    public static final ygg e0 = new ygg(13);

    static {
        int i = 3;
        c = new ah2(2072417165, new jm0(i), false);
        W = new nfa("ResolutionAnchorProvider", i);
    }

    public /* synthetic */ ygg(int i) {
        this.a = i;
    }

    public static void A(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        v1.o0(iArr, iArr3);
        s(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            v1.o0(iArr2, iArr3);
            s(iArr3, iArr2);
        }
    }

    public static void B(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v1.q0(iArr, iArr2, iArr3) != 0) {
            ka6.p1(6, 4553, iArr3);
        }
    }

    public static String C(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d)};
        String str = vjg.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static /* synthetic */ void a(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static final void c(int i, gu5 gu5Var, gu5 gu5Var2, b bVar, boolean z) {
        c cVarC = ja.c(gu5Var, gu5Var2, bVar, 266229961);
        int i2 = (cVarC.a(z) ? 4 : 2) | i | (cVarC.x(gu5Var) ? 32 : 16) | (cVarC.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarC.o(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                cVarC.L(-1547666111);
                qof.a(gu5Var, gu5Var2, false, cVarC, (i2 >> 3) & 126, 4);
            } else {
                cVarC.L(-1547999175);
            }
            cVarC.U(false);
        } else {
            cVarC.D();
        }
        i iVarW = cVarC.W();
        if (iVarW != null) {
            iVarW.d = new z7a(i, 0, gu5Var, gu5Var2, z);
        }
    }

    public static final void e(String str, Function2 function2, b bVar, int i) {
        boolean zEquals;
        function2.getClass();
        c cVarH = bVar.h(-1876611382);
        int i2 = 2;
        int i3 = (cVarH.K(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= cVarH.x(function2) ? 32 : 16;
        }
        int i4 = 1;
        if (cVarH.o(i3 & 1, (i3 & 19) != 18)) {
            List<ypb> list = ypb.c;
            cVarH.L(462733015);
            List<ypb> list2 = list;
            ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                int i5 = ((ypb) it.next()).a;
                String strI = ak2.I(i5, cVarH);
                if (str == null) {
                    cVarH.L(-1287196855);
                    zEquals = wl7.b(ak2.I(i5, cVarH), ak2.I(R.string.not_applicable, cVarH));
                } else {
                    cVarH.L(-1287194259);
                    zEquals = str.equals(ak2.I(i5, cVarH));
                }
                cVarH.U(false);
                arrayList.add(new zv6(strI, zEquals));
            }
            cVarH.U(false);
            zv6[] zv6VarArr = (zv6[]) arrayList.toArray(new zv6[0]);
            String strI2 = ak2.I(R.string.language_proficiency_label, cVarH);
            boolean zX = cVarH.x(list) | cVarH.x(zv6VarArr) | ((i3 & 112) == 32);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                objV = new jx7(i2, list, zv6VarArr, function2);
                cVarH.p(objV);
            }
            fw6.c(strI2, null, null, null, false, zv6VarArr, (Function2) objV, null, cVarH, 24576, 302);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new o5b(str, i, i4, function2);
        }
    }

    public static final String f(Object[] objArr, int i, int i2, l3 l3Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == l3Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final e g(e eVar, float f2) {
        return f2 == 1.0f ? eVar : a.c(eVar, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, null, 520187);
    }

    public static final e h(e eVar, dce dceVar) {
        return a.c(eVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, dceVar, 518143);
    }

    public static final e i(e eVar) {
        return a.c(eVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 520191);
    }

    public static float j(float f2, float f3, b bVar) {
        long j = ((da2) bVar.M(ps2.a)).a;
        return (!((kb2) bVar.M(lb2.a)).g() ? ((double) pnb.J(j)) < 0.5d : ((double) pnb.J(j)) > 0.5d) ? f3 : f2;
    }

    public static rlg k(n8a n8aVar, t52 t52Var) {
        if (n8aVar == null) {
            a(19);
            throw null;
        }
        if (t52Var == null) {
            a(20);
            throw null;
        }
        Collection<m52> collectionK = t52Var.k();
        if (collectionK.size() != 1) {
            return null;
        }
        for (rlg rlgVar : collectionK.iterator().next().i()) {
            if (rlgVar.getName().equals(n8aVar)) {
                return rlgVar;
            }
        }
        return null;
    }

    public static float l(b bVar) {
        return j(1.0f, 0.87f, bVar);
    }

    public static we4 m(String str) {
        r5h r5hVar;
        r5h r5hVar2;
        r5h r5hVar3;
        r5h r5hVar4;
        r5h r5hVar5;
        r5h r5hVar6;
        ye4 ye4Var;
        r5h r5hVar7 = (r5h) ib3.a.get(qve.a(str));
        q5h q5hVarB = r5hVar7 == null ? null : r5hVar7.b();
        if (q5hVarB == null) {
            try {
                r5h r5hVar8 = (r5h) ib3.c.get(new u(str));
                q5hVarB = r5hVar8 == null ? null : r5hVar8.b();
            } catch (IllegalArgumentException unused) {
            }
            if (q5hVarB == null) {
                u uVar = (u) o5h.a.get(qve.a(str));
                q5hVarB = (uVar == null || (r5hVar6 = (r5h) o5h.b.get(uVar)) == null) ? null : r5hVar6.b();
                if (q5hVarB == null) {
                    u uVar2 = (u) thd.a.get(qve.a(str));
                    q5hVarB = (uVar2 == null || (r5hVar5 = (r5h) thd.b.get(uVar2)) == null) ? null : r5hVar5.b();
                }
                if (q5hVarB == null) {
                    Hashtable hashtable = i8a.a;
                    char[] charArray = str.toCharArray();
                    boolean z = false;
                    for (int i = 0; i != charArray.length; i++) {
                        char c2 = charArray[i];
                        if ('a' <= c2 && 'z' >= c2) {
                            charArray[i] = (char) (c2 - ' ');
                            z = true;
                        }
                    }
                    u uVar3 = (u) hashtable.get(z ? new String(charArray) : str);
                    q5hVarB = (uVar3 == null || (r5hVar4 = (r5h) thd.b.get(uVar3)) == null) ? null : r5hVar4.b();
                }
                if (q5hVarB == null) {
                    u uVar4 = (u) obf.a.get(qve.a(str));
                    q5hVarB = (uVar4 == null || (r5hVar3 = (r5h) obf.b.get(uVar4)) == null) ? null : r5hVar3.b();
                }
                if (q5hVarB == null) {
                    u uVar5 = (u) o.a.get(qve.a(str));
                    q5hVarB = (uVar5 == null || (r5hVar2 = (r5h) o.b.get(uVar5)) == null) ? null : r5hVar2.b();
                }
                if (q5hVarB == null) {
                    u uVar6 = (u) hw5.a.get(qve.a(str));
                    q5hVarB = (uVar6 == null || (r5hVar = (r5h) hw5.b.get(uVar6)) == null) ? null : r5hVar.b();
                }
                if (q5hVarB == null) {
                    try {
                        u uVar7 = new u(str);
                        r5h r5hVar9 = (r5h) o5h.b.get(uVar7);
                        q5h q5hVarB2 = r5hVar9 != null ? r5hVar9.b() : null;
                        if (q5hVarB2 == null) {
                            r5h r5hVar10 = (r5h) thd.b.get(uVar7);
                            q5hVarB2 = r5hVar10 == null ? null : r5hVar10.b();
                        }
                        if (q5hVarB2 == null) {
                            r5h r5hVar11 = (r5h) obf.b.get(uVar7);
                            q5hVarB2 = r5hVar11 != null ? r5hVar11.b() : null;
                        }
                        if (q5hVarB2 == null) {
                            r5h r5hVar12 = (r5h) o.b.get(uVar7);
                            q5hVarB2 = r5hVar12 == null ? null : r5hVar12.b();
                        }
                        if (q5hVarB2 == null) {
                            r5h r5hVar13 = (r5h) hw5.b.get(uVar7);
                            q5hVarB2 = r5hVar13 == null ? null : r5hVar13.b();
                        }
                        q5hVarB = q5hVarB2;
                    } catch (IllegalArgumentException unused2) {
                    }
                }
            }
        }
        if (q5hVarB == null) {
            return null;
        }
        ue4 ue4Var = q5hVarB.b;
        s5h s5hVar = q5hVarB.c;
        synchronized (s5hVar) {
            try {
                if (s5hVar.c == null) {
                    s5hVar.c = s5hVar.b.d(s5hVar.a.a).i();
                }
                ye4Var = s5hVar.c;
            } finally {
            }
        }
        BigInteger bigInteger = q5hVarB.d;
        we4 we4Var = new we4();
        we4Var.a = ue4Var;
        we4Var.b = ye4Var.i();
        we4Var.c = bigInteger;
        return we4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean n() {
        /*
            boolean r0 = defpackage.pyd.h0
            java.lang.String r1 = "droid_rn_myjobs_tst"
            java.lang.Class<kr7> r2 = defpackage.kr7.class
            if (r0 == 0) goto L18
            java.lang.Object r0 = defpackage.cr8.p(r2)
            kr7 r0 = (defpackage.kr7) r0
            lr7 r0 = r0.e(r1)
            int r0 = r0.a
            r3 = 1
            if (r0 < r3) goto L18
            goto L19
        L18:
            r3 = 0
        L19:
            java.lang.Class<np7> r0 = defpackage.np7.class
            java.lang.Object r0 = defpackage.cr8.p(r0)
            np7 r0 = (defpackage.np7) r0
            java.lang.Object r2 = defpackage.cr8.p(r2)
            kr7 r2 = (defpackage.kr7) r2
            lr7 r1 = r2.e(r1)
            int r1 = r1.a
            boolean r2 = defpackage.pyd.h0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "isRNMyJobsEnabled: bucket="
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = ", canUseReactNative="
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = ", isEnabled="
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = "RNMyJobsProctor"
            r0.a(r2, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygg.n():boolean");
    }

    public static xo3 o() {
        ah2 ah2Var = v83.a;
        ah2 ah2Var2 = v83.b;
        ah2 ah2Var3 = v83.c;
        ah2 ah2Var4 = v83.d;
        ah2 ah2Var5 = v83.e;
        ah2 ah2Var6 = v83.f;
        ah2 ah2Var7 = v83.g;
        ah2 ah2Var8 = v83.h;
        ah2 ah2Var9 = v83.i;
        ah2 ah2Var10 = v83.j;
        ah2 ah2Var11 = v83.k;
        ah2 ah2Var12 = v83.l;
        ah2 ah2Var13 = v83.m;
        ah2 ah2Var14 = v83.n;
        ah2 ah2Var15 = v83.o;
        ah2 ah2Var16 = v83.p;
        ah2 ah2Var17 = v83.q;
        ah2 ah2Var18 = v83.r;
        ah2 ah2Var19 = v83.s;
        ah2Var.getClass();
        ah2Var2.getClass();
        ah2Var3.getClass();
        ah2Var4.getClass();
        ah2Var5.getClass();
        ah2Var6.getClass();
        ah2Var7.getClass();
        ah2Var8.getClass();
        ah2Var9.getClass();
        ah2Var10.getClass();
        ah2Var11.getClass();
        ah2Var12.getClass();
        ah2Var13.getClass();
        ah2Var14.getClass();
        ah2Var15.getClass();
        ah2Var16.getClass();
        ah2Var17.getClass();
        ah2Var18.getClass();
        ah2Var19.getClass();
        return new xo3(ah2Var, ah2Var2, ah2Var3, ah2Var4, ah2Var5, ah2Var6, ah2Var7, ah2Var8, ah2Var9, ah2Var10, ah2Var11, ah2Var12, ah2Var13, ah2Var14, ah2Var15, ah2Var16, ah2Var17, ah2Var18, ah2Var19);
    }

    public static void p(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        v1.g0(iArr, iArr2, iArr4);
        s(iArr4, iArr3);
    }

    public static final void q(n nVar, nr0 nr0Var, int i) {
        while (true) {
            int i2 = nVar.v;
            if (i > i2 && i < nVar.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            nVar.N();
            if (nVar.x(nVar.v)) {
                nr0Var.p();
            }
            nVar.j();
        }
    }

    public static n8a r(n8a n8aVar, String str, String str2, int i) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!n8aVar.b) {
            String strE = n8aVar.e();
            if (wve.K(strE, str, false) && strE.length() != str.length() && ('a' > (cCharAt = strE.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return n8a.h(str2.concat(zve.b0(strE, str)));
                }
                if (!z) {
                    return n8aVar;
                }
                String strB0 = zve.b0(strE, str);
                if (strB0.length() != 0 && ie7.p(0, strB0)) {
                    if (strB0.length() != 1 && ie7.p(1, strB0)) {
                        Iterator<Integer> it = new oh7(0, strB0.length() - 1, 1).iterator();
                        while (true) {
                            if (!((nh7) it).c) {
                                next = null;
                                break;
                            }
                            next = ((fh7) it).next();
                            if (!ie7.p(((Number) next).intValue(), strB0)) {
                                break;
                            }
                        }
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            strB0 = ie7.A(strB0.substring(0, iIntValue)).concat(strB0.substring(iIntValue));
                        } else {
                            strB0 = ie7.A(strB0);
                        }
                    } else if (strB0.length() != 0 && 'A' <= (cCharAt2 = strB0.charAt(0)) && cCharAt2 < '[') {
                        strB0 = Character.toLowerCase(cCharAt2) + strB0.substring(1);
                    }
                }
                if (n8a.m(strB0)) {
                    return n8a.h(strB0);
                }
            }
        }
        return null;
    }

    public static void s(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[6]) & 4294967295L;
        long j2 = (4553 * j) + (((long) iArr[0]) & 4294967295L);
        int i = (int) j2;
        iArr2[0] = i;
        long j3 = ((long) iArr[7]) & 4294967295L;
        long j4 = (4553 * j3) + j + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        int i2 = (int) j4;
        iArr2[1] = i2;
        long j5 = ((long) iArr[8]) & 4294967295L;
        long j6 = (4553 * j5) + j3 + (((long) iArr[2]) & 4294967295L) + (j4 >>> 32);
        int i3 = (int) j6;
        iArr2[2] = i3;
        long j7 = ((long) iArr[9]) & 4294967295L;
        long j8 = (4553 * j7) + j5 + (((long) iArr[3]) & 4294967295L) + (j6 >>> 32);
        int i4 = (int) j8;
        iArr2[3] = i4;
        long j9 = ((long) iArr[10]) & 4294967295L;
        long j10 = (4553 * j9) + j7 + (((long) iArr[4]) & 4294967295L) + (j8 >>> 32);
        iArr2[4] = (int) j10;
        long j11 = ((long) iArr[11]) & 4294967295L;
        long j12 = (4553 * j11) + j9 + (((long) iArr[5]) & 4294967295L) + (j10 >>> 32);
        iArr2[5] = (int) j12;
        long j13 = (j12 >>> 32) + j11;
        long j14 = j13 & 4294967295L;
        long j15 = (4553 * j14) + (((long) i) & 4294967295L);
        iArr2[0] = (int) j15;
        long j16 = j13 >>> 32;
        long j17 = (4553 * j16) + j14 + (((long) i2) & 4294967295L) + (j15 >>> 32);
        iArr2[1] = (int) j17;
        long j18 = j16 + (((long) i3) & 4294967295L) + (j17 >>> 32);
        iArr2[2] = (int) j18;
        long j19 = (j18 >>> 32) + (((long) i4) & 4294967295L);
        iArr2[3] = (int) j19;
        if (((j19 >>> 32) == 0 ? 0 : ka6.u0(6, 4, iArr2)) != 0 || (iArr2[5] == -1 && v1.c0(iArr2, X))) {
            ka6.I(6, 4553, iArr2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void t(int r11, int[] r12) {
        /*
            r0 = 6
            if (r11 == 0) goto L3c
            long r1 = (long) r11
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 4553(0x11c9, double:2.2495E-320)
            long r5 = r5 * r1
            r11 = 0
            r7 = r12[r11]
            long r7 = (long) r7
            long r7 = r7 & r3
            long r5 = r5 + r7
            int r7 = (int) r5
            r12[r11] = r7
            r7 = 32
            long r5 = r5 >>> r7
            r8 = 1
            r9 = r12[r8]
            long r9 = (long) r9
            long r9 = r9 & r3
            long r1 = r1 + r9
            long r1 = r1 + r5
            int r5 = (int) r1
            r12[r8] = r5
            long r1 = r1 >>> r7
            r5 = 2
            r6 = r12[r5]
            long r8 = (long) r6
            long r3 = r3 & r8
            long r1 = r1 + r3
            int r3 = (int) r1
            r12[r5] = r3
            long r1 = r1 >>> r7
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L35
            goto L3a
        L35:
            r11 = 3
            int r11 = defpackage.ka6.u0(r0, r11, r12)
        L3a:
            if (r11 != 0) goto L4a
        L3c:
            r11 = 5
            r11 = r12[r11]
            r1 = -1
            if (r11 != r1) goto L4f
            int[] r11 = defpackage.ygg.X
            boolean r11 = defpackage.v1.c0(r12, r11)
            if (r11 == 0) goto L4f
        L4a:
            r11 = 4553(0x11c9, float:6.38E-42)
            defpackage.ka6.I(r0, r11, r12)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygg.t(int, int[]):void");
    }

    public static final void u(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static LinkedHashSet v(n8a n8aVar, Collection collection, Collection collection2, t52 t52Var, sw4 sw4Var, ixa ixaVar, boolean z) {
        if (n8aVar == null) {
            a(12);
            throw null;
        }
        if (collection == null) {
            a(13);
            throw null;
        }
        if (t52Var == null) {
            a(15);
            throw null;
        }
        if (sw4Var == null) {
            a(16);
            throw null;
        }
        if (ixaVar == null) {
            a(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ixaVar.h(n8aVar, collection, collection2, t52Var, new wz3(sw4Var, linkedHashSet, z));
        return linkedHashSet;
    }

    public static LinkedHashSet w(n8a n8aVar, AbstractCollection abstractCollection, Collection collection, t52 t52Var, sw4 sw4Var, ixa ixaVar) {
        if (n8aVar == null) {
            a(0);
            throw null;
        }
        if (t52Var == null) {
            a(3);
            throw null;
        }
        if (sw4Var == null) {
            a(4);
            throw null;
        }
        if (ixaVar != null) {
            return v(n8aVar, abstractCollection, collection, t52Var, sw4Var, ixaVar, false);
        }
        a(5);
        throw null;
    }

    public static LinkedHashSet x(n8a n8aVar, Collection collection, AbstractCollection abstractCollection, ap8 ap8Var, sw4 sw4Var, ixa ixaVar) {
        if (n8aVar == null) {
            a(6);
            throw null;
        }
        if (collection == null) {
            a(7);
            throw null;
        }
        if (ap8Var == null) {
            a(9);
            throw null;
        }
        if (sw4Var == null) {
            a(10);
            throw null;
        }
        if (ixaVar != null) {
            return v(n8aVar, collection, abstractCollection, ap8Var, sw4Var, ixaVar, true);
        }
        a(11);
        throw null;
    }

    public static final void y(b bVar, Object obj, Function2 function2) {
        if (bVar.f() || !wl7.b(bVar.v(), obj)) {
            bVar.p(obj);
            bVar.b(obj, function2);
        }
    }

    public static void z(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        v1.o0(iArr, iArr3);
        s(iArr3, iArr2);
    }

    @Override // defpackage.hna
    public Object b() {
        return new TreeSet();
    }

    @Override // ad3.c
    public Iterable d(Object obj) {
        qf8<Object>[] qf8VarArr = rc8.h;
        return ((hv1) obj).a().m();
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 10:
                List<svh<?>> list = djh.a;
                return Long.valueOf(((ubi) vbi.b.zza()).zzp());
            case 11:
                List<svh<?>> list2 = djh.a;
                return Boolean.valueOf(((jei) eei.b.zza()).zzc());
            case 12:
                List<svh<?>> list3 = djh.a;
                return Boolean.valueOf(((uci) oci.b.zza()).zzd());
            default:
                List<svh<?>> list4 = djh.a;
                return Integer.valueOf((int) ((ubi) vbi.b.zza()).c());
        }
    }
}

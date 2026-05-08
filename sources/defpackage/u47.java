package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.sp7;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class u47 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[v47.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[w47.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr2;
        }
    }

    public static final void a(final e13 e13Var, final hee heeVar, final v47 v47Var, final w47 w47Var, final Function1 function1, final Function1 function12, final gu5 gu5Var, b bVar, final int i) {
        c cVar;
        int i2;
        int i3;
        int i4;
        List listA0;
        boolean z;
        e13Var.getClass();
        heeVar.getClass();
        v47Var.getClass();
        function1.getClass();
        gu5Var.getClass();
        c cVarH = bVar.h(385247877);
        int i5 = (cVarH.x(gu5Var) ? 1048576 : 524288) | i | (cVarH.x(e13Var) ? 4 : 2) | (cVarH.K(heeVar) ? 32 : 16) | (cVarH.d(v47Var.ordinal()) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.d(w47Var == null ? -1 : w47Var.ordinal()) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(function1) ? 16384 : 8192) | (cVarH.x(function12) ? 131072 : 65536);
        if (cVarH.o(i5 & 1, (599187 & i5) != 599186)) {
            Boolean boolValueOf = Boolean.valueOf(heeVar.c());
            int i6 = i5 & 112;
            int i7 = i5 & 896;
            boolean z2 = (i6 == 32) | (i7 == 256);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z2 || objV == c0020a) {
                objV = new s47(heeVar, v47Var, null);
                cVarH.p(objV);
            }
            to4.d(cVarH, boolValueOf, (Function2) objV);
            boolean zC = heeVar.c();
            int i8 = 3670016 & i5;
            boolean z3 = (i7 == 256) | (i8 == 1048576);
            Object objV2 = cVarH.v();
            if (z3 || objV2 == c0020a) {
                objV2 = new rr(6, v47Var, gu5Var);
                cVarH.p(objV2);
            }
            g71.a(zC, (gu5) objV2, cVarH, 0, 0);
            int iOrdinal = v47Var.ordinal();
            if (iOrdinal == 0) {
                i2 = 856070389;
                i3 = R.string.messaging_inbox_filters;
            } else {
                if (iOrdinal != 1) {
                    cVarH.L(856068118);
                    cVarH.U(false);
                    l.g();
                    return;
                }
                i2 = 856073967;
                i3 = R.string.messaging_options;
            }
            String strK = z3.k(cVarH, i2, i3, cVarH, false);
            int iOrdinal2 = v47Var.ordinal();
            if (iOrdinal2 == 0) {
                i4 = i7;
                cVarH.L(856081135);
                String strI = ak2.I(w47.DRAFTS.e(), cVarH);
                fv6 fv6Var = fv6.g3;
                int i9 = 57344 & i5;
                boolean z4 = (i9 == 16384) | (i8 == 1048576);
                Object objV3 = cVarH.v();
                if (z4 || objV3 == c0020a) {
                    objV3 = new oa0(3, gu5Var, function1);
                    cVarH.p(objV3);
                }
                ax6 ax6Var = new ax6(strI, (gu5) objV3, fv6Var, false, false, 500);
                String strI2 = ak2.I(w47.ARCHIVE.e(), cVarH);
                fv6 fv6Var2 = fv6.k0;
                boolean z5 = (i9 == 16384) | (i8 == 1048576);
                Object objV4 = cVarH.v();
                if (z5 || objV4 == c0020a) {
                    objV4 = new pa0(5, gu5Var, function1);
                    cVarH.p(objV4);
                }
                ax6 ax6Var2 = new ax6(strI2, (gu5) objV4, fv6Var2, false, false, 500);
                String strI3 = ak2.I(w47.SPAM.e(), cVarH);
                fv6 fv6Var3 = fv6.c9;
                boolean z6 = (i9 == 16384) | (i8 == 1048576);
                Object objV5 = cVarH.v();
                if (z6 || objV5 == c0020a) {
                    objV5 = new qe(5, gu5Var, function1);
                    cVarH.p(objV5);
                }
                listA0 = u63.a0(ax6Var, ax6Var2, new ax6(strI3, (gu5) objV5, fv6Var3, false, false, 500));
                z = false;
                cVarH.U(false);
            } else {
                if (iOrdinal2 != 1) {
                    cVarH.L(856079827);
                    cVarH.U(false);
                    l.g();
                    return;
                }
                cVarH.L(856124209);
                int[] iArr = a.a;
                String strI4 = ak2.I(iArr[w47Var.ordinal()] == 1 ? R.string.messaging_archive : R.string.messaging_restore, cVarH);
                fv6 fv6Var4 = iArr[w47Var.ordinal()] == 1 ? fv6.k0 : fv6.e8;
                boolean zX = cVarH.x(e13Var) | (i6 == 32) | ((i5 & 7168) == 2048) | ((458752 & i5) == 131072);
                Object objV6 = cVarH.v();
                if (zX || objV6 == c0020a) {
                    i4 = i7;
                    xm2 xm2Var = new xm2(e13Var, w47Var, function12, heeVar, 1);
                    cVarH.p(xm2Var);
                    objV6 = xm2Var;
                } else {
                    i4 = i7;
                }
                listA0 = u63.Z(new ax6(strI4, (gu5) objV6, fv6Var4, false, false, 500));
                z = false;
                cVarH.U(false);
            }
            List list = listA0;
            boolean z7 = (i4 == 256 ? true : z) | (i8 == 1048576 ? true : z);
            Object objV7 = cVarH.v();
            if (z7 || objV7 == c0020a) {
                objV7 = new ti(5, v47Var, gu5Var);
                cVarH.p(objV7);
            }
            cVar = cVarH;
            ok1.a(heeVar, strK, list, "InboxBottomSheet", (gu5) objV7, cVar, ((i5 >> 3) & 14) | 3072);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(heeVar, v47Var, w47Var, function1, function12, gu5Var, i) { // from class: r47
                public final /* synthetic */ gu5 V;
                public final /* synthetic */ hee b;
                public final /* synthetic */ v47 c;
                public final /* synthetic */ w47 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function1 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    u47.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(v47 v47Var, gu5<j6g> gu5Var) {
        int iOrdinal = v47Var.ordinal();
        if (iOrdinal == 0) {
            ((tp7) cr8.p(tp7.class)).b(new sp7.b("messagingArchiveSpamFilterBanner", "messagingArchiveSpamFilterDismiss", null, null, 12));
        } else if (iOrdinal != 1) {
            l.g();
            return;
        }
        gu5Var.invoke();
    }
}

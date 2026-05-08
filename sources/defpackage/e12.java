package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class e12 {

    public static final class a implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public a(List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final class b implements xu5<xo8, Integer, androidx.compose.runtime.b, Integer, j6g> {
        public final /* synthetic */ List a;
        public final /* synthetic */ i12 b;
        public final /* synthetic */ Function1 c;
        public final /* synthetic */ Function2 d;

        public b(List list, i12 i12Var, Function1 function1, Function2 function2) {
            this.a = list;
            this.b = i12Var;
            this.c = function1;
            this.d = function2;
        }

        @Override // defpackage.xu5
        public final j6g j(xo8 xo8Var, Integer num, androidx.compose.runtime.b bVar, Integer num2) {
            int i;
            xo8 xo8Var2 = xo8Var;
            int iIntValue = num.intValue();
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i = (bVar2.K(xo8Var2) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= bVar2.d(iIntValue) ? 32 : 16;
            }
            if (bVar2.o(i & 1, (i & 147) != 146)) {
                n97 n97Var = (n97) this.a.get(iIntValue);
                bVar2.L(338249411);
                i12 i12Var = this.b;
                t02.a(n97Var, i12Var.b, i12Var.c, i12Var.d, this.c, this.d, iIntValue, bVar2, ((i & 126) << 15) & 3670016);
                m02.a(null, 0.5f, bVar2, 48, 1);
                bVar2.F();
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final void a(final gza gzaVar, final i12 i12Var, final Function1<? super String, j6g> function1, final gu5<j6g> gu5Var, final Function1<? super n97, j6g> function12, final Function2<? super String, ? super String, j6g> function2, androidx.compose.runtime.b bVar, final int i) {
        int i2;
        c cVar;
        c cVarH = bVar.h(-1120970267);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(gzaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(i12Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(function1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(function12) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.x(function2) ? 131072 : 65536;
        }
        if (cVarH.o(i2 & 1, (73875 & i2) != 73874)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            cVar = cVarH;
            m0f.a(null, null, o97Var.c.b.a, 0L, null, 0.0f, bh2.c(-1570774487, new w9(gzaVar, o97Var, i12Var, function1, function12, function2), cVarH), cVar, 1572864, 59);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: c12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    e12.a(gzaVar, i12Var, function1, gu5Var, function12, function2, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(final i12 i12Var, final gu5 gu5Var, final Function1 function1, final gu5 gu5Var2, final Function1 function12, final Function2 function2, final dx4 dx4Var, final gu5 gu5Var3, final gu5 gu5Var4, final boolean z, final gu5 gu5Var5, androidx.compose.runtime.b bVar, final int i) {
        c cVar;
        i12Var.getClass();
        gu5Var.getClass();
        function1.getClass();
        gu5Var2.getClass();
        function12.getClass();
        function2.getClass();
        dx4Var.getClass();
        gu5Var3.getClass();
        gu5Var4.getClass();
        gu5Var5.getClass();
        c cVarH = bVar.h(339086613);
        int i2 = i | (cVarH.x(i12Var) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.x(function1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(function12) ? 16384 : 8192) | (cVarH.x(function2) ? 131072 : 65536) | (cVarH.x(dx4Var) ? 1048576 : 524288) | (cVarH.x(gu5Var3) ? 8388608 : 4194304) | (cVarH.x(gu5Var4) ? 67108864 : 33554432) | (cVarH.a(z) ? 536870912 : 268435456);
        int i3 = cVarH.x(gu5Var5) ? 4 : 2;
        byte b2 = 0;
        if (cVarH.o(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 3) == 2) ? false : true)) {
            dmd.a(g.d(e.a.b, 1.0f), bh2.c(1029056473, new y02(gu5Var, b2, b2), cVarH), null, null, null, 0, 0L, 0L, null, bh2.c(1996025636, new wu5() { // from class: a12
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    gza gzaVar = (gza) obj;
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    gzaVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= bVar2.K(gzaVar) ? 4 : 2;
                    }
                    if (bVar2.o(iIntValue & 1, (iIntValue & 19) != 18)) {
                        i12 i12Var2 = i12Var;
                        int iOrdinal = i12Var2.g.ordinal();
                        if (iOrdinal == 0) {
                            bVar2.L(-221944295);
                            e12.a(gzaVar, i12Var2, function1, gu5Var2, function12, function2, bVar2, iIntValue & 14);
                            bVar2.F();
                        } else if (iOrdinal == 1) {
                            bVar2.L(-222384216);
                            bxg.a(0, bVar2);
                            bVar2.F();
                        } else {
                            if (iOrdinal != 2) {
                                bVar2.L(-1669743341);
                                bVar2.F();
                                l.g();
                                return null;
                            }
                            bVar2.L(-222279653);
                            gu5 gu5Var6 = gu5Var3;
                            boolean zK = bVar2.K(gu5Var6);
                            Object objV = bVar2.v();
                            b.a.C0020a c0020a = b.a.a;
                            if (zK || objV == c0020a) {
                                objV = new ld(5, gu5Var6);
                                bVar2.p(objV);
                            }
                            gu5 gu5Var7 = (gu5) objV;
                            gu5 gu5Var8 = gu5Var4;
                            boolean zK2 = bVar2.K(gu5Var8);
                            Object objV2 = bVar2.v();
                            if (zK2 || objV2 == c0020a) {
                                objV2 = new u9(4, gu5Var8);
                                bVar2.p(objV2);
                            }
                            gu5 gu5Var9 = (gu5) objV2;
                            gu5 gu5Var10 = gu5Var;
                            boolean zK3 = bVar2.K(gu5Var10);
                            Object objV3 = bVar2.v();
                            if (zK3 || objV3 == c0020a) {
                                objV3 = new vr(1, gu5Var10);
                                bVar2.p(objV3);
                            }
                            kl6.c(dx4Var, gu5Var7, gu5Var9, (gu5) objV3, false, bVar2, 0, 16);
                            bVar2.F();
                        }
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, 805306422, 508);
            cVar = cVarH;
            if (z) {
                cVar.L(-32165551);
                tz6.a(((i3 << 21) & 29360128) | 390, 888, null, gu5Var5, fv6.q4, cVar, null, ak2.I(R.string.failed_to_find_email_app, cVar), null, null, null, true);
            } else {
                cVar.L(-35620563);
            }
            cVar.U(false);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(gu5Var, function1, gu5Var2, function12, function2, dx4Var, gu5Var3, gu5Var4, z, gu5Var5, i) { // from class: b12
                public final /* synthetic */ dx4 V;
                public final /* synthetic */ gu5 W;
                public final /* synthetic */ gu5 X;
                public final /* synthetic */ boolean Y;
                public final /* synthetic */ gu5 Z;
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function2 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    e12.b(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X, this.Y, this.Z, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}

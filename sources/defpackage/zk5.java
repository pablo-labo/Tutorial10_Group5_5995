package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.w;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.k73;
import defpackage.pm8;
import defpackage.vs0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zk5 {
    public static final /* synthetic */ int a = 0;

    static {
        int i = k73.a;
        new k73.e(c20.a.j);
        new k73.c(c20.a.m);
    }

    public static final void a(e eVar, vs0.e eVar2, vs0.l lVar, c20.c cVar, int i, int i2, final ah2 ah2Var, b bVar, final int i3, final int i4) {
        int i5;
        final e eVar3;
        final vs0.e eVar4;
        final vs0.l lVar2;
        final int i6;
        c cVar2;
        final int i7;
        c cVarH = bVar.h(-1303174015);
        int i8 = i4 & 1;
        if (i8 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (cVarH.K(eVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i9 = i4 & 2;
        if (i9 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= cVarH.K(eVar2) ? 32 : 16;
        }
        int i10 = i4 & 4;
        if (i10 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= cVarH.K(lVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        int i11 = i5 | 224256;
        if (cVarH.o(i11 & 1, (599187 & i11) != 599186)) {
            if (i8 != 0) {
                eVar = e.a.b;
            }
            if (i9 != 0) {
                eVar2 = vs0.a;
            }
            eVar4 = eVar2;
            if (i10 != 0) {
                lVar = vs0.c;
            }
            lVar2 = lVar;
            int i12 = (i11 & 14) | 1572864 | (i11 & 112) | (i11 & 896) | 12807168;
            eVar3 = eVar;
            b(eVar3, eVar4, lVar2, hl5.b, ah2Var, cVarH, i12);
            cVar = c20.a.j;
            i6 = Integer.MAX_VALUE;
            cVar2 = cVarH;
            i7 = Integer.MAX_VALUE;
        } else {
            cVarH.D();
            eVar3 = eVar;
            eVar4 = eVar2;
            lVar2 = lVar;
            i6 = i;
            cVar2 = cVarH;
            i7 = i2;
        }
        final c20.c cVar3 = cVar;
        i iVarW = cVar2.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: xk5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zk5.a(eVar3, eVar4, lVar2, cVar3, i6, i7, ah2Var, (b) obj, ka2.L(i3 | 1), i4);
                    return j6g.a;
                }
            };
        }
    }

    @sy3
    public static final void b(e eVar, vs0.e eVar2, vs0.l lVar, hl5 hl5Var, ah2 ah2Var, b bVar, int i) {
        int i2;
        int i3;
        c cVarH = bVar.h(-1956591841);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(eVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.K(lVar) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        int i4 = i & 3072;
        af1.b bVar2 = c20.a.j;
        if (i4 == 0) {
            i2 |= cVarH.K(bVar2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.d(Integer.MAX_VALUE) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.d(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= cVarH.K(hl5Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= cVarH.x(ah2Var) ? 8388608 : 4194304;
        }
        int i5 = i2;
        if (cVarH.o(i5 & 1, (i5 & 4793491) != 4793490)) {
            int i6 = i5 & 3670016;
            boolean z = i6 == 1048576;
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z || objV == c0020a) {
                objV = new bl5(hl5Var.a);
                cVarH.p(objV);
            }
            bl5 bl5Var = (bl5) objV;
            int i7 = i5 >> 3;
            boolean zK = ((((i7 & 14) ^ 6) > 4 && cVarH.K(eVar2)) || (i7 & 6) == 4) | ((((i7 & 112) ^ 48) > 32 && cVarH.K(lVar)) || (i7 & 48) == 32) | ((((i7 & 896) ^ 384) > 256 && cVarH.K(bVar2)) || (i7 & 384) == 256) | ((((i7 & 7168) ^ 3072) > 2048 && cVarH.d(Integer.MAX_VALUE)) || (i7 & 3072) == 2048) | ((((57344 & i7) ^ 24576) > 16384 && cVarH.d(Integer.MAX_VALUE)) || (i7 & 24576) == 16384) | cVarH.K(bl5Var);
            Object objV2 = cVarH.v();
            if (zK || objV2 == c0020a) {
                float fA = eVar2.a();
                int i8 = k73.a;
                i3 = i6;
                gl5 gl5Var = new gl5(eVar2, lVar, fA, new k73.e(bVar2), lVar.a(), bl5Var);
                cVarH.p(gl5Var);
                objV2 = gl5Var;
            } else {
                i3 = i6;
            }
            gl5 gl5Var2 = (gl5) objV2;
            boolean z2 = (i3 == 1048576) | ((i5 & 29360128) == 8388608) | ((i5 & 458752) == 131072);
            Object objV3 = cVarH.v();
            Object obj = objV3;
            if (z2 || objV3 == c0020a) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new ah2(-1192950673, new yk5(ah2Var), true));
                hl5Var.getClass();
                hl5Var.a.ordinal();
                cVarH.p(arrayList);
                obj = arrayList;
            }
            ah2 ah2Var2 = new ah2(1271844412, new em8((List) obj), true);
            boolean zK2 = cVarH.K(gl5Var2);
            Object objV4 = cVarH.v();
            if (zK2 || objV4 == c0020a) {
                objV4 = new i1a(gl5Var2);
                cVarH.p(objV4);
            }
            ag9 ag9Var = (ag9) objV4;
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVar);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9Var, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            ah2Var2.invoke(cVarH, 0);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new k72(eVar, eVar2, lVar, hl5Var, ah2Var, i);
        }
    }

    public static final void c(vf9 vf9Var, gl5 gl5Var, long j, Function1 function1) {
        if (q92.n(q92.l(vf9Var)) != 0.0f) {
            vf9Var.K(vf9Var.O(Integer.MAX_VALUE));
            return;
        }
        q92.l(vf9Var);
        w wVarR = vf9Var.R(j);
        function1.invoke(wVarR);
        gl5Var.g(wVarR);
        gl5Var.j(wVarR);
    }
}

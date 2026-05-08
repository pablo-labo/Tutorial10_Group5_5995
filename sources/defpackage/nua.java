package defpackage;

import androidx.compose.runtime.i;
import androidx.compose.runtime.n;
import defpackage.wua;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class nua {
    public final int a;
    public final int b;

    public static final class a extends nua {
        public static final a c = new a(1, 0, 2);

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            nVar.a(aVar.a(0));
        }
    }

    public static final class a0 extends nua {
        public static final a0 c;

        static {
            int i = 1;
            c = new a0(0, i, i);
        }

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            b0dVar.g.b((gu5) aVar.b(0));
        }
    }

    public static final class b extends nua {
        public static final b c = new b(0, 2, 1);

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            x20 x20Var = (x20) aVar.b(0);
            Object objB = aVar.b(1);
            if (objB instanceof l0d) {
                b0dVar.h((l0d) objB);
            }
            if (nVar.n != 0) {
                androidx.compose.runtime.d.c("Can only append a slot if not current inserting");
            }
            int i = nVar.i;
            int i2 = nVar.j;
            int iC = nVar.c(x20Var);
            int iG = nVar.g(nVar.r(iC + 1), nVar.b);
            nVar.i = iG;
            nVar.j = iG;
            nVar.w(1, iC);
            if (i >= iG) {
                i++;
                i2++;
            }
            nVar.c[iG] = objB;
            nVar.i = i;
            nVar.j = i2;
        }
    }

    public static final class b0 extends nua {
        public static final b0 c;

        static {
            int i = 0;
            c = new b0(i, i, 3);
        }

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            nVar.N();
        }
    }

    public static final class c extends nua {
        public static final c c = new c(0, 2, 1);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            qh7 qh7Var = (qh7) aVar.b(1);
            int i = qh7Var != null ? qh7Var.a : 0;
            q12 q12Var = (q12) aVar.b(0);
            if (i > 0) {
                nr0Var = new poa(nr0Var, i);
            }
            q12Var.J1(nr0Var, nVar, b0dVar, tuaVar != null ? new ou7(tuaVar, nVar) : null);
        }
    }

    public static final class c0 extends nua {
        public static final c0 c;

        static {
            int i = 1;
            c = new c0(0, i, i);
        }

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            androidx.compose.runtime.i iVar = (androidx.compose.runtime.i) aVar.b(0);
            z3a<androidx.compose.runtime.i, t6b> z3aVar = b0dVar.i;
            t6b t6bVarD = z3aVar != null ? z3aVar.d(iVar) : null;
            if (t6bVarD != null) {
                ArrayList arrayList = b0dVar.j;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    b0dVar.j = arrayList;
                }
                arrayList.add(b0dVar.e);
                b0dVar.e = t6bVarD.b;
            }
        }
    }

    public static final class d extends nua {
        public static final d c = new d(0, 2, 1);

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            int i = ((qh7) aVar.b(0)).a;
            List list = (List) aVar.b(1);
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                int i3 = i + i2;
                nr0Var.l(i3, obj);
                nr0Var.g(i3, obj);
            }
        }
    }

    public static final class d0 extends nua {
        public static final d0 c = new d0(1, 0, 2);

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            int iA = aVar.a(0);
            int i = nVar.v;
            int iO = nVar.O(nVar.r(i), nVar.b);
            int iG = nVar.g(nVar.r(i + 1), nVar.b);
            for (int iMax = Math.max(iO, iG - iA); iMax < iG; iMax++) {
                Object obj = nVar.c[nVar.h(iMax)];
                if (obj instanceof l0d) {
                    b0dVar.e((l0d) obj);
                } else if (obj instanceof androidx.compose.runtime.i) {
                    ((androidx.compose.runtime.i) obj).c();
                }
            }
            if (iA <= 0) {
                androidx.compose.runtime.d.c("Check failed");
            }
            int i2 = nVar.v;
            int iO2 = nVar.O(nVar.r(i2), nVar.b);
            int iG2 = nVar.g(nVar.r(i2 + 1), nVar.b) - iA;
            if (iG2 < iO2) {
                androidx.compose.runtime.d.c("Check failed");
            }
            nVar.K(iG2, iA, i2);
            int i3 = nVar.i;
            if (i3 >= iO2) {
                nVar.i = i3 - iA;
            }
        }
    }

    public static final class e extends nua {
        public static final e c = new e(0, 4, 1);

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            q0a q0aVar = (q0a) aVar.b(2);
            q0a q0aVar2 = (q0a) aVar.b(3);
            dm2 dm2Var = (dm2) aVar.b(1);
            p0a p0aVarN = (p0a) aVar.b(0);
            if (p0aVarN == null && (p0aVarN = dm2Var.n(q0aVar)) == null) {
                androidx.compose.runtime.d.d("Could not resolve state for movable content");
                r40.e();
                return;
            }
            androidx.compose.runtime.m mVar = p0aVarN.a;
            if (nVar.n > 0 || nVar.t(nVar.t + 1) != 1) {
                androidx.compose.runtime.d.c("Check failed");
            }
            int i = nVar.t;
            int i2 = nVar.i;
            int i3 = nVar.j;
            nVar.a(1);
            nVar.Q();
            nVar.d();
            androidx.compose.runtime.n nVarF = mVar.f();
            try {
                List listA = n.a.a(nVarF, 2, nVar, false, true, true);
                nVarF.e(true);
                nVar.k();
                nVar.j();
                nVar.t = i;
                nVar.i = i2;
                nVar.j = i3;
                i.a.a(nVar, listA, (wsc) q0aVar2.c);
            } catch (Throwable th) {
                nVarF.e(false);
                throw th;
            }
        }
    }

    public static final class e0 extends nua {
        public static final e0 c = new e0(1, 2);

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            Object objB = aVar.b(0);
            x20 x20Var = (x20) aVar.b(1);
            int iA = aVar.a(0);
            if (objB instanceof l0d) {
                b0dVar.h((l0d) objB);
            }
            Object objL = nVar.L(objB, nVar.c(x20Var), iA);
            if (objL instanceof l0d) {
                b0dVar.e((l0d) objL);
            } else if (objL instanceof androidx.compose.runtime.i) {
                ((androidx.compose.runtime.i) objL).c();
            }
        }
    }

    public static final class f extends nua {
        public static final f c;

        static {
            int i = 0;
            c = new f(i, i, 3);
        }

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            nVar.n(nVar.t, new n91(1, b0dVar, nVar));
        }
    }

    public static final class f0 extends nua {
        public static final f0 c;

        static {
            int i = 1;
            c = new f0(0, i, i);
        }

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            nVar.U(aVar.b(0));
        }
    }

    public static final class g extends nua {
        public static final g c = new g(0, 2, 1);

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            int i;
            qh7 qh7Var = (qh7) aVar.b(0);
            int iC = nVar.c((x20) aVar.b(1));
            if (nVar.t >= iC) {
                androidx.compose.runtime.d.c("Check failed");
            }
            ygg.q(nVar, nr0Var, iC);
            int i2 = nVar.t;
            int iF = nVar.v;
            while (iF >= 0 && !nVar.x(iF)) {
                iF = nVar.F(iF, nVar.b);
            }
            int iT = iF + 1;
            int iM = 0;
            while (iT < i2) {
                if (nVar.u(i2, iT)) {
                    if (nVar.x(iT)) {
                        iM = 0;
                    }
                    iT++;
                } else {
                    iM += nVar.x(iT) ? 1 : nVar.E(iT);
                    iT += nVar.t(iT);
                }
            }
            while (true) {
                i = nVar.t;
                if (i >= iC) {
                    break;
                }
                if (nVar.u(iC, i)) {
                    int i3 = nVar.t;
                    if (i3 < nVar.u && (nVar.b[(nVar.r(i3) * 5) + 1] & 1073741824) != 0) {
                        nr0Var.m(nVar.D(nVar.t));
                        iM = 0;
                    }
                    nVar.Q();
                } else {
                    iM += nVar.M();
                }
            }
            if (i != iC) {
                androidx.compose.runtime.d.c("Check failed");
            }
            qh7Var.a = iM;
        }
    }

    public static final class g0 extends nua {
        public static final g0 c = new g0(0, 2, 1);

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            nr0Var.b(aVar.b(0), (Function2) aVar.b(1));
        }
    }

    public static final class h extends nua {
        public static final h c;

        static {
            int i = 1;
            c = new h(0, i, i);
        }

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            for (Object obj : (Object[]) aVar.b(0)) {
                nr0Var.m(obj);
            }
        }
    }

    public static final class h0 extends nua {
        public static final h0 c = new h0(1, 1);

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            Object objB = aVar.b(0);
            int iA = aVar.a(0);
            if (objB instanceof l0d) {
                b0dVar.h((l0d) objB);
            }
            Object objL = nVar.L(objB, nVar.t, iA);
            if (objL instanceof l0d) {
                b0dVar.e((l0d) objL);
            } else if (objL instanceof androidx.compose.runtime.i) {
                ((androidx.compose.runtime.i) objL).c();
            }
        }
    }

    public static final class i extends nua {
        public static final i c = new i(0, 2, 1);

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            ((Function1) aVar.b(0)).invoke((cm2) aVar.b(1));
        }
    }

    public static final class i0 extends nua {
        public static final i0 c = new i0(1, 0, 2);

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            int iA = aVar.a(0);
            for (int i = 0; i < iA; i++) {
                nr0Var.p();
            }
        }
    }

    public static final class j extends nua {
        public static final j c;

        static {
            int i = 0;
            c = new j(i, i, 3);
        }

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            nVar.j();
        }
    }

    public static final class j0 extends nua {
        public static final j0 c;

        static {
            int i = 0;
            c = new j0(i, i, 3);
        }

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            nr0Var.n();
        }
    }

    public static final class k extends nua {
        public static final k c;

        static {
            int i = 0;
            c = new k(i, i, 3);
        }

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            ygg.q(nVar, nr0Var, 0);
            nVar.j();
        }
    }

    public static final class l extends nua {
        public static final l c;

        static {
            int i = 1;
            c = new l(0, i, i);
        }

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            j4a<l0d> j4aVar;
            androidx.compose.runtime.i iVar = (androidx.compose.runtime.i) aVar.b(0);
            z3a<androidx.compose.runtime.i, t6b> z3aVar = b0dVar.i;
            if (z3aVar == null || z3aVar.d(iVar) == null) {
                return;
            }
            ArrayList arrayList = b0dVar.j;
            if (arrayList != null && (j4aVar = (j4a) arrayList.remove(arrayList.size() - 1)) != null) {
                b0dVar.e = j4aVar;
            }
            z3aVar.k(iVar);
        }
    }

    public static final class m extends nua {
        public static final m c;

        static {
            int i = 1;
            c = new m(0, i, i);
        }

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            x20 x20Var = (x20) aVar.b(0);
            x20Var.getClass();
            nVar.l(nVar.c(x20Var));
        }
    }

    public static final class n extends nua {
        public static final n c;

        static {
            int i = 0;
            c = new n(i, i, 3);
        }

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            nVar.l(0);
        }
    }

    public static final class o extends nua {
        public static final o c = new o(1, 2);

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            Object objInvoke = ((gu5) aVar.b(0)).invoke();
            x20 x20Var = (x20) aVar.b(1);
            int iA = aVar.a(0);
            x20Var.getClass();
            nVar.W(nVar.c(x20Var), objInvoke);
            nr0Var.g(iA, objInvoke);
            nr0Var.m(objInvoke);
        }

        @Override // defpackage.nua
        public final x20 b(wua.a aVar) {
            return (x20) aVar.b(1);
        }
    }

    public static final class p extends nua {
        public static final p c = new p(0, 2, 1);

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            androidx.compose.runtime.m mVar = (androidx.compose.runtime.m) aVar.b(1);
            x20 x20Var = (x20) aVar.b(0);
            nVar.d();
            x20Var.getClass();
            nVar.z(mVar, mVar.a(x20Var));
            nVar.k();
        }
    }

    public static final class q extends nua {
        public static final q c = new q(0, 3, 1);

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            ou7 ou7Var;
            androidx.compose.runtime.m mVar = (androidx.compose.runtime.m) aVar.b(1);
            x20 x20Var = (x20) aVar.b(0);
            tg5 tg5Var = (tg5) aVar.b(2);
            androidx.compose.runtime.n nVarF = mVar.f();
            if (tuaVar != null) {
                try {
                    ou7Var = new ou7(tuaVar, nVar);
                } catch (Throwable th) {
                    nVarF.e(false);
                    throw th;
                }
            } else {
                ou7Var = null;
            }
            if (!tg5Var.e.L1()) {
                androidx.compose.runtime.d.c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
            }
            tg5Var.d.K1(nr0Var, nVarF, b0dVar, ou7Var);
            j6g j6gVar = j6g.a;
            nVarF.e(true);
            nVar.d();
            x20Var.getClass();
            nVar.z(mVar, mVar.a(x20Var));
            nVar.k();
        }
    }

    public static final class r extends nua {
        public static final r c = new r(1, 0, 2);

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            int[] iArr;
            x20 x20Var;
            int iC;
            int iA = aVar.a(0);
            if (nVar.n != 0) {
                androidx.compose.runtime.d.c("Cannot move a group while inserting");
            }
            if (iA < 0) {
                androidx.compose.runtime.d.c("Parameter offset is out of bounds");
            }
            if (iA == 0) {
                return;
            }
            int i = nVar.t;
            int i2 = nVar.v;
            int i3 = nVar.u;
            int i4 = i;
            while (true) {
                iArr = nVar.b;
                if (iA <= 0) {
                    break;
                }
                i4 += iArr[(nVar.r(i4) * 5) + 3];
                if (i4 > i3) {
                    androidx.compose.runtime.d.c("Parameter offset is out of bounds");
                }
                iA--;
            }
            int i5 = iArr[(nVar.r(i4) * 5) + 3];
            int iG = nVar.g(nVar.r(nVar.t), nVar.b);
            int iG2 = nVar.g(nVar.r(i4), nVar.b);
            int i6 = i4 + i5;
            int iG3 = nVar.g(nVar.r(i6), nVar.b);
            int i7 = iG3 - iG2;
            nVar.w(i7, Math.max(nVar.t - 1, 0));
            nVar.v(i5);
            int[] iArr2 = nVar.b;
            int iR = nVar.r(i6) * 5;
            pyd.h(nVar.r(i) * 5, iR, (i5 * 5) + iR, iArr2, iArr2);
            if (i7 > 0) {
                Object[] objArr = nVar.c;
                int iH = nVar.h(iG2 + i7);
                System.arraycopy(objArr, iH, objArr, iG, nVar.h(iG3 + i7) - iH);
            }
            int i8 = iG2 + i7;
            int i9 = i8 - iG;
            int i10 = nVar.k;
            int i11 = nVar.l;
            int length = nVar.c.length;
            int i12 = nVar.m;
            int i13 = i + i5;
            int i14 = i;
            while (i14 < i13) {
                int iR2 = nVar.r(i14);
                int i15 = i9;
                int[] iArr3 = iArr2;
                iArr3[(iR2 * 5) + 4] = androidx.compose.runtime.n.i(androidx.compose.runtime.n.i(nVar.g(iR2, iArr2) - i15, i12 < iR2 ? 0 : i10, i11, length), nVar.k, nVar.l, nVar.c.length);
                i14++;
                i9 = i15;
                iArr2 = iArr3;
                i10 = i10;
            }
            int i16 = i6 + i5;
            int iP = nVar.p();
            int iA2 = gke.a(nVar.d, i6, iP);
            ArrayList arrayList = new ArrayList();
            if (iA2 >= 0) {
                while (iA2 < nVar.d.size() && (iC = nVar.c((x20Var = nVar.d.get(iA2)))) >= i6 && iC < i16) {
                    arrayList.add(x20Var);
                    nVar.d.remove(iA2);
                }
            }
            int i17 = i - i6;
            int size = arrayList.size();
            for (int i18 = 0; i18 < size; i18++) {
                x20 x20Var2 = (x20) arrayList.get(i18);
                int iC2 = nVar.c(x20Var2) + i17;
                if (iC2 >= nVar.g) {
                    x20Var2.a = -(iP - iC2);
                } else {
                    x20Var2.a = iC2;
                }
                nVar.d.add(gke.a(nVar.d, iC2, iP), x20Var2);
            }
            if (nVar.J(i6, i5)) {
                androidx.compose.runtime.d.c("Unexpectedly removed anchors");
            }
            nVar.m(i2, nVar.u, i);
            if (i7 > 0) {
                nVar.K(i8, i7, i6 - 1);
            }
        }
    }

    public static final class s extends nua {
        public static final s c = new s(3, 0, 2);

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            nr0Var.e(aVar.a(0), aVar.a(1), aVar.a(2));
        }
    }

    public static final class t extends nua {
        public static final t c = new t(1, 1);

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            x20 x20Var = (x20) aVar.b(0);
            int iA = aVar.a(0);
            nr0Var.p();
            x20Var.getClass();
            nr0Var.l(iA, nVar.D(nVar.c(x20Var)));
        }

        @Override // defpackage.nua
        public final x20 b(wua.a aVar) {
            return (x20) aVar.b(0);
        }
    }

    public static final class u extends nua {
        public static final u c = new u(0, 3, 1);

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            su2 su2Var = (su2) aVar.b(0);
            q0a q0aVar = (q0a) aVar.b(2);
            ((dm2) aVar.b(1)).m(q0aVar, androidx.compose.runtime.d.e(su2Var, q0aVar, nVar, null), nr0Var);
        }
    }

    public static final class v extends nua {
        public static final v c;

        static {
            int i = 1;
            c = new v(0, i, i);
        }

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            b0dVar.h((l0d) aVar.b(0));
        }
    }

    public static final class w extends nua {
        public static final w c;

        static {
            int i = 1;
            c = new w(0, i, i);
        }

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            androidx.compose.runtime.i iVar = (androidx.compose.runtime.i) aVar.b(0);
            Set<k0d> set = b0dVar.a;
            if (set == null) {
                return;
            }
            t6b t6bVar = new t6b(set);
            z3a<androidx.compose.runtime.i, t6b> z3aVarB = b0dVar.i;
            if (z3aVarB == null) {
                z3aVarB = lnd.b();
                b0dVar.i = z3aVarB;
            }
            z3aVarB.m(iVar, t6bVar);
            b0dVar.e.b(new l0d(t6bVar, null));
        }
    }

    public static final class x extends nua {
        public static final x c;

        static {
            int i = 0;
            c = new x(i, i, 3);
        }

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            nVar.n(nVar.t, new kh(b0dVar, 1));
            nVar.I();
        }
    }

    public static final class y extends nua {
        public static final y c;

        static {
            int i = 2;
            c = new y(i, 0, i);
        }

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            nr0Var.f(aVar.a(0), aVar.a(1));
        }
    }

    public static final class z extends nua {
        public static final z c;

        static {
            int i = 0;
            c = new z(i, i, 3);
        }

        @Override // defpackage.nua
        public final void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar) {
            if (nVar.n != 0) {
                androidx.compose.runtime.d.c("Cannot reset when inserting");
            }
            nVar.H();
            nVar.t = 0;
            nVar.u = nVar.o() - nVar.h;
            nVar.i = 0;
            nVar.j = 0;
            nVar.o = 0;
        }
    }

    public /* synthetic */ nua(int i2, int i3, int i4) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3);
    }

    public abstract void a(wua.a aVar, nr0 nr0Var, androidx.compose.runtime.n nVar, b0d b0dVar, tua tuaVar);

    public x20 b(wua.a aVar) {
        return null;
    }

    public final String toString() {
        String strR = fwc.a.b(getClass()).r();
        return strR == null ? "" : strR;
    }

    public nua(int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }
}

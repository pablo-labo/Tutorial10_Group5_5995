package defpackage;

import defpackage.ere;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public interface s62 extends fyf {

    public static final class a {
        public static boolean A(zi8 zi8Var) {
            zi8Var.getClass();
            if (zi8Var instanceof ui8) {
                return pnb.D((ui8) zi8Var);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(zi8Var);
            sb.append(", ");
            h5.k(ia.m(fwc.a, zi8Var.getClass(), sb));
            return false;
        }

        public static boolean B(lwf lwfVar) {
            lwfVar.getClass();
            if (lwfVar instanceof kwf) {
                v62 v62VarD = ((kwf) lwfVar).d();
                t52 t52Var = v62VarD instanceof t52 ? (t52) v62VarD : null;
                return (t52Var != null ? t52Var.U() : null) instanceof ee7;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(lwfVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, lwfVar.getClass(), sb));
            return false;
        }

        public static boolean C(lwf lwfVar) {
            lwfVar.getClass();
            if (lwfVar instanceof kwf) {
                return lwfVar instanceof zh7;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(lwfVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, lwfVar.getClass(), sb));
            return false;
        }

        public static boolean D(lwf lwfVar) {
            lwfVar.getClass();
            if (lwfVar instanceof kwf) {
                return lwfVar instanceof kj7;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(lwfVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, lwfVar.getClass(), sb));
            return false;
        }

        public static boolean E(zi8 zi8Var) {
            zi8Var.getClass();
            return (zi8Var instanceof mge) && ((mge) zi8Var).N0();
        }

        public static boolean F(lwf lwfVar) {
            lwfVar.getClass();
            if (lwfVar instanceof kwf) {
                return ei8.J((kwf) lwfVar, ere.a.b);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(lwfVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, lwfVar.getClass(), sb));
            return false;
        }

        public static boolean G(zi8 zi8Var) {
            zi8Var.getClass();
            if (zi8Var instanceof ui8) {
                return kyf.e((ui8) zi8Var);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(zi8Var);
            sb.append(", ");
            h5.k(ia.m(fwc.a, zi8Var.getClass(), sb));
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean H(oge ogeVar) {
            if (ogeVar instanceof ui8) {
                return ei8.H((ui8) ogeVar);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(ogeVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, ogeVar.getClass(), sb));
            return false;
        }

        public static boolean I(px1 px1Var) {
            if (px1Var instanceof jha) {
                return ((jha) px1Var).V;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(px1Var);
            sb.append(", ");
            h5.k(ia.m(fwc.a, px1Var.getClass(), sb));
            return false;
        }

        public static boolean J(dwf dwfVar) {
            dwfVar.getClass();
            if (dwfVar instanceof wxf) {
                return ((wxf) dwfVar).b();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(dwfVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, dwfVar.getClass(), sb));
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean K(fdd fddVar) {
            fddVar.getClass();
            if (fddVar instanceof mge) {
                ui8 ui8Var = (ui8) fddVar;
                if (ui8Var instanceof q4) {
                    return true;
                }
                return (ui8Var instanceof fs3) && (((fs3) ui8Var).b instanceof q4);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(fddVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, fddVar.getClass(), sb));
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean L(fdd fddVar) {
            fddVar.getClass();
            if (fddVar instanceof mge) {
                ui8 ui8Var = (ui8) fddVar;
                if (ui8Var instanceof iwe) {
                    return true;
                }
                return (ui8Var instanceof fs3) && (((fs3) ui8Var).b instanceof iwe);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(fddVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, fddVar.getClass(), sb));
            return false;
        }

        public static mge M(jh5 jh5Var) {
            if (jh5Var instanceof jh5) {
                return jh5Var.b;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(jh5Var);
            sb.append(", ");
            h5.k(ia.m(fwc.a, jh5Var.getClass(), sb));
            return null;
        }

        public static p7g N(px1 px1Var) {
            if (px1Var instanceof jha) {
                return ((jha) px1Var).d;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(px1Var);
            sb.append(", ");
            h5.k(ia.m(fwc.a, px1Var.getClass(), sb));
            return null;
        }

        public static p7g O(zi8 zi8Var) {
            if (zi8Var instanceof p7g) {
                return uoe.a((p7g) zi8Var, false);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(zi8Var);
            sb.append(", ");
            h5.k(ia.m(fwc.a, zi8Var.getClass(), sb));
            return null;
        }

        public static int P(lwf lwfVar) {
            lwfVar.getClass();
            if (lwfVar instanceof kwf) {
                return ((kwf) lwfVar).getParameters().size();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(lwfVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, lwfVar.getClass(), sb));
            return 0;
        }

        public static Collection<zi8> Q(s62 s62Var, fdd fddVar) {
            kwf kwfVarV = s62Var.V(fddVar);
            if (kwfVarV instanceof zh7) {
                return ((zh7) kwfVarV).a;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(fddVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, fddVar.getClass(), sb));
            return null;
        }

        public static wxf R(lx1 lx1Var) {
            lx1Var.getClass();
            if (lx1Var instanceof lha) {
                return ((lha) lx1Var).a;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(lx1Var);
            sb.append(", ");
            h5.k(ia.m(fwc.a, lx1Var.getClass(), sb));
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static t62 S(s62 s62Var, fdd fddVar) {
            if (fddVar instanceof mge) {
                ui8 ui8Var = (ui8) fddVar;
                return new t62(s62Var, TypeSubstitutor.e(nwf.b.a(ui8Var.M0(), ui8Var.K0())));
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(fddVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, fddVar.getClass(), sb));
            return null;
        }

        public static Collection T(lwf lwfVar) {
            lwfVar.getClass();
            if (lwfVar instanceof kwf) {
                Collection<ui8> collectionB = ((kwf) lwfVar).b();
                collectionB.getClass();
                return collectionB;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(lwfVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, lwfVar.getClass(), sb));
            return null;
        }

        public static lha U(px1 px1Var) {
            if (px1Var instanceof jha) {
                return ((jha) px1Var).c;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(px1Var);
            sb.append(", ");
            h5.k(ia.m(fwc.a, px1Var.getClass(), sb));
            return null;
        }

        public static kwf V(fdd fddVar) {
            fddVar.getClass();
            if (fddVar instanceof mge) {
                return ((mge) fddVar).M0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(fddVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, fddVar.getClass(), sb));
            return null;
        }

        public static mge W(jh5 jh5Var) {
            if (jh5Var instanceof jh5) {
                return jh5Var.c;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(jh5Var);
            sb.append(", ");
            h5.k(ia.m(fwc.a, jh5Var.getClass(), sb));
            return null;
        }

        public static zi8 X(s62 s62Var, zi8 zi8Var) {
            if (zi8Var instanceof fdd) {
                return s62Var.b0((fdd) zi8Var);
            }
            if (zi8Var instanceof jh5) {
                jh5 jh5Var = (jh5) zi8Var;
                return s62Var.p0(s62Var.b0(s62Var.m(jh5Var)), s62Var.b0(s62Var.k(jh5Var)));
            }
            r6.g("sealed");
            return null;
        }

        public static mge Y(fdd fddVar, boolean z) {
            fddVar.getClass();
            if (fddVar instanceof mge) {
                return ((mge) fddVar).Q0(z);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(fddVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, fddVar.getClass(), sb));
            return null;
        }

        public static boolean a(lwf lwfVar, lwf lwfVar2) {
            lwfVar.getClass();
            lwfVar2.getClass();
            if (!(lwfVar instanceof kwf)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(lwfVar);
                sb.append(", ");
                h5.k(ia.m(fwc.a, lwfVar.getClass(), sb));
                return false;
            }
            if (lwfVar2 instanceof kwf) {
                return lwfVar.equals(lwfVar2);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(lwfVar2);
            sb2.append(", ");
            h5.k(ia.m(fwc.a, lwfVar2.getClass(), sb2));
            return false;
        }

        public static int b(zi8 zi8Var) {
            zi8Var.getClass();
            if (zi8Var instanceof ui8) {
                return ((ui8) zi8Var).K0().size();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(zi8Var);
            sb.append(", ");
            h5.k(ia.m(fwc.a, zi8Var.getClass(), sb));
            return 0;
        }

        public static cwf c(fdd fddVar) {
            fddVar.getClass();
            if (fddVar instanceof mge) {
                return (cwf) fddVar;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(fddVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, fddVar.getClass(), sb));
            return null;
        }

        public static px1 d(s62 s62Var, oge ogeVar) {
            ogeVar.getClass();
            if (ogeVar instanceof mge) {
                if (ogeVar instanceof qge) {
                    return s62Var.X(((qge) ogeVar).b);
                }
                if (ogeVar instanceof jha) {
                    return (jha) ogeVar;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(ogeVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, ogeVar.getClass(), sb));
            return null;
        }

        public static fs3 e(fdd fddVar) {
            fddVar.getClass();
            if (fddVar instanceof mge) {
                if (fddVar instanceof fs3) {
                    return (fs3) fddVar;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(fddVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, fddVar.getClass(), sb));
            return null;
        }

        public static oe4 f(jh5 jh5Var) {
            if (jh5Var instanceof oe4) {
                return (oe4) jh5Var;
            }
            return null;
        }

        public static jh5 g(zi8 zi8Var) {
            zi8Var.getClass();
            if (zi8Var instanceof ui8) {
                p7g p7gVarP0 = ((ui8) zi8Var).P0();
                if (p7gVarP0 instanceof jh5) {
                    return (jh5) p7gVarP0;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(zi8Var);
            sb.append(", ");
            h5.k(ia.m(fwc.a, zi8Var.getClass(), sb));
            return null;
        }

        public static mge h(zi8 zi8Var) {
            zi8Var.getClass();
            if (zi8Var instanceof ui8) {
                p7g p7gVarP0 = ((ui8) zi8Var).P0();
                if (p7gVarP0 instanceof mge) {
                    return (mge) p7gVarP0;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(zi8Var);
            sb.append(", ");
            h5.k(ia.m(fwc.a, zi8Var.getClass(), sb));
            return null;
        }

        public static yxf i(zi8 zi8Var) {
            zi8Var.getClass();
            if (zi8Var instanceof ui8) {
                return new yxf((ui8) zi8Var);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(zi8Var);
            sb.append(", ");
            h5.k(ia.m(fwc.a, zi8Var.getClass(), sb));
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static defpackage.mge j(defpackage.fdd r15) {
            /*
                Method dump skipped, instruction units count: 405
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: s62.a.j(fdd):mge");
        }

        public static hx1 k(px1 px1Var) {
            if (px1Var instanceof jha) {
                return ((jha) px1Var).b;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(px1Var);
            sb.append(", ");
            h5.k(ia.m(fwc.a, px1Var.getClass(), sb));
            return null;
        }

        public static p7g l(s62 s62Var, fdd fddVar, fdd fddVar2) {
            fddVar.getClass();
            fddVar2.getClass();
            if (!(fddVar instanceof mge)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(s62Var);
                sb.append(", ");
                h5.k(ia.m(fwc.a, s62Var.getClass(), sb));
                return null;
            }
            if (fddVar2 instanceof mge) {
                return yi8.a((mge) fddVar, (mge) fddVar2);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(s62Var);
            sb2.append(", ");
            h5.k(ia.m(fwc.a, s62Var.getClass(), sb2));
            return null;
        }

        public static dwf m(zi8 zi8Var, int i) {
            zi8Var.getClass();
            if (zi8Var instanceof ui8) {
                return ((ui8) zi8Var).K0().get(i);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(zi8Var);
            sb.append(", ");
            h5.k(ia.m(fwc.a, zi8Var.getClass(), sb));
            return null;
        }

        public static txf n(lwf lwfVar, int i) {
            lwfVar.getClass();
            if (lwfVar instanceof kwf) {
                rxf rxfVar = ((kwf) lwfVar).getParameters().get(i);
                rxfVar.getClass();
                return rxfVar;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(lwfVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, lwfVar.getClass(), sb));
            return null;
        }

        public static p7g o(s62 s62Var, dwf dwfVar) {
            dwfVar.getClass();
            if (s62Var.N(dwfVar)) {
                return null;
            }
            if (dwfVar instanceof wxf) {
                return ((wxf) dwfVar).getType().P0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(dwfVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, dwfVar.getClass(), sb));
            return null;
        }

        public static rxf p(myf myfVar) {
            if (myfVar instanceof tha) {
                return ((tha) myfVar).a();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(myfVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, myfVar.getClass(), sb));
            return null;
        }

        public static rxf q(lwf lwfVar) {
            lwfVar.getClass();
            if (lwfVar instanceof kwf) {
                v62 v62VarD = ((kwf) lwfVar).d();
                if (v62VarD instanceof rxf) {
                    return (rxf) v62VarD;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(lwfVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, lwfVar.getClass(), sb));
            return null;
        }

        public static nyf r(dwf dwfVar) {
            dwfVar.getClass();
            if (dwfVar instanceof wxf) {
                ylg ylgVarC = ((wxf) dwfVar).c();
                ylgVarC.getClass();
                return w74.i(ylgVarC);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(dwfVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, dwfVar.getClass(), sb));
            return null;
        }

        public static nyf s(txf txfVar) {
            txfVar.getClass();
            if (txfVar instanceof rxf) {
                ylg ylgVarZ = ((rxf) txfVar).z();
                ylgVarZ.getClass();
                return w74.i(ylgVarZ);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(txfVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, txfVar.getClass(), sb));
            return null;
        }

        public static boolean t(zi8 zi8Var, mq5 mq5Var) {
            zi8Var.getClass();
            mq5Var.getClass();
            if (zi8Var instanceof ui8) {
                return ((ui8) zi8Var).getAnnotations().P0(mq5Var);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(zi8Var);
            sb.append(", ");
            h5.k(ia.m(fwc.a, zi8Var.getClass(), sb));
            return false;
        }

        public static boolean u(txf txfVar, lwf lwfVar) {
            if (!(txfVar instanceof rxf)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(txfVar);
                sb.append(", ");
                h5.k(ia.m(fwc.a, txfVar.getClass(), sb));
                return false;
            }
            rxf rxfVar = (rxf) txfVar;
            if (lwfVar == null ? true : lwfVar instanceof kwf) {
                return boa.y(rxfVar, (kwf) lwfVar, 4);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(rxfVar);
            sb2.append(", ");
            h5.k(ia.m(fwc.a, rxfVar.getClass(), sb2));
            return false;
        }

        public static boolean v(fdd fddVar, fdd fddVar2) {
            fddVar.getClass();
            fddVar2.getClass();
            if (!(fddVar instanceof mge)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(fddVar);
                sb.append(", ");
                h5.k(ia.m(fwc.a, fddVar.getClass(), sb));
                return false;
            }
            if (fddVar2 instanceof mge) {
                return ((mge) fddVar).K0() == ((mge) fddVar2).K0();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(fddVar2);
            sb2.append(", ");
            h5.k(ia.m(fwc.a, fddVar2.getClass(), sb2));
            return false;
        }

        public static boolean w(lwf lwfVar) {
            lwfVar.getClass();
            if (lwfVar instanceof kwf) {
                return ei8.J((kwf) lwfVar, ere.a.a);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(lwfVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, lwfVar.getClass(), sb));
            return false;
        }

        public static boolean x(lwf lwfVar) {
            lwfVar.getClass();
            if (lwfVar instanceof kwf) {
                return ((kwf) lwfVar).d() instanceof t52;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(lwfVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, lwfVar.getClass(), sb));
            return false;
        }

        public static boolean y(lwf lwfVar) {
            if (lwfVar instanceof kwf) {
                v62 v62VarD = ((kwf) lwfVar).d();
                t52 t52Var = v62VarD instanceof t52 ? (t52) v62VarD : null;
                return (t52Var == null || t52Var.r() != ax9.b || t52Var.f() == c62.ENUM_CLASS || t52Var.f() == c62.ENUM_ENTRY || t52Var.f() == c62.ANNOTATION_CLASS) ? false : true;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(lwfVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, lwfVar.getClass(), sb));
            return false;
        }

        public static boolean z(lwf lwfVar) {
            lwfVar.getClass();
            if (lwfVar instanceof kwf) {
                return ((kwf) lwfVar).e();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(lwfVar);
            sb.append(", ");
            h5.k(ia.m(fwc.a, lwfVar.getClass(), sb));
            return false;
        }
    }

    mge b0(fdd fddVar);

    mge k(jh5 jh5Var);

    mge m(jh5 jh5Var);

    p7g p0(oge ogeVar, oge ogeVar2);

    mge q(ui8 ui8Var);
}

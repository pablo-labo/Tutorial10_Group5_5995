package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e5 extends dj3 implements rxf {
    public final int V;
    public final fla<kwf> W;
    public final fla<mge> X;
    public final aue Y;
    public final ylg e;
    public final boolean f;

    public class a extends a5 {
        public final cze c;
        public final /* synthetic */ e5 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e5 e5Var, aue aueVar, cze czeVar) {
            super(aueVar);
            if (aueVar == null) {
                o(0);
                throw null;
            }
            this.d = e5Var;
            this.c = czeVar;
        }

        public static /* synthetic */ void o(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // defpackage.kwf
        public final v62 d() {
            return this.d;
        }

        @Override // defpackage.kwf
        public final boolean e() {
            return true;
        }

        @Override // defpackage.u62
        public final boolean f(v62 v62Var) {
            if (!(v62Var instanceof rxf)) {
                return false;
            }
            return iz3.a.b(this.d, (rxf) v62Var, true, gz3.a);
        }

        @Override // defpackage.a5
        public final Collection<ui8> g() {
            List<ui8> listN0 = this.d.N0();
            if (listN0 != null) {
                return listN0;
            }
            o(1);
            throw null;
        }

        @Override // defpackage.kwf
        public final List<rxf> getParameters() {
            List<rxf> list = Collections.EMPTY_LIST;
            if (list != null) {
                return list;
            }
            o(2);
            throw null;
        }

        @Override // defpackage.a5
        public final ui8 h() {
            return lx4.c(kx4.e, new String[0]);
        }

        @Override // defpackage.a5
        public final cze j() {
            cze czeVar = this.c;
            if (czeVar != null) {
                return czeVar;
            }
            o(5);
            throw null;
        }

        @Override // defpackage.kwf
        public final ei8 l() {
            ei8 ei8VarE = b04.e(this.d);
            if (ei8VarE != null) {
                return ei8VarE;
            }
            o(4);
            throw null;
        }

        @Override // defpackage.a5
        public final List<ui8> m(List<ui8> list) {
            List<ui8> listL0 = this.d.L0(list);
            if (listL0 != null) {
                return listL0;
            }
            o(8);
            throw null;
        }

        @Override // defpackage.a5
        public final void n(ui8 ui8Var) {
            if (ui8Var != null) {
                this.d.M0(ui8Var);
            } else {
                o(6);
                throw null;
            }
        }

        public final String toString() {
            return this.d.getName().a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(aue aueVar, aj3 aj3Var, lf0 lf0Var, n8a n8aVar, ylg ylgVar, boolean z, int i, cze czeVar) {
        super(aj3Var, lf0Var, n8aVar, qne.p);
        if (aueVar == null) {
            D0(0);
            throw null;
        }
        if (aj3Var == null) {
            D0(1);
            throw null;
        }
        if (lf0Var == null) {
            D0(2);
            throw null;
        }
        if (n8aVar == null) {
            D0(3);
            throw null;
        }
        if (ylgVar == null) {
            D0(4);
            throw null;
        }
        if (czeVar == null) {
            D0(6);
            throw null;
        }
        this.e = ylgVar;
        this.f = z;
        this.V = i;
        this.W = aueVar.f(new b5(this, aueVar, czeVar));
        this.X = aueVar.f(new d5(this, n8aVar));
        this.Y = aueVar;
    }

    public static /* synthetic */ void D0(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.dj3
    /* JADX INFO: renamed from: K0 */
    public final cj3 a() {
        return this;
    }

    public List<ui8> L0(List<ui8> list) {
        return list;
    }

    @Override // defpackage.rxf
    public final aue M() {
        aue aueVar = this.Y;
        if (aueVar != null) {
            return aueVar;
        }
        D0(14);
        throw null;
    }

    public abstract void M0(ui8 ui8Var);

    public abstract List<ui8> N0();

    @Override // defpackage.rxf
    public final boolean Q() {
        return false;
    }

    @Override // defpackage.dj3, defpackage.bj3, defpackage.aj3
    public final aj3 a() {
        return this;
    }

    @Override // defpackage.dj3, defpackage.bj3, defpackage.aj3
    public final v62 a() {
        return this;
    }

    @Override // defpackage.rxf
    public final int getIndex() {
        return this.V;
    }

    @Override // defpackage.rxf
    public final List<ui8> getUpperBounds() {
        List<ui8> listB = ((a) j()).b();
        if (listB != null) {
            return listB;
        }
        D0(8);
        throw null;
    }

    @Override // defpackage.rxf, defpackage.v62
    public final kwf j() {
        kwf kwfVarInvoke = this.W.invoke();
        if (kwfVarInvoke != null) {
            return kwfVarInvoke;
        }
        D0(9);
        throw null;
    }

    @Override // defpackage.v62
    public final mge o() {
        mge mgeVarInvoke = this.X.invoke();
        if (mgeVarInvoke != null) {
            return mgeVarInvoke;
        }
        D0(10);
        throw null;
    }

    @Override // defpackage.aj3
    public final <R, D> R o0(ej3<R, D> ej3Var, D d) {
        return (R) ej3Var.j(this, d);
    }

    @Override // defpackage.rxf
    public final boolean v() {
        return this.f;
    }

    @Override // defpackage.rxf
    public final ylg z() {
        ylg ylgVar = this.e;
        if (ylgVar != null) {
            return ylgVar;
        }
        D0(7);
        throw null;
    }

    @Override // defpackage.dj3, defpackage.bj3, defpackage.aj3
    public final rxf a() {
        return this;
    }
}

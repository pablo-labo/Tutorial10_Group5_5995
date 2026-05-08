package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.fv1;
import defpackage.hv1;
import defpackage.lf0;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class nu7 extends n52 implements mu7 {
    public Boolean u0;
    public Boolean v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu7(t52 t52Var, nu7 nu7Var, lf0 lf0Var, boolean z, hv1.a aVar, qne qneVar) {
        super(t52Var, nu7Var, lf0Var, z, aVar, qneVar);
        if (t52Var == null) {
            D0(0);
            throw null;
        }
        if (lf0Var == null) {
            D0(1);
            throw null;
        }
        if (aVar == null) {
            D0(2);
            throw null;
        }
        if (qneVar == null) {
            D0(3);
            throw null;
        }
        this.u0 = null;
        this.v0 = null;
    }

    public static /* synthetic */ void D0(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static nu7 Z0(t52 t52Var, lf0 lf0Var, boolean z, dw7 dw7Var) {
        if (t52Var == null) {
            D0(4);
            throw null;
        }
        if (dw7Var != null) {
            return new nu7(t52Var, null, lf0Var, z, hv1.a.a, dw7Var);
        }
        D0(6);
        throw null;
    }

    @Override // defpackage.mu7
    public final mu7 I0(ui8 ui8Var, ArrayList arrayList, ui8 ui8Var2, Pair pair) {
        nu7 nu7VarA1 = a1(d(), null, f(), getAnnotations(), g());
        nu7VarA1.P0(ui8Var == null ? null : jz3.h(nu7VarA1, ui8Var, lf0.a.a), this.Y, zr4.a, getTypeParameters(), vfd.c(arrayList, i(), nu7VarA1), ui8Var2, r(), getVisibility());
        if (pair != null) {
            nu7VarA1.R0((fv1.a) pair.d(), pair.e());
        }
        return nu7VarA1;
    }

    @Override // defpackage.n52, defpackage.mv5
    public final /* bridge */ /* synthetic */ mv5 M0(lf0 lf0Var, hv1.a aVar, aj3 aj3Var, kv5 kv5Var, n8a n8aVar, qne qneVar) {
        return a1(aj3Var, kv5Var, aVar, lf0Var, qneVar);
    }

    @Override // defpackage.mv5
    public final void S0(boolean z) {
        this.u0 = Boolean.valueOf(z);
    }

    @Override // defpackage.mv5
    public final void T0(boolean z) {
        this.v0 = Boolean.valueOf(z);
    }

    @Override // defpackage.n52
    /* JADX INFO: renamed from: V0 */
    public final /* bridge */ /* synthetic */ n52 M0(lf0 lf0Var, hv1.a aVar, aj3 aj3Var, kv5 kv5Var, n8a n8aVar, qne qneVar) {
        return a1(aj3Var, kv5Var, aVar, lf0Var, qneVar);
    }

    public final nu7 a1(aj3 aj3Var, kv5 kv5Var, hv1.a aVar, lf0 lf0Var, qne qneVar) {
        if (aj3Var == null) {
            D0(7);
            throw null;
        }
        if (aVar == null) {
            D0(8);
            throw null;
        }
        if (lf0Var == null) {
            D0(9);
            throw null;
        }
        if (qneVar == null) {
            D0(10);
            throw null;
        }
        if (aVar != hv1.a.a && aVar != hv1.a.d) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + aj3Var + "\nkind: " + aVar);
        }
        nu7 nu7Var = new nu7((t52) aj3Var, (nu7) kv5Var, lf0Var, this.t0, aVar, qneVar);
        Boolean bool = this.u0;
        bool.getClass();
        nu7Var.u0 = bool;
        Boolean bool2 = this.v0;
        bool2.getClass();
        nu7Var.v0 = bool2;
        return nu7Var;
    }

    @Override // defpackage.mv5, defpackage.fv1
    public final boolean g0() {
        return this.v0.booleanValue();
    }
}

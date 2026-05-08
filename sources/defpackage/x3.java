package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.d04;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x3 extends bj3 implements hsc {
    public static /* synthetic */ void D0(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.fv1
    public final hsc L() {
        return null;
    }

    @Override // defpackage.fv1
    public final hsc O() {
        return null;
    }

    @Override // defpackage.bj3, defpackage.aj3
    public final aj3 a() {
        return this;
    }

    @Override // defpackage.bj3, defpackage.aj3
    public final fv1 a() {
        return this;
    }

    @Override // defpackage.qxe
    public final x3 b(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            D0(3);
            throw null;
        }
        if (!typeSubstitutor.a.e()) {
            ui8 ui8VarJ = d() instanceof t52 ? typeSubstitutor.j(getType(), ylg.OUT_VARIANCE) : typeSubstitutor.j(getType(), ylg.INVARIANT);
            if (ui8VarJ == null) {
                return null;
            }
            if (ui8VarJ != getType()) {
                return new isc(d(), new yrf(ui8VarJ, null), getAnnotations());
            }
        }
        return this;
    }

    @Override // defpackage.cj3
    public final qne g() {
        return qne.p;
    }

    @Override // defpackage.fv1
    public final boolean g0() {
        return false;
    }

    @Override // defpackage.fv1
    public final ui8 getReturnType() {
        return getType();
    }

    @Override // defpackage.ilg
    public final ui8 getType() {
        ui8 type = getValue().getType();
        if (type != null) {
            return type;
        }
        D0(6);
        throw null;
    }

    @Override // defpackage.fv1
    public final List<rxf> getTypeParameters() {
        List<rxf> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        D0(5);
        throw null;
    }

    @Override // defpackage.fj3
    public final e04 getVisibility() {
        d04.i iVar = d04.f;
        if (iVar != null) {
            return iVar;
        }
        D0(9);
        throw null;
    }

    @Override // defpackage.fv1
    public final List<rlg> i() {
        List<rlg> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        D0(7);
        throw null;
    }

    @Override // defpackage.fv1, defpackage.hv1
    public final Collection<? extends fv1> m() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        D0(8);
        throw null;
    }

    @Override // defpackage.aj3
    public final <R, D> R o0(ej3<R, D> ej3Var, D d) {
        return (R) ej3Var.c(this, d);
    }
}

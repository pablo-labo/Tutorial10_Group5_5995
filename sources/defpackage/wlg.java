package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wlg extends dj3 implements vlg {
    public ui8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wlg(aj3 aj3Var, lf0 lf0Var, n8a n8aVar, ui8 ui8Var, qne qneVar) {
        super(aj3Var, lf0Var, n8aVar, qneVar);
        if (aj3Var == null) {
            D0(0);
            throw null;
        }
        if (lf0Var == null) {
            D0(1);
            throw null;
        }
        if (n8aVar == null) {
            D0(2);
            throw null;
        }
        if (qneVar == null) {
            D0(3);
            throw null;
        }
        this.e = ui8Var;
    }

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
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
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
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public hsc L() {
        return null;
    }

    public hsc O() {
        return null;
    }

    public boolean g0() {
        return false;
    }

    public ui8 getReturnType() {
        ui8 type = getType();
        if (type != null) {
            return type;
        }
        D0(10);
        throw null;
    }

    @Override // defpackage.ilg
    public final ui8 getType() {
        ui8 ui8Var = this.e;
        if (ui8Var != null) {
            return ui8Var;
        }
        D0(4);
        throw null;
    }

    public List<rxf> getTypeParameters() {
        List<rxf> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        D0(8);
        throw null;
    }

    @Override // defpackage.fv1
    public final List<rlg> i() {
        List<rlg> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        D0(6);
        throw null;
    }
}

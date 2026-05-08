package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;

/* JADX INFO: loaded from: classes3.dex */
public final class isc extends x3 {
    public final aj3 c;
    public final y3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isc(aj3 aj3Var, y3 y3Var, lf0 lf0Var, n8a n8aVar) {
        super(lf0Var, n8aVar);
        if (aj3Var == null) {
            D0(3);
            throw null;
        }
        if (lf0Var == null) {
            D0(5);
            throw null;
        }
        if (n8aVar == null) {
            D0(6);
            throw null;
        }
        this.c = aj3Var;
        this.d = y3Var;
    }

    public static /* synthetic */ void D0(int i) {
        String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.aj3
    public final aj3 d() {
        aj3 aj3Var = this.c;
        if (aj3Var != null) {
            return aj3Var;
        }
        D0(8);
        throw null;
    }

    @Override // defpackage.hsc
    public final jsc getValue() {
        y3 y3Var = this.d;
        if (y3Var != null) {
            return y3Var;
        }
        D0(7);
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public isc(aj3 aj3Var, y3 y3Var, lf0 lf0Var) {
        this(aj3Var, y3Var, lf0Var, toe.d);
        if (aj3Var == null) {
            D0(0);
            throw null;
        }
        if (lf0Var != null) {
        } else {
            D0(2);
            throw null;
        }
    }
}

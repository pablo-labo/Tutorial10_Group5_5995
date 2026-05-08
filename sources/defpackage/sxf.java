package defpackage;

import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.cze;
import defpackage.lf0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sxf extends e5 {
    public final ArrayList Z;
    public boolean a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxf(aj3 aj3Var, lf0 lf0Var, boolean z, ylg ylgVar, n8a n8aVar, int i, aue aueVar) {
        super(aueVar, aj3Var, lf0Var, n8aVar, ylgVar, z, i, cze.a.a);
        if (aj3Var == null) {
            D0(19);
            throw null;
        }
        if (lf0Var == null) {
            D0(20);
            throw null;
        }
        if (ylgVar == null) {
            D0(21);
            throw null;
        }
        if (n8aVar == null) {
            D0(22);
            throw null;
        }
        if (aueVar == null) {
            D0(25);
            throw null;
        }
        this.Z = new ArrayList(1);
        this.a0 = false;
    }

    public static /* synthetic */ void D0(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
            case 12:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static sxf O0(aj3 aj3Var, lf0 lf0Var, boolean z, ylg ylgVar, n8a n8aVar, int i, aue aueVar) {
        if (aj3Var == null) {
            D0(6);
            throw null;
        }
        if (lf0Var == null) {
            D0(7);
            throw null;
        }
        if (ylgVar == null) {
            D0(8);
            throw null;
        }
        if (n8aVar == null) {
            D0(9);
            throw null;
        }
        if (aueVar != null) {
            return new sxf(aj3Var, lf0Var, z, ylgVar, n8aVar, i, aueVar);
        }
        D0(11);
        throw null;
    }

    public static sxf P0(x0 x0Var, ylg ylgVar, n8a n8aVar, int i, aue aueVar) {
        if (aueVar == null) {
            D0(4);
            throw null;
        }
        sxf sxfVarO0 = O0(x0Var, lf0.a.a, false, ylgVar, n8aVar, i, aueVar);
        mge mgeVarN = b04.e(x0Var).n();
        if (sxfVarO0.a0) {
            r6.g("Type parameter descriptor is already initialized: ".concat(sxfVarO0.Q0()));
            return null;
        }
        if (!pnb.D(mgeVarN)) {
            sxfVarO0.Z.add(mgeVarN);
        }
        if (sxfVarO0.a0) {
            r6.g("Type parameter descriptor is already initialized: ".concat(sxfVarO0.Q0()));
            return null;
        }
        sxfVarO0.a0 = true;
        return sxfVarO0;
    }

    @Override // defpackage.e5
    public final void M0(ui8 ui8Var) {
        if (ui8Var != null) {
            return;
        }
        D0(27);
        throw null;
    }

    @Override // defpackage.e5
    public final List<ui8> N0() {
        if (!this.a0) {
            r6.g("Type parameter descriptor is not initialized: ".concat(Q0()));
            return null;
        }
        ArrayList arrayList = this.Z;
        if (arrayList != null) {
            return arrayList;
        }
        D0(28);
        throw null;
    }

    public final String Q0() {
        return getName() + " declared in " + yz3.g(d());
    }
}

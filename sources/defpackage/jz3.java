package defpackage;

import app.rive.runtime.kotlin.renderers.RendererMetrics;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.d04;
import defpackage.hv1;
import defpackage.lf0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jz3 {

    public static class a extends n52 {
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case DatadogLogGenerator.CRASH /* 9 */:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case RendererMetrics.SAMPLES /* 30 */:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case RendererMetrics.SAMPLES /* 30 */:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static isc b(fv1 fv1Var, ui8 ui8Var, n8a n8aVar, lf0 lf0Var, int i) {
        if (lf0Var == null) {
            a(33);
            throw null;
        }
        if (ui8Var == null) {
            return null;
        }
        du2 du2Var = new du2(fv1Var, ui8Var, n8aVar, null);
        pxc pxcVar = r8a.a;
        return new isc(fv1Var, du2Var, lf0Var, n8a.h(r8a.b + '_' + i));
    }

    public static g4c c(d4c d4cVar, lf0 lf0Var) {
        return i(d4cVar, lf0Var, true, d4cVar.g());
    }

    public static q4c d(d4c d4cVar, lf0 lf0Var) {
        qne qneVarG = d4cVar.g();
        if (qneVarG != null) {
            return j(d4cVar, lf0Var, lf0.a.a, true, d4cVar.getVisibility(), qneVarG);
        }
        a(6);
        throw null;
    }

    public static e4c e(x0 x0Var) {
        if (x0Var == null) {
            a(26);
            throw null;
        }
        xx9 xx9VarD = yz3.d(x0Var);
        xx9VarD.getClass();
        ute uteVar = (ute) xx9VarD.k0(u63.f);
        if (uteVar == null) {
            uteVar = h72.a;
        }
        t52 t52VarA = uteVar.a(xx9VarD);
        if (t52VarA == null) {
            return null;
        }
        d04.h hVar = d04.e;
        n8a n8aVar = ere.b;
        qne qneVarG = x0Var.g();
        ax9 ax9Var = ax9.b;
        hv1.a aVar = hv1.a.d;
        e4c e4cVarN0 = e4c.N0(x0Var, ax9Var, hVar, false, n8aVar, aVar, qneVarG);
        g4c g4cVar = new g4c(e4cVarN0, lf0.a.a, ax9Var, hVar, false, false, false, aVar, null, x0Var.g());
        e4cVarN0.P0(g4cVar, null, null, null);
        gwf.b.getClass();
        gwf gwfVar = gwf.c;
        kwf kwfVarJ = t52VarA.j();
        List listSingletonList = Collections.singletonList(new yxf(x0Var.o()));
        gwfVar.getClass();
        kwfVarJ.getClass();
        listSingletonList.getClass();
        mge mgeVarC = yi8.c(gwfVar, kwfVarJ, listSingletonList, false, null);
        List list = Collections.EMPTY_LIST;
        e4cVarN0.R0(mgeVarC, list, null, null, list);
        g4cVar.O0(e4cVarN0.getReturnType());
        return e4cVarN0;
    }

    public static tfe f(x0 x0Var) {
        if (x0Var == null) {
            a(24);
            throw null;
        }
        tfe tfeVarW0 = tfe.W0(x0Var, ere.c, hv1.a.d, x0Var.g());
        slg slgVar = new slg(tfeVarW0, null, 0, lf0.a.a, n8a.h("value"), b04.e(x0Var).v(), false, false, false, null, x0Var.g());
        List<hsc> list = Collections.EMPTY_LIST;
        return tfeVarW0.P0(null, null, list, list, Collections.singletonList(slgVar), x0Var.o(), ax9.b, d04.e);
    }

    public static tfe g(x0 x0Var) {
        if (x0Var == null) {
            a(22);
            throw null;
        }
        tfe tfeVarW0 = tfe.W0(x0Var, ere.a, hv1.a.d, x0Var.g());
        List<hsc> list = Collections.EMPTY_LIST;
        return tfeVarW0.P0(null, null, list, list, list, b04.e(x0Var).h(x0Var.o()), ax9.b, d04.e);
    }

    public static isc h(fv1 fv1Var, ui8 ui8Var, lf0 lf0Var) {
        if (ui8Var == null) {
            return null;
        }
        return new isc(fv1Var, new q45(fv1Var, ui8Var, null), lf0Var);
    }

    public static g4c i(d4c d4cVar, lf0 lf0Var, boolean z, qne qneVar) {
        if (lf0Var == null) {
            a(18);
            throw null;
        }
        if (qneVar != null) {
            return new g4c(d4cVar, lf0Var, d4cVar.r(), d4cVar.getVisibility(), z, false, false, hv1.a.a, null, qneVar);
        }
        a(19);
        throw null;
    }

    public static q4c j(d4c d4cVar, lf0 lf0Var, lf0 lf0Var2, boolean z, e04 e04Var, qne qneVar) {
        if (lf0Var == null) {
            a(8);
            throw null;
        }
        if (lf0Var2 == null) {
            a(9);
            throw null;
        }
        if (e04Var == null) {
            a(10);
            throw null;
        }
        if (qneVar == null) {
            a(11);
            throw null;
        }
        q4c q4cVar = new q4c(d4cVar, lf0Var, d4cVar.r(), e04Var, z, false, false, hv1.a.a, null, qneVar);
        q4cVar.b0 = q4c.N0(q4cVar, d4cVar.getType(), lf0Var2);
        return q4cVar;
    }

    public static boolean k(kv5 kv5Var) {
        if (kv5Var.f() != hv1.a.d) {
            return false;
        }
        aj3 aj3VarD = kv5Var.d();
        int i = yz3.a;
        return yz3.n(aj3VarD, c62.ENUM_CLASS);
    }
}

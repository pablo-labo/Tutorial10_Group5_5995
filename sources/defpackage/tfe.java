package defpackage;

import app.rive.runtime.kotlin.renderers.RendererMetrics;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.fv1;
import defpackage.hv1;
import defpackage.kv5;
import defpackage.lf0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public class tfe extends mv5 implements sfe {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfe(aj3 aj3Var, sfe sfeVar, lf0 lf0Var, n8a n8aVar, hv1.a aVar, qne qneVar) {
        super(lf0Var, aVar, aj3Var, sfeVar, n8aVar, qneVar);
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
        if (aVar == null) {
            D0(3);
            throw null;
        }
        if (qneVar != null) {
        } else {
            D0(4);
            throw null;
        }
    }

    public static /* synthetic */ void D0(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case RendererMetrics.SAMPLES /* 30 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
            case 16:
            case 17:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case RendererMetrics.SAMPLES /* 30 */:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static tfe W0(x0 x0Var, n8a n8aVar, hv1.a aVar, qne qneVar) {
        if (x0Var == null) {
            D0(5);
            throw null;
        }
        if (n8aVar == null) {
            D0(7);
            throw null;
        }
        if (qneVar != null) {
            return new tfe(x0Var, null, lf0.a.a, n8aVar, aVar, qneVar);
        }
        D0(9);
        throw null;
    }

    @Override // defpackage.mv5, defpackage.kv5
    public kv5.a<? extends sfe> F0() {
        return Q0(TypeSubstitutor.b);
    }

    @Override // defpackage.mv5
    public mv5 M0(lf0 lf0Var, hv1.a aVar, aj3 aj3Var, kv5 kv5Var, n8a n8aVar, qne qneVar) {
        if (aj3Var == null) {
            D0(25);
            throw null;
        }
        if (aVar == null) {
            D0(26);
            throw null;
        }
        if (lf0Var == null) {
            D0(27);
            throw null;
        }
        sfe sfeVar = (sfe) kv5Var;
        if (n8aVar == null) {
            n8aVar = getName();
        }
        return new tfe(aj3Var, sfeVar, lf0Var, n8aVar, aVar, qneVar);
    }

    @Override // defpackage.hv1
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public sfe Z(aj3 aj3Var, ax9 ax9Var, e04 e04Var) {
        return (sfe) super.L0(aj3Var, ax9Var, e04Var);
    }

    @Override // defpackage.mv5, defpackage.dj3, defpackage.bj3, defpackage.aj3
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public final sfe a() {
        sfe sfeVar = (sfe) super.a();
        if (sfeVar != null) {
            return sfeVar;
        }
        D0(24);
        throw null;
    }

    @Override // defpackage.mv5
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public final tfe P0(hsc hscVar, hsc hscVar2, List<hsc> list, List<? extends rxf> list2, List<rlg> list3, ui8 ui8Var, ax9 ax9Var, e04 e04Var) {
        if (list == null) {
            D0(14);
            throw null;
        }
        if (list2 == null) {
            D0(15);
            throw null;
        }
        if (list3 == null) {
            D0(16);
            throw null;
        }
        if (e04Var != null) {
            return Z0(hscVar, hscVar2, list, list2, list3, ui8Var, ax9Var, e04Var, null);
        }
        D0(17);
        throw null;
    }

    public tfe Z0(hsc hscVar, hsc hscVar2, List<hsc> list, List<? extends rxf> list2, List<rlg> list3, ui8 ui8Var, ax9 ax9Var, e04 e04Var, Map<? extends fv1.a<?>, ?> map) {
        if (list == null) {
            D0(19);
            throw null;
        }
        if (list2 == null) {
            D0(20);
            throw null;
        }
        if (list3 == null) {
            D0(21);
            throw null;
        }
        if (e04Var == null) {
            D0(22);
            throw null;
        }
        super.P0(hscVar, hscVar2, list, list2, list3, ui8Var, ax9Var, e04Var);
        if (map != null && !map.isEmpty()) {
            this.s0 = new LinkedHashMap(map);
        }
        return this;
    }
}

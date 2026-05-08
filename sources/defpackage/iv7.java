package defpackage;

import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.fv1;
import defpackage.hv1;
import defpackage.i32;
import defpackage.lf0;
import defpackage.mv5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public final class iv7 extends tfe implements mu7 {
    public static final a v0 = new a();
    public static final b w0 = new b();
    public c t0;
    public final boolean u0;

    public static class a implements fv1.a<rlg> {
    }

    public static class b implements fv1.a<Boolean> {
    }

    public enum c {
        a(false, false),
        b(true, false),
        c(false, true),
        d(true, true);

        public final boolean isStable;
        public final boolean isSynthesized;

        c(boolean z, boolean z2) {
            this.isStable = z;
            this.isSynthesized = z2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv7(aj3 aj3Var, sfe sfeVar, lf0 lf0Var, n8a n8aVar, hv1.a aVar, qne qneVar, boolean z) {
        super(aj3Var, sfeVar, lf0Var, n8aVar, aVar, qneVar);
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
        if (qneVar == null) {
            D0(4);
            throw null;
        }
        this.t0 = null;
        this.u0 = z;
    }

    public static /* synthetic */ void D0(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                objArr[0] = "newOwner";
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static iv7 a1(aj3 aj3Var, zo8 zo8Var, n8a n8aVar, dw7 dw7Var, boolean z) {
        if (aj3Var == null) {
            D0(5);
            throw null;
        }
        if (n8aVar == null) {
            D0(7);
            throw null;
        }
        if (dw7Var != null) {
            return new iv7(aj3Var, null, zo8Var, n8aVar, hv1.a.a, dw7Var, z);
        }
        D0(8);
        throw null;
    }

    @Override // defpackage.mu7
    public final mu7 I0(ui8 ui8Var, ArrayList arrayList, ui8 ui8Var2, Pair pair) {
        ArrayList arrayListC = vfd.c(arrayList, i(), this);
        isc iscVarH = ui8Var == null ? null : jz3.h(this, ui8Var, lf0.a.a);
        mv5.a aVarQ0 = Q0(TypeSubstitutor.b);
        aVarQ0.g = arrayListC;
        aVarQ0.k = ui8Var2;
        aVarQ0.i = iscVarH;
        aVarQ0.p = true;
        aVarQ0.o = true;
        iv7 iv7Var = (iv7) aVarQ0.x.N0(aVarQ0);
        if (pair != null) {
            iv7Var.R0((fv1.a) pair.d(), pair.e());
        }
        if (iv7Var != null) {
            return iv7Var;
        }
        D0(21);
        throw null;
    }

    @Override // defpackage.tfe, defpackage.mv5
    public final mv5 M0(lf0 lf0Var, hv1.a aVar, aj3 aj3Var, kv5 kv5Var, n8a n8aVar, qne qneVar) {
        if (aj3Var == null) {
            D0(14);
            throw null;
        }
        if (aVar == null) {
            D0(15);
            throw null;
        }
        if (lf0Var == null) {
            D0(16);
            throw null;
        }
        sfe sfeVar = (sfe) kv5Var;
        if (n8aVar == null) {
            n8aVar = getName();
        }
        iv7 iv7Var = new iv7(aj3Var, sfeVar, lf0Var, n8aVar, aVar, qneVar, this.u0);
        c cVar = this.t0;
        iv7Var.b1(cVar.isStable, cVar.isSynthesized);
        return iv7Var;
    }

    @Override // defpackage.tfe
    public final tfe Z0(hsc hscVar, hsc hscVar2, List<hsc> list, List<? extends rxf> list2, List<rlg> list3, ui8 ui8Var, ax9 ax9Var, e04 e04Var, Map<? extends fv1.a<?>, ?> map) {
        i32 bVar;
        if (list == null) {
            D0(9);
            throw null;
        }
        if (list2 == null) {
            D0(10);
            throw null;
        }
        if (list3 == null) {
            D0(11);
            throw null;
        }
        if (e04Var == null) {
            D0(12);
            throw null;
        }
        super.Z0(hscVar, hscVar2, list, list2, list3, ui8Var, ax9Var, e04Var, map);
        ava.a.getClass();
        for (a42 a42Var : ava.b) {
            pxc pxcVar = a42Var.b;
            n8a n8aVar = a42Var.a;
            if (n8aVar == null || wl7.b(getName(), n8aVar)) {
                if (pxcVar != null) {
                    String strC = getName().c();
                    strC.getClass();
                    if (!pxcVar.d(strC)) {
                        continue;
                    }
                }
                Collection<n8a> collection = a42Var.c;
                if (collection == null || collection.contains(getName())) {
                    b32[] b32VarArr = a42Var.e;
                    int length = b32VarArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            bVar = a42Var.d.invoke(this) != null ? new i32.b(false) : i32.c.b;
                        } else {
                            if (b32VarArr[i].a(this) != null) {
                                bVar = new i32.b(false);
                                break;
                            }
                            i++;
                        }
                    }
                    this.b0 = bVar.a;
                    return this;
                }
            }
        }
        bVar = i32.a.b;
        this.b0 = bVar.a;
        return this;
    }

    public final void b1(boolean z, boolean z2) {
        this.t0 = z ? z2 ? c.d : c.b : z2 ? c.c : c.a;
    }

    @Override // defpackage.mv5, defpackage.fv1
    public final boolean g0() {
        return this.t0.isSynthesized;
    }
}

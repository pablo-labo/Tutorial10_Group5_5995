package defpackage;

import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.fv1;
import defpackage.hv1;
import defpackage.lf0;
import defpackage.s62;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public class ov7 extends e4c implements mu7 {
    public final boolean p0;
    public final Pair<fv1.a<?>, ?> q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov7(aj3 aj3Var, lf0 lf0Var, ax9 ax9Var, e04 e04Var, boolean z, n8a n8aVar, qne qneVar, d4c d4cVar, hv1.a aVar, boolean z2, Pair<fv1.a<?>, ?> pair) {
        super(aj3Var, d4cVar, lf0Var, ax9Var, e04Var, z, n8aVar, aVar, qneVar, false, false, false, false, false);
        if (aj3Var == null) {
            D0(0);
            throw null;
        }
        if (lf0Var == null) {
            D0(1);
            throw null;
        }
        if (ax9Var == null) {
            D0(2);
            throw null;
        }
        if (e04Var == null) {
            D0(3);
            throw null;
        }
        if (n8aVar == null) {
            D0(4);
            throw null;
        }
        if (qneVar == null) {
            D0(5);
            throw null;
        }
        if (aVar == null) {
            D0(6);
            throw null;
        }
        this.p0 = z2;
        this.q0 = pair;
    }

    public static /* synthetic */ void D0(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case DatadogLogGenerator.CRASH /* 9 */:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(str2);
        }
    }

    public static ov7 S0(aj3 aj3Var, zo8 zo8Var, e04 e04Var, boolean z, n8a n8aVar, dw7 dw7Var, boolean z2) {
        if (aj3Var == null) {
            D0(7);
            throw null;
        }
        if (n8aVar == null) {
            D0(11);
            throw null;
        }
        if (dw7Var != null) {
            return new ov7(aj3Var, zo8Var, ax9.b, e04Var, z, n8aVar, dw7Var, null, hv1.a.a, z2, null);
        }
        D0(12);
        throw null;
    }

    @Override // defpackage.mu7
    public final mu7 I0(ui8 ui8Var, ArrayList arrayList, ui8 ui8Var2, Pair pair) {
        ui8 ui8Var3;
        g4c g4cVar;
        q4c q4cVar;
        d4c d4cVarA = a() == this ? null : a();
        ov7 ov7Var = new ov7(d(), getAnnotations(), r(), getVisibility(), this.f, getName(), g(), d4cVarA, f(), this.p0, pair);
        g4c g4cVar2 = this.l0;
        if (g4cVar2 != null) {
            g4c g4cVar3 = new g4c(ov7Var, g4cVar2.getAnnotations(), g4cVar2.r(), g4cVar2.getVisibility(), g4cVar2.e, g4cVar2.f, g4cVar2.X, f(), d4cVarA == null ? null : d4cVarA.c(), g4cVar2.g());
            g4cVar3.a0 = g4cVar2.a0;
            ui8Var3 = ui8Var2;
            g4cVar3.b0 = ui8Var3;
            g4cVar = g4cVar3;
        } else {
            ui8Var3 = ui8Var2;
            g4cVar = null;
        }
        p4c p4cVar = this.m0;
        if (p4cVar != null) {
            q4cVar = new q4c(ov7Var, p4cVar.getAnnotations(), p4cVar.r(), p4cVar.getVisibility(), p4cVar.E(), p4cVar.isExternal(), p4cVar.isInline(), f(), d4cVarA == null ? null : d4cVarA.e(), p4cVar.g());
            q4cVar.a0 = q4cVar.a0;
            rlg rlgVar = p4cVar.i().get(0);
            if (rlgVar == null) {
                q4c.D0(6);
                throw null;
            }
            q4cVar.b0 = rlgVar;
        } else {
            q4cVar = null;
        }
        ov7Var.P0(g4cVar, q4cVar, this.n0, this.o0);
        gu5<sma<up2<?>>> gu5Var = this.W;
        if (gu5Var != null) {
            ov7Var.L0(this.V, gu5Var);
        }
        ov7Var.C0(m());
        ov7Var.R0(ui8Var3, getTypeParameters(), this.i0, ui8Var != null ? jz3.h(this, ui8Var, lf0.a.a) : null, zr4.a);
        return ov7Var;
    }

    @Override // defpackage.e4c
    public final e4c O0(aj3 aj3Var, ax9 ax9Var, e04 e04Var, d4c d4cVar, hv1.a aVar, n8a n8aVar) {
        if (aj3Var == null) {
            D0(13);
            throw null;
        }
        if (ax9Var == null) {
            D0(14);
            throw null;
        }
        if (e04Var == null) {
            D0(15);
            throw null;
        }
        if (aVar == null) {
            D0(16);
            throw null;
        }
        if (n8aVar == null) {
            D0(17);
            throw null;
        }
        return new ov7(aj3Var, getAnnotations(), ax9Var, e04Var, this.f, n8aVar, qne.p, d4cVar, aVar, this.p0, this.q0);
    }

    @Override // defpackage.e4c
    public final void Q0(ui8 ui8Var) {
    }

    @Override // defpackage.e4c, defpackage.vlg
    public final boolean b0() {
        ui8 type = getType();
        if (!this.p0) {
            return false;
        }
        type.getClass();
        if (((!ei8.H(type) && !k7g.a(type)) || kyf.e(type)) && !ei8.I(type)) {
            return false;
        }
        bu4 bu4Var = jxf.a;
        mq5 mq5Var = kc8.p;
        mq5Var.getClass();
        return !s62.a.t(type, mq5Var) || ei8.I(type);
    }

    @Override // defpackage.wlg, defpackage.fv1
    public final boolean g0() {
        return false;
    }

    @Override // defpackage.e4c, defpackage.fv1
    public final <V> V j0(fv1.a<V> aVar) {
        Pair<fv1.a<?>, ?> pair = this.q0;
        if (pair == null || !pair.d().equals(aVar)) {
            return null;
        }
        return (V) pair.e();
    }
}

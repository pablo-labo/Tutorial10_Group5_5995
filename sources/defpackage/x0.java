package defpackage;

import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x0 extends tx9 {
    public final n8a a;
    public final fla<mge> b;
    public final fla<in9> c;
    public final fla<hsc> d;

    public class a implements gu5<mge> {
        public a() {
        }

        @Override // defpackage.gu5
        public final mge invoke() {
            x0 x0Var = x0.this;
            in9 in9VarW = x0Var.W();
            w0 w0Var = new w0(this);
            hx4 hx4Var = kyf.a;
            if (!lx4.f(x0Var)) {
                return kyf.l(x0Var.j(), in9VarW, w0Var);
            }
            return lx4.c(kx4.X, x0Var.toString());
        }
    }

    public class b implements gu5<in9> {
        public b() {
        }

        @Override // defpackage.gu5
        public final in9 invoke() {
            return new oe7(x0.this.W());
        }
    }

    public class c implements gu5<hsc> {
        public c() {
        }

        @Override // defpackage.gu5
        public final hsc invoke() {
            return new en8(x0.this);
        }
    }

    public x0(aue aueVar, n8a n8aVar) {
        if (aueVar == null) {
            D0(0);
            throw null;
        }
        if (n8aVar == null) {
            D0(1);
            throw null;
        }
        this.a = n8aVar;
        this.b = aueVar.f(new a());
        this.c = aueVar.f(new b());
        this.d = aueVar.f(new c());
    }

    public static /* synthetic */ void D0(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 12:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 16:
            case 17:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 12:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 16:
            case 17:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.qxe
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public t52 b(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return typeSubstitutor.a.e() ? this : new pt8(this, typeSubstitutor);
        }
        D0(18);
        throw null;
    }

    @Override // defpackage.t52
    public final in9 H(byf byfVar) {
        in9 in9VarT = t(byfVar, b04.h(yz3.d(this)));
        if (in9VarT != null) {
            return in9VarT;
        }
        D0(16);
        throw null;
    }

    @Override // defpackage.t52
    public final hsc J0() {
        hsc hscVarInvoke = this.d.invoke();
        if (hscVarInvoke != null) {
            return hscVarInvoke;
        }
        D0(5);
        throw null;
    }

    @Override // defpackage.t52
    public in9 T() {
        in9 in9VarInvoke = this.c.invoke();
        if (in9VarInvoke != null) {
            return in9VarInvoke;
        }
        D0(4);
        throw null;
    }

    @Override // defpackage.t52
    public in9 W() {
        in9 in9VarK = K(b04.h(yz3.d(this)));
        if (in9VarK != null) {
            return in9VarK;
        }
        D0(17);
        throw null;
    }

    @Override // defpackage.t52
    public List<hsc> Y() {
        List<hsc> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        D0(6);
        throw null;
    }

    @Override // defpackage.tx9, defpackage.t52, defpackage.aj3
    public final aj3 a() {
        return this;
    }

    @Override // defpackage.tx9, defpackage.aj3
    public final v62 a() {
        return this;
    }

    @Override // defpackage.aj3
    public final n8a getName() {
        n8a n8aVar = this.a;
        if (n8aVar != null) {
            return n8aVar;
        }
        D0(2);
        throw null;
    }

    @Override // defpackage.t52, defpackage.v62
    public final mge o() {
        mge mgeVarInvoke = this.b.invoke();
        if (mgeVarInvoke != null) {
            return mgeVarInvoke;
        }
        D0(20);
        throw null;
    }

    @Override // defpackage.aj3
    public final <R, D> R o0(ej3<R, D> ej3Var, D d) {
        return (R) ej3Var.h(this, d);
    }

    @Override // defpackage.tx9
    public in9 t(byf byfVar, bj8 bj8Var) {
        if (bj8Var == null) {
            D0(11);
            throw null;
        }
        if (!byfVar.e()) {
            return new vxe(K(bj8Var), TypeSubstitutor.e(byfVar));
        }
        in9 in9VarK = K(bj8Var);
        if (in9VarK != null) {
            return in9VarK;
        }
        D0(12);
        throw null;
    }

    @Override // defpackage.tx9, defpackage.t52, defpackage.aj3
    public final t52 a() {
        return this;
    }
}

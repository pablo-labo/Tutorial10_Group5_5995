package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.fv1;
import defpackage.hv1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x3c extends dj3 implements w3c {
    public final ax9 V;
    public final d4c W;
    public final boolean X;
    public final hv1.a Y;
    public e04 Z;
    public kv5 a0;
    public boolean e;
    public final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3c(ax9 ax9Var, e04 e04Var, d4c d4cVar, lf0 lf0Var, n8a n8aVar, boolean z, boolean z2, boolean z3, hv1.a aVar, qne qneVar) {
        super(d4cVar.d(), lf0Var, n8aVar, qneVar);
        if (ax9Var == null) {
            D0(0);
            throw null;
        }
        if (e04Var == null) {
            D0(1);
            throw null;
        }
        if (lf0Var == null) {
            D0(3);
            throw null;
        }
        if (qneVar == null) {
            D0(5);
            throw null;
        }
        this.a0 = null;
        this.V = ax9Var;
        this.Z = e04Var;
        this.W = d4cVar;
        this.e = z;
        this.f = z2;
        this.X = z3;
        this.Y = aVar;
    }

    public static /* synthetic */ void D0(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
            case 12:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
            case 12:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
            case 12:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
            case 12:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
            case 12:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.kv5
    public final boolean B() {
        return false;
    }

    @Override // defpackage.kv5
    public final boolean B0() {
        return false;
    }

    @Override // defpackage.hv1
    public final void C0(Collection<? extends hv1> collection) {
        if (collection != null) {
            return;
        }
        D0(16);
        throw null;
    }

    @Override // defpackage.w3c
    public final boolean E() {
        return this.e;
    }

    @Override // defpackage.kv5
    public final boolean E0() {
        return false;
    }

    @Override // defpackage.fv1
    public final hsc L() {
        return V().L();
    }

    @Override // defpackage.dj3, defpackage.bj3, defpackage.aj3
    /* JADX INFO: renamed from: L0 */
    public abstract w3c a();

    public final ArrayList M0(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        Iterator<? extends hv1> it = V().m().iterator();
        while (it.hasNext()) {
            d4c d4cVar = (d4c) it.next();
            fv1 fv1VarC = z ? d4cVar.c() : d4cVar.e();
            if (fv1VarC != null) {
                arrayList.add(fv1VarC);
            }
        }
        return arrayList;
    }

    @Override // defpackage.fv1
    public final hsc O() {
        return V().O();
    }

    @Override // defpackage.w3c
    public final d4c V() {
        d4c d4cVar = this.W;
        if (d4cVar != null) {
            return d4cVar;
        }
        D0(13);
        throw null;
    }

    @Override // defpackage.zm9
    public final boolean X() {
        return false;
    }

    @Override // defpackage.hv1
    public final hv1 Z(t52 t52Var, ax9 ax9Var, ws3 ws3Var) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // defpackage.kv5, defpackage.qxe
    public final kv5 b(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return this;
        }
        D0(7);
        throw null;
    }

    @Override // defpackage.hv1
    public final hv1.a f() {
        hv1.a aVar = this.Y;
        if (aVar != null) {
            return aVar;
        }
        D0(6);
        throw null;
    }

    @Override // defpackage.fv1
    public final boolean g0() {
        return false;
    }

    @Override // defpackage.fv1
    public final List<rxf> getTypeParameters() {
        List<rxf> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        D0(9);
        throw null;
    }

    @Override // defpackage.fj3
    public final e04 getVisibility() {
        e04 e04Var = this.Z;
        if (e04Var != null) {
            return e04Var;
        }
        D0(11);
        throw null;
    }

    @Override // defpackage.zm9
    public final boolean i0() {
        return false;
    }

    @Override // defpackage.zm9
    public final boolean isExternal() {
        return this.f;
    }

    @Override // defpackage.kv5
    public final boolean isInfix() {
        return false;
    }

    @Override // defpackage.kv5
    public final boolean isInline() {
        return this.X;
    }

    @Override // defpackage.kv5
    public final boolean isOperator() {
        return false;
    }

    @Override // defpackage.kv5
    public final boolean isSuspend() {
        return false;
    }

    @Override // defpackage.fv1
    public final <V> V j0(fv1.a<V> aVar) {
        return null;
    }

    @Override // defpackage.zm9
    public final ax9 r() {
        ax9 ax9Var = this.V;
        if (ax9Var != null) {
            return ax9Var;
        }
        D0(10);
        throw null;
    }

    @Override // defpackage.kv5
    public final kv5 s0() {
        return this.a0;
    }

    @Override // defpackage.fv1
    public final List<hsc> w0() {
        List<hsc> listW0 = V().w0();
        if (listW0 != null) {
            return listW0;
        }
        D0(14);
        throw null;
    }

    @Override // defpackage.qxe
    public final /* bridge */ /* synthetic */ cj3 b(TypeSubstitutor typeSubstitutor) {
        b(typeSubstitutor);
        return this;
    }
}

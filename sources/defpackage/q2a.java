package defpackage;

import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.in9;
import defpackage.lf0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class q2a extends u52 {
    public final c62 V;
    public ax9 W;
    public e04 X;
    public k62 Y;
    public ArrayList Z;
    public final ArrayList a0;
    public final aue b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2a(es4 es4Var, n8a n8aVar, aue aueVar) {
        super(aueVar, es4Var, n8aVar, qne.p);
        if (aueVar == null) {
            D0(4);
            throw null;
        }
        this.a0 = new ArrayList();
        this.b0 = aueVar;
        this.V = c62.INTERFACE;
    }

    public static /* synthetic */ void D0(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 12:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                i2 = 2;
                break;
            case 6:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 12:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 12:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                throw new IllegalStateException(str2);
            case 6:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 12:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.t52
    public final m52 C() {
        return null;
    }

    @Override // defpackage.t52
    public final boolean H0() {
        return false;
    }

    @Override // defpackage.tx9
    public final in9 K(bj8 bj8Var) {
        if (bj8Var == null) {
            D0(16);
            throw null;
        }
        in9.b bVar = in9.b.b;
        if (bVar != null) {
            return bVar;
        }
        D0(17);
        throw null;
    }

    @Override // defpackage.t52
    public final hlg<mge> U() {
        return null;
    }

    @Override // defpackage.zm9
    public final boolean X() {
        return false;
    }

    @Override // defpackage.t52
    public final boolean a0() {
        return false;
    }

    @Override // defpackage.t52
    public final boolean e0() {
        return false;
    }

    @Override // defpackage.t52
    public final c62 f() {
        c62 c62Var = this.V;
        if (c62Var != null) {
            return c62Var;
        }
        D0(8);
        throw null;
    }

    @Override // defpackage.ie0
    public final lf0 getAnnotations() {
        return lf0.a.a;
    }

    @Override // defpackage.t52, defpackage.zm9, defpackage.fj3
    public final e04 getVisibility() {
        e04 e04Var = this.X;
        if (e04Var != null) {
            return e04Var;
        }
        D0(10);
        throw null;
    }

    @Override // defpackage.zm9
    public final boolean i0() {
        return false;
    }

    @Override // defpackage.t52
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.v62
    public final kwf j() {
        k62 k62Var = this.Y;
        if (k62Var != null) {
            return k62Var;
        }
        D0(11);
        throw null;
    }

    @Override // defpackage.t52
    public final Collection k() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        D0(13);
        throw null;
    }

    @Override // defpackage.t52
    public final in9 l0() {
        in9.b bVar = in9.b.b;
        if (bVar != null) {
            return bVar;
        }
        D0(18);
        throw null;
    }

    @Override // defpackage.t52
    public final t52 m0() {
        return null;
    }

    @Override // defpackage.t52, defpackage.w62
    public final List<rxf> p() {
        ArrayList arrayList = this.Z;
        if (arrayList != null) {
            return arrayList;
        }
        D0(15);
        throw null;
    }

    @Override // defpackage.t52, defpackage.zm9
    public final ax9 r() {
        ax9 ax9Var = this.W;
        if (ax9Var != null) {
            return ax9Var;
        }
        D0(7);
        throw null;
    }

    @Override // defpackage.t52
    public final boolean s() {
        return false;
    }

    public final String toString() {
        return bj3.G0(this);
    }

    @Override // defpackage.t52
    public final Collection<t52> x() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        D0(19);
        throw null;
    }

    @Override // defpackage.w62
    public final boolean y() {
        return false;
    }
}

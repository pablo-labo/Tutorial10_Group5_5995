package defpackage;

import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.d04;
import defpackage.in9;
import defpackage.lf0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class w52 extends u52 {
    public final ax9 V;
    public final c62 W;
    public final k62 X;
    public in9 Y;
    public Set<m52> Z;
    public m52 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w52(aj3 aj3Var, n8a n8aVar, ax9 ax9Var, c62 c62Var, Collection collection, aue aueVar) {
        super(aueVar, aj3Var, n8aVar, qne.p);
        if (aj3Var == null) {
            D0(0);
            throw null;
        }
        if (n8aVar == null) {
            D0(1);
            throw null;
        }
        if (aueVar == null) {
            D0(6);
            throw null;
        }
        this.V = ax9Var;
        this.W = c62Var;
        this.X = new k62(this, Collections.EMPTY_LIST, collection, aueVar);
    }

    public static /* synthetic */ void D0(int i) {
        String str;
        int i2;
        switch (i) {
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case DatadogLogGenerator.CRASH /* 9 */:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.t52
    public final m52 C() {
        return this.a0;
    }

    @Override // defpackage.t52
    public final boolean H0() {
        return false;
    }

    @Override // defpackage.tx9
    public final in9 K(bj8 bj8Var) {
        if (bj8Var == null) {
            D0(12);
            throw null;
        }
        in9 in9Var = this.Y;
        if (in9Var != null) {
            return in9Var;
        }
        D0(13);
        throw null;
    }

    public final void K0(in9 in9Var, Set set, n52 n52Var) {
        if (in9Var == null) {
            D0(7);
            throw null;
        }
        this.Y = in9Var;
        this.Z = set;
        this.a0 = n52Var;
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
        c62 c62Var = this.W;
        if (c62Var != null) {
            return c62Var;
        }
        D0(15);
        throw null;
    }

    @Override // defpackage.ie0
    public final lf0 getAnnotations() {
        return lf0.a.a;
    }

    @Override // defpackage.t52, defpackage.zm9, defpackage.fj3
    public final e04 getVisibility() {
        d04.h hVar = d04.e;
        if (hVar != null) {
            return hVar;
        }
        D0(17);
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
        k62 k62Var = this.X;
        if (k62Var != null) {
            return k62Var;
        }
        D0(10);
        throw null;
    }

    @Override // defpackage.t52
    public final Collection<m52> k() {
        Set<m52> set = this.Z;
        if (set != null) {
            return set;
        }
        D0(11);
        throw null;
    }

    @Override // defpackage.t52
    public final in9 l0() {
        in9.b bVar = in9.b.b;
        if (bVar != null) {
            return bVar;
        }
        D0(14);
        throw null;
    }

    @Override // defpackage.t52
    public final t52 m0() {
        return null;
    }

    @Override // defpackage.t52, defpackage.w62
    public final List<rxf> p() {
        List<rxf> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        D0(18);
        throw null;
    }

    @Override // defpackage.t52, defpackage.zm9
    public final ax9 r() {
        ax9 ax9Var = this.V;
        if (ax9Var != null) {
            return ax9Var;
        }
        D0(16);
        throw null;
    }

    @Override // defpackage.t52
    public final boolean s() {
        return false;
    }

    public String toString() {
        return "class " + getName();
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

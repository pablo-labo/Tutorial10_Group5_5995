package defpackage;

import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.d04;
import defpackage.in9;
import defpackage.j29;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class yv4 extends u52 {
    public final k62 V;
    public final a W;
    public final fla<Set<n8a>> X;
    public final lf0 Y;

    public class a extends jn9 {
        public final nn9<n8a, Collection<? extends sfe>> b;
        public final nn9<n8a, Collection<? extends d4c>> c;
        public final fla<Collection<aj3>> d;
        public final /* synthetic */ yv4 e;

        /* JADX INFO: renamed from: yv4$a$a, reason: collision with other inner class name */
        public class C0484a implements Function1<n8a, Collection<? extends sfe>> {
            public C0484a() {
            }

            @Override // kotlin.jvm.functions.Function1
            public final Collection<? extends sfe> invoke(n8a n8aVar) {
                n8a n8aVar2 = n8aVar;
                if (n8aVar2 != null) {
                    a aVar = a.this;
                    return aVar.j(n8aVar2, aVar.i().e(n8aVar2, dia.f));
                }
                a.h(8);
                throw null;
            }
        }

        public class b implements Function1<n8a, Collection<? extends d4c>> {
            public b() {
            }

            @Override // kotlin.jvm.functions.Function1
            public final Collection<? extends d4c> invoke(n8a n8aVar) {
                n8a n8aVar2 = n8aVar;
                if (n8aVar2 != null) {
                    a aVar = a.this;
                    return aVar.j(n8aVar2, aVar.i().b(n8aVar2, dia.f));
                }
                a.h(4);
                throw null;
            }
        }

        public class c implements gu5<Collection<aj3>> {
            public c() {
            }

            @Override // defpackage.gu5
            public final Collection<aj3> invoke() {
                HashSet hashSet = new HashSet();
                a aVar = a.this;
                for (n8a n8aVar : aVar.e.X.invoke()) {
                    dia diaVar = dia.f;
                    hashSet.addAll(aVar.e(n8aVar, diaVar));
                    hashSet.addAll(aVar.b(n8aVar, diaVar));
                }
                return hashSet;
            }
        }

        public a(yv4 yv4Var, aue aueVar) {
            if (aueVar == null) {
                h(0);
                throw null;
            }
            this.e = yv4Var;
            this.b = aueVar.g(new C0484a());
            this.c = aueVar.g(new b());
            this.d = aueVar.f(new c());
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static /* synthetic */ void h(int r13) {
            /*
                Method dump skipped, instruction units count: 346
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: yv4.a.h(int):void");
        }

        @Override // defpackage.jn9, defpackage.in9
        public final Set<n8a> a() {
            Set<n8a> setInvoke = this.e.X.invoke();
            if (setInvoke != null) {
                return setInvoke;
            }
            h(17);
            throw null;
        }

        @Override // defpackage.jn9, defpackage.in9
        public final Collection b(n8a n8aVar, dia diaVar) {
            if (n8aVar != null) {
                return (Collection) ((j29.k) this.c).invoke(n8aVar);
            }
            h(1);
            throw null;
        }

        @Override // defpackage.jn9, defpackage.in9
        public final Set<n8a> c() {
            Set<n8a> setInvoke = this.e.X.invoke();
            if (setInvoke != null) {
                return setInvoke;
            }
            h(19);
            throw null;
        }

        @Override // defpackage.jn9, defpackage.in9
        public final Collection<? extends sfe> e(n8a n8aVar, dia diaVar) {
            if (n8aVar != null) {
                return (Collection) ((j29.k) this.b).invoke(n8aVar);
            }
            h(5);
            throw null;
        }

        @Override // defpackage.jn9, defpackage.z4d
        public final Collection<aj3> f(lz3 lz3Var, Function1<? super n8a, Boolean> function1) {
            if (lz3Var == null) {
                h(13);
                throw null;
            }
            Collection<aj3> collectionInvoke = this.d.invoke();
            if (collectionInvoke != null) {
                return collectionInvoke;
            }
            h(15);
            throw null;
        }

        @Override // defpackage.jn9, defpackage.in9
        public final Set<n8a> g() {
            Set<n8a> set = Collections.EMPTY_SET;
            if (set != null) {
                return set;
            }
            h(18);
            throw null;
        }

        public final in9 i() {
            in9 in9VarN = ((a5) this.e.j()).b().iterator().next().n();
            if (in9VarN != null) {
                return in9VarN;
            }
            h(9);
            throw null;
        }

        public final LinkedHashSet j(n8a n8aVar, Collection collection) {
            if (n8aVar == null) {
                h(10);
                throw null;
            }
            if (collection == null) {
                h(11);
                throw null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ixa.e.h(n8aVar, collection, Collections.EMPTY_SET, this.e, new zv4(linkedHashSet));
            return linkedHashSet;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv4(aue aueVar, t52 t52Var, mge mgeVar, n8a n8aVar, fla flaVar, lf0 lf0Var, qne qneVar) {
        super(aueVar, t52Var, n8aVar, qneVar);
        if (aueVar == null) {
            D0(6);
            throw null;
        }
        if (t52Var == null) {
            D0(7);
            throw null;
        }
        if (mgeVar == null) {
            D0(8);
            throw null;
        }
        if (n8aVar == null) {
            D0(9);
            throw null;
        }
        if (flaVar == null) {
            D0(10);
            throw null;
        }
        if (qneVar == null) {
            D0(12);
            throw null;
        }
        this.Y = lf0Var;
        this.V = new k62(this, Collections.EMPTY_LIST, Collections.singleton(mgeVar), aueVar);
        this.W = new a(this, aueVar);
        this.X = flaVar;
    }

    public static /* synthetic */ void D0(int i) {
        String str;
        int i2;
        switch (i) {
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case DatadogLogGenerator.CRASH /* 9 */:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static yv4 K0(aue aueVar, t52 t52Var, n8a n8aVar, fla<Set<n8a>> flaVar, lf0 lf0Var, qne qneVar) {
        if (aueVar == null) {
            D0(0);
            throw null;
        }
        if (t52Var == null) {
            D0(1);
            throw null;
        }
        if (n8aVar == null) {
            D0(2);
            throw null;
        }
        if (flaVar == null) {
            D0(3);
            throw null;
        }
        if (qneVar != null) {
            return new yv4(aueVar, t52Var, t52Var.o(), n8aVar, flaVar, lf0Var, qneVar);
        }
        D0(5);
        throw null;
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
            D0(13);
            throw null;
        }
        a aVar = this.W;
        if (aVar != null) {
            return aVar;
        }
        D0(14);
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
        return c62.ENUM_ENTRY;
    }

    @Override // defpackage.ie0
    public final lf0 getAnnotations() {
        lf0 lf0Var = this.Y;
        if (lf0Var != null) {
            return lf0Var;
        }
        D0(21);
        throw null;
    }

    @Override // defpackage.t52, defpackage.zm9, defpackage.fj3
    public final e04 getVisibility() {
        d04.h hVar = d04.e;
        if (hVar != null) {
            return hVar;
        }
        D0(20);
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
        k62 k62Var = this.V;
        if (k62Var != null) {
            return k62Var;
        }
        D0(17);
        throw null;
    }

    @Override // defpackage.t52
    public final Collection<m52> k() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        D0(16);
        throw null;
    }

    @Override // defpackage.t52
    public final in9 l0() {
        in9.b bVar = in9.b.b;
        if (bVar != null) {
            return bVar;
        }
        D0(15);
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
        D0(22);
        throw null;
    }

    @Override // defpackage.t52, defpackage.zm9
    public final ax9 r() {
        return ax9.b;
    }

    @Override // defpackage.t52
    public final boolean s() {
        return false;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // defpackage.t52
    public final Collection<t52> x() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        D0(23);
        throw null;
    }

    @Override // defpackage.w62
    public final boolean y() {
        return false;
    }
}

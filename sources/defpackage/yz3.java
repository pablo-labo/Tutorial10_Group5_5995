package defpackage;

import app.rive.runtime.kotlin.renderers.RendererMetrics;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.internal.domain.scope.RumViewScope;
import com.datadog.android.trace.AndroidTracer;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.hv1;
import defpackage.sne;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class yz3 {
    public static final /* synthetic */ int a = 0;

    static {
        new mq5("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 60:
            case AndroidTracer.SPAN_ID_BIT_SIZE /* 63 */:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case RendererMetrics.SAMPLES /* 30 */:
            case 32:
            case 45:
            case 66:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case RumViewScope.SLOW_RENDERED_THRESHOLD_FPS /* 55 */:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case 80:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case RendererMetrics.SAMPLES /* 30 */:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case RumViewScope.SLOW_RENDERED_THRESHOLD_FPS /* 55 */:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case AndroidTracer.SPAN_ID_BIT_SIZE /* 63 */:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 80:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void b(fv1 fv1Var, LinkedHashSet linkedHashSet) {
        if (fv1Var == null) {
            a(72);
            throw null;
        }
        if (linkedHashSet.contains(fv1Var)) {
            return;
        }
        Iterator<? extends fv1> it = fv1Var.a().m().iterator();
        while (it.hasNext()) {
            fv1 fv1VarA = it.next().a();
            b(fv1VarA, linkedHashSet);
            linkedHashSet.add(fv1VarA);
        }
    }

    public static t52 c(ui8 ui8Var) {
        if (ui8Var == null) {
            a(45);
            throw null;
        }
        kwf kwfVarM0 = ui8Var.M0();
        if (kwfVarM0 == null) {
            a(46);
            throw null;
        }
        t52 t52Var = (t52) kwfVarM0.d();
        if (t52Var != null) {
            return t52Var;
        }
        a(47);
        throw null;
    }

    public static xx9 d(aj3 aj3Var) {
        if (aj3Var == null) {
            a(21);
            throw null;
        }
        xx9 xx9VarE = e(aj3Var);
        if (xx9VarE != null) {
            return xx9VarE;
        }
        a(22);
        throw null;
    }

    public static xx9 e(aj3 aj3Var) {
        if (aj3Var == null) {
            a(23);
            throw null;
        }
        while (aj3Var != null) {
            if (aj3Var instanceof xx9) {
                return (xx9) aj3Var;
            }
            if (aj3Var instanceof wya) {
                return ((wya) aj3Var).A0();
            }
            aj3Var = aj3Var.d();
        }
        return null;
    }

    public static sne f(aj3 aj3Var) {
        if (aj3Var == null) {
            a(81);
            throw null;
        }
        if (aj3Var instanceof p4c) {
            aj3Var = ((p4c) aj3Var).V();
        }
        boolean z = aj3Var instanceof cj3;
        sne.a aVar = sne.a;
        if (z) {
            ((cj3) aj3Var).g().getClass();
        }
        return aVar;
    }

    public static nq5 g(aj3 aj3Var) {
        if (aj3Var != null) {
            mq5 mq5VarH = h(aj3Var);
            return mq5VarH != null ? mq5VarH.a : g(aj3Var.d()).a(aj3Var.getName());
        }
        a(2);
        throw null;
    }

    public static mq5 h(aj3 aj3Var) {
        if (aj3Var == null) {
            a(5);
            throw null;
        }
        if ((aj3Var instanceof xx9) || lx4.f(aj3Var)) {
            return mq5.c;
        }
        if (aj3Var instanceof wya) {
            return ((wya) aj3Var).h();
        }
        if (aj3Var instanceof lya) {
            return ((lya) aj3Var).h();
        }
        return null;
    }

    public static <D extends aj3> D i(aj3 aj3Var, Class<D> cls, boolean z) {
        if (aj3Var == null) {
            return null;
        }
        if (z) {
            aj3Var = (D) aj3Var.d();
        }
        while (aj3Var != null) {
            if (cls.isInstance(aj3Var)) {
                return (D) aj3Var;
            }
            aj3Var = (D) aj3Var.d();
        }
        return null;
    }

    public static t52 j(t52 t52Var) {
        if (t52Var == null) {
            a(44);
            throw null;
        }
        Iterator<ui8> it = t52Var.j().b().iterator();
        while (it.hasNext()) {
            t52 t52VarC = c(it.next());
            if (t52VarC.f() != c62.INTERFACE) {
                return t52VarC;
            }
        }
        return null;
    }

    public static boolean k(aj3 aj3Var) {
        return n(aj3Var, c62.CLASS) && aj3Var.getName().equals(toe.a);
    }

    public static boolean l(aj3 aj3Var) {
        return n(aj3Var, c62.OBJECT) && ((t52) aj3Var).a0();
    }

    public static boolean m(aj3 aj3Var) {
        if (aj3Var != null) {
            return n(aj3Var, c62.ENUM_ENTRY);
        }
        a(36);
        throw null;
    }

    public static boolean n(aj3 aj3Var, c62 c62Var) {
        return (aj3Var instanceof t52) && ((t52) aj3Var).f() == c62Var;
    }

    public static boolean o(aj3 aj3Var) {
        if (aj3Var == null) {
            a(1);
            throw null;
        }
        while (aj3Var != null) {
            if (k(aj3Var) || ((aj3Var instanceof fj3) && ((fj3) aj3Var).getVisibility() == d04.f)) {
                return true;
            }
            aj3Var = aj3Var.d();
        }
        return false;
    }

    public static boolean p(ui8 ui8Var, aj3 aj3Var) {
        if (ui8Var == null) {
            a(30);
            throw null;
        }
        if (aj3Var == null) {
            a(31);
            throw null;
        }
        v62 v62VarD = ui8Var.M0().d();
        if (v62VarD == null) {
            return false;
        }
        aj3 aj3VarA = v62VarD.a();
        return (aj3VarA instanceof v62) && (aj3Var instanceof v62) && ((v62) aj3Var).j().equals(((v62) aj3VarA).j());
    }

    public static boolean q(aj3 aj3Var) {
        return (n(aj3Var, c62.CLASS) || n(aj3Var, c62.INTERFACE)) && ((t52) aj3Var).r() == ax9.c;
    }

    public static boolean r(ui8 ui8Var, aj3 aj3Var) {
        if (ui8Var == null) {
            a(32);
            throw null;
        }
        if (aj3Var == null) {
            a(33);
            throw null;
        }
        if (p(ui8Var, aj3Var)) {
            return true;
        }
        Iterator<ui8> it = ui8Var.M0().b().iterator();
        while (it.hasNext()) {
            if (r(it.next(), aj3Var)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(aj3 aj3Var) {
        return aj3Var != null && (aj3Var.d() instanceof lya);
    }

    public static <D extends hv1> D t(D d) {
        if (d == null) {
            a(58);
            throw null;
        }
        while (d.f() == hv1.a.b) {
            Collection<? extends hv1> collectionM = d.m();
            if (collectionM.isEmpty()) {
                bg.n(d, "Fake override should have at least one overridden descriptor: ");
                return null;
            }
            d = (D) collectionM.iterator().next();
        }
        return d;
    }
}

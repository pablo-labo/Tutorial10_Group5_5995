package defpackage;

import defpackage.cze;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k62 extends y0 {
    public final tx9 c;
    public final List<rxf> d;
    public final Collection<ui8> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k62(tx9 tx9Var, List list, Collection collection, aue aueVar) {
        super(aueVar);
        if (list == null) {
            o(1);
            throw null;
        }
        if (collection == null) {
            o(2);
            throw null;
        }
        if (aueVar == null) {
            o(3);
            throw null;
        }
        this.c = tx9Var;
        this.d = Collections.unmodifiableList(new ArrayList(list));
        this.e = Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void o(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.kwf
    public final boolean e() {
        return true;
    }

    @Override // defpackage.a5
    public final Collection<ui8> g() {
        Collection<ui8> collection = this.e;
        if (collection != null) {
            return collection;
        }
        o(6);
        throw null;
    }

    @Override // defpackage.kwf
    public final List<rxf> getParameters() {
        List<rxf> list = this.d;
        if (list != null) {
            return list;
        }
        o(4);
        throw null;
    }

    @Override // defpackage.a5
    public final cze j() {
        return cze.a.a;
    }

    @Override // defpackage.y0
    /* JADX INFO: renamed from: p */
    public final t52 d() {
        tx9 tx9Var = this.c;
        if (tx9Var != null) {
            return tx9Var;
        }
        o(5);
        throw null;
    }

    public final String toString() {
        return yz3.g(this.c).a;
    }
}

package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lyf implements TypeVariable<GenericDeclaration>, Type {
    public final dg8 a;

    public lyf(dg8 dg8Var) {
        this.a = dg8Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !this.a.getName().equals(((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        List<zf8> upperBounds = this.a.getUpperBounds();
        ArrayList arrayList = new ArrayList(t92.r0(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(kzf.b((zf8) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new ela("An operation is not implemented: ".concat("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.a));
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return this.a.getName();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return this.a.getName();
    }

    public final int hashCode() {
        this.a.getName();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return this.a.getName();
    }
}

package defpackage;

import defpackage.fdd;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class j1a<Type extends fdd> extends hlg<Type> {
    public final ArrayList a;
    public final Map<n8a, Type> b;

    public j1a(ArrayList arrayList) {
        this.a = arrayList;
        this.b = lc9.f0(arrayList);
    }

    @Override // defpackage.hlg
    public final boolean a(n8a n8aVar) {
        return this.b.containsKey(n8aVar);
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.a + ')';
    }
}

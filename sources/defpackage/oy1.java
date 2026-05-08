package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class oy1 {
    public final List<String> a;

    public oy1(List<String> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oy1) && this.a.equals(((oy1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g7.h("CategoricalOQVTGenericAttributesFilterInput(attributeIds=", ")", this.a);
    }
}

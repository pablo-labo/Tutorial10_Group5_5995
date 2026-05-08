package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m1<Element, Collection, Builder> implements KSerializer<Collection> {
    public abstract Builder a();

    public abstract int b(Builder builder);

    public abstract Iterator<Element> c(Collection collection);

    public abstract int d(Collection collection);

    @Override // defpackage.i04
    public Collection deserialize(Decoder decoder) {
        return (Collection) e(decoder);
    }

    public final Object e(Decoder decoder) {
        Builder builderA = a();
        int iB = b(builderA);
        ul2 ul2VarB = decoder.b(getDescriptor());
        while (true) {
            int iP = ul2VarB.p(getDescriptor());
            if (iP == -1) {
                ul2VarB.c(getDescriptor());
                return h(builderA);
            }
            f(ul2VarB, iP + iB, builderA);
        }
    }

    public abstract void f(ul2 ul2Var, int i, Object obj);

    public abstract Builder g(Collection collection);

    public abstract Collection h(Builder builder);
}

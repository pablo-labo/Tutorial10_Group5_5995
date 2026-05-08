package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ax5;
import java.io.Externalizable;
import java.util.IdentityHashMap;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dpe implements cpe, Comparable<cpe>, la7, Externalizable {
    @Override // java.lang.Comparable
    public final int compareTo(cpe cpeVar) {
        return m().a(this, cpeVar, a(), false);
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof cpe) && getClass() == obj.getClass() && m().a(this, obj, a(), true) == 0);
    }

    public void f(d5d d5dVar) {
        throw new UnsupportedOperationException();
    }

    public void h(g54 g54Var) {
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        zoe zoeVarM = m();
        g gVarA = a();
        zoeVarM.getClass();
        return new ax5.e().a(this, gVarA);
    }

    public abstract zoe m();

    public boolean n() {
        return this instanceof xz;
    }

    public final String toString() {
        zoe zoeVarM = m();
        zoeVarM.getClass();
        StringBuilder sb = new StringBuilder();
        zoeVarM.r(this, sb, new IdentityHashMap<>(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
        return sb.toString();
    }
}

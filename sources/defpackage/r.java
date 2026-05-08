package defpackage;

import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public final class r {
    public Cloneable a;

    public r() {
        this.a = new Vector();
    }

    public void a(q qVar) {
        ((Vector) this.a).addElement(qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(String[] strArr) {
        strArr.getClass();
        this.a = strArr;
    }
}

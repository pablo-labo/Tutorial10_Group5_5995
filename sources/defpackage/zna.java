package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zna<V> {
    public V a;

    public zna(V v) {
        this.a = v;
    }

    public void a(qf8<?> qf8Var, V v, V v2) {
        qf8Var.getClass();
    }

    public void b(qf8 qf8Var) {
        qf8Var.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(qf8 qf8Var, Object obj, Object obj2) {
        qf8Var.getClass();
        V v = this.a;
        b(qf8Var);
        this.a = obj2;
        a(qf8Var, v, obj2);
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.a + ')';
    }
}

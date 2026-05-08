package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vge<T> extends hg7<T> {
    public T b;

    public static final class a extends mj8 implements gu5<j6g> {
        final /* synthetic */ fg7 $context;
        final /* synthetic */ vge<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vge<T> vgeVar, fg7 fg7Var) {
            super(0);
            this.this$0 = vgeVar;
            this.$context = fg7Var;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            vge<T> vgeVar = this.this$0;
            fg7 fg7Var = this.$context;
            if (vgeVar.b == null) {
                vgeVar.b = vgeVar.a(fg7Var);
            }
            return j6g.a;
        }
    }

    public vge() {
        throw null;
    }

    @Override // defpackage.hg7
    public final T a(fg7 fg7Var) {
        fg7Var.getClass();
        T t = this.b;
        if (t == null) {
            return (T) super.a(fg7Var);
        }
        if (t != null) {
            return t;
        }
        r6.g("Single instance created couldn't return value");
        return null;
    }

    @Override // defpackage.hg7
    public final void b() {
        this.b = null;
    }

    @Override // defpackage.hg7
    public final T c(fg7 fg7Var) {
        a aVar = new a(this, fg7Var);
        synchronized (this) {
            aVar.invoke();
        }
        T t = this.b;
        if (t != null) {
            return t;
        }
        r6.g("Single instance created couldn't return value");
        return null;
    }
}

package defpackage;

import com.google.gson.JsonSyntaxException;

/* JADX INFO: loaded from: classes2.dex */
public final class wvf implements qvf {
    public final /* synthetic */ Class a;
    public final /* synthetic */ pvf b;

    public class a extends pvf<Object> {
        public final /* synthetic */ Class a;

        public a(Class cls) {
            this.a = cls;
        }

        @Override // defpackage.pvf
        public final Object a(nb8 nb8Var) {
            Object objA = wvf.this.b.a(nb8Var);
            if (objA != null) {
                Class cls = this.a;
                if (!cls.isInstance(objA)) {
                    throw new JsonSyntaxException("Expected a " + cls.getName() + " but was " + objA.getClass().getName() + "; at path " + nb8Var.Q());
                }
            }
            return objA;
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, Object obj) {
            wvf.this.b.b(gc8Var, obj);
        }
    }

    public wvf(Class cls, pvf pvfVar) {
        this.a = cls;
        this.b = pvfVar;
    }

    @Override // defpackage.qvf
    public final <T2> pvf<T2> c(ae6 ae6Var, iyf<T2> iyfVar) {
        Class<? super T2> cls = iyfVar.a;
        if (this.a.isAssignableFrom(cls)) {
            return new a(cls);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Factory[typeHierarchy=");
        u40.k(this.a, sb, ",adapter=");
        sb.append(this.b);
        sb.append("]");
        return sb.toString();
    }
}

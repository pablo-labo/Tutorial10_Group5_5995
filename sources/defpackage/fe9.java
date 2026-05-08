package defpackage;

import defpackage.ce9;
import defpackage.e69;
import fe9.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import org.intellij.markdown.MarkdownParsingException;
import xpb.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fe9<T extends a> {
    public final xpb a;
    public final gd9 b;
    public final ArrayList c;
    public gd9 d;
    public int e;
    public final b f;

    public static class a {
        public final gd9 a;
        public final gd9 b;
        public final List<ce9> c;

        public a(gd9 gd9Var, gd9 gd9Var2, ArrayList arrayList) {
            gd9Var.getClass();
            gd9Var2.getClass();
            arrayList.getClass();
            this.a = gd9Var;
            this.b = gd9Var2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            a aVar = obj instanceof a ? (a) obj : null;
            return aVar != null && wl7.b(this.a, aVar.a) && wl7.b(this.b, aVar.b) && wl7.b(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 37)) * 37);
        }
    }

    public static final class b extends mj8 implements Function2<e69.a, gd9, Boolean> {
        final /* synthetic */ fe9<a> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fe9<a> fe9Var) {
            super(2);
            this.this$0 = fe9Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(e69.a aVar, gd9 gd9Var) {
            boolean z;
            e69.a aVar2 = aVar;
            gd9 gd9Var2 = gd9Var;
            aVar2.getClass();
            gd9Var2.getClass();
            Iterator<ee9<T>> it = this.this$0.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (it.next().b(aVar2, gd9Var2)) {
                    z = true;
                    break;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    public fe9(gd9 gd9Var, xpb xpbVar) {
        gd9Var.getClass();
        this.a = xpbVar;
        this.b = gd9Var;
        this.c = new ArrayList();
        this.d = gd9Var;
        this.e = -1;
        this.f = new b(this);
    }

    public final void a(int i, ce9.a aVar) {
        if (aVar != ce9.a.d) {
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size > i; size--) {
                if (!((ce9) arrayList.get(size)).e(aVar)) {
                    throw new MarkdownParsingException("If closing action is not NOTHING, marker should be gone");
                }
                arrayList.remove(size);
            }
            e();
        }
    }

    public List<ce9> b(e69.a aVar, xpb xpbVar) {
        gd9 gd9Var = d().a;
        gd9Var.getClass();
        int i = aVar.b;
        String str = aVar.d;
        if (i != hd9.d(gd9Var, str)) {
            throw new MarkdownParsingException("");
        }
        Iterator<ee9<T>> it = c().iterator();
        while (it.hasNext()) {
            List<ce9> listA = it.next().a(aVar, xpbVar, d());
            if (!listA.isEmpty()) {
                return listA;
            }
        }
        return (i < hd9.d(d().b, str) || aVar.a() == null) ? zr4.a : u63.Z(new k3b(d().a, xpbVar.new a(), this.f));
    }

    public abstract List<ee9<T>> c();

    public abstract T d();

    public final void e() {
        ArrayList arrayList = this.c;
        this.d = arrayList.isEmpty() ? this.b : ((ce9) z92.Y0(arrayList)).b();
    }
}

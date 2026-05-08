package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class onh implements Iterator<Map.Entry<String, Object>> {
    public final /* synthetic */ bnh V;
    public int a = -1;
    public hoh b;
    public Object c;
    public boolean d;
    public boolean e;
    public hoh f;

    public onh(bnh bnhVar) {
        this.V = bnhVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        bnh bnhVar = this.V;
        xmh xmhVar = bnhVar.b;
        if (!this.e) {
            this.e = true;
            this.c = null;
            while (this.c == null) {
                int i = this.a + 1;
                this.a = i;
                if (i >= xmhVar.d.size()) {
                    break;
                }
                hoh hohVarB = xmhVar.b(xmhVar.d.get(this.a));
                this.b = hohVarB;
                this.c = hoh.a(bnhVar.a, hohVarB.b);
            }
        }
        return this.c != null;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Map.Entry<String, Object> next() {
        if (!hasNext()) {
            k20.p();
            return null;
        }
        hoh hohVar = this.b;
        this.f = hohVar;
        Object obj = this.c;
        this.e = false;
        this.d = false;
        this.b = null;
        this.c = null;
        return new snh(this.V, hohVar, obj);
    }

    @Override // java.util.Iterator
    public final void remove() {
        hoh hohVar = this.f;
        if (hohVar == null || this.d) {
            bg.h();
        } else {
            this.d = true;
            hohVar.c(this.V.a, null);
        }
    }
}

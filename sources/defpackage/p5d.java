package defpackage;

import defpackage.w5b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class p5d extends pa5 {
    public static final w5b f;
    public final ClassLoader c;
    public final pa5 d;
    public final d2f e;

    public static final class a {
        public static final boolean a(w5b w5bVar) {
            w5b w5bVar2 = p5d.f;
            return !wve.D(w5bVar.c(), ".class", true);
        }
    }

    static {
        String str = w5b.b;
        f = w5b.a.a("/");
    }

    public p5d(ClassLoader classLoader) {
        qd8 qd8Var = pa5.a;
        qd8Var.getClass();
        this.c = classLoader;
        this.d = qd8Var;
        this.e = new d2f(new q5d(this));
    }

    @Override // defpackage.pa5
    public final fie a(w5b w5bVar) throws IOException {
        w5bVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.pa5
    public final void b(w5b w5bVar, w5b w5bVar2) throws IOException {
        w5bVar.getClass();
        w5bVar2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.pa5
    public final void d(w5b w5bVar) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.pa5
    public final void e(w5b w5bVar) throws IOException {
        w5bVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.pa5
    public final List<w5b> h(w5b w5bVar) throws FileNotFoundException {
        w5bVar.getClass();
        w5b w5bVar2 = f;
        w5bVar2.getClass();
        String strA = i.b(w5bVar2, w5bVar, true).f(w5bVar2).a.A();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (Pair pair : (List) this.e.getValue()) {
            pa5 pa5Var = (pa5) pair.a();
            w5b w5bVar3 = (w5b) pair.b();
            try {
                List<w5b> listH = pa5Var.h(w5bVar3.h(strA));
                ArrayList<w5b> arrayList = new ArrayList();
                for (Object obj : listH) {
                    if (a.a((w5b) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
                for (w5b w5bVar4 : arrayList) {
                    w5bVar4.getClass();
                    String strReplace = zve.b0(w5bVar4.a.A(), w5bVar3.a.A()).replace('\\', '/');
                    strReplace.getClass();
                    arrayList2.add(w5bVar2.h(strReplace));
                }
                w92.w0(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return z92.z1(linkedHashSet);
        }
        n6.b(w5bVar, "file not found: ");
        return null;
    }

    @Override // defpackage.pa5
    public final da5 j(w5b w5bVar) {
        w5bVar.getClass();
        if (!a.a(w5bVar)) {
            return null;
        }
        w5b w5bVar2 = f;
        w5bVar2.getClass();
        String strA = i.b(w5bVar2, w5bVar, true).f(w5bVar2).a.A();
        for (Pair pair : (List) this.e.getValue()) {
            da5 da5VarJ = ((pa5) pair.a()).j(((w5b) pair.b()).h(strA));
            if (da5VarJ != null) {
                return da5VarJ;
            }
        }
        return null;
    }

    @Override // defpackage.pa5
    public final p95 k(w5b w5bVar) throws FileNotFoundException {
        w5bVar.getClass();
        if (!a.a(w5bVar)) {
            n6.b(w5bVar, "file not found: ");
            return null;
        }
        w5b w5bVar2 = f;
        w5bVar2.getClass();
        String strA = i.b(w5bVar2, w5bVar, true).f(w5bVar2).a.A();
        Iterator it = ((List) this.e.getValue()).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            try {
                return ((pa5) pair.a()).k(((w5b) pair.b()).h(strA));
            } catch (FileNotFoundException unused) {
            }
        }
        n6.b(w5bVar, "file not found: ");
        return null;
    }

    @Override // defpackage.pa5
    public final fie l(w5b w5bVar, boolean z) throws IOException {
        w5bVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.pa5
    public final pne m(w5b w5bVar) throws IOException {
        w5bVar.getClass();
        if (!a.a(w5bVar)) {
            n6.b(w5bVar, "file not found: ");
            return null;
        }
        w5b w5bVar2 = f;
        w5bVar2.getClass();
        URL resource = this.c.getResource(i.b(w5bVar2, w5bVar, false).f(w5bVar2).a.A());
        if (resource == null) {
            n6.b(w5bVar, "file not found: ");
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        inputStream.getClass();
        return c0h.S(inputStream);
    }
}

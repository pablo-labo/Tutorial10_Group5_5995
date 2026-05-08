package defpackage;

import defpackage.w5b;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class q5d extends mj8 implements gu5<List<? extends Pair<? extends pa5, ? extends w5b>>> {
    final /* synthetic */ p5d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5d(p5d p5dVar) {
        super(0);
        this.this$0 = p5dVar;
    }

    @Override // defpackage.gu5
    public final List<? extends Pair<? extends pa5, ? extends w5b>> invoke() throws IOException {
        int iW;
        Pair pair;
        p5d p5dVar = this.this$0;
        ClassLoader classLoader = p5dVar.c;
        pa5 pa5Var = p5dVar.d;
        Enumeration<URL> resources = classLoader.getResources("");
        resources.getClass();
        ArrayList list = Collections.list(resources);
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            Pair pair2 = null;
            if (!it.hasNext()) {
                break;
            }
            URL url = (URL) it.next();
            url.getClass();
            if (wl7.b(url.getProtocol(), "file")) {
                String str = w5b.b;
                pair2 = new Pair(pa5Var, w5b.a.b(new File(url.toURI())));
            }
            if (pair2 != null) {
                arrayList.add(pair2);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        resources2.getClass();
        ArrayList<URL> list2 = Collections.list(resources2);
        list2.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            url2.getClass();
            String string = url2.toString();
            string.getClass();
            if (wve.K(string, "jar:file:", false) && (iW = zve.W(string, 0, 6, "!")) != -1) {
                String str2 = w5b.b;
                pair = new Pair(y6h.c(w5b.a.b(new File(URI.create(string.substring(4, iW)))), pa5Var, r5d.a), p5d.f);
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        return z92.h1(arrayList, arrayList2);
    }
}

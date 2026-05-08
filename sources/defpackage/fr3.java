package defpackage;

import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.source.i;
import defpackage.e47;
import defpackage.e75;
import defpackage.hr3;
import org.apache.avro.a;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fr3 implements hr3.h.a, e75.b, wq2 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fr3(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // defpackage.wq2
    public void accept(Object obj) {
        i.a aVar = (i.a) this.a;
        ((i) obj).G(aVar.a, (h.b) this.b, (nj9) this.c);
    }

    @Override // hr3.h.a
    public qyc g(int i, wpf wpfVar, int[] iArr) {
        hr3.d dVar = (hr3.d) this.a;
        String str = (String) this.b;
        String str2 = (String) this.c;
        e47.b bVar = e47.b;
        e47.a aVar = new e47.a();
        for (int i2 = 0; i2 < wpfVar.a; i2++) {
            aVar.c(new hr3.g(i, wpfVar, i2, dVar, iArr[i2], str, str2));
        }
        return aVar.f();
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        e75.b bVar = (e75.b) this.a;
        g gVar = (g) this.b;
        return a.a(bVar.j(obj, ka6Var), gVar, gVar.G(), (xy2) this.c);
    }
}

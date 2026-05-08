package defpackage;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import defpackage.ad3;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public class ze4 implements tr0, ewe, ad3.c {
    public static final String[] c = {"standard", "accelerate", "decelerate", "linear"};
    public static final wea d = new wea();
    public final /* synthetic */ int a;
    public final Object b;

    public ze4(int i) {
        this.a = i;
        switch (i) {
            case 1:
                y2i y2iVar = y2i.c;
                d1i d1iVar = new d1i(rxh.a, d);
                Charset charset = ezh.a;
                this.b = d1iVar;
                break;
            default:
                this.b = "identity";
                break;
        }
    }

    @Override // defpackage.tr0
    public Object K(xrd xrdVar, Float f, Float f2, Function1 function1, nle nleVar) {
        Object objG = ewa.g(xrdVar, f.floatValue(), boa.a(0.0f, f2.floatValue(), 28), (yi3) this.b, function1, nleVar);
        return objG == g13.a ? objG : (vd0) objG;
    }

    @Override // defpackage.ewe
    public void a(int i) {
    }

    @Override // defpackage.ewe
    public MemoryCache.a b(MemoryCache.Key key) {
        return null;
    }

    @Override // defpackage.ewe
    public void c(MemoryCache.Key key, Bitmap bitmap, Map map) {
        ((oug) this.b).c(key, bitmap, map, ka2.w(bitmap));
    }

    @Override // ad3.c
    public Iterable d(Object obj) {
        rc8 rc8Var = (rc8) this.b;
        Collection<ui8> collectionB = ((t52) obj).j().b();
        collectionB.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionB.iterator();
        while (it.hasNext()) {
            v62 v62VarD = ((ui8) it.next()).M0().d();
            t52 t52VarF = null;
            v62 v62VarA = v62VarD != null ? v62VarD.a() : null;
            t52 t52Var = v62VarA instanceof t52 ? (t52) v62VarA : null;
            if (t52Var != null && (t52VarF = rc8Var.f(t52Var)) == null) {
                t52VarF = t52Var;
            }
            if (t52VarF != null) {
                arrayList.add(t52VarF);
            }
        }
        return arrayList;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return (String) this.b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ze4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}

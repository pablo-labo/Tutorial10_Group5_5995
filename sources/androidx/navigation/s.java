package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.e;
import androidx.navigation.k;
import defpackage.cc5;
import defpackage.ie7;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.nea;
import defpackage.o6;
import defpackage.r6;
import defpackage.tb;
import defpackage.wl7;
import defpackage.xrf;
import defpackage.y92;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class s<D extends k> {
    public e.a a;
    public boolean b;

    public interface a {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        String value();
    }

    public static final class c extends mj8 implements Function1<q, j6g> {
        public static final c a = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(q qVar) {
            q qVar2 = qVar;
            qVar2.getClass();
            qVar2.b = true;
            return j6g.a;
        }
    }

    public abstract D a();

    public final nea b() {
        e.a aVar = this.a;
        if (aVar != null) {
            return aVar;
        }
        r6.g("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public k c(D d, Bundle bundle, p pVar, a aVar) {
        return d;
    }

    public void d(List list, p pVar) {
        cc5.a aVar = new cc5.a(new cc5(new xrf(new y92(list), new t(this, pVar)), false, new tb(13)));
        while (aVar.hasNext()) {
            b().g((d) aVar.next());
        }
    }

    public void e(e.a aVar) {
        this.a = aVar;
        this.b = true;
    }

    public void f(d dVar) {
        k kVar = dVar.b;
        if (kVar == null) {
            kVar = null;
        }
        if (kVar == null) {
            return;
        }
        c(kVar, null, ie7.q(c.a), null);
        b().c(dVar);
    }

    public void g(Bundle bundle) {
    }

    public Bundle h() {
        return null;
    }

    public void i(d dVar, boolean z) {
        dVar.getClass();
        List list = (List) b().e.a.getValue();
        if (!list.contains(dVar)) {
            o6.n("popBackStack was called with ", dVar, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        d dVar2 = null;
        while (j()) {
            dVar2 = (d) listIterator.previous();
            if (wl7.b(dVar2, dVar)) {
                break;
            }
        }
        if (dVar2 != null) {
            b().d(dVar2, z);
        }
    }

    public boolean j() {
        return true;
    }
}

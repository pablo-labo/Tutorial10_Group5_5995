package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class ly8 extends pl2 {
    public final Lazy f;

    public static final class a {
        public static final boolean a(y yVar) {
            Iterator<y> it = yVar.a().iterator();
            int i = 0;
            boolean z = false;
            while (it.hasNext()) {
                en6 type = it.next().getType();
                if (wl7.b(type, zd9.p)) {
                    i++;
                } else {
                    if (wl7.b(type, zd9.z) ? true : wl7.b(type, zd9.C) ? true : wl7.b(type, zd9.M)) {
                        continue;
                    } else {
                        if (z && i > 1) {
                            return true;
                        }
                        i = 0;
                        z = true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly8(en6 en6Var, ArrayList arrayList) {
        super(en6Var, arrayList);
        en6Var.getClass();
        this.f = boa.E(qt8.c, new my8(this));
    }
}

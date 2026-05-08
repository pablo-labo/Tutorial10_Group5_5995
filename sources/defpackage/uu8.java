package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.intellij.markdown.MarkdownParsingException;

/* JADX INFO: loaded from: classes3.dex */
public final class uu8 extends mnf {
    public final ArrayList a;
    public final ArrayList b;
    public final CharSequence c;
    public final oh7 d;

    public uu8(sd9 sd9Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            en6 en6Var = sd9Var.b;
            if (en6Var == null) {
                break;
            }
            boolean zEquals = en6Var.equals(zd9.M);
            knf knfVar = new knf(sd9Var.b, sd9Var.g, sd9Var.h, arrayList.size(), zEquals ? -1 : arrayList2.size());
            arrayList.add(knfVar);
            if (!zEquals) {
                arrayList2.add(knfVar);
            }
            en6 en6Var2 = sd9Var.c;
            sd9Var.b = en6Var2;
            sd9Var.g = sd9Var.h;
            if (en6Var2 != null) {
                sd9Var.a();
            }
        }
        this.a = arrayList;
        this.b = arrayList2;
        this.c = sd9Var.d;
        this.d = nic.H(sd9Var.e, sd9Var.f);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((knf) this.a.get(i)).d != i) {
                throw new MarkdownParsingException("");
            }
        }
        int size2 = this.b.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((knf) this.b.get(i2)).e != i2) {
                throw new MarkdownParsingException("");
            }
        }
    }

    @Override // defpackage.mnf
    public final List<knf> a() {
        return this.a;
    }

    @Override // defpackage.mnf
    public final List<knf> b() {
        return this.b;
    }

    @Override // defpackage.mnf
    public final CharSequence c() {
        return this.c;
    }

    @Override // defpackage.mnf
    public final oh7 d() {
        return this.d;
    }
}

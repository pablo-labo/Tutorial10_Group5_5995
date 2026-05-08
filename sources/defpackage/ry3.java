package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ry3 implements ny3 {
    public final ezg d;
    public int f;
    public int g;
    public ezg a = null;
    public boolean b = false;
    public boolean c = false;
    public a e = a.a;
    public int h = 1;
    public v44 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a V;
        public static final a W;
        public static final /* synthetic */ a[] X;
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;

        static {
            a aVar = new a("UNKNOWN", 0);
            a = aVar;
            a aVar2 = new a("HORIZONTAL_DIMENSION", 1);
            b = aVar2;
            a aVar3 = new a("VERTICAL_DIMENSION", 2);
            c = aVar3;
            a aVar4 = new a("LEFT", 3);
            d = aVar4;
            a aVar5 = new a("RIGHT", 4);
            e = aVar5;
            a aVar6 = new a("TOP", 5);
            f = aVar6;
            a aVar7 = new a("BOTTOM", 6);
            V = aVar7;
            a aVar8 = new a("BASELINE", 7);
            W = aVar8;
            X = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) X.clone();
        }
    }

    public ry3(ezg ezgVar) {
        this.d = ezgVar;
    }

    @Override // defpackage.ny3
    public final void a(ny3 ny3Var) {
        ArrayList<ry3> arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((ry3) it.next()).j) {
                return;
            }
        }
        this.c = true;
        ezg ezgVar = this.a;
        if (ezgVar != null) {
            ezgVar.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        ry3 ry3Var = null;
        int i = 0;
        for (ry3 ry3Var2 : arrayList) {
            if (!(ry3Var2 instanceof v44)) {
                i++;
                ry3Var = ry3Var2;
            }
        }
        if (ry3Var != null && i == 1 && ry3Var.j) {
            v44 v44Var = this.i;
            if (v44Var != null) {
                if (!v44Var.j) {
                    return;
                } else {
                    this.f = this.h * v44Var.g;
                }
            }
            d(ry3Var.g + this.f);
        }
        ezg ezgVar2 = this.a;
        if (ezgVar2 != null) {
            ezgVar2.a(this);
        }
    }

    public final void b(ezg ezgVar) {
        this.k.add(ezgVar);
        if (this.j) {
            ezgVar.a(ezgVar);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (ny3 ny3Var : this.k) {
            ny3Var.a(ny3Var);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.i0);
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}

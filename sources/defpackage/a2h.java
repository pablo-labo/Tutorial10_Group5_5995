package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a2h extends h91 {
    public static final String Y = z39.f("WorkContinuationImpl");
    public final ArrayList V;
    public boolean W;
    public uua X;
    public final w2h b;
    public final String c;
    public final q25 d;
    public final List<? extends h3h> e;
    public final ArrayList f;

    public a2h(w2h w2hVar, String str, q25 q25Var, List list) {
        super(12);
        this.b = w2hVar;
        this.c = str;
        this.d = q25Var;
        this.e = list;
        this.f = new ArrayList(list.size());
        this.V = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String string = ((h3h) list.get(i)).a.toString();
            string.getClass();
            this.f.add(string);
            this.V.add(string);
        }
    }

    public static HashSet S(a2h a2hVar) {
        HashSet hashSet = new HashSet();
        a2hVar.getClass();
        return hashSet;
    }

    public final oua R() {
        if (this.W) {
            z39.d().g(Y, "Already enqueued work ids (" + TextUtils.join(", ", this.f) + ")");
        } else {
            cu4 cu4Var = new cu4(this);
            this.b.d.a(cu4Var);
            this.X = cu4Var.b;
        }
        return this.X;
    }
}

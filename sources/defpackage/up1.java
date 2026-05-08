package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class up1 implements rn9, kma {
    public final /* synthetic */ int b;
    public Object c;
    public Object d;

    public up1(Map map) {
        this.b = 4;
        this.c = map;
        this.d = new j29("Java nullability annotation states").d(new ql2(this, 2));
    }

    @Override // defpackage.rn9
    public n82 a(Object obj, n82 n82Var) {
        ((vn9) this.d).e(obj);
        return ((rn9) this.c).a(obj, n82Var);
    }

    @Override // defpackage.rn9
    public boolean b(tf2 tf2Var) {
        return ((rn9) this.c).b(tf2Var);
    }

    @Override // defpackage.rn9
    public int c(cjb cjbVar) {
        return ((rn9) this.c).c(cjbVar);
    }

    @Override // defpackage.rn9
    public n82 get(Object obj) {
        n82 n82Var = ((rn9) this.c).get(obj);
        vn9 vn9Var = (vn9) this.d;
        if (n82Var == null) {
            vn9Var.c(obj);
            return n82Var;
        }
        vn9Var.a(obj);
        return n82Var;
    }

    public String toString() {
        switch (this.b) {
            case 1:
                StringBuilder sb = new StringBuilder("GetFriendsResponse{groups=");
                sb.append((ArrayList) this.c);
                sb.append(", nextPageRequestToken='");
                return l6.i(sb, (String) this.d, "'}");
            default:
                return super.toString();
        }
    }

    public up1(rn9 rn9Var, vn9 vn9Var) {
        this.b = 2;
        this.c = rn9Var;
        this.d = vn9Var;
    }

    public /* synthetic */ up1(int i) {
        this.b = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public up1(Bundle bundle, LinkedHashMap linkedHashMap) {
        this(0);
        this.b = 0;
        this.c = bundle;
        this.d = linkedHashMap;
    }

    public up1() {
        this.b = 3;
        this.c = new xmg(0);
        this.d = new xmg(0);
    }
}

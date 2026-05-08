package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s98 implements dve {
    public static final a d = new a(new aa8(false, false, true, "    ", "type", true, z52.b), i8e.a);
    public final aa8 a;
    public final v1 b;
    public final xz3 c = new xz3();

    public static final class a extends s98 {
    }

    public s98(aa8 aa8Var, v1 v1Var) {
        this.a = aa8Var;
        this.b = v1Var;
    }

    @Override // defpackage.dve
    public final v1 a() {
        return this.b;
    }

    @Override // defpackage.dve
    public final <T> String b(r7e<? super T> r7eVar, T t) {
        char[] cArr;
        r7eVar.getClass();
        rb8 rb8Var = new rb8();
        p22 p22Var = p22.c;
        synchronized (p22Var) {
            zs0 zs0Var = p22Var.a;
            cArr = null;
            char[] cArr2 = (char[]) (zs0Var.isEmpty() ? null : zs0Var.removeLast());
            if (cArr2 != null) {
                p22Var.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];
        }
        rb8Var.a = cArr;
        try {
            new rue(new hl2(rb8Var), this, d5h.a, new pa8[d5h.f.a()]).t(r7eVar, t);
            return rb8Var.toString();
        } finally {
            rb8Var.b();
        }
    }

    @Override // defpackage.dve
    public final <T> T c(i04<? extends T> i04Var, String str) {
        i04Var.getClass();
        str.getClass();
        eve eveVar = new eve(str);
        T t = (T) new que(this, d5h.a, eveVar, i04Var.getDescriptor(), null).B(i04Var);
        if (eveVar.e() == 10) {
            return t;
        }
        eve.m(eveVar, "Expected EOF after parsing, but had " + eveVar.e.charAt(eveVar.a - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final Object d(i04 i04Var, JsonObject jsonObject) {
        i04Var.getClass();
        return new tb8(this, jsonObject, (String) null, 12).B(i04Var);
    }

    public final <T> JsonElement e(r7e<? super T> r7eVar, T t) {
        r7eVar.getClass();
        luc lucVar = new luc();
        new ub8(this, new vx0(lucVar, 12)).t(r7eVar, t);
        T t2 = lucVar.element;
        if (t2 != null) {
            return (JsonElement) t2;
        }
        wl7.g("result");
        throw null;
    }
}

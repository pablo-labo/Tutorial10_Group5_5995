package defpackage;

import android.content.Context;
import com.google.firebase.encoders.EncodingException;
import defpackage.c2f;
import defpackage.l71;
import defpackage.y21;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ihg {
    public final Context a;
    public final k71 b;
    public final q05 c;
    public final p3h d;
    public final Executor e;
    public final c2f f;
    public final b82 g;
    public final b82 h;
    public final s72 i;

    public ihg(Context context, k71 k71Var, q05 q05Var, p3h p3hVar, Executor executor, c2f c2fVar, b82 b82Var, b82 b82Var2, s72 s72Var) {
        this.a = context;
        this.b = k71Var;
        this.c = q05Var;
        this.d = p3hVar;
        this.e = executor;
        this.f = c2fVar;
        this.g = b82Var;
        this.h = b82Var2;
        this.i = s72Var;
    }

    public final void a(final v31 v31Var, int i) {
        Iterable iterable;
        s11 s11VarB;
        ihg ihgVar = this;
        zsf zsfVarA = ihgVar.b.a(v31Var.a);
        l71.a aVar = l71.a.a;
        final long jMax = 0;
        new s11(aVar, 0L);
        while (true) {
            dp3 dp3Var = new dp3(ihgVar, v31Var);
            c2f c2fVar = ihgVar.f;
            if (!((Boolean) c2fVar.h(dp3Var)).booleanValue()) {
                final ihg ihgVar2 = ihgVar;
                c2fVar.h(new c2f.a() { // from class: hhg
                    @Override // c2f.a
                    public final Object b() {
                        ihg ihgVar3 = this.a;
                        ihgVar3.c.G0(ihgVar3.g.getTime() + jMax, v31Var);
                        return null;
                    }
                });
                return;
            }
            Iterable iterable2 = (Iterable) c2fVar.h(new uw8(ihgVar, v31Var));
            if (!iterable2.iterator().hasNext()) {
                return;
            }
            if (zsfVarA == null) {
                i49.a(v31Var, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                s11VarB = new s11(l71.a.c, -1L);
                iterable = iterable2;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((p8b) it.next()).a());
                }
                if (v31Var.b() != null) {
                    s72 s72Var = ihgVar.i;
                    Objects.requireNonNull(s72Var);
                    u72 u72Var = (u72) c2fVar.h(new u91(s72Var, 13));
                    y21.a aVar2 = new y21.a();
                    aVar2.f = new HashMap();
                    aVar2.d = Long.valueOf(ihgVar.g.getTime());
                    aVar2.e = Long.valueOf(ihgVar.h.getTime());
                    aVar2.a = "GDT_CLIENT_METRICS";
                    dt4 dt4Var = new dt4("proto");
                    u72Var.getClass();
                    d6c d6cVar = t5c.a;
                    d6cVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        HashMap map = d6cVar.a;
                        iterable = iterable2;
                        try {
                            b6c b6cVar = new b6c(byteArrayOutputStream, map, d6cVar.b, d6cVar.c);
                            kna knaVar = (kna) map.get(u72.class);
                            if (knaVar == null) {
                                throw new EncodingException(m6.f(u72.class, "No encoder for "));
                            }
                            knaVar.a(u72Var, b6cVar);
                        } catch (IOException unused) {
                        }
                    } catch (IOException unused2) {
                        iterable = iterable2;
                    }
                    aVar2.c = new xs4(dt4Var, byteArrayOutputStream.toByteArray());
                    arrayList.add(zsfVarA.a(aVar2.b()));
                } else {
                    iterable = iterable2;
                }
                s11VarB = zsfVarA.b(new r11(arrayList, v31Var.b));
            }
            l71.a aVar3 = s11VarB.a;
            if (aVar3 == l71.a.b) {
                final long j = jMax;
                final Iterable iterable3 = iterable;
                c2fVar.h(new c2f.a() { // from class: ghg
                    @Override // c2f.a
                    public final Object b() {
                        ihg ihgVar3 = this.a;
                        q05 q05Var = ihgVar3.c;
                        q05Var.w0(iterable3);
                        q05Var.G0(ihgVar3.g.getTime() + j, v31Var);
                        return null;
                    }
                });
                this.d.b(v31Var, i + 1, true);
                return;
            }
            Iterable iterable4 = iterable;
            c2fVar.h(new xk3(this, iterable4));
            if (aVar3 == aVar) {
                jMax = Math.max(jMax, s11VarB.b);
                if (v31Var.b() != null) {
                    c2fVar.h(new z25(this, 5));
                }
            } else if (aVar3 == l71.a.d) {
                HashMap map2 = new HashMap();
                Iterator it2 = iterable4.iterator();
                while (it2.hasNext()) {
                    String strG = ((p8b) it2.next()).a().g();
                    if (map2.containsKey(strG)) {
                        map2.put(strG, Integer.valueOf(((Integer) map2.get(strG)).intValue() + 1));
                    } else {
                        map2.put(strG, 1);
                    }
                }
                c2fVar.h(new yi9(map2, this));
            }
            ihgVar = this;
        }
    }
}

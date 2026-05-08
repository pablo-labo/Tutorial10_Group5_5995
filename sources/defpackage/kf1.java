package defpackage;

import defpackage.me8;
import defpackage.mx4;
import defpackage.oi8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kf1 extends s0<af0, up2<?>> {
    public final yx9 c;
    public final cla d;
    public final cf0 e;
    public us9 f;

    public abstract class a implements oi8.a {

        /* JADX INFO: renamed from: kf1$a$a, reason: collision with other inner class name */
        public static final class C0292a implements oi8.a {
            public final /* synthetic */ lf1 a;
            public final /* synthetic */ lf1 b;
            public final /* synthetic */ a c;
            public final /* synthetic */ n8a d;
            public final /* synthetic */ ArrayList<af0> e;

            public C0292a(lf1 lf1Var, a aVar, n8a n8aVar, ArrayList arrayList) {
                this.b = lf1Var;
                this.c = aVar;
                this.d = n8aVar;
                this.e = arrayList;
                this.a = lf1Var;
            }

            @Override // oi8.a
            public final void a() {
                this.b.a();
                ((lf1) this.c).b.put(this.d, new kf0((af0) z92.k1(this.e)));
            }

            @Override // oi8.a
            public final void b(n8a n8aVar, d62 d62Var) {
                this.a.b(n8aVar, d62Var);
            }

            @Override // oi8.a
            public final oi8.b c(n8a n8aVar) {
                return this.a.c(n8aVar);
            }

            @Override // oi8.a
            public final void d(n8a n8aVar, a62 a62Var, n8a n8aVar2) {
                this.a.d(n8aVar, a62Var, n8aVar2);
            }

            @Override // oi8.a
            public final oi8.a e(a62 a62Var, n8a n8aVar) {
                return this.a.e(a62Var, n8aVar);
            }

            @Override // oi8.a
            public final void f(n8a n8aVar, Object obj) {
                this.a.f(n8aVar, obj);
            }
        }

        public static final class b implements oi8.b {
            public final ArrayList<up2<?>> a = new ArrayList<>();
            public final /* synthetic */ kf1 b;
            public final /* synthetic */ n8a c;
            public final /* synthetic */ a d;

            /* JADX INFO: renamed from: kf1$a$b$a, reason: collision with other inner class name */
            public static final class C0293a implements oi8.a {
                public final /* synthetic */ lf1 a;
                public final /* synthetic */ lf1 b;
                public final /* synthetic */ b c;
                public final /* synthetic */ ArrayList<af0> d;

                public C0293a(lf1 lf1Var, b bVar, ArrayList arrayList) {
                    this.b = lf1Var;
                    this.c = bVar;
                    this.d = arrayList;
                    this.a = lf1Var;
                }

                @Override // oi8.a
                public final void a() {
                    this.b.a();
                    this.c.a.add(new kf0((af0) z92.k1(this.d)));
                }

                @Override // oi8.a
                public final void b(n8a n8aVar, d62 d62Var) {
                    this.a.b(n8aVar, d62Var);
                }

                @Override // oi8.a
                public final oi8.b c(n8a n8aVar) {
                    return this.a.c(n8aVar);
                }

                @Override // oi8.a
                public final void d(n8a n8aVar, a62 a62Var, n8a n8aVar2) {
                    this.a.d(n8aVar, a62Var, n8aVar2);
                }

                @Override // oi8.a
                public final oi8.a e(a62 a62Var, n8a n8aVar) {
                    return this.a.e(a62Var, n8aVar);
                }

                @Override // oi8.a
                public final void f(n8a n8aVar, Object obj) {
                    this.a.f(n8aVar, obj);
                }
            }

            public b(kf1 kf1Var, n8a n8aVar, a aVar) {
                this.b = kf1Var;
                this.c = n8aVar;
                this.d = aVar;
            }

            @Override // oi8.b
            public final void a() {
                lf1 lf1Var = (lf1) this.d;
                ArrayList<up2<?>> arrayList = this.a;
                arrayList.getClass();
                t52 t52Var = lf1Var.d;
                n8a n8aVar = this.c;
                rlg rlgVarK = ygg.k(n8aVar, t52Var);
                if (rlgVarK != null) {
                    HashMap<n8a, up2<?>> map = lf1Var.b;
                    List listI = r03.i(arrayList);
                    ui8 type = rlgVarK.getType();
                    type.getClass();
                    map.put(n8aVar, new uyf(listI, type));
                    return;
                }
                if (lf1Var.c.o(lf1Var.e) && wl7.b(n8aVar.c(), "value")) {
                    ArrayList arrayList2 = new ArrayList();
                    for (up2<?> up2Var : arrayList) {
                        if (up2Var instanceof kf0) {
                            arrayList2.add(up2Var);
                        }
                    }
                    List<af0> list = lf1Var.f;
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        list.add((af0) ((kf0) it.next()).a);
                    }
                }
            }

            @Override // oi8.b
            public final oi8.a b(a62 a62Var) {
                ArrayList arrayList = new ArrayList();
                return new C0293a(this.b.p(a62Var, qne.p, arrayList), this, arrayList);
            }

            @Override // oi8.b
            public final void c(Object obj) {
                up2<?> up2VarL = web.l(obj, this.b.c);
                if (up2VarL == null) {
                    up2VarL = new mx4.a("Unsupported annotation argument: " + this.c);
                }
                this.a.add(up2VarL);
            }

            @Override // oi8.b
            public final void d(a62 a62Var, n8a n8aVar) {
                this.a.add(new dw4(a62Var, n8aVar));
            }

            @Override // oi8.b
            public final void e(d62 d62Var) {
                this.a.add(new me8(new me8.a.b(d62Var)));
            }
        }

        public a() {
        }

        @Override // oi8.a
        public final void b(n8a n8aVar, d62 d62Var) {
            ((lf1) this).b.put(n8aVar, new me8(new me8.a.b(d62Var)));
        }

        @Override // oi8.a
        public final oi8.b c(n8a n8aVar) {
            return new b(kf1.this, n8aVar, this);
        }

        @Override // oi8.a
        public final void d(n8a n8aVar, a62 a62Var, n8a n8aVar2) {
            ((lf1) this).b.put(n8aVar, new dw4(a62Var, n8aVar2));
        }

        @Override // oi8.a
        public final oi8.a e(a62 a62Var, n8a n8aVar) {
            ArrayList arrayList = new ArrayList();
            return new C0292a(kf1.this.p(a62Var, qne.p, arrayList), this, n8aVar, arrayList);
        }

        @Override // oi8.a
        public final void f(n8a n8aVar, Object obj) {
            up2<?> up2VarL = web.l(obj, kf1.this.c);
            if (up2VarL == null) {
                up2VarL = new mx4.a("Unsupported annotation argument: " + n8aVar);
            }
            ((lf1) this).b.put(n8aVar, up2VarL);
        }
    }

    public kf1(yx9 yx9Var, cla claVar, j29 j29Var, bwc bwcVar) {
        super(j29Var, bwcVar);
        this.c = yx9Var;
        this.d = claVar;
        this.e = new cf0(yx9Var, claVar);
        this.f = us9.g;
    }

    @Override // defpackage.t0
    public final lf1 p(a62 a62Var, qne qneVar, List list) {
        list.getClass();
        return new lf1(this, rc5.c(this.c, a62Var, this.d), a62Var, list, qneVar);
    }
}
